package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 28-Mar-18.
 */

class ShoppingStoresPagerAdapter extends FragmentPagerAdapter {

    private final String[] tabTitles = new String[] {"Modu", "Citizens", "Somag"};

    public ShoppingStoresPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ModuFragment();
            case 1:
                return new CitiStoreFragment();
            default:
                return new SomagFragment();
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
