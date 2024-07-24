
package com.excelr;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectDynamic {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/excelr/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  productid you want to select");
		int id = sc.nextInt();
		Transaction tx = session.beginTransaction();
		Criteria crit=session.createCriteria(Product.class);
		List<Product> list=crit.list();
		for(Product product:list) {
			System.out.println(product);
		}
		
		tx.commit();
		session.close();
		factory.close();

	}

}
