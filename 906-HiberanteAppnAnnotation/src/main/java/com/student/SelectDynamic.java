package com.student;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class SelectDynamic {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/student/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		int sid=sc.nextInt();
		Student x1= (Student)session.load(Student.class,sid);		
        System.out.println(x1);
        Transaction ts=session.beginTransaction();
        ts.commit();        
        session.close();
        factory.close();

	}

}
