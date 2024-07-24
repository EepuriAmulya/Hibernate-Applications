package com.excelr;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.*;
public class DynamicInsertion {


			public static void main(String[] args) {
				Configuration cfg=new Configuration();
				cfg.configure("com/excelr/hibernate.cfg.xml");
				SessionFactory factory=cfg.buildSessionFactory();
				Session session=factory.openSession();
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the  productid");
				int pid=sc.nextInt();
				System.out.println("Enter the  productname");
				String pname=sc.next();
				System.out.println("Enter the price");
				double price=sc.nextDouble();
				Product p1=new Product();
				p1.setPid(pid);
				p1.setPname(pname);
				p1.setPrice(price);
				Transaction ts=session.beginTransaction();
				session.save(p1);
				ts.commit();
				System.out.println("1 table craeted and record inserted");
				session.close();
				factory.close();

			}

		


	}

	


