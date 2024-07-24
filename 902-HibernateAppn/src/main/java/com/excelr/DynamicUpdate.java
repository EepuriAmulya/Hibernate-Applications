package com.excelr;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class DynamicUpdate {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure("com/excelr/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the  productid you want to update");
		int id=sc.nextInt();
		System.out.println("Enter the  productname");
		String name=sc.next();
		System.out.println("Enter the price");
		double price=sc.nextDouble();
		Product p1=new Product();
		p1.setPid(id);
		p1.setPname(name);
		p1.setPrice(price);
		Transaction ts=session.beginTransaction();
		session.update(p1);
		ts.commit();
		System.out.println(" record updated");
		session.close();
		factory.close();


			}

		


	}