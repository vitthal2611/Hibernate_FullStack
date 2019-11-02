package com.etp.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.etp.model.Country;
import com.etp.model.State;

public class CountryStateTest {

	public static void main(String[] args) {

		Country country= new Country(1, "India", "India is great Country");
		
		State stateMh= new State(1, "MH", "Marathi");
		
		State stateGoa= new State(2,"GOA","Portugal");
		
		List<State> stateList= new ArrayList<>();
		
		stateList.add(stateGoa);
		
		stateList.add(stateMh);
		
		country.setStateList(stateList);
		

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		
		session.save(stateGoa)	;
		session.save(stateMh)	;
		session.save(country)	;
		
		transaction.commit();

		session.close();

		System.exit(0);

	}

}
