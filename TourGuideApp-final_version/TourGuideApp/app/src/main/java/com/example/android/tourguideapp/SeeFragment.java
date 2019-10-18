/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class SeeFragment extends Fragment {

    public SeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

// Create a list of places to see
        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide(R.string.place_terminus, R.string.details_terminus, R.drawable.shivaji_terminus));
        guide.add(new Guide(R.string.place_caves, R.string.details_caves, R.drawable.elephanta_caves));
        guide.add(new Guide(R.string.place_gateway, R.string.details_gateway, R.drawable.gateaway_of_india));
        guide.add(new Guide(R.string.place_market, R.string.details_market, R.drawable.spice_market));
        guide.add(new Guide(R.string.place_beach, R.string.details_beach, R.drawable.juhu_beach));
        guide.add(new Guide(R.string.place_temple, R.string.details_temple, R.drawable.iskcon));
        guide.add(new Guide(R.string.place_nationalpark, R.string.details_nationalpark, R.drawable.sanjay_gandhi_np));

        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapterSee = new GuideAdapter(getActivity(), guide, R.color.category_see);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // guide_list.xml layout file.
        ListView listViewSee = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        listViewSee.setAdapter(adapterSee);


        return rootView;

    }

}