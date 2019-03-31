package com.example.sduapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

public class Fragment_location extends Fragment  {

    GoogleMap googleMap;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.location_layout,container,false);

    }
    private void createMapView(){
        try {
            if(null == googleMap){
                SupportMapFragment map = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapView)).getMapAsync(this);

                if(null == googleMap) {
                    Toast.makeText(getContext(), "Error creating map",Toast.LENGTH_SHORT).show();
                }
            }
        } catch (NullPointerException exception){
            Log.e("mapApp", exception.toString());
        }
    }

}
