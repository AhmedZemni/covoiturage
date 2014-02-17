/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connexion.MyConnection;
import entities.Administrateur;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fedi
 */
public class AdminDAO {
    public void AjouterAdministrateur(Administrateur a)
    {
        String requete="insert into administrateur(nom,prenom,adresse,age,numTel,login,pwd)value(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            ps.setString(1,a.getNom());
            ps.setString(2,a.getPrenom());
            ps.setString(3,a.getAdresse());
            ps.setInt(4,a.getAge());
            ps.setString(5,a.getNumTel());
            ps.setString(6,a.getLogin());
            ps.setString(7,a.getPwd());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
    }
    public List <Administrateur> getallAdministrateur () 
    {
     String requete = "select* from Administrateur";
     List <Administrateur> mesadmins= new ArrayList<Administrateur>();
             
        try {
            Statement s = MyConnection.getInstance().createStatement();
            ResultSet res = s.executeQuery(requete);
            while(res.next())
            {
                Administrateur a = new Administrateur();
                a.setRefAdmin(res.getInt(1));
                a.setNom(res.getString(2));
                a.setPrenom(res.getString(3));
                a.setAdresse(res.getString(4));
                a.setAge(res.getInt(5));
                a.setNumTel(res.getString(6));
                a.setLogin(res.getString(7));
                a.setPwd(res.getString(8));
                mesadmins.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesadmins;
    }
            
    
}
