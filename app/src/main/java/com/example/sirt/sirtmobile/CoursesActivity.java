package com.example.sirt.sirtmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 09-May-17.
 */

public class CoursesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        final ArrayList<Name> words = new ArrayList<Name>();
        words.add(new Name("I", "Scheme", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/090713090713122520.pdf", "Syllabus", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/Syl.pdf180913120040.pdf"));
        words.add(new Name("II", "Scheme", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/090713090713123107.pdf", "Syllabus", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/Syl.pdf180913120059.pdf"));
        words.add(new Name("III", "Scheme", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/III%20BE%20CSE070711060414.pdf", "Syllabus", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/III%20CSE%20_SY_260711061137.pdf"));
        words.add(new Name("IV", "Scheme", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/IV%20BE%20CSE220217034201.pdf", "Syllabus", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/IV%20CSE%20_SY_110112041557.pdf"));
        words.add(new Name("V", "Scheme", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/V%20BE%20CSE040612034109.pdf", "Syllabus", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/V%20CSE%20_SY_170913041212.pdf"));
        words.add(new Name("VI", "Scheme", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VI%20Sem%20sceme010411052149.pdf", "Syllabus", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VI%20CSE%20(Syllabus)010411052318.pdf"));
        words.add(new Name("VII", "Scheme", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VII%20CSE060713121334.pdf", "Syllabus", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VII%20CS_Modified%20Sy_070711052904.pdf"));
        words.add(new Name("VIII", "Scheme", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/VIII%20CSE290414054143.pdf", "Syllabus", "https://www.rgpv.ac.in/UC/frm_download_file.aspx?Filepath=CDN/PubContent/Scheme/8csesyll240214041722.pdf"));

        CourseAdapter adapter = new CourseAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.courses);
        listView.setAdapter(adapter);


    }
}
