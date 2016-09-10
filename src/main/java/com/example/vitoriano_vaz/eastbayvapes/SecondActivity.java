package com.example.vitoriano_vaz.eastbayvapes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ebv.vitoriano_vaz.eastbayvapes.R;

/**
 * Created by vitoriano-vaz on 5/11/16.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuscreen);

        populateListView();

    }

    public void populateListView() {
        // Create the list of items

        String[] juiceMenu = {
                "#1 BLUEBERRY BOMBSHELL \nThis blueberry dessert will keep your taste buds begging for more",
                "#2 RICHIE RICH\nShout out to Rich! This was his all day vape. Strawberry cream with a bunch of deliciousness",
                "#3 CHIQUITA\nCreamy Banana with a bready after taste",
                "#4 AFTERNOON DELIGHT\nGot that 3 o'clock feeling? Try a little Afternoon delight. Kiwi Strawberry Dessert",
                "#5 POPPIN OTTERS\nMelt an otter-pop put it in your tank and vape it",
                "#6 VIVA LA SANGRIA\nFruit, with a little bit of fruit,  add a teaspoon of fruit mixed with white win and top it off with fruit",
                "#7 OKOLE MALUNA\nPineapple fruit blend. Bottom up!",
                "#8 CARMEN MIRANDA\nVanilla custard with a crisp",
                "#9 POMALADE\nIt's Bombalade! Your mother will love it",
                "#10 IZUAL\nWhirlwind of icy Fruits",
                "#11 BUTTER STOTCH\nProfessor Chaos will surely get grounded for this one!",
                "#12 BLUE BULLS\nGrab the bull by the horns",
                "#13 GRAPE APE\nA grapple a day will keep the doctor away",
                "#14 BRUCE JUICE\nPerfectly blended old fashioned. This one is for you Bruce",
                "#15 DOC HOLIDAY\nN.E.T. Tabacco flavor. Limited release",
                "#16 PEACHY KEEN\nPeach cobbler. Better than what your mama used to make",
                "#17 HULA\nStrawberry coconut? What in the hula?",
                "#18 NEW YORK\nPeppermint paddy dipped in chocolate...Amazing really",
                "#19 AL GORE\nIm super duper cereal right now!",
                "#20 LUX CHARMS\nHearts, stars, horseshoes, clovers & blue moons, pots of gold % rainbows & me red balloons",
                "#21 SAILOR JACK\nCant go to the ball game without some cracker jacks",
                "#22 GET HIM TO THE GREEK\n...Yogurt, peach, delightful!",
                "#23 KEY WE LIE CHI\nFruit lovers will enjoy this lychee vape",
                "#24 SPRING FLING\nA menage a trois of honeydew and cream on your tongue",
                "#25 GUMBY\nWatermelon sour gummy",
                "#26 CHAI\nMILK and Chai Tea",
                "#27 MR. BBEAN\nCappuccino with cream to start the day off right",
                "#28 50 SHADES OF ORANGE\nA delightful blend of orange and cream",
                "#29 BLUE WAFFLES\nBreakfast for dinner with this Blueberry Waffle",
                "#30 ENIGMA\nEnigma conundrum of mango raspberry with a hint of mystery can you solve the puzzle?",
                "#31 MR. FREEZE\nPut down the tank and STEP AWAY hardcore mint lovers ONLY! This juice is too coll for most",
                "#32 CUP OF JOE\nThe best part of waking up is coffee in your vape",
                "#33 BON JOVI\nVanilla Bourbon ",
        };
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
