package com.ty.springannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobileConfiguration.class);
		Mobile bean = context.getBean(Mobile.class);
		System.out.println(bean);
		context.close();

	}
}
