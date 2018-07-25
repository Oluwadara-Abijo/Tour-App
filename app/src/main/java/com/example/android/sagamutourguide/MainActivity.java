package com.example.android.sagamutourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facility_list);

        //Create an array of hospitals
        final ArrayList<Category> categories = new ArrayList<>();

        categories.add(new Category("Hotels", R.drawable.hotel));
        categories.add(new Category("Restaurants", R.drawable.restaurant));
        categories.add(new Category("Shopping Stores", R.drawable.shopping_store));
        categories.add(new Category("Markets", R.drawable.market));
        categories.add(new Category("Offices", R.drawable.office));


        // Create an {@link FacilityAdapter}, whose data source is a list of {@link Facility}s. The
        // adapter knows how to create list items for each item in the list.
        final CategoryAdapter adapter = new CategoryAdapter(this, categories);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called facility_list, which is declared in the
        // facility_list xml layout file.
        final ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        //Create a new intent to open the {@link HotelsActivity}
                        Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                        //Start the new activity
                        startActivity(hotelsIntent);
                        break;
                    case 1:
                        //Create a new intent to open the {@link HotelsActivity}
                        Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                        //Start the new activity
                        startActivity(restaurantsIntent);
                        break;
                    case 2:
                        //Create a new intent to open the {@link HotelsActivity}
                        Intent shoppingStoresIntent = new Intent(MainActivity.this, ShoppingStoresActivity.class);
                        //Start the new activity
                        startActivity(shoppingStoresIntent);
                        break;
                    case 3:
                        //Create a new intent to open the {@link HotelsActivity}
                        Intent marketsIntent = new Intent(MainActivity.this, MarketsActivity.class);
                        //Start the new activity
                        startActivity(marketsIntent);
                        break;
                    default:
                        //Create a new intent to open the {@link HotelsActivity}
                        Intent othersIntent = new Intent(MainActivity.this, OthersActivity.class);
                        //Start the new activity
                        startActivity(othersIntent);
                }

            }
        });
    }
}
