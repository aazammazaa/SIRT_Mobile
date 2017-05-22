package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 22-May-17.
 */

public class CalendarAcademicActivity extends CalendarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_academic);

        final ArrayList<MainAdapter> words = new ArrayList<MainAdapter>();
        words.add(new MainAdapter("09/02/2017", "Academic Session Start"));
        words.add(new MainAdapter("09/02/2017", "Registration Day"));
        words.add(new MainAdapter("10/02/2017", "Regular Classes"));
        words.add(new MainAdapter("19/03/2017", "VI Semester Mid-Semester Exams Start"));
        words.add(new MainAdapter("21/03/2017", "VI Semester Mid-Semester Exams End"));
        words.add(new MainAdapter("15/04/2017", "ACM Workshop"));
        words.add(new MainAdapter("05/05/2017", "php Workshop"));
        words.add(new MainAdapter("05/05/2017", "WordPress Workshop"));
        words.add(new MainAdapter("23/05/2017", "VI Semester PUT Exams Start"));
        words.add(new MainAdapter("29/05/2017", "VI Semester PUT Exams End"));
        words.add(new MainAdapter("30/05/2017", "External of Microprocessor & Interfacing"));
        words.add(new MainAdapter("29/05/2017", "Software Engg. & Project Management"));
        words.add(new MainAdapter("01/06/2017", "Computer Networking"));
        words.add(new MainAdapter("02/06/2017", "Minor Project"));
        words.add(new MainAdapter("06/06/2017", "Semester Exams Start"));
        words.add(new MainAdapter("20/06/2017", "Semester Exams End"));

        CalendarAcademicAdapter adapter = new CalendarAcademicAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.academic_calendar);
        listView.setAdapter(adapter);

    }
}
