package de.chefkoch.api.model.notification;

import java.io.Serializable;

public class NotificationMessage implements Serializable {
    public static final String IDENTIFIER_FIELD = "identifier";

    public static final String IDENTIFIER_INVALID_PARAMETER = "invalid_parameter";
    public static final String IDENTIFIER_CONFLICT = "conflict";

    public static final String TYPE_INFO = "info";
    public static final String TYPE_WARNING = "warning";
    public static final String TYPE_ERROR = "error";
    public static final String TYPE_SUCCESS = "success";

    private String type;
    private String identifier;

    public NotificationMessage() {

    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }
}