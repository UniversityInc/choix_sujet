package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sujet {
    public String getTitre(int id){
        String query = "select titre from sujet where id = "+id+" ";
        String titre = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                titre = data.getString("titre");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return titre;
    }
    public String getEnonce(int id){
        String query = "select enonce from sujet where id = "+id+" ";
        String enonce = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                enonce = data.getString("enonce");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return enonce;
    }
    public int getPris(int id){
        String query = "select pris from sujet where id = "+id+" ";
        int pris = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                pris = data.getInt("pris");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pris;
    }
    public int getIdEns(int id){
        String query = "select id_enseignant from sujet where id = "+id+" ";
        int id_enseignant = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                id_enseignant = data.getInt("id_enseignant");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_enseignant;
    }
    public void updateSujet(int id, int pris){
        String query = "UPDATE sujet SET pris='"+pris+"' WHERE id = "+id+" ; ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String checkDispo(int pris){
        String disponible = null;
        switch (pris) {
            case 0:
                disponible = "Disponible";
                break;
            case 1:
                disponible = "Non disponible";
                break;
        }
        return disponible;
    }
    public void addSujet(String titre, String enonce, int id_enseignant){
        String query = "INSERT INTO sujet(titre, enonce, pris, id_enseignant) VALUES ('"+titre+"', '"+enonce+"', 0, "+id_enseignant+") ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}