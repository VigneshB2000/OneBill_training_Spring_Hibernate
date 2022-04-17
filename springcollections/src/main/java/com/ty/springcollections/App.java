package com.ty.springcollections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
    	Names bean = context.getBean(Names.class);
    	System.out.println(bean);
    	
    	
    }
}
