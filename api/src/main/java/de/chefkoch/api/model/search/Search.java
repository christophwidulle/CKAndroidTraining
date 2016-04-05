package de.chefkoch.api.model.search;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Search implements Serializable {
    private String descriptionText = "";
    private SearchParameters parameters = new SearchParameters();

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(final String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public SearchParameters getParameters() {
        return parameters;
    }

    public void setParameters(final SearchParameters parameters) {
        this.parameters = parameters;
    }

    public Map<String, String> asMap() {
        Map<String, String> params = new HashMap<>();
        params.put("orderBy", String.valueOf(parameters.getOrderBy()));
        params.put("order", String.valueOf(parameters.getOrder()));
        params.put("query", parameters.getQuery());
        params.put("hasImage", parameters.getHasImage() ? "1" : "0");
        if (parameters.getCategories() != null) {
            params.put("categories", parameters.getCategories());
        }
        params.put("descendCategories", parameters.getDescendCategories() ? "1" : "0");
        params.put("maximumTime", String.valueOf(parameters.getMaximumTime()));
        params.put("minimumRating", String.valueOf(parameters.getMinimumRating()));
        if (parameters.getDifficulties() != null) {
            params.put("difficulties", parameters.getDifficulties());
        }
        if (parameters.getUserId() != null) {
            params.put("userId", parameters.getUserId());
        }
        if (parameters.getSimilarTo() != null) {
            params.put("similarTo", parameters.getSimilarTo());
        }
        params.put("searchTitles", parameters.getSearchTitles() ? "1" : "0");
        params.put("searchIngredients", parameters.getSearchIngredients() ? "1" : "0");
        params.put("searchInstructions", parameters.getSearchInstructions() ? "1" : "0");
        return params;
    }


}