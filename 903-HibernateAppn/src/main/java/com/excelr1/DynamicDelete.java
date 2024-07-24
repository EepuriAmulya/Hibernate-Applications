package com.excelr1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DynamicDelete {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/excelr1/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction ts=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mb_no which you want delete:");
		int mobile_no=sc.nextInt();
		Mobile d1=(Mobile)session.get(Mobile.class,mobile_no);
		System.out.println(mobile_no);		
		session.delete(d1);
		System.out.println("Record Deleted...");
		ts.commit();
		
		session.close();
		factory.close();

	}

}
