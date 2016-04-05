package de.chefkoch.api.model.notification;

import java.io.Serializable;

public class Failure implements Serializable {
    private String message;
    private String propertyPath;

    public String getMessage() {
        return message;
    }

    public String getPropertyPath() {
        return propertyPath;
    }
}