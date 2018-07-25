package com.example.android.sagamutourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SagamuPalaceFragment extends Fragment {


    public SagamuPalaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.facility_list, container, false);

        //Create an array of filing stations
        final ArrayList<Facility> facilities = new ArrayList<>();

        facilities.add(new Facility("Sagamu Palace Hotel",
                "Palace Quarters, GRA Quarters", "From 4 000 per night",
                "Description:\n\nRooms available are categorised into Legacy Rooms, Mini Executive Down" +
                        "and Mini Executive Up. Each room is equipped with air-conditioning units, beautiful wall arts," +
                        "reading desk and chair, cable connected TV, make-up mirror, telephone, sofa and an en-suite" +
                        "bathroom.\n\nGuests can enjoy a relaxing dip in the outdoor swimming pool or engage in workout" +
                        " sessions at the fully equipped gym. The on-site restaurant serves a variety of meals while the" +
                        " bar is fully stocked with various kinds of alcoholic and non-alcoholic drinks from which guests" +
                        " can order from. This hotel is guarded by security personnel and has an on-site parking " +
                        "space. \n\nA 24-hour room service, laundry/dry cleaning and concierge services are rendered" +
                        " by the hotel on request.\n\n",
                "Check In: From 2:00 PM (ID Required)\n" + "Check Out: By 12:00 PM",
                "Contact: 08012345678",
                "AMENITIES",
                R.drawable.conference_outside, R.drawable.conference_room4, R.drawable.conference_restaurant,
                R.drawable.conference_in, R.drawable.conference_gym));

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
