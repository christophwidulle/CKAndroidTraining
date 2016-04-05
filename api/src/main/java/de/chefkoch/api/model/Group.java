package de.chefkoch.api.model;

import java.io.Serializable;

public class Group implements Serializable {
    private String id;
    private String name;
    private Long memberCount;
    private Boolean hasImage;

    public Group() {

    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Long getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(final Long memberCount) {
        this.memberCount = memberCount;
    }

    public Boolean getHasImage() {
        return hasImage;
    }

    public void setHasImage(final Boolean hasImage) {
        this.hasImage = hasImage;
    }
}