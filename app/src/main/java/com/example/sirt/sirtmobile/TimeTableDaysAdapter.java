package com.example.sirt.sirtmobile;

/**
 * Created by Tanveer on 22-May-17.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class TimeTableDaysAdapter extends FragmentPagerAdapter {

    public TimeTableDaysAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TimeTableMondayFragment();
        } else if (position == 1) {
            return new TimeTableTuesdayFragment();
        } else if (position == 2) {
            return new TimeTableWednesdayFragment();
        } else if (position == 3) {
            return new TimeTableThursdayFragment();
        } else {
            return new TimeTableFridayFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Monday";
            case 1:
                return "Tuesday";
            case 2:
                return "Wednesday";
            case 3:
                return "Thursday";
            case 4:
                return "Friday";
            default:
                return "Saturday";

        }

        //return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
