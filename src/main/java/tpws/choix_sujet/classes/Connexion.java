package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {
    public Connection connexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
    
    public ResultSet getData(String query){
        Statement stmt = null;
        ResultSet rs = null;
        Connexion conne = new Connexion();
        Connection conn = conne.connexion();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void insertData(String query){
        Statement stmt = null;
        Connexion conne = new Connexion();
        Connection conn = conne.connexion();
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            stmt.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
