package com.example.android.sagamutourguide;

/**
 * Created by Oluwadara on 23-Mar-18.
 */

public class Category {

    //Name of category
    private String mCategoryName;

    //Background image for category
    private int mImageForCategory;


    //Define constructor1
    public Category(String categoryName, int imageForCategory) {
        mCategoryName = categoryName;
        mImageForCategory = imageForCategory;
    }


    //Get the name of category
    public String getCategoryName() {
        return mCategoryName;
    }

    //Get image for category
    public int getImageForCategory() {
        return mImageForCategory;
    }
}
