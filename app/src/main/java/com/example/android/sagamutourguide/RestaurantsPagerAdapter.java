package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 28-Mar-18.
 */

class RestaurantsPagerAdapter extends FragmentPagerAdapter {

    private final String[] tabTitles = new String[] {"Right Options", "Meeting Point", "Mr. Biggs", "Olass Cafe"};

    public RestaurantsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RightOptionsFragment();
            case 1:
                return new MeetingPointFragment();
            case 2:
                return new MrBiggsFragment();
            default:
                return new OlassCafeFragment();
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
