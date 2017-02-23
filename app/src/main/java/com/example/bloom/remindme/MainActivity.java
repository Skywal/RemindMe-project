package com.example.bloom.remindme;

import android.app.Activity; // раніше наслідувався від нього
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.bloom.remindme.adapter.TabsPagerFragmentAdapter;

/**
 * Created by Bloom on 21.02.2017.
 */

public class MainActivity extends AppCompatActivity {

    /** зберігає ідентифікаційний номер головного шару*/
    private static final int LAYOUT = R.layout.activity_main;

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        initToolbar();
        initNavigationView();
        initTabs();

    }

    /**ініціалізація і конфігурація тулбару*/
    private void initToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);

        /**для розтановки обробників подій по натисненню по ітему*/
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });
        /**вказує що для тулбару потрібно використовувати таке-то меню*/
        toolbar.inflateMenu(R.menu.menu);
    }

    /**Ініціалізація таб меню*/
    private void initTabs() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        TabsPagerFragmentAdapter adapter = new TabsPagerFragmentAdapter(getSupportFragmentManager());
        /**вкладки*/
        viewPager.setAdapter(adapter);
        /**перев'язка*/
        tabLayout.setupWithViewPager(viewPager);
    }

    /** ініціалізація NavigationView з його пунктами*/
    private void initNavigationView() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.view_navigation_open, R.string.view_navigation_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();
                switch (item.getItemId()){
                    case R.id.action_notification_item:
                        showNotificationTab();
                }
                return true;
            }
        });
    }

    /**перехід із NavigationView у відповідне таб меню*/
    private void showNotificationTab(){
        viewPager.setCurrentItem(Constants.TAB_TWO);
    }
}
