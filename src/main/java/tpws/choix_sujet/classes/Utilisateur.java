package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilisateur {
    public int getId(String user){
        int id = 0;
        String query = "SELECT id FROM compte WHERE user = '"+user+"';";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                id = data.getInt("id");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public String getPass(String user){
        String pass = null;
        String query = "SELECT pass FROM compte WHERE user = '"+user+"';";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                pass = data.getString("pass");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pass;
    }
    public String getRole(String user){
        String query = "SELECT role FROM compte WHERE user = '"+user+"';";
        String role = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                role = data.getString("role");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }
    public int checkUser(String pass, String inputPass){
        int i = 0;
        
        if(pass!=null){
            i = 1;
            if(pass.equals(inputPass)){
                i = 2;
            }
        }
        return i;
    }
    public boolean checkUserExist(String user){
        String query = "SELECT * FROM compte;";
        ResultSet data = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            data = stmt.executeQuery(query);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean exist = false;
        try {
            while(data.next()){
                String dbUser = data.getString(2);
                if(dbUser.equals(user)){
                    exist = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exist;
    }
}
