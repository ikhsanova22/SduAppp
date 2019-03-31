package com.example.sduapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Contacts_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fr_contacts,container,false);

        Button callcenter = view.findViewById(R.id.callcenter);
        Button administration = view.findViewById(R.id.admin);
        Button admission = view.findViewById(R.id.admission);
        Button chancellery = view.findViewById(R.id.chancellery);
        Button site = view.findViewById(R.id.site);

        callcenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:87273079565"));
                startActivity(callIntent);
            }
        });
        administration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:118"));
                startActivity(callIntent);
            }
        });
        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:231"));
                startActivity(callIntent);
            }
        });
        chancellery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:123"));
                startActivity(callIntent);
            }
        });

        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sdu.edu.kz/en/"));
                startActivity(browserIntent);
            }
        });


        return view;

    }
}
