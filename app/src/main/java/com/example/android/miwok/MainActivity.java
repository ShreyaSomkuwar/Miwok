package com.example.android.miwok;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout=(TabLayout) findViewById(R.id.siliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        /*TextView numbers= (TextView) findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberActivity=new Intent(MainActivity.this, numbers_activity.class);
                startActivity(numberActivity);
            }
        });

        TextView colors= (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorActivity=new Intent(MainActivity.this, colors_activity.class);
                startActivity(colorActivity);
            }
        });

        TextView phrases= (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesActivity=new Intent(MainActivity.this, phrases_activity.class);
                startActivity(phrasesActivity);
            }
        });

        TextView family= (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyActivity=new Intent(MainActivity.this, family_activity.class);
                startActivity(familyActivity);
            }
        });*/
    }
}
