package org.designpatterns;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("email notification ");
    }
}
