/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connexion.MyConnection;
import entities.Annonce;
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
public class AnnonceDAO {
    
    public void AjouterAnnonce (Annonce a)
    {
        String requette = "insert into annonce (villeDepart,villeArrive,date,heure,minute,nbPlace,refCond) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requette);
            ps.setString(1, a.getVilleDepart());
            ps.setString(2, a.getVilleArrive());
            ps.setString(3, a.getDate());
            ps.setInt(4, a.getHeure());
            ps.setInt(5, a.getMinute());
            ps.setInt(6, a.getNbPlace());
            ps.setInt(7, a.getRefConducteur());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Annonce> GetAllAnnonce()
    {
        String requette = "select * from Annonce";
        List<Annonce> MesAnnonce = new ArrayList<Annonce>();
        try {
            Statement s = MyConnection.getInstance().createStatement();
            ResultSet res = s.executeQuery(requette);
            while(res.next())
            {
                Annonce a = new Annonce();
                a.setRefAnnonce(res.getInt(1));
                a.setVilleDepart(res.getString(2));
                a.setVilleArrive(res.getString(3));
                a.setDate(res.getString(4));
                a.setHeure(res.getInt(5));
                a.setMinute(res.getInt(6));
                a.setRefConducteur(res.getInt(7));
                
                MesAnnonce.add(a);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AnnonceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MesAnnonce;
    }
    
}
