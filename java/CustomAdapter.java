package com.example.sduapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Teacher> {

    ArrayList<Teacher> contacts;

    public CustomAdapter(Context context, ArrayList<Teacher> c) {
        super(context, R.layout.list_item);
        contacts = c;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View custom_view = inflater.inflate(R.layout.list_item, parent, false);

        ImageView iv = custom_view.findViewById(R.id.imageView5);
        TextView name_tv = custom_view.findViewById(R.id.textView);
        TextView position_tv = custom_view.findViewById(R.id.textView2);

        iv.setImageResource(contacts.get(position).getImage());
        name_tv.setText(contacts.get(position).getName());
        position_tv.setText(contacts.get(position).getPosition());

        return custom_view;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }
}
