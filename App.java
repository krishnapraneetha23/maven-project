package com.vignan.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		person e1 = new person(23, "Ravi", "Kishore");
		System.out.println(e1);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(e1);
		tx.commit();
		factory.close();
	}

}
