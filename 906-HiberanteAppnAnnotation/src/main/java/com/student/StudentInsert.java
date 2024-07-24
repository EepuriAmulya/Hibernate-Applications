package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StudentInsert {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/student/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Student sc=new Student(1,"Amulya","98","pass");
        session.save(sc);
        Transaction ts=session.beginTransaction();
        ts.commit();
        System.out.println("Table created and record Inserted...");
        session.close();
        factory.close();
	}

}
