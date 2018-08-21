package com.example.gers0n.coffe;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class mapList extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_list2);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Location Coordinates in the globe
        LatLng starbucks = new LatLng(31.767859, -106.502154);
        LatLng jazzman = new LatLng(31.767525, -106.504750);
        LatLng yutep = new LatLng(31.767471, -106.503766);
        mMap.addMarker(new MarkerOptions()
                .position(starbucks)
                .title("Starbucks")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(jazzman)
                .title("Jazzman")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(16.0f));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yutep));

        // To enable zoom control
        mMap.getUiSettings();
        UiSettings moreSettings = mMap.getUiSettings();
        moreSettings.setZoomControlsEnabled(true);
    }
}
