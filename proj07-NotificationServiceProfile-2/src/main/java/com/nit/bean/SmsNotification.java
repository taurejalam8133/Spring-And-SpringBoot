package com.nit.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sms")
public class SmsNotification implements NotificationService {

    @Value("${notification.senderName}")
    private String senderName;

    @Value("${notification.supportEmail}")
    private String supportEmail;

    @Value("${notification.notificationType}")
    private String notificationType;

    @Override
    public void sendNotification() {

        System.out.println("SMS Notification Sent Successfully");
    }

    @Override
    public void displayNotificationInfo() {

        System.out.println("Sender Name : " + senderName);
        System.out.println("Support Email : " + supportEmail);
        System.out.println("Notification Type : " + notificationType);
    }
}
