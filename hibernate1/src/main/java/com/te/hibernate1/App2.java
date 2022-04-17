package com.te.hibernate1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App2 {

	
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Goku");
		employee.setRole("Developer");
		employee.setSalary(2000);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employee");
		EntityManager em = emf.createEntityManager();
		
//		to get data
		
		Employee emp =em.find(Employee.class, 1);
		System.out.println(emp);
		
//		To get reference

		Employee reference = em.getReference(Employee.class, 1) ;
		System.out.println("The reference is =====>"+ reference);
		
		
	}

}
