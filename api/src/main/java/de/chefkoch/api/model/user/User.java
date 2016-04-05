package de.chefkoch.api.model.user;

import java.io.Serializable;

public class User implements Serializable {
    public final static String ROLE_USER = "user";
    public final static String ROLE_REGUSER = "reguser";
    public final static String ROLE_MODERATOR = "moderator";
    public final static String ROLE_ADMIN = "admin";

    private String id;
    private String username;
    private int rank;
    private String role;
    private Boolean hasAvatar;
    private Boolean hasPaid;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(final int rank) {
        this.rank = rank;
    }

    public String getRole() {
        return role;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public Boolean getHasAvatar() {
        return hasAvatar;
    }

    public void setHasAvatar(final Boolean hasAvatar) {
        this.hasAvatar = hasAvatar;
    }

    public Boolean getHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(final Boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

}