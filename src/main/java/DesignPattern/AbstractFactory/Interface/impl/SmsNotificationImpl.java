package DesignPattern.AbstractFactory.Interface.impl;

import DesignPattern.AbstractFactory.Interface.Notification;

public class SmsNotificationImpl implements Notification {

    @Override
    public void notify(String message) {
        System.out.println("SMS Sent Successfully: " + message);
    }
}
