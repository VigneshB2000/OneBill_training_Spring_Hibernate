package com.te.mapping1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		Trainee1 trainee = new Trainee1();
		trainee.setName("Gokul");
		trainee.setSalary(30000);
		trainee.setDesignation("Graphics Developer");
		Laptop1 laptop = new Laptop1();
		laptop.setId(101);
		laptop.setBattery("Dell");
		laptop.setBrand("Dell");
		laptop.setRom("1 TB");
		laptop.setTrainee(trainee);

		trainee.setLaptop(laptop);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(trainee);
//		manager.persist(laptop);
		transaction.begin();
		transaction.commit();
	}

}
