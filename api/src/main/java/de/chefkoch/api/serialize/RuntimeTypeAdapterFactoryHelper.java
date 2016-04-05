package de.chefkoch.api.serialize;


import de.chefkoch.api.model.notification.NotificationMessage;
import de.chefkoch.api.model.notification.message.Conflict;
import de.chefkoch.api.model.notification.message.InvalidParameter;

public class RuntimeTypeAdapterFactoryHelper {
    public static RuntimeTypeAdapterFactory<NotificationMessage> getNotificationRuntimeTypeAdapterFactory() {
        final RuntimeTypeAdapterFactory<NotificationMessage> notificationAdapter = RuntimeTypeAdapterFactory
                .of(NotificationMessage.class, NotificationMessage.IDENTIFIER_FIELD)
                .registerSubtype(InvalidParameter.class, NotificationMessage.IDENTIFIER_INVALID_PARAMETER)
                .registerSubtype(Conflict.class, NotificationMessage.IDENTIFIER_CONFLICT);
        return notificationAdapter;
    }

}
