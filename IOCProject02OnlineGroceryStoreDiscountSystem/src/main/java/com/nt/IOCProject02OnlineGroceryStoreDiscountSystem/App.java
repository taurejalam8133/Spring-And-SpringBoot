package com.nt.IOCProject02OnlineGroceryStoreDiscountSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

    	ApplicationContext context =
    	        new AnnotationConfigApplicationContext(AppConfig.class);

        GroceryStore store = context.getBean(GroceryStore.class);

        store.showStoreDetails();

        double finalAmount = store.calculateDiscount(1000);
        System.out.println("Final Amount after discount: " + finalAmount);
    }
}