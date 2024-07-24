package com.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

	public static void main(String[] args) {
	  Configuration cfg=new Configuration();
	  cfg.configure("com/employee/hibernate.cfg.xml");
	  SessionFactory factory=cfg.buildSessionFactory();
	  Session session=factory.openSession();
	  Transaction tx=session.beginTransaction();
	  Employee e2=(Employee)session.get(Employee.class,300);
	  System.out.println(e2);
	   session.delete(e2);
	   System.out.println("Deleted Successfully");
	   tx.commit();
	   session.close();
	   factory.close();

	}

}
