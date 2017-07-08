package com.example.android.tourguidebarcelona;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        Location[] locationsArray = {
                new Location("Como Agua de Mayo"),
                new Location("Tween"),
                new Location("Modart"),
                new Location("Boo"),
                new Location("Nagore"),
                new Location("Cannibal"),
                new Location("The Rent Shop"),
                new Location("Misty Rose"),
                new Location("Cotton Vintage"),
                new Location("Guantería Alonso")
        };

        ArrayList<Location> locations = new ArrayList<Location>(Arrays.asList(locationsArray));

        ListView list = (ListView) findViewById(R.id.list);
        LocationAdapter adapter = new LocationAdapter(this, locations);
        list.setAdapter(adapter);
    }
}
