package DesignPattern.AbstractFactory.Interface.impl;

import DesignPattern.AbstractFactory.Interface.Notification;

public class EmailNotificationImpl implements Notification {

    @Override
    public void notify(String message) {
        System.out.println("Email Sent !!: " + message);
    }
}
