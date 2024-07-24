package com.employee;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UpdateEmployee {

	

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/employee/hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Employee e1=(Employee)session.get(Employee.class,200);
        System.out.println(e1);
        e1.setEname("Deepthi");
        e1.setDesignation("Associative");
        e1.setSalary(20000.00);
        session.update(e1);
        System.out.println("Values Updated Succesfully");
        tx.commit();
        session.close();
        factory.close();	
	}
}

