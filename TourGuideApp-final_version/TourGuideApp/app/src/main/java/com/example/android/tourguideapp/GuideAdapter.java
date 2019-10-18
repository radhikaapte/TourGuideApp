package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class GuideAdapter extends ArrayAdapter<Guide> {

    /**
     * Resource ID for the background color for this list of words
     */
    private int mColorResourceId;

    public GuideAdapter(Context context, ArrayList<Guide> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Guide} object located at this position in the list
        Guide currentGuide = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name of the guide from the currentGuide object and set this text on
        // the name text view.
        nameTextView.setText(currentGuide.getGuideName());

        // Find the TextView in the list_item.xml layout with the ID details_text_view.
        TextView detailsTextView = (TextView) listItemView.findViewById(R.id.details_text_view);
        // Get the details of the guide from the currentGuide object and set this text on
        // the details text view.
        detailsTextView.setText(currentGuide.getGuideDetails());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentGuide.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentGuide.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }

}
