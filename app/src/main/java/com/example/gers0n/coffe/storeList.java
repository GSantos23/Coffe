package com.example.gers0n.coffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class storeList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_list);
    }

    // Method to jump to google maps activity
    public void mapLocate(View view){
        Intent intent = new Intent(this, mapList.class);
        startActivity(intent);
    }

    // Method to jump to Jazzman menu
    public void Jazz(View view){
        Intent intent = new Intent(this, Jazz.class);
        startActivity(intent);
    }

    // Method to jump to Starbucks menu
    public void Siren(View view){
        Intent intent = new Intent(this, Bucks.class);
        startActivity(intent);
    }
}
