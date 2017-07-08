package com.example.android.tourguidebarcelona;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class SquaresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        Location[] locationsArray = {
                new Location("Plaza de Cataluña", R.drawable.plaza_cataluna),
                new Location("Plaza de España (Plaça d'Espanya)", R.drawable.plaza_espanya),
                new Location("Plaza Real (Plaça Reial)", R.drawable.plaza_reial),
                new Location("Plaça del Pí", R.drawable.plaza_pi),
                new Location("Plaza de Toros Monumental de Barcelona", R.drawable.plaza_toros_monumental),
                new Location("Plaza de George Orwell (Plaça George Orwell)", R.drawable.plaza_george_orwell),
                new Location("Placa de Sant Jaume", R.drawable.plaza_sant_jaume),
                new Location("Plaza del Sol", R.drawable.plaza_del_sol),
                new Location("Placa Sant Felip Neri", R.drawable.plaza_sant_felip_neri),
                new Location("Placa del Rei", R.drawable.plaza_del_rei)
        };

        ArrayList<Location> locations = new ArrayList<Location>(Arrays.asList(locationsArray));

        ListView list = (ListView) findViewById(R.id.list);
        LocationAdapter adapter = new LocationAdapter(this, locations);
        list.setAdapter(adapter);
    }
}
