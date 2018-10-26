package com.example.sonam.cstbrochurenav;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by plabm23 on 9/25/2018.
 */

public class FragmentTag extends android.support.v4.app.Fragment {

    View view;

    public FragmentTag() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.tag_fragment,container,false);
        return view;
    }
}