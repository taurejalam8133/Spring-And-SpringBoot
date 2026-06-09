package com.nt.FoodDeliveryScopeApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.nt.config.AppConfig;
//import com.nt.customer.Customer;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Customer c1 = context.getBean(Customer.class);
        Customer c2 = context.getBean(Customer.class);

       
        c1.placeOrder();
        c2.placeOrder();

        System.out.println("DeliveryService HashCode (c1): " +
                c1.getDeliveryService().hashCode());

        System.out.println("DeliveryService HashCode (c2): " +
                c2.getDeliveryService().hashCode());
    }
}
