package com.example.android.sagamutourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CitizensFragment extends Fragment {


    public CitizensFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.facility_list, container, false);

        //Create an array of filing stations
        final ArrayList<Facility> facilities = new ArrayList<>();

        facilities.add(new Facility("Citizens Suites",
                "63, Paddy Arikawe Street, GRA Quarters",
                "From ₦14 000 per night",
                "Description:\n\nEach room is fitted with air conditioning units so that guests would feel" +
                        " refreshed. Guests can keep themselves entertained by watching the flat screen TV. The en-suite" +
                        " bathroom is modern and tidy. Glass door showers have been put in the bathrooms. The king-sized " +
                        "bed is soft and comes with clean sheets. Guests are free to pick their room of choice from Classic," +
                        " Supreme, Executive, Supremo, Super Executive Supreme and Royal Executive Suites categories." +
                        "\n\nCitizen Suites Sagamu has provided facilities that guests can use at their leisure." +
                        "The swimming pool affords guests the liberty to take a relaxing dip after a long day. Exercise and" +
                        " workout sessions can be held at the gym. The restaurant does a good job of serving mouthwatering dishes" +
                        " to guests. Alcoholic and non-alcoholic drinks can be gotten from the bar. Guests have unlimited access" +
                        " to the Wi-Fi facility provided by Citizen Suites Sagamu.\n\nGuests can park their cars with ease at" +
                        "the spacious parking space. Additional services rendered by Citizen Suites Sagamu include laundry/dry" +
                        " cleaning, car hire and 24 hours room services. This hotel is a guarded complex.",
                "Check in: From 9:00 am \nCheck out: By 12:00 pm",
                "Contact: 08168234923, 07017731039",
                "AMENITIES", R.drawable.citizens_outside, R.drawable.citizens_room1,
                R.drawable.citizens_food, R.drawable.citizens_room2, R.drawable.citizens_outdoor));

        // Create an {@link FacilityAdapter}, whose data source is a list of {@link Facility}s. The
        // adapter knows how to create list items for each item in the list.
        FacilityAdapter adapter = new FacilityAdapter(getActivity(), facilities);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // facility_list xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
