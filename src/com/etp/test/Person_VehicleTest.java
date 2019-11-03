package com.etp.test;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.etp.model.FourWheeler;
import com.etp.model.Person;
import com.etp.model.TwoWheeler;
import com.etp.model.Vehicles;

public class Person_VehicleTest {

	public static void main(String[] args) {
		
		Vehicles vehicle= new Vehicles();
		
		vehicle.setVehicleName("Suzuki");
		
		Person p= new Person();
		p.setPersonName("Vitthal");
		p.setVehicle(vehicle);
		
		Person p1= new Person();
		p1.setPersonName("Sham");
		p1.setVehicle(vehicle);
		
		Person p2= new Person();
		p2.setPersonName("Xyz");
		p2.setVehicle(vehicle);
		
		
		
		 

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		
		session.save(vehicle);
		session.save(p);
		session.save(p1);session.save(p2);
		
		transaction.commit();

		session.close();
		
		// HBQ
		
		
		session = sessionFactory.openSession();

		transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Person.class);
		criteria.add(Restrictions.gt("personId", 0)).addOrder(Order.desc("personId"));
		
		//Query query=session.createQuery("FROM Person");
		
		List personList = criteria.list();//query.getResultList();
		
		for (Iterator iterator = personList.iterator(); iterator.hasNext();) {
			Person person = (Person) iterator.next();
			System.out.println(person.getPersonId() + " " +person.getPersonName());
			
		}
		
		
		transaction.commit();

		session.close();
		
		

		System.exit(0);

	}

}
