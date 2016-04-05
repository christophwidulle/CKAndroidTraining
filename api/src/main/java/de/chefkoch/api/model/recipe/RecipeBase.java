package de.chefkoch.api.model.recipe;

import java.io.Serializable;

import de.chefkoch.api.model.Rating;
import de.chefkoch.api.model.user.User;

public class RecipeBase implements Serializable {
    public static final int DIFFICULTY_NONE = 0;
    public static final int DIFFICULTY_SIMPLE = 1;
    public static final int DIFFICULTY_NORMAL = 2;
    public static final int DIFFICULTY_ADVANCED = 3;

    public static final int TYPE_PUBLIC = 0;
    public static final int TYPE_PRIVATE = 1;
    public static final int TYPE_SUBMITTED = 2;

    private String id;
    private String title;
    private String subtitle;
    private Integer preparationTime;
    private Integer difficulty;
    private Boolean hasImage;
    private Rating rating;
    private Integer type;
    private Boolean hasVoted;
    private User owner;
    private String previewImageId;
    private String siteUrl;
    private Boolean isSubmitted;
    //not used right now, we deserialize it anyway, as we will need it later for recipe entry
    //this member means a recipe was submitted, checked and rejected by the moderators
    @SuppressWarnings("unused")
    private Boolean isRejected;

    private Boolean hasVideo;
    private String recipeVideoId;

    public RecipeBase() {

    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(final String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(final Integer preparationTime) {
        this.preparationTime = preparationTime;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(final Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Boolean getHasImage() {
        return hasImage;
    }

    public void setHasImage(final Boolean hasImage) {
        this.hasImage = hasImage;
    }

    public void isSubmitted(final Boolean isSubmitted) {
    		this.isSubmitted = isSubmitted;
    }

    public Boolean getIsSubmitted() {
    		return isSubmitted;
    }

    public void isRejected(final Boolean isRejected) {
    		this.isRejected = isRejected;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(final Rating rating) {
        this.rating = rating;
    }

    public Integer getType() {
        return type;
    }

    public void setType(final Integer type) {
        this.type = type;
    }

    public Boolean getHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(final Boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(final User owner) {
        this.owner = owner;
    }

    public String getPreviewImageId() {
        return previewImageId;
    }

    public void setPreviewImageId(final String previewImageId) {
        this.previewImageId = previewImageId;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(final String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public Boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public String getRecipeVideoId() {
        return recipeVideoId;
    }

    public void setRecipeVideoId(String recipeVideoId) {
        this.recipeVideoId = recipeVideoId;
    }

    @Override
    public boolean equals(final Object o) {
        //TODO: check implemenation, this is technically wrong, but some other code might rely on this behavior
        if (o instanceof RecipeBase) {
            final RecipeBase otherObject = (RecipeBase) o;
            if (otherObject.getId() != null && this.id != null && otherObject.getId().equals(this.id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}