package com.nt.FoodDeliveryScopeApp;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DeliveryService {

    private String serviceName = "Swiggy Delivery";
    private int totalOrders = 0;

    public void deliverOrder() {
        totalOrders++;
        System.out.println("Order delivered successfully!");
    }

    public void showServiceInfo() {
        System.out.println("Service Name: " +serviceName);
        System.out.println("Total Orders Delivered: " +totalOrders);
    }
}
