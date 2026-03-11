package DesignPattern.Factory;

public class NotificationDemoApp {
    public static void main(String[] args) {

        try {
            NotificationFactory notificationFactory = new NotificationFactory();
            Notification smsObj = notificationFactory.createNotification("SMS");
            smsObj.notify("SMS factory");
            Notification emailObj = notificationFactory.createNotification("Email");
            emailObj.notify("Email Factory");
            Notification exceptionObj = notificationFactory.createNotification("");
            exceptionObj.notify("Exception Occurred");
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }
}
