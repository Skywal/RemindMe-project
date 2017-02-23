package com.example.bloom.remindme;

import android.app.Activity; // раніше наслідувався від нього
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

/**
 * Created by Bloom on 21.02.2017.
 */

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefault);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
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
}
