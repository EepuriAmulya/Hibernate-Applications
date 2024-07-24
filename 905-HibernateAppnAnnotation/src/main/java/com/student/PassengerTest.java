package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotatedClassType;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class PassengerTest {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/student/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Passenger p1 = new Passenger(21,"Amulya","3","5",20.0);
		session.save(p1);
	
		System.out.println("new table is created and record also inserted");

		tx.commit();

		session.close();
		factory.close();
	}
}

	


