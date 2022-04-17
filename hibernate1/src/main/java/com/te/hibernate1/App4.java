package com.te.hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class App4 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Employee empl = em.find(Employee.class, 2);
		empl.setRole("Tester");
		em.persist(empl);
		transaction.begin();
		transaction.commit();
	}

	
	
	
	
	
}
