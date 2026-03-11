package DesignPattern.AbstractFactory;

import DesignPattern.AbstractFactory.Exception.CustomException;
import DesignPattern.AbstractFactory.Interface.Notification;
import DesignPattern.AbstractFactory.AbstractFactory.NotificationAbstractFactory;
import DesignPattern.AbstractFactory.ProducerFactory.NotificationFactoryProducer;

public class NotificationDemoApp {
    public static void main(String[] args) {

        try {
            NotificationAbstractFactory obj = NotificationFactoryProducer.getAbstractFactory("Call");
            Notification notification = obj.getFactory("Call");
            notification.notify("Hi call");

            NotificationAbstractFactory obj1 = NotificationFactoryProducer.getAbstractFactory("Msg");
            Notification notification1 = obj1.getFactory("SMS");
            notification1.notify("Hi msg");

            Notification notification2 = obj1.getFactory("Email");
            notification2.notify("Hi email");



        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}
