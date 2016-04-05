package de.chefkoch.training.app.util.ui;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by christophwidulle on 20.11.15.
 */
public class ImageLoader {

    public static void loadInto(ImageView view, String url) {
        Picasso.with(view.getContext()).load(url).into(view);
    }
}
