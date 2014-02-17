/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Fedi
 */
public class Passager {

    private int refPassager;
    private String nom;
    private String prenom;
    private int age;
    private String numTel;
    private String adresse;
    private String login;
    private String pwd;
    private String travail;

    public Passager() {
    }

    public Passager(int refPassager, String nom, String prenom, int age, String numTel, String adresse, String login, String pwd, String travail) {
        this.refPassager = refPassager;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numTel = numTel;
        this.adresse = adresse;
        this.login = login;
        this.pwd = pwd;
        this.travail = travail;
    }

    public int getRefPassager() {
        return refPassager;
    }

    public void setRefPassager(int refPassager) {
        this.refPassager = refPassager;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
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

    public String getTravail() {
        return travail;
    }

    public void setTravail(String travail) {
        this.travail = travail;
    }
}
