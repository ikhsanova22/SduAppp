package com.example.sduapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class GalleryFragment extends Fragment {
    GridView gridView;
    int[] fruitImages = {R.drawable.ph1,R.drawable.ph2,
            R.drawable.ph3,R.drawable.ph4,R.drawable.ph5,R.drawable.ph6,
            R.drawable.ph7,R.drawable.ph8,R.drawable.ph9,R.drawable.ph1,R.drawable.ph2,R.drawable.ph3};
    public GalleryFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view;
        view= inflater.inflate(R.layout.fragment_gallery, container, false);
        gridView = view.findViewById(R.id.gridview);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), GridItemActivity.class);
                intent.putExtra("image",fruitImages[i]);
                startActivity(intent);
            }
        });
        return view;
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            ImageView image=view1.findViewById(R.id.images);
            image.setImageResource(fruitImages[i]);
            return view1;
        }
    }
}