/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AnnonceDAO;
import entities.Annonce;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fedi
 */
public class ListAnnonceController extends AbstractTableModel{
    List<Annonce> annonces = new ArrayList<Annonce>();
    
    String [] headers ={"Ref° Annonce","Ville de depart","Ville d'arrivée","Date","Heure","Minute","Nb°places","Ref°conducteur"};
    @Override
    
    
    
    public int getRowCount() {
        return annonces.size();
        
    }

    public ListAnnonceController() {
        AnnonceDAO dao = new AnnonceDAO();
        annonces = dao.GetAllAnnonce();
    }


    @Override
    public int getColumnCount() {
        return headers.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex)
        {
            case 0 :
                return annonces.get(rowIndex).getRefAnnonce();
            case 1 :
                return annonces.get(rowIndex).getVilleDepart();
            case 2 :
                return annonces.get(rowIndex).getVilleDepart();
            case 4 :
                return annonces.get(rowIndex).getDate();
            case 5 :
                return annonces.get(rowIndex).getHeure();
            case 6 :
                return annonces.get(rowIndex).getMinute();
            case 7 :    
                return annonces.get(rowIndex).getRefConducteur();
            default :
                return null ;
                
        }
        
    }

    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    

    
}
