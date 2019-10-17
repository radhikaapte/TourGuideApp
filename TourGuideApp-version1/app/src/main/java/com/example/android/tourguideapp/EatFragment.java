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

public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

// Create a list of words
        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide("Gajalee","SEAFOOD, VILEPARLE EAST"));
        guide.add(new Guide("Dakshinayan","SOUTH INDIAN, JUHU"));
        guide.add(new Guide("5 Spice","INDO-CHINESE, BANDRA WEST"));
        guide.add(new Guide("Bademiya Restaurant","MUGHLAI, COLABA"));
        guide.add(new Guide("Khyani & Co.","IRANI CAFE, MARINE LINES"));
        guide.add(new Guide("Hotel Ram Ashraya","SOUTH INDIAN, KING CIRCLE"));
        guide.add(new Guide("Trishna","SEAFOOD, CHURCHGATE"));
        guide.add(new Guide("Candies Cafe","CAFE FOOD, PALI HILL"));
        guide.add(new Guide("Babu Vada Pav","STREET FOOD, VILEPARLE EAST"));
        guide.add(new Guide("Raaj Bhog","GUJARATI THALI, KHAR"));
        guide.add(new Guide("Theobroma","CAFE, CHURCHGATE"));
        guide.add(new Guide("PIZZA BY THE BAY","PIZZA, MARINE LINES"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapter = new GuideAdapter(getActivity(),guide, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        return rootView;

    }

}
