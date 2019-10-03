package com.example.inclass1project;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.ceng319.launcher.R;


public class MainActivity extends AppCompatActivity {


    //How to do Toast Button Part 1
    protected Button myButton;
    String myString = "Hello this is my first android APP!!!!";


    //How to do Toast Button Part 2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_transparent); //  here
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// This is where the screen gets its design from the XML file. The change of theme cannot happen after this
        // line. It has to be before it.
        BottomNavigationView navView = findViewById(R.id.nav_view);

        //mTextMessage = findViewById(R.id.message);
        //navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        myButton = (Button)findViewById(R.id.button);
//
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
            }
        });



        }



    }
