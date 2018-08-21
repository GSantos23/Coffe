package com.example.gers0n.coffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
    }

    // When user tap About button, app is going to display information of creator:
    // small bio, github link, contact information, and Rate
    public void aboutME(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    // When user tap Types button, app is going to display a list showing the types of coffee
    public void typeList(View view) {
        Intent intent = new Intent(this, CoffeList.class);
        startActivity(intent);
    }

    // When user tap Stores button, app is going to display a the available stores and locations
    public void storeMenu(View view){
        Intent intent = new Intent(this, storeList.class);
        startActivity(intent);
    }

}
