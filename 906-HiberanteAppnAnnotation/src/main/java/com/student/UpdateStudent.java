package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UpdateStudent {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/student/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Student s1=(Student)session.get(Student.class,1);
		s1.setSname("Siri");
		s1.setStdMarks("56");
		s1.setStdResult("pass");
		session.update(s1);
		tx.commit();
		System.out.println("Record has updated...");
		session.close();
		factory.close();

	}

}
