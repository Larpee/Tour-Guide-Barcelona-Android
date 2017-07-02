package com.example.android.tourguidebarcelona;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View hotels = findViewById(R.id.hotels);
        hotels.setOnClickListener(createListenerForActivity(HotelsActivity.class));

        View bakeries = findViewById(R.id.bakeries);
        bakeries.setOnClickListener(createListenerForActivity(BakeriesActivity.class));

        View iceCream = findViewById(R.id.ice_cream);
        iceCream.setOnClickListener(createListenerForActivity(IceCreamActivity.class));

        View churches = findViewById(R.id.churches);
        churches.setOnClickListener(createListenerForActivity(ChurchesActivity.class));

        View shops = findViewById(R.id.shops);
        shops.setOnClickListener(createListenerForActivity(ShopsActivity.class));

        View squares = findViewById(R.id.squares);
        squares.setOnClickListener(createListenerForActivity(SquaresActivity.class));
    }

    /*
    @return OnClickListener which goes to activity passed as parameter

     */
    private View.OnClickListener createListenerForActivity(final Class activity) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToActivity = new Intent(MainActivity.this, activity);
                startActivity(goToActivity);
            }
        };
    }


}
