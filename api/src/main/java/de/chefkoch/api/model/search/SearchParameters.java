package de.chefkoch.api.model.search;

import java.io.Serializable;
import java.util.Map;

import de.chefkoch.api.ApiHelper;


public class SearchParameters implements Serializable {
    private int orderBy = ApiHelper.FILTER_ORDER_BY_RELEVANCE;
    private int order = ApiHelper.FILTER_ORDER_DESC;
    private String query = "";
    private Boolean hasImage = false;
    private String categories = null;
    private Boolean descendCategories = true;
    private int maximumTime = 0;
    private int minimumRating = 0;
    private String difficulties = null;
    private String userId = null;
    private String similarTo = null;
    private Boolean searchTitles = true;
    private Boolean searchIngredients = true;
    private Boolean searchInstructions = false;

    public SearchParameters()
    {}

    public SearchParameters(final SearchParameters copy) {
        super();
        this.orderBy = copy.orderBy;
        this.order = copy.order;
        this.query = copy.query;
        this.hasImage = copy.hasImage;
        this.categories = copy.categories;
        this.descendCategories = copy.descendCategories;
        this.maximumTime = copy.maximumTime;
        this.minimumRating = copy.minimumRating;
        this.difficulties = copy.difficulties;
        this.userId = copy.userId;
        this.similarTo = copy.similarTo;
        this.searchTitles = copy.searchTitles;
        this.searchIngredients = copy.searchIngredients;
        this.searchInstructions = copy.searchInstructions;
    }


    public int getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(final int orderBy) {
        this.orderBy = orderBy;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(final int order) {
        this.order = order;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(final String query) {
        this.query = query;
    }

    public Boolean getHasImage() {
        return hasImage;
    }

    public void setHasImage(final Boolean hasImage) {
        this.hasImage = hasImage;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(final String categories) {
        this.categories = categories;
    }

    public Boolean getDescendCategories() {
        return descendCategories;
    }

    public void setDescendCategories(final Boolean descendCategories) {
        this.descendCategories = descendCategories;
    }

    public int getMaximumTime() {
        return maximumTime;
    }

    public void setMaximumTime(final int maximumTime) {
        this.maximumTime = maximumTime;
    }

    public int getMinimumRating() {
        return minimumRating;
    }

    public void setMinimumRating(final int minimumRating) {
        this.minimumRating = minimumRating;
    }

    public String getDifficulties() {
        return difficulties;
    }

    public void setDifficulties(final String difficulties) {
        this.difficulties = difficulties;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public String getSimilarTo() {
        return similarTo;
    }

    public void setSimilarTo(final String similiarTo) {
        this.similarTo = similiarTo;
    }

    public Boolean getSearchTitles() {
        return searchTitles;
    }

    public void setSearchTitles(final Boolean searchTitles) {
        this.searchTitles = searchTitles;
    }

    public Boolean getSearchIngredients() {
        return searchIngredients;
    }

    public void setSearchIngredients(final Boolean searchIngredients) {
        this.searchIngredients = searchIngredients;
    }

    public Boolean getSearchInstructions() {
        return searchInstructions;
    }

    public void setSearchInstructions(final Boolean searchInstructions) {
        this.searchInstructions = searchInstructions;
    }

    @Override
    public boolean equals(final Object o) {
        if (o instanceof SearchParameters) {
            final SearchParameters defaultParameters = (SearchParameters) o;
            if (this.orderBy != defaultParameters.getOrderBy()) {
                return false;
            }
            if (this.order != defaultParameters.getOrder()) {
                return false;
            }
            if (!this.hasImage.equals(defaultParameters.getHasImage())) {
                return false;
            }
            if (!(this.categories == null && defaultParameters.getCategories() == null)
                    || (this.categories != null && !this.categories.equals(defaultParameters.getCategories()))) {
                return false;
            }
            if (!this.descendCategories.equals(defaultParameters.getDescendCategories())) {
                return false;
            }
            if (this.maximumTime != defaultParameters.getMaximumTime()) {
                return false;
            }
            if (this.minimumRating != defaultParameters.getMinimumRating()) {
                return false;
            }
            if (!(this.difficulties == null && defaultParameters.getDifficulties() == null)
                    || (this.difficulties != null && !this.difficulties.equals(defaultParameters.getDifficulties()))) {
                return false;
            }
            if (!(this.userId == null && defaultParameters.getUserId() == null) || (this.userId != null && !this.userId.equals(defaultParameters.getUserId()))) {
                return false;
            }
            if (!(this.similarTo == null && defaultParameters.getSimilarTo() == null)
                    || (this.similarTo != null && !this.similarTo.equals(defaultParameters.getSimilarTo()))) {
                return false;
            }
            if (!this.searchTitles.equals(defaultParameters.getSearchTitles())) {
                return false;
            }
            if (!this.searchIngredients.equals(defaultParameters.getSearchIngredients())) {
                return false;
            }
            if (!this.searchInstructions.equals(defaultParameters.getSearchInstructions())) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}