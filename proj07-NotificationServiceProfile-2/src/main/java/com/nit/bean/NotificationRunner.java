package com.nit.bean;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import com.nit.notificationprofile.service.NotificationService;

@Component
public class NotificationRunner implements CommandLineRunner {

    private NotificationService notificationService;

    public NotificationRunner(NotificationService notificationService) {

        this.notificationService = notificationService;
    }

    @Override
    public void run(String... args) throws Exception {

        notificationService.sendNotification();

        notificationService.displayNotificationInfo();
    }
}
