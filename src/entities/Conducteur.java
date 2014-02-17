/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Fedi
 */
public class Conducteur {

    private int refConducteur;
    private String nom;
    private String prenom;
    private String numTel;
    private int age;
    private String adresse;
    private String login;
    private String pwd;
    private String marqueVoiture;
    private String matricule;

    public Conducteur() {
    }

    public Conducteur(int refConducteur, String nom, String prenom, String numTel, int age, String adresse, String login, String pwd, String marqueVoiture, String matricule) {
        this.refConducteur = refConducteur;
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
        this.age = age;
        this.adresse = adresse;
        this.login = login;
        this.pwd = pwd;
        this.marqueVoiture = marqueVoiture;
        this.matricule = matricule;
    }

    public int getRefConducteur() {
        return refConducteur;
    }

    public void setRefConducteur(int refConducteur) {
        this.refConducteur = refConducteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMarqueVoiture() {
        return marqueVoiture;
    }

    public void setMarqueVoiture(String marqueVoiture) {
        this.marqueVoiture = marqueVoiture;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}
