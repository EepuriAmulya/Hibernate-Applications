package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDelete {

	
		public static void main(String[] args) {
			Configuration cfg=new Configuration();
			cfg.configure("com/excelr/hibernate.cfg.xml");
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			Product p3=(Product)session.get(Product.class,1);
			System.out.println(p3);
						
			session.delete(p3);
			tx.commit();
			session.close();
			factory.close();

	}

}
