package com.example.sirt.sirtmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 08-May-17.
 */

public class NameAdapter extends ArrayAdapter<Name> implements Filterable {
    public ArrayList<Name> mList;
    public ArrayList<Name> originalList;
    public NameAdapter(Context context, ArrayList<Name> words) {
        super(context, 0, words);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_peoples_directory_list_item, parent, false);
        }

        Name currentWord = getItem(position);

        TextView facultyNameTextView = (TextView) listItemView.findViewById(R.id.faculty_name);
        facultyNameTextView.setText(currentWord.getFacultyName());

        TextView facultyNumberTextView = (TextView) listItemView.findViewById(R.id.faculty_number);
        facultyNumberTextView.setText(currentWord.getFacultyNumber());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.faculty_image);
        imageView.setImageResource(currentWord.getFacultyImage());

        return listItemView;
    }

}