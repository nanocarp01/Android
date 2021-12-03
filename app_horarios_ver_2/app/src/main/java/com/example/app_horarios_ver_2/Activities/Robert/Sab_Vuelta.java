package com.example.app_horarios_ver_2.Activities.Robert;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.app_horarios_ver_2.Adapters.Robert.ViewPagerAdapterIda;
import com.example.app_horarios_ver_2.Adapters.Robert.ViewPagerAdapterSabVuelta;
import com.example.app_horarios_ver_2.Adapters.Robert.ViewPagerAdapterVuelta;
import com.example.app_horarios_ver_2.R;
import com.example.app_horarios_ver_2.ZoomOutPageTransformer;

public class Sab_Vuelta extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterSabVuelta adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sab__vuelta);
        initView();
        initToolbar();
        initTablayout();
        setupView();
    }

    public void initToolbar() {
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        //actionBar.setHomeAsUpIndicator(R.drawable.ic_launcher_background);
        actionBar.setTitle("Sabado");
        //actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void initView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.main_drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //navigationView = findViewById(R.id.navigator);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
    }

    public void setupView() {
        adapter = new ViewPagerAdapterSabVuelta(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    public void initTablayout() {
        tabLayout.addTab(tabLayout.newTab().setText("Mendoza"));
        tabLayout.addTab(tabLayout.newTab().setText("Carril Lucero"));
        tabLayout.addTab(tabLayout.newTab().setText("Rivadavia"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
