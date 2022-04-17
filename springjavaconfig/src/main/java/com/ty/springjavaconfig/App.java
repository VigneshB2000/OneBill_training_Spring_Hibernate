package com.ty.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
//		Car bean = context.getBean("suzuki", Car.class);
//		Car bean1 = context.getBean("audi", Car.class);
		Car bean1 = context.getBean( Car.class);
//		System.out.println(bean);
		System.out.println(bean1);

	}
}
