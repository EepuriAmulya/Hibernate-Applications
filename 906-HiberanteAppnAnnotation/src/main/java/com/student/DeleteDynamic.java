package com.student;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteDynamic {
	
	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/student/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sid what you want delete:");
		int sid=sc.nextInt();		
		Student d1=(Student)session.get(Student.class,sid);
      
        d1.setSid(sid);   
        session.delete(d1);
        Transaction ts=session.beginTransaction();
        ts.commit();
        System.out.println("Record Deleted...");
        session.close();
        factory.close();
	}
}
