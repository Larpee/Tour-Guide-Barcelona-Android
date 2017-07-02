package com.example.android.tourguidebarcelona;

/**
 * Created by pilar_000 on 02/07/2017.
 */

class Location {
    private static final int NO_IMAGE_INCLUDED = -1;
    private String mName;
    private String mAddress;
    private int mImageResourceId;

    // Constructor for Locations with images
    public Location(String mName, String mAddress, int mImageResourceId) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mImageResourceId = mImageResourceId;
    }

    // Constructor for Locations without images
    public Location(String mName, String mAddress) {
        this.mName = mName;
        this.mAddress = mAddress;
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

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
