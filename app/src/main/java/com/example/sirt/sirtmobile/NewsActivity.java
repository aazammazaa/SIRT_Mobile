package com.example.sirt.sirtmobile;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 10-May-17.
 */

public class NewsActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        final ArrayList<MainAdapter> words = new ArrayList<MainAdapter>();
        words.add(new MainAdapter(R.drawable.newspaper, "VI Semester Registration", "09/02/2017 registration of students"));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV", "Coming Soon"));
        words.add(new MainAdapter(R.drawable.newspaper, "MID-SEM", "Dates will be announced soon"));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV", "Food Fun"));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV", "DAY1: Wall Painting, Ramp Walk, Dance And Singing"));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV", "DAY2: Treasure Hunt, Sports"));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV", "DAY3: Traditional Day, Prize Distribution"));
        words.add(new MainAdapter(R.drawable.newspaper, "VI Semster Main Exam Timetable", "Check out rgpv"));

        NewsAdapter adapter = new NewsAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.news);
        listView.setAdapter(adapter);

    }
}
