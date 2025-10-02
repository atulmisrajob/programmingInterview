package org.designpatterns;


public class FactoryPattern {

    public static Notification getNotification(String type){
        switch (type){
            case "EMAIL": return new EmailNotification();
            case "SMS": return new SmsNotification();
            default: throw new IllegalArgumentException("Unknow type");
        }
    }

    static void main(String[] args) {
        Notification notification=FactoryPattern.getNotification("SMS");
        notification.notifyUser();
    }

}
