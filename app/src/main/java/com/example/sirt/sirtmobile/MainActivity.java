package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.sirt.sirtmobile.R.drawable.male;
import static com.example.sirt.sirtmobile.R.drawable.female;

public class MainActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ImageView peopleImage = (ImageView) findViewById(R.id.directory_image);
        peopleImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent peopleIntent = new Intent(MainActivity.this, PeoplesDirectory.class);
                startActivity(peopleIntent);
            }
        });

        TextView peopleText = (TextView) findViewById(R.id.directory_text);
        peopleText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent peopleIntent = new Intent(MainActivity.this, PeoplesDirectory.class);
                startActivity(peopleIntent);
            }
        });
    }
}


