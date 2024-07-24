package com.excelr;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ProductTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/excelr/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Product p1 = new Product(1, "Samsung", 50000.0);

		session.save(p1);
		System.out.println("new table is created and record also inserted");

		tx.commit();

		session.close();
		factory.close();
	}
}
