package com.example.sirt.sirtmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.sirt.sirtmobile.R.id.semester;
import static com.example.sirt.sirtmobile.R.id.timing;

/**
 * Created by Tanveer on 22-May-17.
 */

public class TimeTableAdapter extends ArrayAdapter<TimeTableWord> {
    public TimeTableAdapter(Context context, ArrayList<TimeTableWord> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_timetable_list_item, parent, false);
        }

        TimeTableWord currentWord = getItem(position);

        TextView sem = (TextView) listItemView.findViewById(R.id.time_table_sem);
        sem.setText(currentWord.getSem());

        TextView semester = (TextView) listItemView.findViewById(R.id.time_table_semester);
        semester.setText(currentWord.getSemester());

        return listItemView;

    }
}