package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 25-Mar-18.
 */

class HotelsPagerAdapter extends FragmentPagerAdapter {

    private final String[] tabTitles = new String[] { "Conference Hotel", "Citizens Suites", "Remo Majestic", "Sagamu Palace" };

    public HotelsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ConferenceFragment();
            case 1:
                return new CitizensFragment();
            case 2:
                return new RemoMajesticFragment();
            default:
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
