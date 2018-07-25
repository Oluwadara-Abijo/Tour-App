package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 25-Mar-18.
 */

public class HotelsPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Conference Hotel", "Citizens Suites", "Remo Majestic", "Sagamu Palace" };

    public HotelsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ConferenceFragment();
        } else if (position == 1){
            return new CitizensFragment();
        } else if (position == 2){
            return new RemoMajesticFragment();
        } else {
            return new SagamuPalaceFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
