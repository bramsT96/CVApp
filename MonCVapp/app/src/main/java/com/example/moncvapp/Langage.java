package com.example.moncvapp;

public class Langage {
    private String Lprog;
    private float Rating;

    public Langage(String lprog, float rating) {
        Lprog = lprog;
        Rating = rating;
    }


    public String getLprog() {
        return Lprog;
    }

    public void setLprog(String lprog) {
        Lprog = lprog;
    }

    public float getRating() {
        return Rating;
    }

    public void setRating(float rating) {
        Rating = rating;
    }
}