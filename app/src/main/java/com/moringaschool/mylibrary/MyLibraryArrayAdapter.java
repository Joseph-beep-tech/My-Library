package com.moringaschool.mylibrary;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyLibraryArrayAdapter extends ArrayAdapter {

    private Context mContext;
    private String[] mLibrary;
    private String[] mBooks;

    public MyLibraryArrayAdapter(LibraryActivity mContext, int resource, String[] mLibrary, String[] mBooks) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mLibrary = mLibrary;
        this.mBooks = mBooks;
    }

    @Override
    public Object getItem(int position){
        String library = mLibrary[position];
        String books = mBooks[position];
        return String.format("%s \n You can purchase or borrow: %s", library, books);
    }

    @Override
    public int getCount(){
        return mLibrary.length;
    }
}
