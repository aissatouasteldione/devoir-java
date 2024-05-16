package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Session {
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String salle;

    public Session(LocalDate date, LocalTime heureDebut, LocalTime heureFin, String salle) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.salle = salle;
    }

    // Getters et setters
    public LocalDate getDate() {
        return date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public String getSalle() {
        return salle;
    }
}
