/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.chefkoch.training.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import de.chefkoch.api.ApiHelper;
import de.chefkoch.api.model.recipe.Recipe;
import de.chefkoch.api.model.recipe.RecipeSearchResultResponse;
import de.chefkoch.api.service.CkApiClient;
import de.chefkoch.training.app.util.ui.ImageLoader;
import retrofit.Callback;
import retrofit.Response;


public class RecipeActivity extends AppCompatActivity {

    private TextView recipeTitle;
    private ImageView recipeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recipe_simple);

        recipeTitle = (TextView) findViewById(R.id.recipeTitle);
        recipeImage = (ImageView) findViewById(R.id.recipeImage);

        final String id = getIntent().getStringExtra("id");

        new CkApiClient().recipe().getRecipe(id).enqueue(new Callback<Recipe>() {
            @Override
            public void onResponse(Response<Recipe> response) {
                populate(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                Log.e("Recipe", "error loading recipe", t);
            }
        });


    }

    private void populate(Recipe recipe) {

        recipeTitle.setText(recipe.getTitle());
        if (recipe.getPreviewImageId() != null) {
            ImageLoader.loadInto(recipeImage, ApiHelper.getRecipeImageUrl(recipe.getId(), recipe.getPreviewImageId(), ApiHelper.IMAGE_FORMAT_CROP_420x280));
        }
    }
}
