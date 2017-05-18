package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 09-May-17.
 */

public class CoursesActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        final TextView scheme = (TextView) findViewById(R.id.scheme_link);
        TextView syllabus = (TextView) findViewById(R.id.syllabus_link);

        final ArrayList<Name> words = new ArrayList<Name>();
        words.add(new Name("I", "Scheme", R.string.scheme_1, "Syllabus", R.string.syallbus_1));
        words.add(new Name("II", "Scheme", R.string.scheme_2, "Syllabus", R.string.syallbus_2));
        words.add(new Name("III", "Scheme", R.string.scheme_3, "Syllabus", R.string.syallbus_3));
        words.add(new Name("IV", "Scheme", R.string.scheme_4, "Syllabus", R.string.syallbus_4));
        words.add(new Name("V", "Scheme", R.string.scheme_5, "Syllabus", R.string.syallbus_5));
        words.add(new Name("VI", "Scheme", R.string.scheme_6, "Syllabus", R.string.syallbus_6));
        words.add(new Name("VII", "Scheme", R.string.scheme_7, "Syllabus", R.string.syallbus_7));
        words.add(new Name("VIII", "Scheme", R.string.scheme_8, "Syllabus", R.string.syallbus_8));

        CourseAdapter adapter = new CourseAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.courses);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    String scheme_0 = "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/090713090713122520.pdf";
                    Intent s0 = new Intent(Intent.ACTION_VIEW);
                    s0.setData(Uri.parse(scheme_0));
                    startActivityForResult(s0, 0);
                }

                if (position == 1) {
                    String scheme_1 = "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/090713090713123107.pdf";
                    Intent s1 = new Intent(Intent.ACTION_VIEW);
                    s1.setData(Uri.parse(scheme_1));
                    startActivityForResult(s1, 0);
                }

                if (position == 2) {
                    String scheme_2 = "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/III%20BE%20CSE070711060414.pdf";
                    Intent s2 = new Intent(Intent.ACTION_VIEW);
                    s2.setData(Uri.parse(scheme_2));
                    startActivityForResult(s2, 0);
                }

                if (position == 3) {
                    String scheme_3 = "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/IV%20BE%20CSE220217034201.pdf";
                    Intent s3 = new Intent(Intent.ACTION_VIEW);
                    s3.setData(Uri.parse(scheme_3));
                    startActivityForResult(s3, 0);
                }

                if (position == 4) {
                    String scheme_4 = "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/V%20BE%20CSE040612034109.pdf";
                    Intent s4 = new Intent(Intent.ACTION_VIEW);
                    s4.setData(Uri.parse(scheme_4));
                    startActivityForResult(s4, 0);
                }

                if (position == 5) {
                    String scheme_5 = "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VI%20Sem%20sceme010411052149.pdf";
                    Intent s5 = new Intent(Intent.ACTION_VIEW);
                    s5.setData(Uri.parse(scheme_5));
                    startActivityForResult(s5, 0);
                }

                if (position == 6) {
                    String scheme_6 = "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VII%20CSE060713121334.pdf";
                    Intent s6 = new Intent(Intent.ACTION_VIEW);
                    s6.setData(Uri.parse(scheme_6));
                    startActivityForResult(s6, 0);
                }

                if (position == 7) {
                    String scheme_7 = "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VIII%20CSE290414054143.pdf";
                    Intent s7 = new Intent(Intent.ACTION_VIEW);
                    s7.setData(Uri.parse(scheme_7));
                    startActivityForResult(s7, 0);
                }
            }
        });
    }
}
