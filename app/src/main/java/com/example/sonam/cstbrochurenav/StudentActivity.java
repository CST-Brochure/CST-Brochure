package com.example.sonam.cstbrochurenav;


import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentActivity extends AppCompatActivity {



    private TabLayout tabLayout;
    private AppBarLayout appBarLayout ;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        tabLayout = (TabLayout) findViewById (R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById (R.id.appbarid);
        viewPager = (ViewPager) findViewById (R.id.viewpager_id);
        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentFashion(),"Fash");
        adapter.AddFragment(new FragmentIntro(),"Intro");
        adapter.AddFragment(new FragmentTag(),"Tag");
        adapter.AddFragment(new FragmentPrayer (),"Pray");
        adapter.AddFragment(new FragmentDiwali(),"Diwali");

        viewPager.setAdapter (adapter);
        tabLayout.setupWithViewPager (viewPager);

    }
}