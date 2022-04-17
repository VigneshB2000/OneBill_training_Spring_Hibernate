package com.ty.manytomany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Class {

	public static void main(String[] args) {
		User vicky = new User();
		vicky.setMailid("vicky@gmail.com");
		vicky.setName("Vicky");
		vicky.setPassword("!@#$");

		User raja = new User();
		raja.setMailid("raja@gmail.com");
		raja.setName("Rajan");
		raja.setPassword("%^&*");

		Application whatsapp = new Application();
		whatsapp.setUserid(1);
		whatsapp.setName("Whatsapp");
		whatsapp.setCategory("Social Media");

		Application instagram = new Application();
		instagram.setUserid(2);
		instagram.setName("Whatsapp");
		instagram.setCategory("Social Media");

		whatsapp.setUser(Arrays.asList(vicky, raja));
		instagram.setUser(Arrays.asList(vicky, raja));

		vicky.setApps(Arrays.asList(whatsapp, instagram));
		raja.setApps(Arrays.asList(whatsapp, instagram));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("app");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(vicky);
		manager.persist(raja);
		transaction.commit();
	}
}
