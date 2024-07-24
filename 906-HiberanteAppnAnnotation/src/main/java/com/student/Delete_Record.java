package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Delete_Record {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/student/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Student sc= (Student)session.get(Student.class,3);
        session.delete(sc);
        Transaction ts=session.beginTransaction();
        ts.commit();
        System.out.println("Record Deleted...");
        session.close();
        factory.close();
	}


	}


