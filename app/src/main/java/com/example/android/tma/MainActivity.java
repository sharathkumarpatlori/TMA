package com.example.android.tma;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tablayout;
    //  private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        setContentView( R.layout.home );
        tablayout = (TabLayout) findViewById( R.id.tablayout_id );
        //appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById( R.id.viewpager_id );
        ViewPageAdapter adapter = new ViewPageAdapter( getSupportFragmentManager() );
        // Adding Fragments
        adapter.AddFragment( new FragmentQuiz(), "Portfolio" ); //Quiz-Fragment related code and stuff comes here
        adapter.AddFragment( new FragmentExplore(), "Transit" ); // Explore-Fragment related code and stuff comes here
        adapter.AddFragment( new FragmentStore(), "Recommended" ); // Store-Fragment related code and stuff comes here
        // adapter Setup
        viewPager.setAdapter( adapter );
        tablayout.setupWithViewPager( viewPager );


    }
}
