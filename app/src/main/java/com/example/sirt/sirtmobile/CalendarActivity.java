package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Vini Mishra on 10-May-17.
 */

public class CalendarActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        ImageView academicImage = (ImageView) findViewById(R.id.academic_calendar_image);
        academicImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent academicImageIntent = new Intent(CalendarActivity.this, CalendarAcademicActivity.class);
                startActivity(academicImageIntent);
            }
        });

        TextView academicText = (TextView) findViewById(R.id.academic_calendar_text);
        academicText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent academicTextIntent = new Intent(CalendarActivity.this, CalendarAcademicActivity.class);
                startActivity(academicTextIntent);
            }
        });

        ImageView calendarCulturalImage = (ImageView) findViewById(R.id.cultural_calendar_image);
        calendarCulturalImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent calendarCulturalImageIntent = new Intent(CalendarActivity.this, CalendarCulturalActivity.class);
                startActivity(calendarCulturalImageIntent);
            }
        });

        TextView calendarCulturalText = (TextView) findViewById(R.id.cultural_calendar_text);
        calendarCulturalText.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent calendarCulturalTextIntent = new Intent(CalendarActivity.this, CalendarCulturalActivity.class);
                startActivity(calendarCulturalTextIntent);
            }
        });
    }
}
