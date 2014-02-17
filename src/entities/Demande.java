/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Fedi
 */
public class Demande {

    private int refDemande;
    private String villeDepart;
    private String villeArrive;
    private String date;
    private int heure;
    private int minute;
    private int refPassager;

    public Demande() {
    }

    public Demande(int refDemande, String villeDepart, String villeArrive, String date, int heure, int minute, int refPassager) {
        this.refDemande = refDemande;
        this.villeDepart = villeDepart;
        this.villeArrive = villeArrive;
        this.date = date;
        this.heure = heure;
        this.minute = minute;
        this.refPassager = refPassager;
    }

    public int getRefDemande() {
        return refDemande;
    }

    public void setRefDemande(int refDemande) {
        this.refDemande = refDemande;
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

    public int getRefPassager() {
        return refPassager;
    }

    public void setRefPassager(int refPassager) {
        this.refPassager = refPassager;
    }
}
