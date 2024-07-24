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
		int passenger_id=sc.nextInt();
		String pname=sc.next();
		String startTime=sc.next();
		String endTime=sc.next();
		double ticketFair=sc.nextDouble();
		Passenger d1=new Passenger();
        session.save(sc);
        d1.setPassenger_id(passenger_id);
        d1.setPname(pname);
        d1.setStartTime(startTime);
        d1.setEndTime(endTime);
        d1.setTicketFair(ticketFair);      
        Transaction ts=session.beginTransaction();
        ts.commit();
        System.out.println("Table created and record Inserted...");
        session.close();
        factory.close();
	}


	}
