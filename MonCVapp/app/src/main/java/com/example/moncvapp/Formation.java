package com.example.moncvapp;

public class Formation {

    private String dateObtention;
    private String nomDiplome;
    private String lieu;

    public Formation(String dateObtention, String nomDiplome, String lieu) {
        this.dateObtention = dateObtention;
        this.nomDiplome = nomDiplome;
        this.lieu = lieu;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(String dateObtention) {
        this.dateObtention = dateObtention;
    }

    public String getNomDiplome() {
        return nomDiplome;
    }

    public void setNomDiplome(String nomDiplome) {
        this.nomDiplome = nomDiplome;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}
