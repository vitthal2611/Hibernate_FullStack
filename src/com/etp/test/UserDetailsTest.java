package com.etp.test;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.etp.model.UserDetails;

public class UserDetailsTest {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();

		user.setUserName("Xyz");
		user.setMobileNumber("9860986035");
		user.setBirthDate(new Date(156114));

		UserDetails user2 = new UserDetails();

		user2.setUserName("Xyz");
		user2.setMobileNumber("9860986035");
		user2.setBirthDate(new Date(156114));

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		/*
		 * session.save(user); session.save(user2);
		 */

		user = null;

		user = session.get(UserDetails.class, 1);

		System.out.println(user);

		transaction.commit();

		session.close();

		System.exit(0);

	}

}
