package com.example.sduapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Staff_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fr_staff,container,false);

        ListView staff_list = view.findViewById(R.id.staff_list);
        ArrayList<Teacher> staffs = new ArrayList<>();
        CustomAdapter adapter = new CustomAdapter(getContext(), staffs);
        staff_list.setAdapter(adapter);

        staffs.add(new Teacher("Kanat Kozhakhmet", "Head of Board", R.drawable.rector));
        staffs.add(new Teacher("Meirambek Zhaparov", "Dean", R.drawable.dean));
        staffs.add(new Teacher("Zhainagul Duisebekova", "Senior Lecturer", R.drawable.zhainagul));
        staffs.add(new Teacher("Alexandr Ivanov", "Senior Lecturer", R.drawable.ivanov));
        staffs.add(new Teacher("Ardak Shalkarbay-uly", "Educational Program Coordinator", R.drawable.ardak));
        staffs.add(new Teacher("Darkhan Kuanyshbay", "Senior Lecturer", R.drawable.darkhan));
        staffs.add(new Teacher("Madina Alimanova", "Chairman", R.drawable.madina));
        staffs.add(new Teacher("Zhasdauren Duisebekov", "Senior Lecturer", R.drawable.zhasdauren));
        staffs.add(new Teacher("Arman Tynyshtykbayev", "Lecturer", R.drawable.arman));
        staffs.add(new Teacher("Birzhan Moldagaliyev", "Lecturer", R.drawable.birzhan));
        staffs.add(new Teacher("Konstantin Latuta", "Senior Lecturer", R.drawable.latuta));

        adapter.notifyDataSetChanged();

        return view;

    }

}
