package com.nt.IOCProject02OnlineGroceryStoreDiscountSystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GroceryStore {

    @Value("${store.id}")
    private int storeId;

    @Value("${store.name}")
    private String storeName;

    @Value("${store.location}")
    private String location;

    @Value("${store.discount}")
    private double discountPercentage;

    @Value("${store.delivery}")
    private boolean homeDeliveryAvailable;

    public void showStoreDetails() {
        System.out.println("Store ID: " + storeId);
        System.out.println("Store Name: " + storeName);
        System.out.println("Location: " + location);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Home Delivery: " + homeDeliveryAvailable);
    }

    public double calculateDiscount(double amount) {
        double discount = amount * discountPercentage / 100;
        return amount - discount;
    }
}