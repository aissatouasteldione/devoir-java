package core;

import services.AdminService;
import services.AttacheDeClasseService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminService adminService = new AdminService();
        AttacheDeClasseService attacheService = new AttacheDeClasseService();

        while (true) {
            System.out.println("1. Ajouter un Professeur");
            System.out.println("2. Lister les Professeurs");
            System.out.println("3. Créer un cours");
            System.out.println("4. Lister tous les cours");
            System.out.println("5. Lister les cours d’un professeur");
            System.out.println("6. Quitter");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choix) {
                case 1:
                    System.out.println("Entrez le nom du professeur:");
                    String nomProfesseur = scanner.nextLine();
                    adminService.ajouterProfesseur(nomProfesseur);
                    break;
                case 2:
                    adminService.listerProfesseurs();
                    break;
                case 3:
                    System.out.println("Entrez l'ID du cours:");
                    int idCours = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.println("Entrez la date du cours (YYYY-MM-DD):");
                    String dateCours = scanner.nextLine();
                    LocalDate date = LocalDate.parse(dateCours);

                    System.out.println("Entrez l'heure de début du cours (HH:MM):");
                    String heureDebutCours = scanner.nextLine();
                    LocalTime heureDb = LocalTime.parse(heureDebutCours);

                    System.out.println("Entrez l'heure de fin du cours (HH:MM):");
                    String heureFinCours = scanner.nextLine();
                    LocalTime heureFin = LocalTime.parse(heureFinCours);

                    System.out.println("Entrez le nom du professeur:");
                    String nomProf = scanner.nextLine();

                    adminService.creerCours(idCours, date, heureDb, heureFin, nomProf);
                    break;
                case 4:
                    adminService.listerTousLesCours();
                    break;
                case 5:
                    System.out.println("Entrez le nom du professeur:");
                    String nom = scanner.nextLine();
                    adminService.listerCoursParProfesseur(nom);
                    break;
                case 6:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide. Réessayez.");
            }
        }
    }
}
