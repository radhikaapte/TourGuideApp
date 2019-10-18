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

public class SleepFragment extends Fragment {

    public SleepFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

// Create a list of hotels
        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide(R.string.sleep_abodebombay, R.string.details_abodebombay));
        guide.add(new Guide(R.string.sleep_itcmaratha, R.string.details_itcmaratha));
        guide.add(new Guide(R.string.sleep_taj, R.string.details_taj));
        guide.add(new Guide(R.string.sleep_backpackerspanda, R.string.details_backpackerspanda));
        guide.add(new Guide(R.string.sleep_fourseasons, R.string.details_fourseasons));
        guide.add(new Guide(R.string.sleep_iskcon, R.string.details_iskcon));
        guide.add(new Guide(R.string.sleep_sunandsand, R.string.details_sunandsand));
        guide.add(new Guide(R.string.sleep_trident, R.string.details_trident));
        guide.add(new Guide(R.string.sleep_bombaybackpackers, R.string.details_bombaybackpackers));
        guide.add(new Guide(R.string.sleep_tajsantacruz, R.string.details_tajsantacruz));
        guide.add(new Guide(R.string.sleep_seashore, R.string.details_seashore));
        guide.add(new Guide(R.string.sleep_juhuresidency, R.string.details_juhuresidency));


        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapterSleep = new GuideAdapter(getActivity(), guide, R.color.category_sleep);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // guide_list.xml layout file.
        ListView listViewSleep = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listViewSleep.setAdapter(adapterSleep);


        return rootView;

    }

}
