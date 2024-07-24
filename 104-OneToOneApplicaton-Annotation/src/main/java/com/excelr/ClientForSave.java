package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ClientForSave {
	public  static  void main(String args[])
	{

		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/excelr/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Student  s = new Student();
		s.setStudentId(101);
		s.setStudentName("Amulya");
		s.setGrp("mpc");

		Address  ad = new Address();
		ad.setAddressId(1);
		ad.setPlace("Nalgonda");
		ad.setParent(s);
		Transaction  tx = session.beginTransaction();
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("One to One with annotations is done..!!!!");
		factory.close();
	}
}
