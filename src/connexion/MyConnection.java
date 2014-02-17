/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Fedi
 */
public class MyConnection {
    
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/covoiturage";
    private static final String login = "root";
    private static final String pwd = "";
    
    private static Connection con;
    
    private MyConnection()
    {}
    
    public Connection etablirConnection()
    {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, login, pwd);
            System.out.println("Connexion etablie");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erreur de chargement de driver"+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Problème de connexion"+ex.getMessage());
        }
        return con;
    }
    
    public static Connection getInstance()
    {
        if(con==null)
            new MyConnection().etablirConnection();
        return con;
    }
}
