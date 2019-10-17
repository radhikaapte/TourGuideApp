package com.example.android.tourguideapp;

public class Guide {

    private String mguideName;

    /** String which stores the details of the suggested guide item - genre and place */
    private String mguideDetails;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    public Guide(String guideName, String guideDetails) {
      mguideName = guideName;
      mguideDetails = guideDetails;
    }


    public Guide(String guideName, String guideDetails, int imageResourceId) {
        mguideName = guideName;
        mguideDetails = guideDetails;
        mImageResourceId = imageResourceId;

    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public String getGuideName() {
        return mguideName;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public String getGuideDetails() {
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
