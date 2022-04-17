package com.te.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		Trainee trainee = new Trainee();
		trainee.setName("Gokul");
		trainee.setSalary(30000);
		trainee.setDesignation("Graphics Developer");
		Laptop laptop = new Laptop();
		laptop.setId(101);
		laptop.setBattery("Dell");
		laptop.setBrand("Dell");
		laptop.setRom("1 TB");
		
		
		
		trainee.setLaptop(laptop);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(laptop);
		manager.persist(trainee);
		transaction.commit();
	}

}
