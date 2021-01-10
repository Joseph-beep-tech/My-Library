package com.moringaschool.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LibraryActivity extends AppCompatActivity {
    public static final String TAG = LibraryActivity.class.getSimpleName();
    @BindView(R.id.locationTextView) TextView mLocationTextView;
    @BindView(R.id.listView) ListView mListView;

    private String[] library = new String[] {
            "Sweet Hereafter", "Cricket", "Hawthorne Fish House",
            "Viking Soul Food", "Red Square", "Horse Brass",
            "Dick's Kitchen", "Taco Bell", "Me Kha Noodle Bar",
            "La Bonita Taqueria", "Smokehouse Tavern", "Pembiche",
            "Kay's Bar", "Gnarly Grey", "Slappy Cakes", "Mi Mero Mole"
    };


    private  String[] books = new String[] {
            "Vegan Food", "Breakfast", "Fishs Dishs", "Scandinavian",
            "Coffee", "English Food", "Burgers", "Fast Food", "Noodle " +
            "Soups", "Mexican", "BBQ", "Cuban", "Bar Food", "Sports Bar",
            "Breakfast", "Mexican"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        ButterKnife.bind(this);

    //      A toast that will display all the restaurants names when clicked

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
        mLocationTextView.setText("Books you may read: " + location);
}
//
//    private void setContentView(int activity_library) {
//    }

}
