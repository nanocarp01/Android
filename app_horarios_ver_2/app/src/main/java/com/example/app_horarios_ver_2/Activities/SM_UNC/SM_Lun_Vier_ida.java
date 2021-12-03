package com.example.app_horarios_ver_2.Activities.SM_UNC;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.app_horarios_ver_2.Adapters.SM_UNC.ViewPagerAdapterSMUNCIda;
import com.example.app_horarios_ver_2.R;
import com.example.app_horarios_ver_2.ZoomOutPageTransformer;

public class SM_Lun_Vier_ida extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterSMUNCIda adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sm__lun__vier_ida);

        initView();
        initToolbar();
        initTablayout();
        setupView();
    }

    public void initToolbar() {
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        //actionBar.setHomeAsUpIndicator(R.drawable.ic_launcher_background);
        actionBar.setTitle("Lunes - Viernes");
        //actionBar.setDisplayHomeAsUpEnabled(true);

    }
    public void initView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.main_drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //navigationView = findViewById(R.id.navigator);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
    }

    public void setupView() {
        adapter = new ViewPagerAdapterSMUNCIda(getSupportFragmentManager(),  tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewPager.setCurrentItem(position);
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
        tabLayout.addTab(tabLayout.newTab().setText("Rivadavia"));
        tabLayout.addTab(tabLayout.newTab().setText("Junin"));
        tabLayout.addTab(tabLayout.newTab().setText("La Colonia"));
        tabLayout.addTab(tabLayout.newTab().setText("San Martin T"));
        tabLayout.addTab(tabLayout.newTab().setText("Mendoza T"));
        tabLayout.addTab(tabLayout.newTab().setText("UNC"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
