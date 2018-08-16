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
public class ConferenceFragment extends Fragment {


    public ConferenceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.facility_list, container, false);

        //Create an array of filing stations
        final ArrayList<Facility> facilities = new ArrayList<>();

        facilities.add(new Facility("Conference Hotels and Suites", "Plot 11/13," +
                " Kolawole Oye-Igbemo Street, Off Obafemi Awolowo Road, GRA Quarters","From ₦19 500 per night",
                "Description:\n\nConference Hotel and Suites has stylishly furnished rooms of varying categories. " +
                        "Categories of rooms available in this hotel are: Olaitan Apartments with a Studio Room, Luxury Room, " +
                        "Regent, Diplomatic Suite, Ambassadorial and Presidential Suite. These rooms have air-conditioners with " +
                        "well-furnished living rooms, cable TV, fridge, a work desk, a wardrobe with a dressing mirror, telephone," +
                        " shared kitchen facilities and washing machines and an en-suite bathroom.\n\nAdequate " +
                        "facilities are available for guests' comfort at Conference Hotel and Suites. These facilities include:" +
                        " free Wi-Fi, an outdoor swimming pool, a modern gym for guests to engage in workout sessions, a night club," +
                        " barbeque, grill garden, restaurant and bar/lounge where guests can select from a variety of meals and " +
                        "drinks and also relax on the beautiful terrace, 24-hour electricity and an adequate parking " +
                        "space.\n\nAdditional services offered include: 24-hour front desk services, laundry/dry cleaning services," +
                        " shuttle services and car hire, Express Check-in/check-out, ironing service, 24 hours housekeeping/room " +
                        "services, luggage storage, business centre and meeting/banquet facilities. Security personnel have been" +
                        " made available round-the-clock to ensure safety around the premises",
                "Check-In: From " + "9:00 AM\n" + "Check-Out: By 12:00 PM",
                "Contact" + "\n" + "0909 551 9295", "AMENITIES",
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
