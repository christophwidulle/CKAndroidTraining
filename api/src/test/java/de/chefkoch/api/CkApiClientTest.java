package de.chefkoch.api;

import org.hamcrest.Matchers;
import org.junit.Test;

import de.chefkoch.api.model.recipe.Recipe;
import de.chefkoch.api.model.recipe.RecipeSearchResultResponse;
import de.chefkoch.api.model.search.Search;
import de.chefkoch.api.service.CkApiClient;
import retrofit.Call;
import rx.Observable;

import static org.junit.Assert.*;

/**
 * Created by christophwidulle on 25.09.15.
 */
public class CkApiClientTest {


    @Test
    public void testRecipeByID() throws Exception {

        CkApiClient apiService = new CkApiClient();

        apiService.addHeader("User-Agent", "New Android App Test :-)");

        Call<Recipe> recipeCall = apiService.recipe().getRecipe("390111126377837");

        final Recipe recipe = recipeCall.execute().body();
        assertNotNull(recipe);
        assertEquals(recipe.getId(), "390111126377837");
    }


    @Test
    public void testRecipes() throws Exception {

        CkApiClient apiService = new CkApiClient();

        apiService.addHeader("User-Agent", "New Android App Test :-)");

        Call<RecipeSearchResultResponse> recipesCall = apiService.recipe().findRecipes(10, 0, null);

        RecipeSearchResultResponse recipes = recipesCall.execute().body();

        assertNotNull(recipes);
        assertThat(recipes.getCount().longValue(), Matchers.greaterThan(10L));
        assertEquals(recipes.getResults().size(), 10);

            Search search = new Search();
        search.getParameters().setHasImage(true);
        search.getParameters().setMinimumRating(4);
        recipesCall = apiService.recipe().findRecipes(10, 0, search.asMap());

        recipes = recipesCall.execute().body();

        assertNotNull(recipes);
        assertThat(recipes.getCount().longValue(), Matchers.greaterThan(10L));
        assertEquals(recipes.getResults().size(), 10);
    }
}