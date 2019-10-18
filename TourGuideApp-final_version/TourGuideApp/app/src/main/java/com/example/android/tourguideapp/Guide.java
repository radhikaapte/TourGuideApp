package com.example.android.tourguideapp;

public class Guide {

    /**
     * int which stores the name of the suggested guide item
     */
    private int mguideName;

    /**
     * int which stores the details of the suggested guide item - genre and place
     */
    private int mguideDetails;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Guide(int guideName, int guideDetails) {
        mguideName = guideName;
        mguideDetails = guideDetails;
    }


    public Guide(int guideName, int guideDetails, int imageResourceId) {
        mguideName = guideName;
        mguideDetails = guideDetails;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the name of the guide item.
     */
    public int getGuideName() {
        return mguideName;
    }

    /**
     * Get the string resource ID for the details of the guide item
     */
    public int getGuideDetails() {
        return mguideDetails;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
