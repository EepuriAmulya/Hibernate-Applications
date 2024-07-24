package com.excelr;


	import java.util.HashSet;
	import java.util.Set;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.AnnotationConfiguration;
	import org.hibernate.cfg.Configuration;

	public class ForOurLogic { 

		public static void main(String[] args)
		{

			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg.configure("com/excelr/hibernate.cfg.xml");
			SessionFactory factory = cfg.buildSessionFactory();

			Session session = factory.openSession();
			
			Vendor v =new Vendor();

	        v.setVendorId(200);
	        v.setVendorName("java4s6");

	        Customers c1=new Customers();

	         c1.setCustomerId(504);
	         c1.setCustomerName("customer4");
	         c1.setParent(v);

	         Customers c2=new Customers();

	         c2.setCustomerId(505);
	         c2.setCustomerName("customer5");
	         c2.setParent(v);

	         Customers c3=new Customers();

	         c3.setCustomerId(506);
	         c3.setCustomerName("customer6");
	         c3.setParent(v);         		             

	Transaction tx = session.beginTransaction();

	                  //session.save(v);
	                 session.save(c2);
	                 session.save(c2);
	                 session.save(c3);

	tx.commit();
	session.close();
	System.out.println("Many to One with annotation done...!!");
	factory.close();

		}

	}


