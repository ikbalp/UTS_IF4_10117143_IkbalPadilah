package com.ikbalp.introscreen;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/*
     Selasa, 5 Mei 2020
     Ikbal Padilah
     10117143 - IF4
*/

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    BottomNavigationView bottomNavigationView;

    FragHome fragHome;
    FragDailyAct fragDailyAct;
    FragGallery fragGallery;
    FragMusic fragMusic;
    FragProfile fragProfile;

    MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // hide the action bar
        getSupportActionBar().hide();

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav);
        final FragHome fragHome = new FragHome();
        final FragDailyAct fragDailyact = new FragDailyAct();
        final FragGallery fragGallery = new FragGallery();
        final FragMusic fragMusic = new FragMusic();
        final FragProfile fragProfile = new FragProfile();

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.home) {
                    setFragment(fragHome);
                    return  true;
                } else if (id == R.id.dailyact) {
                    setFragment(fragDailyact);
                    return  true;
                } else if (id == R.id.gallery) {
                    setFragment(fragGallery);
                    return  true;
                } else if (id == R.id.music) {
                    setFragment(fragMusic);
                    return  true;
                } else if (id == R.id.profile) {
                    setFragment(fragProfile);
                    return  true;
                }
                return false;
            }
        });
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }





}
