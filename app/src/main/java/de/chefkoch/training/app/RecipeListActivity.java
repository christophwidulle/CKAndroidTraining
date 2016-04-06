package de.chefkoch.training.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import de.chefkoch.api.model.recipe.Recipe;
import de.chefkoch.api.model.recipe.RecipeSearchResult;
import de.chefkoch.api.model.recipe.RecipeSearchResultResponse;
import de.chefkoch.api.model.search.Search;
import de.chefkoch.api.service.CkApiClient;
import retrofit.Callback;
import retrofit.Response;

public class RecipeListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sample_list);

        listView = (ListView) findViewById(R.id.listview);

        //todo rufe die API auf


    }

    private void populate(final List<RecipeSearchResult> recipeSearchResults) {
        final List<String> listItems = new ArrayList<>();
        for (RecipeSearchResult resultItem : recipeSearchResults) {
            listItems.add(resultItem.getRecipe().getTitle());
        }
        //todo setze der Liste einen Adapter

    }
}
