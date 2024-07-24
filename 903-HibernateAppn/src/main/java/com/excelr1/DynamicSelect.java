package com.excelr1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DynamicSelect {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/excelr1/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  productid you want to select");
		int id = sc.nextInt();
		Transaction tx = session.beginTransaction();
		Mobile p = (Mobile) session.get(Mobile.class, id);
		System.out.println(p);
		p.setMobile_no(id);
		tx.commit();
		session.close();
		factory.close();


	}

}
