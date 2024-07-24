package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	
		public static void main(String[] args) {
			Configuration cfg=new Configuration();
			cfg.configure("com/employee/hibernate.cfg.xml");
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Employee m1=new Employee(400,"Rahul","Manager",90000.0);
			Transaction ts=session.beginTransaction();
			session.save(m1);
			ts.commit();
			System.out.println("1 table created and 1record inserted");
			session.close();
			factory.close();	
}

	}


