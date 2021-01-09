package com.moringaschool.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class AuthenticationPagerAdapter extends FragmentPagerAdapter{
        private ArrayList<Fragment> fragmentList = new ArrayList<>();

        public AuthenticationPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i){
            return fragmentList.get(i);
        }

        @Override
        public int getCount(){
            return fragmentList.size();
        }
        void addFragment(Fragment fragment){
            fragmentList.add(fragment);
        }
    }
}