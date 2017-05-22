package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent feedbackIntent = new Intent(MainActivity.this, FeedbackActivity.class);
                startActivity(feedbackIntent);
            }
        });

        ImageView newsImage = (ImageView) findViewById(R.id.news_image);
        newsImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent newsImageIntent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(newsImageIntent);
            }
        });

        TextView newsText = (TextView) findViewById(R.id.news_text);
        newsText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent newsTextIntent = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(newsTextIntent);
            }
        });

        ImageView calendarImage = (ImageView) findViewById(R.id.calendar_image);
        calendarImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent calendarImageIntent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(calendarImageIntent);
            }
        });

        TextView calendarText = (TextView) findViewById(R.id.calendar_text);
        calendarText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent calendarTextIntent = new Intent(MainActivity.this, CalendarActivity.class);
                startActivity(calendarTextIntent);
            }
        });

        ImageView timetableImage = (ImageView) findViewById(R.id.timetable_image);
        timetableImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent timetimeImageIntent = new Intent(MainActivity.this, TimeTableActivity.class);
                startActivity(timetimeImageIntent);
            }
        });

        TextView timetableText = (TextView) findViewById(R.id.timetable_text);
        timetableText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent timetableTextIntent = new Intent(MainActivity.this, TimeTableActivity.class);
                startActivity(timetableTextIntent);
            }
        });

        ImageView shuttlesImage = (ImageView) findViewById(R.id.shuttles_image);
        shuttlesImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent shuttlesImageIntent = new Intent(MainActivity.this, ShuttlesActivity.class);
                startActivity(shuttlesImageIntent);
            }
        });

        TextView shuttlesText = (TextView) findViewById(R.id.shuttles_text);
        shuttlesText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent shuttlesTextIntent = new Intent(MainActivity.this, ShuttlesActivity.class);
                startActivity(shuttlesTextIntent);
            }
        });

        ImageView peopleImage = (ImageView) findViewById(R.id.directory_image);
        peopleImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent peopleImageIntent = new Intent(MainActivity.this, PeoplesDirectoryActivity.class);
                startActivity(peopleImageIntent);
            }
        });
        TextView peopleText = (TextView) findViewById(R.id.directory_text);
        peopleText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent peopleTextIntent = new Intent(MainActivity.this, PeoplesDirectoryActivity.class);
                startActivity(peopleTextIntent);
            }
        });

        ImageView courseImage = (ImageView) findViewById(R.id.course_image);
        courseImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent courseImageIntent = new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(courseImageIntent);
            }
        });

        TextView courseText = (TextView) findViewById(R.id.course_text);
        courseText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent courseTextIntent = new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(courseTextIntent);
            }
        });

    }
}


