package com.example.moncvapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ExperienceBassAdapter extends BaseAdapter {

    private ArrayList<Experience> experiences;
    private Context context;

    public ExperienceBassAdapter(ArrayList<Experience> experiences, Context context) {
        this.experiences = experiences;
        this.context = context;
    }

    @Override
    public int getCount() {
        return experiences.size();
    }

    @Override
    public Object getItem(int position) {
        return experiences.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_experience, parent, false);
        }
        TextView textViewDateDebut= convertView.findViewById(R.id.textViewDateDebut);
        textViewDateDebut.setText(experiences.get(position).getDateDebut());
        TextView textViewDateFin= convertView.findViewById(R.id.textViewDateFin);
        textViewDateFin.setText(experiences.get(position).getDateFin());
        TextView textViewSociete= convertView.findViewById(R.id.textViewSociete);
        textViewSociete.setText(experiences.get(position).getEntreprise());
        TextView textViewDescription= convertView.findViewById(R.id.textViewDescription);
        textViewDescription.setText(experiences.get(position).getDescription());
        return convertView;
    }
}