package DesignPattern.Factory;

public class NotificationFactory {

    public Notification createNotification(String notificationType) throws CustomException {
        if (notificationType.equals("SMS"))
            return new SmsNotificationImpl();
        else if (notificationType.equals("Email"))
            return new EmailNotificationImpl();
        else
            throw new CustomException("custom exception occurred");

    }

}
