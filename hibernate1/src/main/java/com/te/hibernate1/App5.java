package com.te.hibernate1;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App5 {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee");
		
		EntityManager manager = factory.createEntityManager();
		
//		Query query = manager.createQuery("Select max(salary) from Employee");
		
//		List<Employee> list = query.getResultList();
//		for(Employee emp : list) {
//			System.out.println(emp.getName());
//		}
	
//		Object result = query.getSingleResult();
//		System.out.println(result);
//		
//		Query query1 = manager.createQuery("Select count(*) from Employee");
//		System.out.println(query1.getSingleResult());
		
		System.out.println("Enter the input");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Query query = manager.createQuery("Select name From Employee where id =:number" );
		query.setParameter("number", num);
		System.out.println(query.getSingleResult());
		
	}

}
