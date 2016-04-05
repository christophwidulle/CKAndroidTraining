package de.chefkoch.api.model.notification;

import java.io.Serializable;
import java.util.ArrayList;

public class Notification implements Serializable {
    private Boolean hasErrors;
    private ArrayList<NotificationMessage> messages = new ArrayList<NotificationMessage>();

    public Notification() {

    }

    public Boolean getHasErrors() {
        return hasErrors;
    }

    public void setHasErrors(final Boolean hasErrors) {
        this.hasErrors = hasErrors;
    }

    public NotificationMessage getMessage(final Class<? extends NotificationMessage> notificationClass) {
        for (final NotificationMessage message : this.messages) {
            if (notificationClass.isInstance(message)) {
                return message;
            }
        }
        return null;
    }

    public ArrayList<NotificationMessage> getMessages() {
        return messages;
    }

    public void setMessages(final ArrayList<NotificationMessage> messages) {
        this.messages = messages;
    }
}