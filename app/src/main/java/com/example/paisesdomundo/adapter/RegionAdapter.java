package com.example.paisesdomundo.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.paisesdomundo.R;

import java.util.List;

public class RegionAdapter extends BaseAdapter {
    Context context;
    List<String> listRegions;
    LayoutInflater inflter;
    //ImageView img_region;

    public RegionAdapter(Context context, List<String> listRegions) {
        this.context = context;
        this.listRegions = listRegions;
        this.inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return listRegions.size();
    }

    @Override
    public Object getItem(int position) {
        return listRegions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.list_of_regions, null);
        TextView nameRegion = (TextView) view.findViewById(R.id.tv_region_name);

        nameRegion.setText(getItem(position).toString());

        return view;
    }
}
