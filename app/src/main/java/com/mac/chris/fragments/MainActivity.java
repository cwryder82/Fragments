package com.mac.chris.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragOne fragOne;
    FragTwo fragTwo;
    PlusOneFragment plusOneFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragOne = new FragOne();
        fragTwo = new FragTwo();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container1, fragOne);
        fragmentTransaction.add(R.id.container2, fragTwo);
        fragmentTransaction.commit();
    }
}
