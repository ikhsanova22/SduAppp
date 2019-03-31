package com.example.sduapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FacultyAdapter extends ArrayAdapter<Faculty> {

    ArrayList<Faculty> faculties;

    public FacultyAdapter(Context context, ArrayList<Faculty> c) {
        super(context, R.layout.news_item);
        faculties = c;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View custom_view = inflater.inflate(R.layout.news_item, parent, false);

        ImageView iv = custom_view.findViewById(R.id.fac_image);
        TextView name_tv = custom_view.findViewById(R.id.textView1);
        TextView position_tv = custom_view.findViewById(R.id.textView2);

        iv.setImageResource(faculties.get(position).getImage());
        name_tv.setText(faculties.get(position).getName());
        position_tv.setText(faculties.get(position).getDescription());

        return custom_view;
    }

    @Override
    public int getCount() {
        return faculties.size();
    }


}
