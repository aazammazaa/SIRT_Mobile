package com.example.sirt.sirtmobile;

/**
 * Created by hp on 23-May-17.
 */

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Tanveer on 19-Feb-17.
 */

public class TimeTableDetailsWordAdapter extends ArrayAdapter<TimeTableDetailsWord> {
    private int mColourResourceId;

    public TimeTableDetailsWordAdapter(Context context, ArrayList<TimeTableDetailsWord> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.time_table_details_list_item, parent, false);
        }
        TimeTableDetailsWord currentWordAdapter = getItem(position);

        TextView timingFrom = (TextView) listItemView.findViewById(R.id.timing_from);
        TextView timingTo = (TextView) listItemView.findViewById(R.id.timing_to);
        TextView subject = (TextView) listItemView.findViewById(R.id.subject);
        TextView faculty = (TextView) listItemView.findViewById(R.id.faculty_incharge);

        timingFrom.setText(currentWordAdapter.getTimingFrom());
        timingTo.setText(currentWordAdapter.getTimingTo());
        subject.setText(currentWordAdapter.getSubject());
        faculty.setText(currentWordAdapter.getFaculty());

        return listItemView;
    }
}