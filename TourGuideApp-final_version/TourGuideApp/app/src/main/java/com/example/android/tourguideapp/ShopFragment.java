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

public class ShopFragment extends Fragment {

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_list, container, false);

// Create a list of shops
        final ArrayList<Guide> guide = new ArrayList<Guide>();
        guide.add(new Guide(R.string.shop_chorbazaar, R.string.details_chorbazaar));
        guide.add(new Guide(R.string.shop_Fabindia, R.string.details_Fabindia));
        guide.add(new Guide(R.string.shop_Crossword, R.string.details_Crossword));
        guide.add(new Guide(R.string.shop_goodearth, R.string.details_goodearth));
        guide.add(new Guide(R.string.shop_highstreet, R.string.details_highstreet));
        guide.add(new Guide(R.string.shop_kalaniketan, R.string.details_kalaniketan));
        guide.add(new Guide(R.string.shop_Lalbaugmarket, R.string.details_Lalbaugmarket));
        guide.add(new Guide(R.string.shop_fashionstreet, R.string.details_fashionstreet));
        guide.add(new Guide(R.string.shop_nallisilk, R.string.details_nallisilk));
        guide.add(new Guide(R.string.shop_flowermarket, R.string.details_flowermarket));
        guide.add(new Guide(R.string.shop_vijaysales, R.string.details_vijaysales));
        guide.add(new Guide(R.string.shop_bombayshirt, R.string.details_bombayshirt));


        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter adapterShop = new GuideAdapter(getActivity(), guide, R.color.category_shop);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // guide_list.xml layout file.
        ListView listViewShop = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        listViewShop.setAdapter(adapterShop);


        return rootView;

    }

}
