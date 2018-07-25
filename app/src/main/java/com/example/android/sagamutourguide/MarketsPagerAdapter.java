package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 28-Mar-18.
 */

public class MarketsPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Awolowo", "Sabo", "Falawo"};

    public MarketsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AwolowoMarketFragment();
        } else if (position == 1){
            return new SaboMarketFragment();
        } else {
            return new FalawoMarketFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
