package com.example.sirt.sirtmobile;

import android.os.Bundle;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Vini Mishra on 08-May-17.
 */

public class PeoplesDirectoryActivity extends ParentActivity {
    PeoplesDirectoryAdapter adapter;
    private ArrayList<MainAdapter> words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peoples_directory);
        words = new ArrayList<>();
        words.add(new MainAdapter("Ms. Anjana Nigam", "+919179948293", R.drawable.female));
        words.add(new MainAdapter("Mr. Arun Jhapate", "+919754914446", R.drawable.male));
        words.add(new MainAdapter("Mr. Deepak Choudhary", "+918962100721", R.drawable.male));
        words.add(new MainAdapter("Mr. Devdeep Rajput", "+910000000000", R.drawable.male));
        words.add(new MainAdapter("Mr. Dheresh Soni", "+918878743351", R.drawable.male));
        words.add(new MainAdapter("Mr. Ganesh Patidar", "+910000000000", R.drawable.male));
        words.add(new MainAdapter("Ms. Mohini Parihar", "+919827692342", R.drawable.female));
        words.add(new MainAdapter("Mr. Mayank Namdeo", "+919826377765", R.drawable.male));
        words.add(new MainAdapter("Mr. Pawan Sharma", "+910000000000", R.drawable.male));
        words.add(new MainAdapter("Ms. Priyanka Saxena", "+919039499041", R.drawable.female));
        words.add(new MainAdapter("Mr. Rahul Jain", "+919424704530", R.drawable.male));
        words.add(new MainAdapter("Mr. Rajesh K Shukla", "+919893192616", R.drawable.male));
        words.add(new MainAdapter("Dr. Rashmi Soni", "+910000000000", R.drawable.female));
        words.add(new MainAdapter("Ms. Ruchi Thakur", "+917771011091", R.drawable.female));
        words.add(new MainAdapter("Mr. Sandeep Waderkar", "+919993075841", R.drawable.male));
        words.add(new MainAdapter("Ms. Sanyogita Soni", "+910000000000", R.drawable.female));
        words.add(new MainAdapter("Ms. Shalu Arya", "+919425606834", R.drawable.female));
        words.add(new MainAdapter("Mr. Sunil Malviya", "+919098606075", R.drawable.male));
        words.add(new MainAdapter("Dr. Vipin Tiwari", "+910000000000", R.drawable.male));

        adapter = new PeoplesDirectoryAdapter(this, words);
        final ListView listView = (ListView) findViewById(R.id.peoples_directory);
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}
