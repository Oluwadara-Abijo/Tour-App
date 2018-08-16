package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 29-Mar-18.
 */

class OthersPagerAdapter extends FragmentPagerAdapter {

    private final String[] tabTitles = new String[] {"Stadium", "High Court", "Post Office"};

    public OthersPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new StadiumFragment();
            case 1:
                return new HighCourtFragment();
            default:
                return new PostOfficeFragment();
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
