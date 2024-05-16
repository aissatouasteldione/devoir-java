package services;

import entities.Cours;
import entities.Session;

public class AttacheDeClasseService {
    public void inscrireEtudiant(String nomEtudiant, String classe) {
        // Logique pour inscrire un étudiant
        System.out.println("Étudiant " + nomEtudiant + " inscrit à la classe " + classe);
    }

    public void planifierSession(Cours cours, Session session) {
        cours.ajouterSession(session);
        System.out.println("Session planifiée pour le cours ID: " + cours.getId());
    }
}
