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

public class FragmentIntro extends android.support.v4.app.Fragment {

    View view;

    public FragmentIntro() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view =inflater.inflate(R.layout.intro_fragment,container,false);
        return view;
    }
}