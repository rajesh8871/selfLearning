package DesignPattern.Factory;

public class SmsNotificationImpl implements Notification {

    @Override
    public void notify(String message) {
        System.out.println("SMS Sent Successfully: " + message);
    }
}
