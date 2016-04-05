package de.chefkoch.api.model.recipe;

import java.util.ArrayList;
import java.util.Date;

import de.chefkoch.api.model.IngredientGroup;

public class Recipe extends RecipeBase {
    private Date createdAt;
    private Integer restingTime;
    private Integer cookingTime;
    private Integer totalTime;
    private Integer kCalories;
    private Integer servings;
    private String instructions;
    private String miscellaneousText;
    private String ingredientsText;
    private Integer imagesCount;
    private Long viewCount;
    private ArrayList<String> tags;
    private String sourceName;
    private ArrayList<IngredientGroup> ingredientGroups;

    public Recipe() {

    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getRestingTime() {
        return restingTime;
    }

    public void setRestingTime(final Integer restingTime) {
        this.restingTime = restingTime;
    }

    public Integer getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(final Integer cookingTime) {
        this.cookingTime = cookingTime;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(final Integer totalTime) {
        this.totalTime = totalTime;
    }

    public Integer getkCalories() {
        return kCalories;
    }

    public void setkCalories(final Integer kCalories) {
        this.kCalories = kCalories;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(final Integer servings) {
        this.servings = servings;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(final String instructions) {
        this.instructions = instructions;
    }

    public String getMiscellaneousText() {
        return miscellaneousText;
    }

    public void setMiscellaneousText(final String miscellaneousText) {
        this.miscellaneousText = miscellaneousText;
    }

    public String getIngredientsText() {
        return ingredientsText;
    }

    public void setIngredientsText(final String ingredientsText) {
        this.ingredientsText = ingredientsText;
    }

    public Integer getImagesCount() {
        return imagesCount;
    }

    public void setImagesCount(final Integer imagesCount) {
        this.imagesCount = imagesCount;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(final Long viewCount) {
        this.viewCount = viewCount;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(final ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(final String sourceName) {
        this.sourceName = sourceName;
    }

    public ArrayList<IngredientGroup> getIngredientGroups() {
        return ingredientGroups;
    }

    public void setIngredientGroups(final ArrayList<IngredientGroup> ingredientGroups) {
        this.ingredientGroups = ingredientGroups;
    }
}