package com.excelr;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDynamic {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/excelr/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  productid you want to delete");
		int id = sc.nextInt();
		Transaction tx = session.beginTransaction();
		Product p = (Product) session.get(Product.class, id);
		System.out.println(p);
		p.setPid(id);

		session.delete(p);
		tx.commit();
		session.close();
		factory.close();

	}
}
