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
 * Created by Tanveer on 22-May-17.
 */

public class TimeTableSectionActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_table_section_activity);


        final ArrayList<TimeTableWord> timeTableSections = new ArrayList<>();

        timeTableSections.add(new TimeTableWord("Section", "IV A"));
        timeTableSections.add(new TimeTableWord("Section", "IV B"));
        timeTableSections.add(new TimeTableWord("Section", "IV C"));
        timeTableSections.add(new TimeTableWord("Section", "VI A"));
        timeTableSections.add(new TimeTableWord("Section", "VI B"));
        timeTableSections.add(new TimeTableWord("Section", "VI C"));
        timeTableSections.add(new TimeTableWord("Section", "VIII A"));
        // timeTableSections.add(new TimeTableWord("Section", "VIII B"));
        // timeTableSections.add(new TimeTableWord("Section", "VIII C"));

        TimeTableSectionAdapter adapter = new TimeTableSectionAdapter(this, timeTableSections);
        final ListView listView = (ListView) findViewById(R.id.time_table_section_activity);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent newIntent = new Intent(TimeTableSectionActivity.this, TimeTableDetailsActivity.class);
                newIntent.putExtra("position", position);
                startActivity(newIntent);
            }
        });

    }
}
