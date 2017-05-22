package com.example.sirt.sirtmobile;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 22-May-17.
 */

public class CalendarCulturalActivity extends CalendarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_cultural);

        final ArrayList<MainAdapter> words = new ArrayList<MainAdapter>();

        words.add(new MainAdapter("09/02/2017", "Academic Session Start"));
        words.add(new MainAdapter("09/02/2017", "Registration Day"));
        words.add(new MainAdapter("10/02/2017", "Regular Classes"));
        words.add(new MainAdapter("09/03/2017", "Sagar Utsav Day1"));
        words.add(new MainAdapter("10/03/2017", "Sagar Utsav Day2"));
        words.add(new MainAdapter("11/03/2017", "Sagar Utsav Day3"));
        words.add(new MainAdapter("06/06/2017", "Semester Exams Start"));
        words.add(new MainAdapter("20/06/2017", "Semester Exams End"));

        CalendarCulturalAdapter adapter = new CalendarCulturalAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.cultural_calendar);
        listView.setAdapter(adapter);

    }
}

