/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

public class Administrateur {

    private int refAdmin;
    private String nom;
    private String prenom;
    private String adresse;
    private String numTel;
    private int Age;
    private String login;
    private String pwd;

    public Administrateur() {
    }

    public Administrateur(int refAdmin, String nom, String prenom, String adresse, String numTel, int Age, String login, String pwd) {
        this.refAdmin = refAdmin;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numTel = numTel;
        this.Age = Age;
        this.login = login;
        this.pwd = pwd;
    }

    public int getRefAdmin() {
        return refAdmin;
    }

    public void setRefAdmin(int refAdmin) {
        this.refAdmin = refAdmin;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
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
}
