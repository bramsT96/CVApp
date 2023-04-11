package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class LangageBaseAdapter extends BaseAdapter {

    private ArrayList<Langage> langage;
    private Context context;

    public LangageBaseAdapter(ArrayList<Langage> langage, Context context) {
        this.langage = langage;
        this.context = context;
    }

    @Override
    public int getCount() {
        return langage.size();
    }

    @Override
    public Object getItem(int position) {
        return langage.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_langage, parent, false);
        }
        TextView textViewLanguages = convertView.findViewById(R.id.textViewLanguages);
        textViewLanguages.setText(langage.get(position).getLprog());


        RatingBar ratingBar = convertView.findViewById(R.id.ratingBar);
        ratingBar.setRating(langage.get(position).getRating());


        return convertView;
    }
}
