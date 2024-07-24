package com.excelr1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateDynamic {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/excelr1/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction ts=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mb_no which you want Update:");
		int mobile_no=sc.nextInt();
		Mobile d1=(Mobile)session.get(Mobile.class,mobile_no);		
		d1.setModel_name("s21");
		d1.setCompany_name("poco");
		d1.setRam_size("8Gb");
		d1.setRom_size("64Gb");
		d1.setPrice(98000.0);						
		session.update(d1);
		System.out.println("Record Updated...");
		ts.commit();
		
		session.close();
		factory.close();
	}

}
