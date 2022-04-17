package com.ty.spring.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");

		Girl g1 = context.getBean("girl1", Girl.class);
		Girl g2 = context.getBean("girl2", Girl.class);
		Boy b1 = context.getBean("boy1", Boy.class);
		Boy b2 = context.getBean("boy2", Boy.class);

		System.out.println(g1);
		System.out.println(g2);
		System.out.println(b1);
		System.out.println(b2);
		context.close();
		
		
	
	}
}
