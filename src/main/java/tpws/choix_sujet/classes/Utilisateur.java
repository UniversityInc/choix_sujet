package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilisateur {
    
    public ResultSet getUser(String user){
        ResultSet data = null;
        String query = "SELECT * FROM compte WHERE user = '"+user+"';";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    public int getId(String user){
        int id = 0;
        ResultSet data = null;
        String query = "SELECT id FROM compte WHERE user = '"+user+"';";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        try {
            while(data.next()){
                id = data.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public String getRole(String user){
        String query = "SELECT role FROM compte WHERE user = '"+user+"';";
        ResultSet data = null;
        Connexion conne = new Connexion();
        data = conne.getData(query);
        String role = null;
        try {
            while(data.next()){
                role = data.getString("role");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }
    
    public int checkUser(ResultSet data, String inputPass){
        int i = 0;
        try {
            while(data.next()){
                i = 1;
                String pass = data.getString(3);
                if(pass.equals(inputPass)){
                    i = 2;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Utilisateur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return i;
    }
    
    public ResultSet getAllUsers(){
        String query = "SELECT * FROM compte;";
        ResultSet data = null;
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    
    public boolean checkUserExist(ResultSet data, String user){
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
