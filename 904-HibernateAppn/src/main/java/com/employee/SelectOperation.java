package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectOperation {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/employee/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Employee m1=(Employee)session.get(Employee.class,200);
        System.out.println(m1);
		m1.setEid(200);
		tx.commit();
		session.close();
		factory.close();

	}
}

