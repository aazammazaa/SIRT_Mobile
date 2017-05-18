package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hp on 10-May-17.
 */

public class ShuttlesActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuttles);

        final ArrayList<Name> words = new ArrayList<Name>();
        words.add(new Name("Bus No.", "1"));
        words.add(new Name("Bus No.", "2"));
        words.add(new Name("Bus No.", "3"));
        words.add(new Name("Bus No.", "4"));
        words.add(new Name("Bus No.", "5"));
        words.add(new Name("Bus No.", "6"));
        words.add(new Name("Bus No.", "7"));
        words.add(new Name("Bus No.", "8"));
        words.add(new Name("Bus No.", "9"));
        words.add(new Name("Bus No.", "10"));
        words.add(new Name("Bus No.", "11"));
        words.add(new Name("Bus No.", "12"));
        words.add(new Name("Bus No.", "13"));
        words.add(new Name("Bus No.", "14"));
        words.add(new Name("Bus No.", "15"));
        words.add(new Name("Bus No.", "16"));
        words.add(new Name("Bus No.", "17"));
        words.add(new Name("Bus No.", "18"));
        words.add(new Name("Bus No.", "19"));
        words.add(new Name("Bus No.", "20"));
        words.add(new Name("Bus No.", "21"));
        words.add(new Name("Bus No.", "22"));
        words.add(new Name("Bus No.", "23"));
        words.add(new Name("Bus No.", "24"));
        words.add(new Name("Bus No.", "25"));
        words.add(new Name("Bus No.", "26"));
        words.add(new Name("Bus No.", "27"));
        words.add(new Name("Bus No.", "28"));
        words.add(new Name("Bus No.", "29"));
        words.add(new Name("Bus No.", "30"));
        words.add(new Name("Bus No.", "31"));
        words.add(new Name("Bus No.", "32"));
        words.add(new Name("Bus No.", "33"));
        words.add(new Name("Bus No.", "34"));
        words.add(new Name("Bus No.", "35"));
        words.add(new Name("Bus No.", "36"));
        words.add(new Name("Bus No.", "37"));
        words.add(new Name("Bus No.", "38"));

        ShuttlesAdapter adapter = new ShuttlesAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.shuttles);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent newIntent = new Intent(ShuttlesActivity.this, ShuttleDetailActivity.class);
                newIntent.putExtra("position", position);
                startActivity(newIntent);
            }
        });

    }
}