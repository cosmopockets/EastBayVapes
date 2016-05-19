package com.example.vitoriano_vaz.eastbayvapes;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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

        /*
        attempting to send user to each individual app with the URI Intent method

        PackageManager packageManager = getPackageManager();
        List activities = packageManager.queryIntentActivities(intent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        */


        Uri number = Uri.parse("tel:9259619029");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);

        Uri webpage = Uri.parse("http://www.facebook.com/eastbayvapes");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

        /*this is to send the user to facebook application

        try {

            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/eastbay"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/eastbay"));

        }
        */


        // intent to send user to instagram

        Uri uri = Uri.parse("http://instagram.com/_u/eastbayvapes");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/eastbayvapes")));
        }

        //Intent to send user to email app

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"eastbayvapes@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
        intent.putExtra(Intent.EXTRA_TEXT, "");
        startActivity(Intent.createChooser(intent, ""));

        /*Intent to send user to google maps

        String uri = "https://maps.google.co.in/maps?q=" + 1549 N Vasco Rd, Livermore, Ca 94551;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        context.startActivity(intent);
        */

    }


}
