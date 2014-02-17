/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Fedi
 */
public class Annonce {

    private int refAnnonce;
    private String villeDepart;
    private String villeArrive;
    private String date;
    private int heure;
    private int minute;
    private int nbPlace;
    private int refConducteur;

    public Annonce() {
    }

    public Annonce(int refAnnonce, String villeDepart, String villeArrive, String date, int heure, int minute, int refConducteur, int nbPlace) {
        this.refAnnonce = refAnnonce;
        this.villeDepart = villeDepart;
        this.villeArrive = villeArrive;
        this.date = date;
        this.heure = heure;
        this.minute = minute;
        this.refConducteur = refConducteur;
        this.nbPlace = nbPlace;
    }

    public int getRefAnnonce() {
        return refAnnonce;
    }

    public void setRefAnnonce(int refAnnonce) {
        this.refAnnonce = refAnnonce;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrive() {
        return villeArrive;
    }

    public void setVilleArrive(String villeArrive) {
        this.villeArrive = villeArrive;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getRefConducteur() {
        return refConducteur;
    }

    public void setRefConducteur(int refConducteur) {
        this.refConducteur = refConducteur;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }
}
