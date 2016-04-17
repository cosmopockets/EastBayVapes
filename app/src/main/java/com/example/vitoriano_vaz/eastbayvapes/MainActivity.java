package com.example.vitoriano_vaz.eastbayvapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/*
This app is for a local Vape Shop
 it's purpose is to increase customer flow, and provide a menu for Android users

 the array is going to be called = da_menu
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();
    }

    private void populateListView() {
        // Create the list of items

        String[] juiceMenu= {
                "#1 BlueBerry Bombshell",
                "#2 Richie Rich",
                "#3 Chiquita",
                "#4 Afternoon Delight",
                "#5 Poppin Otters",
                "#6 Viva La Sangria",
                "#7 Okole Maluna",
                "#8 Carmen Miranda",
                "#9 Pomalade",
                "#10 Izual",
                "#11 Butter Stotch",
                "#12 Blue Bulls",
                "#13 Grape Ape",
                "#14 Bruce Juice",
                "#15 Doc Holiday",
                "#16 Peachy Keen",
                "#17 Hula",
                "#18 New York",
                "#19 Al Gore",
                "#20 Lux Charms",
                "#21 Sailor Jack",
                "#22 Get Him to the Greek",
                "#23 Key We Lie Chi",
                "#24 Spring Fling",
                "#25 Gumby",
                "#26 Chai-Milk",
                "#27 Mr. Bean",
                "#28 50 Shades of Orange",
                "#29 Blue Waffles",
                "#30 Enigma",
                "#31 Mr. Freeze",
                "#32 Cup of Joe"};
        // Build adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,               // context for the activity
                R.layout.da_menu,   // Layout to create
                juiceMenu);         // Items to be displayed

        //configure list view
        ListView list = (ListView) findViewById(R.id.listViewMain);
        list.setAdapter(adapter);
    }
}
