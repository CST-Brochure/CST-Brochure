package com.example.sonam.cstbrochurenav;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private long backtime;
    private Toast BackToast;
    private ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actionbar = getSupportActionBar();
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (backtime + 2000>System.currentTimeMillis()) {

            BackToast.cancel();
            super.onBackPressed();
            return;
        } else {
            BackToast = Toast.makeText(getBaseContext(), "Press Again to close this app", Toast.LENGTH_SHORT);
            BackToast.show();
        }
        backtime = System.currentTimeMillis();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activityimg in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            Intent arc = new Intent(MainActivity.this,MainActivity.class);
            startActivity(arc);
            // Handle the home action
        }else if (id == R.id.award) {
            Intent awd = new Intent(MainActivity.this, Award.class);
            startActivity(awd);

        } else if (id == R.id.rule) {
            Intent respon = new Intent(MainActivity.this,StudentResponsibility.class);
            startActivity(respon);

        } else if (id == R.id.club) {
            Intent clu = new Intent(MainActivity.this,ClubsNav.class);
            startActivity(clu);
        }
        else if (id == R.id.Architecture) {
            Intent archi=new Intent(MainActivity.this,Architecture.class);
            startActivity(archi);

        }
        else if (id == R.id.civil){
            Intent civ=new Intent(MainActivity.this,Civil.class);
            startActivity(civ);

        }
        else if (id == R.id.electrical){
            Intent ele = new Intent(MainActivity.this, Electrical.class);
            startActivity(ele);

        }
        else if (id== R.id.it){
            Intent it = new Intent(MainActivity.this, IT.class);
            startActivity(it);

        }
        else if (id== R.id.ece){
            Intent ece = new Intent(MainActivity.this, Electronics.class);
            startActivity(ece);

        }
        else if (id == R.id.student){
            Intent act = new Intent(MainActivity.this, StudentActivity.class);
            startActivity(act);
        }

        else if (id == R.id.missionVision)
        {
            Intent mission = new Intent(MainActivity.this, VisionM.class);
            startActivity(mission);
        }
        else if (id==R.id.contact_us){
            Intent cont =new Intent(MainActivity.this,ContactUs.class);
            startActivity(cont);
        }
        else if(id==R.id.map){
            Intent map =new Intent(MainActivity.this,MapsActivity.class);
            startActivity(map);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}