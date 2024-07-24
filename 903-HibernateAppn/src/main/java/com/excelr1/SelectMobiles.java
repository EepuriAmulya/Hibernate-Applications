package com.excelr1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectMobiles {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("com/excelr1/hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	Mobile e1 = (Mobile) session.get(Mobile.class, 5);
	System.out.println(e1);
	e1.setMobile_no(5);
	tx.commit();
	session.close();
	factory.close();


}
}
