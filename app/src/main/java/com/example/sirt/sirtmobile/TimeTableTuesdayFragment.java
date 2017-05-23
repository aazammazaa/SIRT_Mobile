package com.example.sirt.sirtmobile;

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

public class TimeTableTuesdayFragment extends Fragment {

    int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.time_table_word_list, container, false);
        position = getActivity().getIntent().getExtras().getInt("position");
        //return inflater.inflate(R.layout.time_table_word_list, container, false);
        //position = getActivity().getIntent().getExtras().getInt("position");
        final ArrayList<TimeTableDetailsWord> words = new ArrayList<TimeTableDetailsWord>();
        switch (position) {
            case 0: //IV A
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "SE", "Ms. Priyanka Saxena"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "CSO", "Dr. Vipin Tiwari"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", " ", " "));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", " ", " "));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", " ", " "));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", " ", " "));
                words.add(new TimeTableDetailsWord("02:10 PM", "11:00 PM", " ", " "));
                break;
            case 1: //IV B
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", " ", " "));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", " ", " "));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", " ", " "));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", " ", " "));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", " ", " "));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", " ", " "));
                words.add(new TimeTableDetailsWord("02:10 PM", "11:00 PM", " ", " "));
                break;
            case 2: //IV C
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", " ", " "));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", " ", " "));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", " ", " "));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", " ", " "));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", " ", " "));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", " ", " "));
                words.add(new TimeTableDetailsWord("02:10 PM", "11:00 PM", " ", " "));
                break;
            case 3: //VI A
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", " ", " "));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", " ", " "));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", " ", " "));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", " ", " "));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", " ", " "));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", " ", " "));
                words.add(new TimeTableDetailsWord("02:10 PM", "11:00 PM", " ", " "));
                break;
            case 4: //VI B
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", " ", " "));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", " ", " "));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", " ", " "));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", " ", " "));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", " ", " "));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", " ", " "));
                words.add(new TimeTableDetailsWord("02:10 PM", "11:00 PM", " ", " "));
                break;
            case 5: //VI C
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", " ", " "));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", " ", " "));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", " ", " "));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", " ", " "));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", " ", " "));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", " ", " "));
                words.add(new TimeTableDetailsWord("02:10 PM", "11:00 PM", " ", " "));
                break;
            case 6: //VIII A
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", " ", " "));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", " ", " "));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", " ", " "));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", " ", " "));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", " ", " "));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", " ", " "));
                words.add(new TimeTableDetailsWord("02:10 PM", "11:00 PM", " ", " "));
                break;
        }
        TimeTableDetailsWordAdapter adapter = new TimeTableDetailsWordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.time_table_word_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
