package com.moringaschool.mylibrary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RegisterFragment {

    public RegisterFragment(){
        // required empty public constrictor
    }

//    @Override
    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false);
    }
}
