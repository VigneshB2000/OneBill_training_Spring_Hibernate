package com.te.hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(2);
		employee.setName("Rajan");
		employee.setRole("ML Engineer");
		employee.setSalary(20000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		em.persist(employee);
		transaction.begin();
		transaction.commit();
		
		
	}

}
