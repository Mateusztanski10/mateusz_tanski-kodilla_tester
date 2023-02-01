package com.kodilla.spring.basic.dependency_injection.homework;

public class ChinaNotificationService implements NotificationService {

    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address + ", welcome in China.");
    }

    public void fail(String address) {
        System.out.println("Package not delivered to: " + address + ", sorry, maybe next time.");
    }
}