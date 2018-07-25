package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 28-Mar-18.
 */

public class RestaurantsPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Right Options", "Meeting Point", "Mr. Biggs", "Olass Cafe"};

    public RestaurantsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RightOptionsFragment();
        } else if (position == 1){
            return new MeetingPointFragment();
        } else if (position == 2){
            return new MrBiggsFragment();
        } else {
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
