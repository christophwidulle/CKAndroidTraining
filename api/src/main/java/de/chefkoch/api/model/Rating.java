package de.chefkoch.api.model;

import java.io.Serializable;

public class Rating implements Serializable {
    private Double rating;
    private Long numVotes;

    public Rating() {

    }

    public Double getRating() {
        return rating;
    }

    public void setRating(final Double rating) {
        this.rating = rating;
    }

    public Long getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(final Long numVotes) {
        this.numVotes = numVotes;
    }
}