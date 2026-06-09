package com.nt.FoodDeliveryScopeApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import com.nt.service.DeliveryService;

@Component
public class Customer {

    private int customerId = (int)(Math.random() * 1000);
    private String customerName = "Ali";

    @Autowired
    private DeliveryService deliveryService;

    public void placeOrder() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        deliveryService.deliverOrder();
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }
}
