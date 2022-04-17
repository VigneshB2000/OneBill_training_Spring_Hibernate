package com.ty.hibernate_mapping;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



class App {
	public static void main( String[] args )
    {
        Cart ekart = new Cart();
        
        //1st item
        Item item = new Item();
        item.setId(1);
        item.setCategory("SmartPhone");
        item.setProductName("IPhone");
        item.setProductPrice(59999);
        item.setQuantity(1);
        item.setProductRating(5);
        
        //2nd item
        Item item2 = new Item();
        item2.setId(2);
        item2.setCategory("Laptop");
        item2.setProductName("MacBook Pro");
        item2.setProductPrice(159999);
        item2.setQuantity(1);
        item2.setProductRating(4.5);
        
        ekart.setItem(Arrays.asList(item, item2));
        
        
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("cart");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        manager.persist(ekart);
        transaction.begin();
        transaction.commit();
        
        
        
        
    }
}
