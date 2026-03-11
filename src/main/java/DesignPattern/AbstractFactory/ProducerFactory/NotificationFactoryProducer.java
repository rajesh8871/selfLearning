package DesignPattern.AbstractFactory.ProducerFactory;

import DesignPattern.AbstractFactory.AbstractFactory.impl.NotificationFactoryWrittenMsg;
import DesignPattern.AbstractFactory.Exception.CustomException;
import DesignPattern.AbstractFactory.AbstractFactory.NotificationAbstractFactory;
import DesignPattern.AbstractFactory.AbstractFactory.impl.NotificationFactoryCall;

public class NotificationFactoryProducer {
    public static NotificationAbstractFactory getAbstractFactory(String factoryType) throws CustomException {
        if (factoryType.equals("Call"))
            return new NotificationFactoryCall();
        else if (factoryType.equals("Msg"))
            return new NotificationFactoryWrittenMsg();
        else
            throw new CustomException("custom excpetion NotificationFactoryProducer");
    }
}
