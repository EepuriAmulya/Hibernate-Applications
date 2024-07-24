package com.employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DynamicInsert {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/employee/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter eid,ename,designation,salary:");
        int eid=sc.nextInt();
        String ename=sc.next();
        String designation=sc.next();
        double price=sc.nextDouble();
        Employee w1=new Employee();
        w1.setEid(eid);
        w1.setEname(ename);
        w1.setDesignation(designation);
        w1.setSalary(price);
        session.save(w1);
        tx.commit();
        System.out.println("Table created and values inserted");
        session.close();
        factory.close();

	}

}
