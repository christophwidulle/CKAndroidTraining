package de.chefkoch.api.model.notification;

import java.io.Serializable;

public class AbstractNotification implements Serializable {
    private Notification notification = new Notification();

    public AbstractNotification() {

    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(final Notification notification) {
        this.notification = notification;
    }
}