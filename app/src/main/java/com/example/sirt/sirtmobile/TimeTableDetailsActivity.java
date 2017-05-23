package com.example.sirt.sirtmobile;

/**
 * Created by Tanveer on 22-May-17.
 */

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
//import android.icu.util.Calendar;
import android.icu.util.*;
//import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TabHost;
import java.util.Calendar;

public class TimeTableDetailsActivity extends TimeTableSectionActivity {
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        Intent i = getIntent();
        position = i.getExtras().getInt("position");
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.time_table_detail_main);
        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.time_table_viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        TimeTableDaysAdapter adapter = new TimeTableDaysAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.time_table_sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        //Set default tab
        viewPager.setCurrentItem(dayOfWeek);
    }
}
