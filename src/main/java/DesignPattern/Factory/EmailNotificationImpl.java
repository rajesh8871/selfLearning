package DesignPattern.Factory;

public class EmailNotificationImpl implements Notification {

    @Override
    public void notify(String message) {
        System.out.println("Email Sent !!: " + message);
    }
}
