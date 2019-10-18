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

// Create a list of restaurants
        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide(R.string.eat_gajalee, R.string.details_gajalee));
        guide.add(new Guide(R.string.eat_dakshinayan, R.string.details_dakshinayan));
        guide.add(new Guide(R.string.eat_5Spice, R.string.details_5Spice));
        guide.add(new Guide(R.string.eat_bademiyarestaurant, R.string.details_bademiyarestaurant));
        guide.add(new Guide(R.string.eat_khyani, R.string.details_Khyani));
        guide.add(new Guide(R.string.eat_ashraya, R.string.details_ashraya));
        guide.add(new Guide(R.string.eat_trishna, R.string.details_trishna));
        guide.add(new Guide(R.string.eat_Candies, R.string.details_Candies));
        guide.add(new Guide(R.string.eat_babu, R.string.details_babu));
        guide.add(new Guide(R.string.eat_bhog, R.string.details_bhog));
        guide.add(new Guide(R.string.eat_theobroma, R.string.details_theobroma));
        guide.add(new Guide(R.string.eat_pizza, R.string.details_pizza));


        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapterEat = new GuideAdapter(getActivity(), guide, R.color.category_eat);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // guide_list.xml layout file.
        ListView listViewEat = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listViewEat.setAdapter(adapterEat);


        return rootView;

    }

}
