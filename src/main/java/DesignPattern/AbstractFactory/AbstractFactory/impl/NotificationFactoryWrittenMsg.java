package DesignPattern.AbstractFactory.AbstractFactory.impl;

import DesignPattern.AbstractFactory.Exception.CustomException;
import DesignPattern.AbstractFactory.Interface.Notification;
import DesignPattern.AbstractFactory.AbstractFactory.NotificationAbstractFactory;
import DesignPattern.AbstractFactory.Interface.impl.EmailNotificationImpl;
import DesignPattern.AbstractFactory.Interface.impl.SmsNotificationImpl;

public class NotificationFactoryWrittenMsg implements NotificationAbstractFactory {
    @Override
    public Notification getFactory(String factoryType) throws CustomException {
        if (factoryType.equals("SMS"))
            return new SmsNotificationImpl();
        else if (factoryType.equals("Email"))
            return new EmailNotificationImpl();
        else
            throw new CustomException("Custom Exception NotificationFactoryWrittenMsg");
    }
}
