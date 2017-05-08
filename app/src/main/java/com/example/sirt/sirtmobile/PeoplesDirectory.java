package com.example.sirt.sirtmobile;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.message;

/**
 * Created by hp on 08-May-17.
 */

public class PeoplesDirectory extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peoples_directory);

        final ArrayList<Name> words = new ArrayList<Name>();
        words.add(new Name("Mr. Rajesh K Shukla", "+919893192616", R.drawable.male));
        words.add(new Name("Mr. Arun Jhapate", "+919754914446", R.drawable.male));
        words.add(new Name("Ms. Priyanka Saxena", "+919039499041", R.drawable.female));
        words.add(new Name("Ms. Ruchi Thakur", "+917771011091", R.drawable.female));
        words.add(new Name("Ms. Anjana Nigam", "+919179948293", R.drawable.female));
        words.add(new Name("Ms. Mohini Parihar", "+919827692342", R.drawable.female));
        words.add(new Name("Ms. Shalu Arya", "+919425606834", R.drawable.female));
        words.add(new Name("Mr. Sunil Malviya", "+919098606075", R.drawable.male));
        words.add(new Name("Mr. Mayank Namdeo", "+919826377765", R.drawable.male));
        words.add(new Name("Mr. Rahul Jain", "+919424704530", R.drawable.male));
        words.add(new Name("Mr. Sandeep Waderkar", "+919993075841", R.drawable.male));
        words.add(new Name("Mr. Deepak Choudhary", "+918962100721", R.drawable.male));
        words.add(new Name("Mr. Dheresh Soni", "+918878743351", R.drawable.male));
        words.add(new Name("Ms. Sanyogita Soni", "+910000000000", R.drawable.female));
        words.add(new Name("Mr. Devdeep Rajput", "+910000000000", R.drawable.male));
        words.add(new Name("Mr. Pawan Sharma", "+910000000000", R.drawable.male));
        words.add(new Name("Dr. Rashmi Soni", "+910000000000", R.drawable.female));
        words.add(new Name("Dr. Vipin Tiwari", "+910000000000", R.drawable.male));
        words.add(new Name("Mr. Ganesh Patidar", "+910000000000", R.drawable.male));

        NameAdapter adapter = new NameAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.peoples_directory);
        listView.setAdapter(adapter);

    }
}
