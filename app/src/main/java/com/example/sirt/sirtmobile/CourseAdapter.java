package com.example.sirt.sirtmobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 09-May-17.
 */

public class CourseAdapter extends ArrayAdapter<Name> {
    public CourseAdapter(Context context, ArrayList<Name> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_courses_list_item, parent, false);
        }

        Name currentWord = getItem(position);

        TextView semester = (TextView) listItemView.findViewById(R.id.semester);
        semester.setText(currentWord.getSemester());

        TextView scheme = (TextView) listItemView.findViewById(R.id.scheme);
        scheme.setText(currentWord.getScheme());

        TextView schemeLink = (TextView) listItemView.findViewById(R.id.scheme_link);
        schemeLink.setText(currentWord.getSchemeLink());

        TextView syllabus = (TextView) listItemView.findViewById(R.id.syllabus);
        syllabus.setText(currentWord.getSyllabus());

        TextView syllabusLink = (TextView) listItemView.findViewById(R.id.syllabus_link);
        syllabusLink.setText(currentWord.getSyllabusLink());

        return listItemView;
    }

}
