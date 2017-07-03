package com.example.android.tourguidebarcelona;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        Location[] locationsArray = {
                new Location("The Serras", R.drawable.hotel_serras),
                new Location("Grand Hotel Central", R.drawable.grand_hotel_central),
                new Location("NH Barcelona Fira Suites", R.drawable.fira_suites),
                new Location("NH Collection Barcelona Gran Hotel Calderón", R.drawable.gran_hotel_calderon),
                new Location("Hotel DO", R.drawable.hotel_do),
                new Location("Hotel Claris", R.drawable.hotel_claris),
                new Location("Majestic Hotel y Spa Barcelona", R.drawable.majestic_hotel),
                new Location("Mandarin Oriental, Barcelona", R.drawable.mandarin_oriental),
                new Location("Alma Barcelona", R.drawable.alma_hotel),
                new Location("Monument Hotel", R.drawable.monument_hotel)
        };

        ArrayList<Location> locations = new ArrayList<Location>(Arrays.asList(locationsArray));

        ListView list = (ListView) findViewById(R.id.list);
        LocationAdapter adapter = new LocationAdapter(this, locations);
        list.setAdapter(adapter);
    }
}
