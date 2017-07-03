package com.example.android.tourguidebarcelona;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pilar_000 on 03/07/2017.
 */

class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView name = (TextView) listItem.findViewById(R.id.name);
        name.setText(currentLocation.getName());

        ImageView image = (ImageView) listItem.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            image.setImageResource(currentLocation.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
            Log.e("HAS IMAGE", "hasImage() returns false");
        }

        return listItem;
    }
}
