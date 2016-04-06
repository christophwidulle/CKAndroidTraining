package de.chefkoch.training.app.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import de.chefkoch.api.ApiHelper;
import de.chefkoch.api.model.recipe.Recipe;
import de.chefkoch.api.model.recipe.RecipeBase;
import de.chefkoch.training.app.R;
import de.chefkoch.training.app.util.ui.ImageLoader;

/**
 * Created by christophwidulle on 06.04.16.
 */
public class RecipeAdapter extends BaseAdapter {

    final List<RecipeBase> recipes;

    public RecipeAdapter(List<RecipeBase> recipes) {
        this.recipes = recipes;
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    @Override
    public Object getItem(int position) {
        return recipes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem;
        if(convertView != null){
            listItem = convertView;
        }else{
            listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipe_list_item, null);
        }
        final TextView title = (TextView) listItem.findViewById(R.id.recipeTitle);
        final ImageView image = (ImageView) listItem.findViewById(R.id.recipeImage);

        final RecipeBase recipe = recipes.get(position);
        title.setText(recipe.getTitle());
        ImageLoader.loadInto(image, ApiHelper.getRecipeImageUrl(recipe.getId(), recipe.getPreviewImageId(), ApiHelper.IMAGE_FORMAT_CROP_420x280));

        return listItem;
    }
}
