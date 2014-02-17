/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AdminDAO;
import entities.Administrateur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Fedi
 */
public class ListAdminController extends AbstractTableModel{
    List<Administrateur> admins = new ArrayList<Administrateur>();
    String [] headers = {"refAdmin","Nom","Prenom","Adresse","Age","Numtel","login","pwd"};

    public ListAdminController() {
    AdminDAO dao = new AdminDAO();
    admins = dao.getallAdministrateur();
    }
    
    
    
            
    @Override
    public int getRowCount() {
    return admins.size();    
    }

    @Override
    public int getColumnCount() {
    return headers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    switch(columnIndex)
    {
        case 0 : return admins.get(rowIndex).getRefAdmin();
        case 1 : return admins.get(rowIndex).getNom();
        case 2 : return admins.get(rowIndex).getPrenom();
        case 3 : return admins.get(rowIndex).getAdresse();
        case 4 : return admins.get(rowIndex).getAge();
        case 5 : return admins.get(rowIndex).getNumTel();
        case 6 : return admins.get(rowIndex).getLogin();
        case 7 : return admins.get(rowIndex).getPwd();
            
        default:return null;
    }
    }

    @Override
    public String getColumnName(int column) {
        return headers[column];
    }
    
}
