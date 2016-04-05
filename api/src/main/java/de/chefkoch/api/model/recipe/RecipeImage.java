package de.chefkoch.api.model.recipe;

import java.io.Serializable;

import de.chefkoch.api.model.Image;

public class RecipeImage extends Image implements Serializable {
    private String recipeId;

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(final String recipeId) {
        this.recipeId = recipeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecipeImage that = (RecipeImage) o;

        return !(recipeId != null ? !recipeId.equals(that.recipeId) : that.recipeId != null);

    }

    @Override
    public int hashCode() {
        return recipeId != null ? recipeId.hashCode() : 0;
    }
}