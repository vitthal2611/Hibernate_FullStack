package com.etp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.etp.model.FourWheeler;
import com.etp.model.TwoWheeler;
import com.etp.model.Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle vehicle= new Vehicle();
		
		vehicle.setName("Vehicle_Name");
		vehicle.setType("Missing");
		
		
		 TwoWheeler twoWheeler= new TwoWheeler();
		 
		 twoWheeler.setName("Hero Honda");
		 
		 twoWheeler.setSteryingType("handle");
		 
		 twoWheeler.setWheelCount(2);
		 
		 
		 FourWheeler fourWheeler= new FourWheeler();
		 
		 fourWheeler.setName("Hundai");
		 
		 fourWheeler.setSteryingType("Stering");
		 
		 fourWheeler.setWheelCount(4);
				

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		
		
		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);

		transaction.commit();

		session.close();

		System.exit(0);

	}

}
