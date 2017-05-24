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

public class TimeTableWednesdayFragment extends Fragment {

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
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "ADC", "Mr. Manohar Joshi"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "TNP Lecture - II", "Mr. Mahendra Joshi"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "ADA", "Mr. Deepak Choudhary"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "Material Sc.", "Mr. Himanshu Nautiyal"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "CSO", "Dr. Vipin Tiwari"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "SE", "Ms. Priyanka Saxena"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "TOC", "Mr. Arun Jhapate"));
                break;
            case 1: //IV B
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "ADC", "Mr. Veerendra Singh"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "SE", "Mr. Rahul Jain"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "TNP Lecture - II", "Mr. Mahendra Joshi"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "TOC", "Mr. Rajesh K Shukla"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "CSO", "Mr. Mayank Namdeo"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "Material Sc.", "Mr. Himanshu Nautiyal"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "ADA", "Mr. Sandeep Waderkar"));
                break;
            case 2: //IV C
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "Material SC.", "Mr. Ankur Shrivastava"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "ADC/ADA Lab", "Mr. Virendara Singh\nMr. Mayank Namdeo"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "ADC/ADA Lab", "Mr. Virendara Singh\nMr. Mayank Namdeo"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "TNP Lecture - II", "Mr. Mahendra Joshi"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "TOC", "Mr. Rajesh K Shukla"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "CSO", "Mr. Dheeresh Soni"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "Library & GD/SS", " "));
                break;
            case 3: //VI A
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "SEPM", "Ms. Priyanka Saxena"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "Microprocessor", "Ms. Sangeeta Shukla"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "PPL", "Ms. Sanyogita Soni"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "CN", "Mr. Sandeep Waderkar"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "CN/Microprocessor Lab", "Mr. Sandeep Waderkar \nMs. Sngeeta Shukla"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "CN/Microprocessor Lab", "Mr. Sandeep Waderkar \nMs. Sngeeta Shukla"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "ACA", "Ms. Mohini Parihar"));
                break;
            case 4: //VI B
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "Microprocessor/SEPM Lab", "Ms. Sngeeta Shukla\nMs.Anjana Nigam"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "Microprocessor/SEPM Lab", "Ms. Sngeeta Shukla\nMs.Anjana Nigam"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "SEPM", "Dr. M Kumar"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "Microprocessor", "Ms. Sngeeta Shukla"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "CN", "Ms. Ruchi Thakur"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "ACA", "Ms. Anjana Nigam"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "PPL", "Ms. Sanyogita Soni"));
                break;
            case 5: //VI C
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "Microprocessor", "Ms. Sngeeta Shukla"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "SEPM", "Mr. Sunil Malviya"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "CN", "Mr.Arun Jhapate"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "ACA", "Ms. Shalu Arya"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "Microprocessor/CN Lab", "Ms. Sangeeta Shukla\nMr. Arun Jhapate"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "Microprocessor/CN Lab", "Ms. Sangeeta Shukla \nMr. Arun Jhapate"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "PPL", "Dr. Vipin Tiwari"));
                break;
            case 6: //VIII A
                words.add(new TimeTableDetailsWord("08:30 AM", "09:20 AM", "Soft Comp.", " Mr. Arun Jhapate"));
                words.add(new TimeTableDetailsWord("09:20 AM", "10:10 AM", "Web Engg.", "Mr. Pawan Sharma"));
                words.add(new TimeTableDetailsWord("10:10 AM", "11:00 AM", "N/W & Web Sec ", "Mr. Ganesh Patidar"));
                words.add(new TimeTableDetailsWord("11:00 AM", "11:50 AM", "Wireless", "Dr. Rashmi Soni"));
                words.add(new TimeTableDetailsWord("12:30 PM", "01:20 PM", "Soft Comp. /Web Engg. Lab", "Mr. Arun Jhapate\nMr. Pawan Sharma"));
                words.add(new TimeTableDetailsWord("01:20 PM", "02:10 PM", "Soft Comp. /Web Engg. Lab", "Mr. Arun Jhapate\nMr. Pawan Sharma"));
                words.add(new TimeTableDetailsWord("02:10 PM", "03:00 PM", "Counselling", " "));
                break;
        }
        TimeTableDetailsWordAdapter adapter = new TimeTableDetailsWordAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.time_table_word_list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
