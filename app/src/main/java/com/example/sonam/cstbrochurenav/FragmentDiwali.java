package com.example.sonam.cstbrochurenav;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by plabm23 on 9/25/2018.
 */

public class FragmentDiwali extends android.support.v4.app.Fragment {

    View view;

    public FragmentDiwali() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view =inflater.inflate(R.layout.diwali_fragment,container,false);
        return view;
    }
}
