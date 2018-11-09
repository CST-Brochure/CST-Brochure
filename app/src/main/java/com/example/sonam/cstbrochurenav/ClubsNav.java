package com.example.sonam.cstbrochurenav;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClubsNav extends AppCompatActivity {

    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_nav);

        bt1 = (Button) findViewById(R.id.button);
        bt2 = (Button) findViewById(R.id.button1);
        bt3 = (Button) findViewById(R.id.button2);
        bt4 = (Button) findViewById(R.id.button3);
        bt5 = (Button) findViewById(R.id.button4);

        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                Intent myintent = new Intent(ClubsNav.this, KuenphenT.class);
                startActivity(myintent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent myintent=new Intent(ClubsNav.this, AcmChapter.class);
                startActivity(myintent);
            }

        });
        bt3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent myintent=new Intent(ClubsNav.this, NatureClub.class);
                startActivity(myintent);
            }

        });
        bt4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent myintent=new Intent(ClubsNav.this, BtoClub.class);
                startActivity(myintent);
            }

        });
        bt5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View V){
                Intent myintent=new Intent(ClubsNav.this, YpeerClub .class);
                startActivity(myintent);
            }

        });

    }
}