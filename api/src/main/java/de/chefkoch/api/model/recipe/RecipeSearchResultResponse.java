package de.chefkoch.api.model.recipe;

import java.io.Serializable;
import java.util.List;

public class RecipeSearchResultResponse implements Serializable {
    private Integer count;
    private List<RecipeSearchResult> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public List<RecipeSearchResult> getResults() {
        return results;
    }

    public void setResults(final List<RecipeSearchResult> results) {
        this.results = results;
    }
}