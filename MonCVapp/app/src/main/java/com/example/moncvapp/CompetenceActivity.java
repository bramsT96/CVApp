package com.example.moncvapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_competences);


        ArrayList<Langage> langages= new ArrayList<Langage>();
        langages.add(new Langage("Symphony", 4));
        langages.add(new Langage( "Java", 3));
        langages.add(new Langage( "PHP", 5));
        langages.add(new Langage( "Boostrap", 5));

        ListView listViewLangages= findViewById(R.id.listViewLanguages);
        LangageBaseAdapter adapter= new LangageBaseAdapter(langages, this);
        listViewLangages.setAdapter(adapter);

        ArrayList<Projet> projets= new ArrayList<Projet>();
        projets.add(new Projet("PointLoc",
                "Site de Location",
                "Il y'a rien"));
        projets.add(new Projet("Je n'ai pas de projet",
                "Je n'ai pas de projet\"",
                "https://gitlab.com/joan.g.francois/cameraip"));
        projets.add(new Projet("MyCardApp",
                "Je n'ai pas de projet\"",
                "https://gitlab.com/joan.g.francois/mycardapp"));

        ListView listViewProjets= findViewById(R.id.listViewProject);
        ProjetBaseAdapter projetAdapter = new ProjetBaseAdapter(projets, this);
        listViewProjets.setAdapter(projetAdapter);

        Button button=findViewById(R.id.buttonExpérience);
        button.setOnClickListener(this);

    }
    private void switchActivities(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}