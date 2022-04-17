package com.ty.Stationery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PenConfiguration.class);
		Bookstall bean = context.getBean(Bookstall.class);
		System.out.println(bean);
		bean.getPen().write();
	}
}
