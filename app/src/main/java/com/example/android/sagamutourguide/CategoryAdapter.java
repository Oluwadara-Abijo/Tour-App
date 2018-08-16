package com.example.android.sagamutourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Oluwadara on 23-Mar-18.
 */

class CategoryAdapter extends ArrayAdapter<Category> {


    //Constructor
    public CategoryAdapter(Activity context, ArrayList<Category> categories) {
        super(context, 0, categories);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_main, parent, false);
        }

        // Get the {@link Facility} object located at this position in the list
        Category currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID category name text view
        TextView categoryName = listItemView.findViewById(R.id.category_text_view);
        // Get the category name from the current Word object and
        // set this text on the category name TextView
        if (currentWord != null) {
            categoryName.setText(currentWord.getCategoryName());
        }

        // Find the TextView in the list_item.xml layout with the ID category image text view
        ImageView categoryImage = listItemView.findViewById(R.id.category_image_text_view);
        // Get the facility address from the current Word object and
        // set this text on the category image TextView
        if (currentWord != null) {
            categoryImage.setImageResource(currentWord.getImageForCategory());
        }

        return listItemView;

    }
}
