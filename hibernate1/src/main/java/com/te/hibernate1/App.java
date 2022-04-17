package com.te.hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		Employee employee = new Employee(2, "Gokul", 400000, "Developer");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		EntityManager entitymanager = factory.createEntityManager();
		EntityTransaction transaction = entitymanager.getTransaction();
		entitymanager.persist(employee);
		transaction.begin();
		transaction.commit();
	}
}
