package DesignPattern.AbstractFactory.AbstractFactory.impl;

import DesignPattern.AbstractFactory.Exception.CustomException;
import DesignPattern.AbstractFactory.AbstractFactory.NotificationAbstractFactory;
import DesignPattern.AbstractFactory.Interface.Notification;
import DesignPattern.AbstractFactory.Interface.impl.CallNotificationImpl;

public class NotificationFactoryCall implements NotificationAbstractFactory {


    @Override
    public Notification getFactory(String factoryType) throws CustomException {
        if (factoryType == "Call")
            return new CallNotificationImpl();
        else
            throw new CustomException("Custom Exception inside NotificationFactoryCall");

    }
}
