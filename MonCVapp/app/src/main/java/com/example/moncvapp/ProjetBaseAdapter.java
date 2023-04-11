package com.example.moncvapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {

    private ArrayList<Projet> projet;
    private Context context;

    public ProjetBaseAdapter(ArrayList<Projet> projet, Context context) {
        this.projet = projet;
        this.context = context;
    }

    @Override
    public int getCount() {
        return projet.size();
    }

    @Override
    public Object getItem(int position) {
        return projet.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_projet, parent, false);
        }
        TextView textViewName= convertView.findViewById(R.id.textViewNomProjet);
        textViewName.setText(projet.get(position).getName());

        TextView textViewDescription= convertView.findViewById(R.id.textViewDescriptionProj);
        textViewDescription.setText(projet.get(position).getDescription());

        ImageButton imageButton= convertView.findViewById(R.id.buttonGit);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(projet.get(position).getGitLink()));
                context.startActivity(intent);
            }
        });

        return convertView;
    }
}