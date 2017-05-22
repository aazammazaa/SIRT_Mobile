package com.example.sirt.sirtmobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 10-May-17.
 */

public class ShuttlesActivity extends ParentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuttles);

        final ArrayList<MainAdapter> words = new ArrayList<MainAdapter>();
        words.add(new MainAdapter("Bus No.", "1"));
        words.add(new MainAdapter("Bus No.", "2"));
        words.add(new MainAdapter("Bus No.", "3"));
        words.add(new MainAdapter("Bus No.", "4"));
        words.add(new MainAdapter("Bus No.", "5"));
        words.add(new MainAdapter("Bus No.", "6"));
        words.add(new MainAdapter("Bus No.", "7"));
        words.add(new MainAdapter("Bus No.", "8"));
        words.add(new MainAdapter("Bus No.", "9"));
        words.add(new MainAdapter("Bus No.", "10"));
        words.add(new MainAdapter("Bus No.", "11"));
        words.add(new MainAdapter("Bus No.", "12"));
        words.add(new MainAdapter("Bus No.", "13"));
        words.add(new MainAdapter("Bus No.", "14"));
        words.add(new MainAdapter("Bus No.", "15"));
        words.add(new MainAdapter("Bus No.", "16"));
        words.add(new MainAdapter("Bus No.", "17"));
        words.add(new MainAdapter("Bus No.", "18"));
        words.add(new MainAdapter("Bus No.", "19"));
        words.add(new MainAdapter("Bus No.", "20"));
        words.add(new MainAdapter("Bus No.", "21"));
        words.add(new MainAdapter("Bus No.", "22"));
        words.add(new MainAdapter("Bus No.", "23"));
        words.add(new MainAdapter("Bus No.", "24"));
        words.add(new MainAdapter("Bus No.", "25"));
        words.add(new MainAdapter("Bus No.", "26"));
        words.add(new MainAdapter("Bus No.", "27"));
        words.add(new MainAdapter("Bus No.", "28"));
        words.add(new MainAdapter("Bus No.", "29"));
        words.add(new MainAdapter("Bus No.", "30"));
        words.add(new MainAdapter("Bus No.", "31"));
        words.add(new MainAdapter("Bus No.", "32"));
        words.add(new MainAdapter("Bus No.", "33"));
        words.add(new MainAdapter("Bus No.", "34"));
        words.add(new MainAdapter("Bus No.", "35"));
        words.add(new MainAdapter("Bus No.", "36"));
        words.add(new MainAdapter("Bus No.", "37"));
        words.add(new MainAdapter("Bus No.", "38"));

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