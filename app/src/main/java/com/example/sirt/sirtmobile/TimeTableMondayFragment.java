package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Tanveer on 22-May-17.
 */

public class TimeTableMondayFragment extends Fragment {
    int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.time_table_word_list, container, false);
        //  position = getActivity().getIntent().getExtras().getInt("position");
        //   final ArrayList<TimeTableDetailsWord> list = new ArrayList<TimeTableDetailsWord>();
        //  switch (position) {
        //  }
    }
}
