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
public class StadiumFragment extends Fragment {


    public StadiumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.facility_list, container, false);

        //Create an array of the facility's properties
        final ArrayList<Facility> facilities = new ArrayList<>();

        facilities.add(new Facility("Sagamu Stadium", "Ikenne Road",
                "Perfect environment for recreational activities", R.drawable.office));

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
