package com.example.android.tourguidebarcelona;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        Location[] locationsArray = {
                new Location("Vioko"),
                new Location("Sirvent"),
                new Location("Delacrem"),
                new Location("Gelaaati Di Marco"),
                new Location("Belgious"),
                new Location("Amorino"),
                new Location("Mannà Gelats"),
                new Location("O.G.G.I. Gelato"),
                new Location("Artisa"),
                new Location("Gelateria Gocce di Latte")
        };

        ArrayList<Location> locations = new ArrayList<Location>(Arrays.asList(locationsArray));

        ListView list = (ListView) findViewById(R.id.list);
        LocationAdapter adapter = new LocationAdapter(this, locations);
        list.setAdapter(adapter);
    }
}
