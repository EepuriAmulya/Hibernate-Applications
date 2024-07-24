package com.student;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DynamicInsert {

	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("com/student/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sid,sname,smarks,sresult:");
		int sid=sc.nextInt();
		String sname=sc.next();
		String stdMarks=sc.next();
		String stdResult=sc.next();
		Student d1=new Student();
        d1.setSid(sid);
        d1.setSname(sname);
        d1.setStdMarks(stdMarks);
        d1.setStdResult(stdResult);
        session.save(d1);
        Transaction ts=session.beginTransaction();
        ts.commit();
        System.out.println("Table created and record Inserted...");
        session.close();
        factory.close();
	}


	}


