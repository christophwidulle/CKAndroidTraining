package de.chefkoch.training.app.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import de.chefkoch.api.ApiHelper;
import de.chefkoch.training.app.util.ui.ImageLoader;

/**
 * Created by christophwidulle on 29.09.15.
 */
public class CustomBindings {

    @BindingAdapter({"bind:recipeId", "bind:imageId"})
    public static void loadImage(ImageView imageView, String recipeId, String imageId) {
        loadImage(imageView, recipeId, imageId, ApiHelper.IMAGE_FORMAT_CROP_360X240);
    }

    @BindingAdapter({"bind:recipeId", "bind:imageId", "bind:imageFormat"})
    public static void loadImage(ImageView imageView, String recipeId, String imageId, String imageFormat) {
        if (imageFormat == null) {
            imageFormat = ApiHelper.IMAGE_FORMAT_CROP_360X240;
        }
        if (imageView != null && recipeId != null && imageId != null) {
            String recipeImageUrl = ApiHelper.getRecipeImageUrl(recipeId, imageId, imageFormat);
            ImageLoader.loadInto(imageView,recipeImageUrl);
        }
    }

}
