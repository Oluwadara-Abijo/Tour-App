package com.example.android.sagamutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Oluwadara on 29-Mar-18.
 */

public class OthersPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Stadium", "High Court", "Post Office"};

    public OthersPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new StadiumFragment();
        } else if (position == 1){
            return new HighCourtFragment();
        } else {
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
