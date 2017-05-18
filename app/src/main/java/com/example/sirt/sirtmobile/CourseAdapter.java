package com.example.sirt.sirtmobile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
import static android.support.v7.widget.AppCompatDrawableManager.get;

/**
 * Created by hp on 09-May-17.
 */

public class CourseAdapter extends ArrayAdapter<Name> {
    public CourseAdapter(Context context, ArrayList<Name> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        Name holder = null;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_courses_list_item, parent, false);
        }

        final Name currentWord = getItem(position);

        TextView semester = (TextView) listItemView.findViewById(R.id.semester);
        semester.setText(currentWord.getSemester());

        TextView scheme = (TextView) listItemView.findViewById(R.id.scheme);
        scheme.setText("Scheme");

        TextView schemeLink = (TextView) listItemView.findViewById(R.id.scheme_link);
        schemeLink.setText(currentWord.getSchemeLink());

        TextView syllabus = (TextView) listItemView.findViewById(R.id.syllabus);
        syllabus.setText("Syllabus");

        TextView syllabusLink = (TextView) listItemView.findViewById(R.id.syllabus_link);
        syllabusLink.setText(currentWord.getSyllabusLink());


        TextView clickScheme = (TextView) listItemView.findViewById(R.id.scheme_link);
        TextView clickSyllabus = (TextView) listItemView.findViewById(R.id.syllabus_link);

        clickScheme.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Scheme semester" + (position + 1), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentWord.getScheme()));
                Log.v("none", currentWord.getScheme());
                v.getContext().startActivity(intent);

            }
        });

        clickSyllabus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Syllabus semester" + (position + 1), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentWord.getSyllabus()));
                v.getContext().startActivity(intent);
            }

        });



        return listItemView;
    }

}
