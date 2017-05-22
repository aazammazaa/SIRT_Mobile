package com.example.sirt.sirtmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 17-May-17.
 */

public class ShuttleDetailsAdapter extends ArrayAdapter<MainAdapter> {
    public ShuttleDetailsAdapter(Context context, ArrayList<MainAdapter> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_shuttle_details_list_item, parent, false);
        }

        MainAdapter currentWord = getItem(position);

        TextView timing = (TextView) listItemView.findViewById(R.id.timing);
        timing.setText(currentWord.getBusName());

        TextView stopName = (TextView) listItemView.findViewById(R.id.stop_name);
        stopName.setText(currentWord.getBusNumber());

        return listItemView;
    }

}
