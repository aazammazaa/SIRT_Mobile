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
            case 0: //IV A
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "CSO", "Dr. Vipin Tiwari"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "ADC", "Mr. Manohar Joshi"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "TOC", "Mr. Arun Jhapate"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "ADA", "Mr. Deepak Choudhary"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "ADC Batch I, ADA Batch II Lab", "Mr. Manohar Joshi\nMr. Deepak Choudhary"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "ADC Batch I, ADA Batch II Lab", "Mr. Manohar Joshi\nMr. Deepak Choudhary"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "Library & GD/SS", "Mr. Mahendra Joshi"));
                break;
            case 1: //IV B
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "CSO", "Mr. Mayank Namdeo"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "ADA", "Mr. Sandeep Waderkar"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "SE", "Mr. Rahul Jain"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "TOC", "Mr. Rajesh K Shukla"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "ADC", "Mr. Virendra Singh"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "CSO/Python Lab", "Mr. Mayank Namdeo \nMr. Sunil Malviya"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "CSO/Python Lab", "Mr. Mayank Namdeo \nMr. Sunil Malviya"));
                break;

            case 2: //IV C
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "SE", "Mr. Anjana Nigam"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "CSO", "Mr. Dheeresh Soni"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "ADC/ADA Lab", "Mr. Virendra Singh\nMr. Mayank Namdeo"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "ADC/ADA Lab", "Mr. Virendra Singh\nMr. Mayank Namdeo"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "TOC", "Mr. Rajesh k Shukla"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "ADC", "Mr. Virendra Singh"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "ADA", "Mr. Mayank Namdeo"));
                break;
            case 3: //VI A
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "Microprocessor", "Ms. Sangeeta Shukla"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "TNP Lecture - I", "Mr. Keshav Choudhary"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "PPL", "Ms. Sanyogita Soni"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "ACA", "Ms. Mohini Parihar"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "SEPM", "Ms. Priyanka Saxena"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "CN", "Mr. Sandeep Waderkar"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "ACA", "Ms. Mohini Parihar"));
                break;
            case 4: //VI B
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "PPL", "Ms. Sanyogita Soni"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "Microprocessor", "Ms. Sangeeta Shukla"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "TNP Lecture - I", "Mr. Keshav Choudhary"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "SEPM", "Dr. M Kumar"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "CN", "Ms. Ruchi Thakur"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "Microprocessor/SEPM Lab", "Ms. Sangeeta Shukla\nMs. Anjana Nigam"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "Microprocessor/SEPM Lab", "Ms. Sangeeta Shukla\nMs. Anjana Nigam"));
                break;
            case 5: //VI C
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "SEPM", "Mr. Sunil Malviya"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "PPL", "Dr. Vipin Tiwari"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "Microprocessor/SEPM Lab", "Ms. Sangeeta Shukla\nMr. Sunil Malviya"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "Microprocessor/SEPM Lab", "Ms. Sangeeta Shukla\nMr. Sunil Malviya"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "Microprocessor", "Ms. Sangeeta Shukla"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "TNP Lecture - I", "Mr. Keshav Choudhary"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "CN", "Mr. Arun Jhapate"));
                break;
            case 6: //VIII A
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "N/W & Web Sec ", "Mr. Ganesh Patidar"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "Soft Comp.", " Mr. Arun Jhapate"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "Web Engg.", "Mr. Pawan Sharma"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "Wireless", "Dr. Rashmi Soni"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "Major Project \nComputer Center",
                        "Mr. Pawan Sharma \nDr. Rashmi Soni \nMr. Rahul Jain "));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "Major Project \nComputer Center",
                        "Mr. Pawan Sharma \nDr. Rashmi Soni \nMr. Rahul Jain "));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "Major Project \nComputer Center",
                        "Mr. Pawan Sharma \nDr. Rashmi Soni \nMr. Rahul Jain "));
                break;
        }
        TimeTableDetailsWordAdapter adapter = new TimeTableDetailsWordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.time_table_word_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
