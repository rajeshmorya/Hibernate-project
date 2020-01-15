package com.arteck;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Object o=session.get(vendors.class, new Integer(101));
		vendors v=(vendors)o;
		System.out.println(v.getVendorid());
		System.out.println(v.getVendorname());

		Set s=v.getChildren();
		Iterator it = s.iterator();

		while(it.hasNext())
		{

		Object o1 = it.next();
		customers c = (customers) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		System.out.println("---------------------------");
		System.out.println(c.getCustomerid());
		System.out.println(c.getCustomername());
		System.out.println("---------------------------");
		}

/*		vendor v = new vendor();
		v.setVendorid(101);
		v.setVendorname("rajesh");

		customer c = new customer();
		c.setCustomerid(501);
		c.setCustomername("morya");
		
		customer c1 = new customer();
		c1.setCustomerid(502);
		c1.setCustomername("morya1");
		
		customer c2 = new customer();
		c2.setCustomerid(503);
		c2.setCustomername("morya");
		
		customer c3 = new customer();
		c3.setCustomerid(504);
		c3.setCustomername("morya1");
		
		customer c4 = new customer();
		c4.setCustomerid(505);
		c4.setCustomername("morya");
		
		customer c5 = new customer();
		c5.setCustomerid(506);
		c5.setCustomername("morya1");

		Set s = new HashSet();
		s.add(c);
		s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		s.add(c5);

		v.setChildren(s);

		Transaction tx = session.beginTransaction();
		session.save(v);
		tx.commit();*/

		session.close();
		System.out.println("One to One Annotatios Done...!!!!!!");
		factory.close();

	}

}
