package services;

import entities.Cours;
import entities.Professeur;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class AdminService {
    private ArrayList<Professeur> professeurs;
    private ArrayList<Cours> coursList;

    public AdminService() {
        this.professeurs = new ArrayList<>();
        this.coursList = new ArrayList<>();
    }

    public void ajouterProfesseur(String nom) {
        Professeur professeur = new Professeur(nom);
        professeurs.add(professeur);
        System.out.println("Professeur " + nom + " ajouté.");
    }

    public void listerProfesseurs() {
        if (professeurs.isEmpty()) {
            System.out.println("Aucun professeur trouvé.");
        } else {
            System.out.println("Liste des professeurs:");
            for (Professeur professeur : professeurs) {
                System.out.println(professeur.getNom());
            }
        }
    }

    public void creerCours(int id, LocalDate date, LocalTime heureDb, LocalTime heureFin, String nomProfesseur) {
        for (Professeur professeur : professeurs) {
            if (professeur.getNom().equals(nomProfesseur)) {
                Cours cours = new Cours(id, date, heureDb, heureFin, professeur);
                professeur.ajouterCours(cours);
                coursList.add(cours);
                System.out.println("Cours créé avec succès.");
                return;
            }
        }
        System.out.println("Professeur non trouvé.");
    }

    public void listerTousLesCours() {
        if (coursList.isEmpty()) {
            System.out.println("Aucun cours trouvé.");
        } else {
            for (Cours cours : coursList) {
                System.out.println("ID: " + cours.getId() + ", Professeur: " + cours.getProfesseur().getNom() + ", Date: " + cours.getDate() + ", Heure de début: " + cours.getHeureDb() + ", Heure de fin: " + cours.getHeureFin());
            }
        }
    }

    public void listerCoursParProfesseur(String nomProfesseur) {
        for (Professeur professeur : professeurs) {
            if (professeur.getNom().equals(nomProfesseur)) {
                if (professeur.getCours().isEmpty()) {
                    System.out.println("Aucun cours trouvé pour le professeur " + nomProfesseur);
                } else {
                    for (Cours cours : professeur.getCours()) {
                        System.out.println("ID: " + cours.getId() + ", Date: " + cours.getDate() + ", Heure de début: " + cours.getHeureDb() + ", Heure de fin: " + cours.getHeureFin());
                    }
                }
                return;
            }
        }
        System.out.println("Professeur non trouvé.");
    }
}
