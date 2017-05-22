package com.example.sirt.sirtmobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 10-May-17.
 */

public class TimeTableActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);


        final ArrayList<TimeTableWord> timeTableList = new ArrayList<>();

        timeTableList.add(new TimeTableWord("II"));
        timeTableList.add(new TimeTableWord("IV"));
        timeTableList.add(new TimeTableWord("VI"));
        timeTableList.add(new TimeTableWord("VIII"));

        TimeTableAdapter adapter = new TimeTableAdapter(this, timeTableList);
        final ListView listView = (ListView) findViewById(R.id.time_table);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent newIntent = new Intent(TimeTableActivity.this, TimeTableSectionActivity.class);
                newIntent.putExtra("position", position);
                startActivity(newIntent);
            }
        });

    }

}
