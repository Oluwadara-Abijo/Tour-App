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
public class RemoMajesticFragment extends Fragment {


    public RemoMajesticFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.facility_list, container, false);

        //Create an array of filing stations
        final ArrayList<Facility> facilities = new ArrayList<>();

        facilities.add(new Facility("Remo Majestic Hotel",
                "Afolabi Kehinde Avenue, off Sagamu/ Benin Expressway, Sagamu, Ogun State.",
                "From ₦4 500 per night",
                "Description:\n\nThe Remo Majestic Hotel offers rooms in the categories of Executive," +
                        " Ambassador, Luxury, Atlantic Standard, Presidential Suite, Atlantic Superior, and Atlantic Suite." +
                        " Rooms at Remo Majestic Hotel come with amenities such as flat screen television sets, sofa and" +
                        " centre table, arm chairs and desks, refrigerators, private bathrooms with stand-in shower facilities," +
                        " intercom system, plush beds, and wireless internet access.\n\nSufficient parking space, a restaurant" +
                        " with a menu of great tasting dishes, a bar/lounge, fitness centre and gym, uninterrupted power supply," +
                        " conference and event hall facilities, and adequate security are available to guests at the" +
                        " Remo Majestic Hotels.",
                "Check in: From 12:00pm\n" + "Check out : By 12:00pm",
                "Contact: 08012345678",
                "AMENITIES", R.drawable.remo_majestic_outside, R.drawable.remo_majestic_room1,
                R.drawable.remo_majestic_in, R.drawable.remo_majestic_room2, R.drawable.remo_majestic_bath));

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
