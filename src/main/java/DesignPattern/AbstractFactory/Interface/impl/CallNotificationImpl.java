package DesignPattern.AbstractFactory.Interface.impl;

import DesignPattern.AbstractFactory.Interface.Notification;

public class CallNotificationImpl implements Notification {

    @Override
    public void notify(String message) {
        System.out.println("Call Notification Sent: " + message);
    }
}
