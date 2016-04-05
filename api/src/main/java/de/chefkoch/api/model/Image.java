package de.chefkoch.api.model;

import java.io.Serializable;

import de.chefkoch.api.model.user.User;

public class Image implements Serializable {
    private String id;
    private Rating rating;
    private User owner;

    public Image() {

    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(final Rating rating) {
        this.rating = rating;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(final User owner) {
        this.owner = owner;
    }
}