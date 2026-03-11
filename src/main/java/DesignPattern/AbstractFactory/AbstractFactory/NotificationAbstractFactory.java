package DesignPattern.AbstractFactory.AbstractFactory;

import DesignPattern.AbstractFactory.Exception.CustomException;
import DesignPattern.AbstractFactory.Interface.Notification;

public interface NotificationAbstractFactory {
    Notification getFactory(String factoryType) throws CustomException;
}
