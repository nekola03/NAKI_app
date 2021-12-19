package com.example.digitalni_atlas;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;

import com.example.digitalni_atlas.ui.uzemiModel.modelUzemi;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;


import com.example.digitalni_atlas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_first_page, R.id.nav_map, R.id.nav_list, R.id.nav_about, R.id.nav_share, R.id.nav_reference)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_list:
                        startActivity(new Intent(MainActivity.this, modelUzemi.class));
                        break;
                    case R.id.nav_map:
                        startActivity(new Intent(MainActivity.this, activityGooglemap.class));
                        break;
                    case R.id.nav_first_page:
                        navController.popBackStack(R.id.mobile_navigation, true);
                        Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main)
                                .navigate(R.id.nav_first_page);
                        break;
                    case R.id.nav_share:
                        startActivity(new Intent(MainActivity.this, com.example.digitalni_atlas.ui.share.sdilet.class));
                        break;
                    case R.id.nav_reference:
                        navController.popBackStack(R.id.mobile_navigation, true);
                        Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main)
                                .navigate(R.id.nav_reference);
                        break;
                    case R.id.nav_about:
                        navController.popBackStack(R.id.mobile_navigation, true);
                        Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment_content_main)
                                .navigate(R.id.nav_about);
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}