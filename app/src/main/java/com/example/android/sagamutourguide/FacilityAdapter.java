package com.example.android.sagamutourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Oluwadara on 22-Mar-18.
 */

public class FacilityAdapter extends ArrayAdapter<Facility> {


    //Constructor
    public FacilityAdapter(Activity context, ArrayList<Facility> facilities){
        super(context, 0, facilities);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link Facility} object located at this position in the list
        Facility currentFacility = getItem(position);

        // Get the {@link Facility} object located at this position in the list
        Facility currentImage = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID facility_name
        TextView facilityName = listItemView.findViewById(R.id.facility_item_name);
        // Get the facility name from the current Word object and
        // set this text on the facility name TextView
        facilityName.setText(currentFacility.getFacilityName());

        // Find the TextView in the list_item.xml layout with the ID facility_address
        TextView facilityAddress = listItemView.findViewById(R.id.facility_item_adress);
        // Get the facility address from the current facility object and
        // set this text on the facility address TextView
        facilityAddress.setText(currentFacility.getFacilityAddress());

        // Find the TextView in the list_item.xml layout with the ID facility_description
        TextView facilityDescription = listItemView.findViewById(R.id.facility_item_description);
        // Get the facility address from the current facility object and
        // set this text on the facility address TextView
        facilityDescription.setText(currentFacility.getFacilityDescription());

        // Find the ImageView in the list_item.xml layout with the ID facility image
        ImageView facilityImage = listItemView.findViewById(R.id.facility_item_image);
        // Set the image view to the image resource specified in the current word
        facilityImage.setImageResource(currentImage.getFacilityImage());

        //Find the Image views that make up the gallery and set the image views
        // to the image resources specified
        ImageView galleryOne = listItemView.findViewById(R.id.gallery_one);
        galleryOne.setImageResource(currentImage.getGallery_one());
        ImageView galleryTwo = listItemView.findViewById(R.id.gallery_two);
        galleryTwo.setImageResource(currentImage.getGallery_two());
        ImageView galleryThree = listItemView.findViewById(R.id.gallery_three);
        galleryThree.setImageResource(currentImage.getGallery_three());
        ImageView galleryFour = listItemView.findViewById(R.id.gallery_four);
        galleryFour.setImageResource(currentImage.getGallery_four());


        /**
         * Displays or hides facility price
         **/

        // Find the LinearLayout in the list_item.xml layout with the ID price_container
        LinearLayout priceContainer = listItemView.findViewById(R.id.price_container);

        // Find the TextView in the list_item.xml layout with the ID facility_item_price
        TextView price = listItemView.findViewById(R.id.facility_item_price);

        if (currentFacility.hasPrice()) {
            // Set the price text view to the price specified in the current facility
            price.setText(currentFacility.getFacilityPrice());

            //Make sure the view is visible
            priceContainer.setVisibility(View.VISIBLE);
        }
        else {
            //Otherwise hide the view on the current word
            priceContainer.setVisibility(View.GONE);
        }

        /**
         * Displays or hides facility contact
         **/

        // Find the TextView in the list_item.xml layout with the ID facility_contact
        TextView facilityContact = listItemView.findViewById(R.id.facility_item_contact);

        if (currentFacility.hasContact()) {
            // Set the contact text view to the contact specified in the current facility
            facilityContact.setText(currentFacility.getFacilityContact());

            //Make sure the view is visible
            facilityContact.setVisibility(View.VISIBLE);
        }
        else {
            //Otherwise hide the view on the current facility
            facilityContact.setVisibility(View.GONE);
        }


        /**
         * Displays or hides opening hours container
         **/

        // Find the LinearLayout in the list_item.xml layout with the ID price_container
        LinearLayout openingHoursContainer = listItemView.findViewById(R.id.opening_hours_container);

        // Find the TextView in the list_item.xml layout with the ID facility_item_opening_hours
        TextView facilityOpeningHours = listItemView.findViewById(R.id.facility_item_opening_hours);

        if (currentFacility.hasOpeningHours()) {
            // Set the contact text view to the contact specified in the current facility
            facilityOpeningHours.setText(currentFacility.getFacilityOpeningHours());

            //Make sure the view is visible
            facilityOpeningHours.setVisibility(View.VISIBLE);

            //Make sure the view is visible
            openingHoursContainer.setVisibility(View.VISIBLE);

        }
        else {
            //Otherwise hide the view on the current facility
            facilityOpeningHours.setVisibility(View.GONE);

            //Make sure the view is visible
            openingHoursContainer.setVisibility(View.GONE);
        }

        /**
         * Displays or hides available amenities icons
         **/

        // Find the LinearLayout in the list_item.xml layout with the ID price_container
        LinearLayout availableAmenities = listItemView.findViewById(R.id.available_amenities_icons);

        if (currentFacility.hasAvailableAmenities()) {

            //Make sure the view is visible
            availableAmenities.setVisibility(View.VISIBLE);

        }
        else {
            //Otherwise hide the view on the current facility
            availableAmenities.setVisibility(View.GONE);
        }

        return listItemView;

    }


}
