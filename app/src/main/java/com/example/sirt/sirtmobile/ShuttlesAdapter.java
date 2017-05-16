package com.example.sirt.sirtmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.sirt.sirtmobile.R.id.semester;

/**
 * Created by hp on 16-May-17.
 */

public class ShuttlesAdapter extends ArrayAdapter<Name> {
    public ShuttlesAdapter(Context context, ArrayList<Name> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_shuttle_list_item, parent, false);
        }

        Name currentWord = getItem(position);

        TextView busNumber = (TextView) listItemView.findViewById(R.id.bus_no);
        busNumber.setText(currentWord.getBusNumber());

        return listItemView;
    }

}