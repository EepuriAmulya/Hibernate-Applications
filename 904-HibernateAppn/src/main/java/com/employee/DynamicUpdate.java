package com.employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DynamicUpdate {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/employee/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter eid,ename,designation,salary what do want update:");
        int eid=sc.nextInt();
        String ename=sc.next();
        String designation=sc.next();
        double salary=sc.nextDouble();
        Transaction tx=session.beginTransaction();
        Employee m2=new Employee();
         m2.setEid(eid);
         m2.setEname(ename);
         m2.setDesignation(designation);
         m2.setSalary(salary);
         session.update(m2);
         System.out.println("Record Updated Succesfully...");
         tx.commit();
         session.close();
         factory.close();
	}

}
