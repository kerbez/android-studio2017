package com.example.kerbe.justice_league;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

/**
 * Created by kerbe on 30.09.2017.
 */

public class CharactersActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    TextView position, position_txt, psevdo, psevdo_txt, height, height_txt, ves, ves_txt, eyes, eyes_txt, hairs, hairs_txt;
    ImageView charImage;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = (TextView) findViewById(R.id.position);
        position_txt = (TextView) findViewById(R.id.position_txt);
        psevdo = (TextView) findViewById(R.id.psevdo);
        psevdo_txt = (TextView) findViewById(R.id.psevdo_txt);
        height = (TextView) findViewById(R.id.height);
        height_txt = (TextView) findViewById(R.id.height_txt);
        ves = (TextView) findViewById(R.id.ves);
        ves_txt = (TextView) findViewById(R.id.ves_txt);
        eyes = (TextView) findViewById(R.id.eyes);
        eyes_txt = (TextView) findViewById(R.id.eyes_txt);
        hairs = (TextView) findViewById(R.id.hairs);
        hairs_txt = (TextView) findViewById(R.id.hairs_txt);
        charImage = findViewById(R.id.charImage);

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_wallpapers) {

            // Handle the camera action
        } else if (id == R.id.nav_characters) {
            Intent intent =  new Intent();


        } else if (id == R.id.nav_actors) {

        } else if (id == R.id.nav_test) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
