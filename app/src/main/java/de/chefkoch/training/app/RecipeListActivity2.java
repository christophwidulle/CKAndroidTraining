package de.chefkoch.training.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import de.chefkoch.api.model.recipe.Recipe;
import de.chefkoch.api.model.recipe.RecipeBase;
import de.chefkoch.api.model.recipe.RecipeSearchResult;
import de.chefkoch.api.model.recipe.RecipeSearchResultResponse;
import de.chefkoch.api.model.search.Search;
import de.chefkoch.api.service.CkApiClient;
import de.chefkoch.training.app.adapter.RecipeAdapter;
import retrofit.Callback;
import retrofit.Response;

public class RecipeListActivity2 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sample_list);

        listView = (ListView) findViewById(R.id.listview);


        Search search = new Search();
        search.getParameters().setMinimumRating(4);

        new CkApiClient().recipe().findRecipes(100, 0, search.asMap()).enqueue(new Callback<RecipeSearchResultResponse>() {
            @Override
            public void onResponse(Response<RecipeSearchResultResponse> response) {
                populate(response.body().getResults());
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }

    private void populate(final List<RecipeSearchResult> recipeSearchResults) {
        final List<RecipeBase> vals = new ArrayList<>();
        for (RecipeSearchResult resultItem : recipeSearchResults) {
            vals.add(resultItem.getRecipe());
        }

        listView.setAdapter(new RecipeAdapter(vals));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final RecipeSearchResult recipeSearchResult = recipeSearchResults.get(position);
                Intent intent = new Intent(getBaseContext(), RecipeActivity.class);
                intent.putExtra("id", recipeSearchResult.getRecipe().getId());
                startActivity(intent);
            }
        });

    }
}
