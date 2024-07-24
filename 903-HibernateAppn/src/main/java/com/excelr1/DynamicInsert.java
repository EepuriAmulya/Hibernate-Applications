package com.excelr1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DynamicInsert {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/excelr1/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction ts=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mb_no,modelname,cm_name,ro:");
		int mobile_no=sc.nextInt();		
		 String model_name=sc.next();		 
          String  company_name=sc.next();
		 String  os_name=sc.next();
		 String  ram_size=sc.next();
		String  rom_size=sc.next();
		 String  processor_name=sc.next();
		 double price=sc.nextDouble();
	      int imeiNo=sc.nextInt();
		Mobile d2=new Mobile();							
		session.save(d2);
		System.out.println("Table Created and Record Inserted ....");
		d2.setMobile_no(mobile_no);
		d2.setModel_name(model_name);
		d2.setCompany_name(company_name);
		d2.setOs_name(os_name);
		d2.setRam_size(ram_size);
		d2.setRom_size(rom_size);
		d2.setProcessor_name(processor_name);
		d2.setPrice(price);
		d2.setImeiNo(imeiNo);
		ts.commit();
		
		session.close();
		factory.close();

	}

}
