package com.etp.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.etp.model.Address;
import com.etp.model.UserDetails;

public class UserDetailsTest {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();

		user.setUserName("Xyz");
		user.setMobileNumber("9860986035");
		user.setBirthDate(new Date(156114));
		user.setPassword("123456");

		Address adr = new Address();

		adr.setCountry("India");
		adr.setPincode("123456");
		adr.setStreet("Mahatama Gandhi Road");
		adr.setDescrption("Pune");

		UserDetails user2 = new UserDetails();

		user2.setUserName("Xyz");
		user2.setMobileNumber("9860986035");
		user2.setBirthDate(new Date(156114));
		user2.setPassword("123456");

		Set<Address> adrList = new HashSet<>();

		adrList.add(adr);

		user.setAdr(adrList);
		

		user2.setAdr(adrList);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(user);
		session.save(user2);


		/*
		 * user = null;
		 * 
		 * user = session.get(UserDetails.class, 1);
		 */

		System.out.println(user);

		transaction.commit();

		session.close();

		System.exit(0);

	}

}
