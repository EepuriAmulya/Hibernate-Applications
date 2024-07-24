package com.employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SelectDynamic {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/employee/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();		
		Transaction ts=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ename what you want the record:");
		int eid=sc.nextInt();
		Employee s=(Employee)session.get(Employee.class,eid);
		System.out.println(s);
		s.setEid(eid);
		
		ts.commit();		
		session.close();
		factory.close();	
}


	}


