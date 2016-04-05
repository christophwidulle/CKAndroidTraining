package de.chefkoch.api.service;

import java.util.Map;

import de.chefkoch.api.model.recipe.Recipe;
import de.chefkoch.api.model.recipe.RecipeSearchResultResponse;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;
import rx.Observable;

/**
 * Created by christophwidulle on 25.09.15.
 */
public interface RecipeApiModule {


    @GET("recipes/{recipeId}")
    Call<Recipe> getRecipe(@Path("recipeId") String recipeId);

    @GET("recipes")
    Call<RecipeSearchResultResponse> findRecipes(@Query("limit") int limit,
                                                       @Query("offset") int offset,
                                                       @QueryMap Map<String, String> params);

}
