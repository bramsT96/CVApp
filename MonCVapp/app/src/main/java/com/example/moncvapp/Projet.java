package com.example.moncvapp;

public class Projet {
    private String name;
    private String description;
    private String gitLink;

    public Projet(String name,String description,String gitLink){
        this.name = name;
        this.description = description;
        this.gitLink = gitLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGitLink() {
        return gitLink;
    }

    public void setGitLink(String gitLink) {
        this.gitLink = gitLink;
    }


}
