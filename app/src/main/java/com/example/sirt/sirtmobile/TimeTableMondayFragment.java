package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Tanveer on 22-May-17.
 */

public class TimeTableMondayFragment extends Fragment {
    int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.time_table_word_list, container, false);
        position = getActivity().getIntent().getExtras().getInt("position");
        //return inflater.inflate(R.layout.time_table_word_list, container, false);
        //position = getActivity().getIntent().getExtras().getInt("position");
        final ArrayList<TimeTableDetailsWord> words = new ArrayList<TimeTableDetailsWord>();
        switch (position) {
            case 0:
                words.add(new TimeTableDetailsWord("8:30 AM", "9:20 AM", "1SEPM", "SUNIL SIR"));
                words.add(new TimeTableDetailsWord("9:20 AM", "10:10 AM", "1CN", "ARUN SIR"));
                words.add(new TimeTableDetailsWord("10:10AM", "11:00 AM", "1MICRO", "SANGEETA MA'AM"));

                break;
            case 1:
                words.add(new TimeTableDetailsWord("8:30 AM", "9:20 AM", "CN", "aHHH"));
                words.add(new TimeTableDetailsWord("9:20 AM", "10:10 AM", "2", "ARUN SIR"));
                words.add(new TimeTableDetailsWord("10:10AM", "11:00 AM", "2", "SANGEETA MA'AM"));
                break;
        }
        TimeTableDetailsWordAdapter adapter = new TimeTableDetailsWordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.time_table_word_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
