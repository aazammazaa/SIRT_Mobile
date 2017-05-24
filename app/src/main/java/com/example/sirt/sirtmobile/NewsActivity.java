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
        words.add(new MainAdapter(R.drawable.newspaper, "VI Semester Registration", "Hello, students!\n" +
                "All the students of the 6th semester are requested to come with their student id cards, mark sheets of previous semesters and positively get registered on 09/02/2017. After 09/02/2017 per day penalty will be added to the student's profile."));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV COMING SOON", "The wait is over now. Sagar Utsav 2k17 is coming soon with new themes, new fun. Just be ready to enjoy. "));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV DRESS CODE", "Sagar Utsav 2k17 is coming with dress themes and lots of new fun. Dress theme for Day 1: Red, Black, Blue, Green, and Yellow. Dress theme for Day 2: White for girls and Blue for boys. Dress theme for Day3: Traditional."));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV", "DAY1: Wall Painting, Ramp Walk, Dance And Singing"));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV", "DAY2: Treasure Hunt, Sports"));
        words.add(new MainAdapter(R.drawable.newspaper, "SAGAR UTSAV", "DAY3: Traditional Day, Prize Distribution"));
        words.add(new MainAdapter(R.drawable.newspaper, "VI Semster Main Exam Timetable", "Check out rgpv"));

        NewsAdapter adapter = new NewsAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.news);
        listView.setAdapter(adapter);

    }
}
