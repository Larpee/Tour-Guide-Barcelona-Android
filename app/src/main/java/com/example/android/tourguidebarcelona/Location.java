package com.example.android.tourguidebarcelona;

/**
 * Created by pilar_000 on 02/07/2017.
 */

class Location {
    private static final int NO_IMAGE_INCLUDED = -1;
    private String mName;
    private int mImageResourceId = NO_IMAGE_INCLUDED;

    // Constructor for Locations with images
    public Location(String mName, int mImageResourceId) {
        this.mName = mName;
        this.mImageResourceId = mImageResourceId;
    }

    // Constructor for Locations without images
    public Location(String mName) {
        this.mName = mName;
    }

    // Returns a boolean specifying if the Location has an image
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_INCLUDED;
    }

    /*
        Getter methods for member variables
     */

    public String getName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
