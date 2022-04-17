package com.te.hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App3 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Goku");
		employee.setRole("Developer");
		employee.setSalary(2000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Employee merge = em.merge(employee);
		em.remove(merge);
		transaction.begin();
		transaction.commit();
	}

}
