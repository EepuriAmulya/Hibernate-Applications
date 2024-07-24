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
		

	      Vendor v=new Vendor();

	 v.setVendorId(100);
     v.setVendorName("Java4n");

     Customers c1=new Customers();
     c1.setCustomerId(100);
     c1.setCustomerName("Amulya");

     Customers c2=new Customers();
     c2.setCustomerId(101);
     c2.setCustomerName("Ankitha");
     
     

     Set s=new HashSet();
     s.add(c1);
     s.add(c2);

     v.setChildren(s);

     Transaction tx=session.beginTransaction();
          session.save(v);
     tx.commit();

	session.close();
	System.out.println("One to Many Annotatios Done...!!!!!!");
	factory.close();
}
}

