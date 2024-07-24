package com.excelr1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateMobiles {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/excelr1/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Mobile s1=(Mobile)session.get(Mobile.class,3);
		Transaction ts=session.beginTransaction();
		s1.setModel_name("c18");
		s1.setCompany_name("Oppo");
		s1.setRam_size("6GB");
		s1.setRom_size("256GB");
		s1.setPrice(25000.00);		
		session.update(s1);
		ts.commit();
		System.out.println("Record updated...");
		session.close();
		factory.close();

	}

}
