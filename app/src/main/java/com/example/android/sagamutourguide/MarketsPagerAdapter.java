package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 28-Mar-18.
 */

class MarketsPagerAdapter extends FragmentPagerAdapter {

    private final String[] tabTitles = new String[] {"Awolowo", "Sabo", "Falawo"};

    public MarketsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AwolowoMarketFragment();
            case 1:
                return new SaboMarketFragment();
            default:
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
