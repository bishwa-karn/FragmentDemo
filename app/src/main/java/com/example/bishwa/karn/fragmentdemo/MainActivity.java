package com.example.bishwa.karn.fragmentdemo;

import android.app.Fragment;
import android.app.FragmentManager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button firstFragment, secondFragment, thirdFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        firstFragment.setOnClickListener(buttonClicked);
        secondFragment.setOnClickListener(buttonClicked);
        thirdFragment.setOnClickListener(buttonClicked);


    }

    View.OnClickListener buttonClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Fragment fragment;
            FragmentManager fragmentManager;
            android.app.FragmentTransaction fragmentTransaction;
            switch (v.getId()){
                case R.id.btn_first_fragment:
                    fragment = new FirstFragment();
                    fragmentManager = getFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.my_fragment,fragment);
                    fragmentTransaction.commit();

                    break;
                case R.id.btn_second_fragment:

                    fragment = new SecondFragment();
                    fragmentManager = getFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.my_fragment,fragment);
                    fragmentTransaction.commit();
                    break;
                case R.id.btn_third_fragment:

                    fragment = new ThirdFragment();
                    fragmentManager = getFragmentManager();
                    fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.my_fragment,fragment);
                    fragmentTransaction.commit();
                    break;
            }

        }
    };


    private void init() {
        firstFragment = (Button) findViewById(R.id.btn_first_fragment);
        secondFragment = (Button) findViewById(R.id.btn_second_fragment);
        thirdFragment = (Button) findViewById(R.id.btn_third_fragment);


    }
}
