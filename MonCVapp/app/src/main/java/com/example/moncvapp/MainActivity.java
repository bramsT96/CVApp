package com.example.moncvapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("dec 2022", "sept 2023", "Immobilière 3F", "alternant"));
        experiences.add(new Experience("mars 2022", "mai 2022", "Immobilière 3F", "stagière"));
        experiences.add(new Experience("nov 2021", "dec 2021", "RATP", "CDI"));



        ListView listViewExperiences = findViewById(R.id.listViewExperiences);
        ExperienceBassAdapter adapter = new ExperienceBassAdapter(experiences, this);
        listViewExperiences.setAdapter(adapter);

        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("Juin 2022", "Titre pro Dwwm", "Chennevière-sur-Marne"));
        formations.add(new Formation("Avril 2020", "Permis D", "Orly"));
        formations.add(new Formation("Juillet 2015", "Bac STMG RH", "Champigny-sur-Marne"));

        ListView listViewFormations = findViewById(R.id.listViewFormations);
        FormationBaseAdapter formationAdapter = new FormationBaseAdapter(formations, this);
        listViewFormations.setAdapter(formationAdapter);

        Button button=findViewById(R.id.buttonCompetences);
        button.setOnClickListener(this);

    }
    private void switchActivities(){
        Intent intent = new Intent(this, CompetenceActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        Intent intent= new Intent(this, CompetenceActivity.class);
        startActivity(intent);
    }
}