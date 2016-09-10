package com.example.vitoriano_vaz.eastbayvapes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ebv.vitoriano_vaz.eastbayvapes.R;

/*
This app is for a local Vape Shop
 it's purpose is to increase customer flow, and provide a menu for Android users

 the array is going to be called = da_menu
 */
public class MainActivity extends AppCompatActivity {
    private static Intent java;

    //used this to get rid of red line under intent on line 38 if it causes more problems remove and resolve issue
    private Intent intent;

    /*
    called when the user clicks the send Button
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button menubutton = (Button) findViewById(R.id.menubutton);
        menubutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });


        /*
        sends user to about us xml via AboutActivity.class
         */
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });


    }


}
