package de.chefkoch.api.model.recipe;

import java.io.Serializable;


public class RecipeSearchResult implements Serializable {
    private Double score;
    private RecipeBase recipe;

    public Double getScore() {
        return score;
    }

    public void setScore(final Double score) {
        this.score = score;
    }

    public RecipeBase getRecipe() {
        return recipe;
    }

    public void setRecipe(final RecipeBase recipe) {
        this.recipe = recipe;
    }
}
