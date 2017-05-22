package com.example.sirt.sirtmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 22-May-17.
 */

public class CalendarAcademicAdapter extends ArrayAdapter<MainAdapter> {
    public CalendarAcademicAdapter(Context context, ArrayList<MainAdapter> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_calendar_academic_list_item, parent, false);
        }

        MainAdapter currentWord = getItem(position);

        TextView busName = (TextView) listItemView.findViewById(R.id.academic_calendar_date);
        busName.setText(currentWord.getBusName());

        TextView busNumber = (TextView) listItemView.findViewById(R.id.academic_calendar_event);
        busNumber.setText(currentWord.getBusNumber());

        return listItemView;
    }

}
