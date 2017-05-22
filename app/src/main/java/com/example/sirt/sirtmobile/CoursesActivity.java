package com.example.sirt.sirtmobile;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 09-May-17.
 */

public class CoursesActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        final ArrayList<MainAdapter> words = new ArrayList<MainAdapter>();
        words.add(new MainAdapter("I", getResources().getString(R.string.scheme_1),
                "Download", getResources().getString(R.string.syallbus_1), "Download"));
        words.add(new MainAdapter("II", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/090713090713123107.pdf",
                "Download", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/Syl.pdf180913120059.pdf", "Download"));
        words.add(new MainAdapter("III", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/III%20BE%20CSE070711060414.pdf",
                "Download", getResources().getString(R.string.syallbus_3), "Download"));
        words.add(new MainAdapter("IV", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/IV%20BE%20CSE220217034201.pdf",
                "Download", getResources().getString(R.string.syallbus_4), "Download"));
        words.add(new MainAdapter("V", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/V%20BE%20CSE040612034109.pdf",
                "Download", getResources().getString(R.string.syallbus_5), "Download"));
        words.add(new MainAdapter("VI", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VI%20Sem%20sceme010411052149.pdf",
                "Download", getResources().getString(R.string.syallbus_6), "Download"));
        words.add(new MainAdapter("VII", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VII%20CSE060713121334.pdf",
                "Download", getResources().getString(R.string.syallbus_7), "Download"));
        words.add(new MainAdapter("VIII", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VIII%20CSE290414054143.pdf",
                "Download", getResources().getString(R.string.syallbus_8), "Download"));


        CourseAdapter adapter = new CourseAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.courses);
        listView.setAdapter(adapter);
    }
}
