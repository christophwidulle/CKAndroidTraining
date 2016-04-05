package de.chefkoch.api.model;

import java.io.Serializable;
import java.util.ArrayList;

public class IngredientGroup implements Serializable  {
    private String header;
    private ArrayList<Ingredient> ingredients;

    public IngredientGroup() {

    }

    public String getHeader() {
        return header;
    }

    public void setHeader(final String header) {
        this.header = header;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(final ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Boolean hasHeader() {
        return this.header != null && !this.header.isEmpty();
    }
}