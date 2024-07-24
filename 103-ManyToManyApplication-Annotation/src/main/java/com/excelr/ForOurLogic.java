package com.excelr;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class ForOurLogic { 

	public static void main(String args[]){
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("com/excelr/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
		Categories c1 = new Categories();
		c1.setCategoryId(3);
		c1.setCategoryName("cat 3");

		Categories c2=new Categories();
		c2.setCategoryId(4);
		c2.setCategoryName("cat 4");

		Item i1=new Item();
		Item i2 = new Item();

		i1.setItemId(103);
		i1.setItemName("item1");

		i2.setItemId(104);
		i2.setItemName("item2");

		Set  s =new HashSet();
		s.add(i1);
		s.add(i2);

		c1.setItems(s);
		c2.setItems(s);

		Transaction tx = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		tx.commit();
		System.out.println("Many to Many using annotations been done...!!!!!");
		session.close();
	}

}
