package com.excelr1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteMobiles {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/excelr1/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction ts=session.beginTransaction();
		Mobile d1=(Mobile)session.get(Mobile.class,4);
		System.out.println(d1);		
		session.delete(d1);
		System.out.println("Record Deleted...");
		ts.commit();
		
		session.close();
		factory.close();

	}

}
