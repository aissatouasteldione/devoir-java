package entities;

import java.util.ArrayList;

public class Professeur {
    private String nom;
    private ArrayList<Cours> cours;

    public Professeur(String nom) {
        this.nom = nom;
        this.cours = new ArrayList<>();
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Cours> getCours() {
        return cours;
    }

    public void ajouterCours(Cours cours) {
        this.cours.add(cours);
    }
}
