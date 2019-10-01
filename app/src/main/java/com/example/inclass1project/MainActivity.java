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
    String myString = "Hello this is my first android APP";


    //How to do Toast Button Part 2
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        setTheme(R.style.AppTheme_LauncherAfterSplash);
                    }
                });
            }
        }).start();

        //mTextMessage = findViewById(R.id.message);
        //navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        myButton = (Button)findViewById(R.id.button);
//
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
//            }
//        });



        }



    }
