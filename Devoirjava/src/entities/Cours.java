package entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Cours {
    private int id;
    private LocalDate date;
    private LocalTime heureDb;
    private LocalTime heureFin;
    private Professeur professeur;
    private ArrayList<Session> sessions;

    public Cours(int id, LocalDate date, LocalTime heureDb, LocalTime heureFin, Professeur professeur) {
        this.id = id;
        this.date = date;
        this.heureDb = heureDb;
        this.heureFin = heureFin;
        this.professeur = professeur;
        this.sessions = new ArrayList<>();
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getHeureDb() {
        return heureDb;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public ArrayList<Session> getSessions() {
        return sessions;
    }

    public void ajouterSession(Session session) {
        this.sessions.add(session);
    }
}
