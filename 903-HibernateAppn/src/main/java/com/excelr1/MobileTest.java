package com.excelr1;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class MobileTest {

	public static void main(String[] args) {
				Configuration cfg=new Configuration();
				cfg.configure("com/excelr1/hibernate.cfg.xml");
				SessionFactory factory=cfg.buildSessionFactory();
				Session session=factory.openSession();
				Mobile s1=new Mobile(720726881,"s23","samsung","Android","8GB","256GB","Exynos",30000.99,2524);
				Transaction ts=session.beginTransaction();
				session.save(s1);
				ts.commit();
				System.out.println("1 table created and record updated");
				session.close();
				factory.close();	
	}
}

