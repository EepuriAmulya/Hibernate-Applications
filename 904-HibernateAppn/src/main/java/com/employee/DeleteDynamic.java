package com.employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDynamic {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/employee/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter eid what do want delete:");
        int eid=sc.nextInt();
        Employee d1=(Employee)session.get(Employee.class,eid); 
        System.out.println(d1);
        d1.setEid(eid);
        session.delete(d1);
        System.out.println("Record Deleted....");
        tx.commit();
        session.close();
        factory.close();
	}

}
