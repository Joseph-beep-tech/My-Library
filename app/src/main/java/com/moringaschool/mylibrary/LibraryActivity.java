package com.moringaschool.mylibrary;//package com.moringaschool.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LibraryActivity extends AppCompatActivity {
    public static final String TAG = LibraryActivity.class.getSimpleName();
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.findnextButton) Button nextActivity;


    private String[] library = new String[] {
            "LIBRARY OF CONGRESS", "BODELIAN LIBRARY", "BOSTON PUBLIC LIBRARY",
            "LIBRARY OF PARLIAMENT", "NEW YORK PUBLIC LIBRARY", "THOMAS FISHER RARE BOOK",
            "SEATTLE CENTRRAL LIBRARY", "ABBEY LIBRARY OF SAINT GALL", "AUSTRIAN NATIONAL LIBRARY",
            "NATIONAL LIBRARY OF SWEDEN", "LIBRARY OF THE BENEDICTINE MONASTERY", "THE MORGAN LIBRARY",
            "JAY WALKER'S PRIVATE LIBRARY", "TRINITY COLLEGE LIBRARY", "DANISH ROYAL LIBRARY", "MELK MONASTERY LIBRARY"
    };


    private  String[] books = new String[] {
            "A TIME TO KILL", "THE HOUSE OF MIRTH", "EAST OF EDEN", "THE SUN ALSO RISES",
            "VILE BODIES", "A SCANNER DARKLY", "MOAB IS MY WASHPOT", "NUMBER THE STARS", "NOLI ME TANGERE",
             "BRAVE NEW WORLD", "ROSEMARY AND RUE", "PALE FIRE", "REMEMBRANCE OF THINGS PAST", "THE FAULT IN OUR STARS",
            "COLD COMFORT FARM", "IN COLD BLOOD"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        ButterKnife.bind(this);


        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LibraryActivity.this, NextActivity.class);
                startActivity(intent);
            }
        });


        //      A toast that will display all the library names when clicked

    MyLibraryArrayAdapter adapter = new MyLibraryArrayAdapter(this, android.R.layout.simple_list_item_1, library, books);
            mListView.setAdapter(adapter);

            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String library = ((TextView)view).getText().toString();
            Toast.makeText(LibraryActivity.this, library, Toast.LENGTH_LONG).show();
        }
    });

    Intent intent = getIntent();
    String location = intent.getStringExtra("location");
        mLocationTextView.setText("Books you may want to read: " + location);
}
//
//    private void setContentView(int activity_library) {
//    }

}
