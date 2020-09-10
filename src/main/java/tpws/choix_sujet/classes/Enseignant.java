package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Enseignant {
    public int getIdFromCompte(int id_compte){
        int id = 0;
        String query = "SELECT * FROM enseignant WHERE id_compte = "+id_compte+" ;";

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
    public String getNom(int id){
        String nom = null;
        String query = "SELECT nom FROM enseignant WHERE id = "+id+" ;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                nom = data.getString("nom");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nom;
    }
    public String getPrenom(int id){
        String prenom = null;
        String query = "SELECT prenom FROM enseignant WHERE id = "+id+" ;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                prenom = data.getString("prenom");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prenom;
    }
    public String getDate(int id){
        String date_naiss = null;        
        String query = "SELECT date_naiss FROM enseignant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                date_naiss = data.getString("date_naiss");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date_naiss;
    }
    public String getLieu(int id){
        String lieu_naiss = null;        
        String query = "SELECT lieu_naiss FROM enseignant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                lieu_naiss = data.getString("lieu_naiss");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lieu_naiss;
    }
    public String getNumero(int id){
        String n_telephone = null;
        String query = "SELECT n_telephone FROM enseignant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                n_telephone = data.getString("n_telephone");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n_telephone;
    }
    public String getEmail(int id){
        String email = null;
        String query = "SELECT email FROM enseignant WHERE id = "+id+" ;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                email = data.getString("email");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return email;
    }
    public String getGrade(int id){
        String grade = null;
        String query = "SELECT grade FROM enseignant WHERE id = "+id+" ;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                grade = data.getString("grade");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grade;
    }
    public int getIdCompte(int id){
        int id_compte = 0;
        String query = "SELECT id_compte FROM enseignant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                id_compte = data.getInt("id_compte");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_compte;
    }
    public void updateEnseignant(int id, String nom, String prenom, String ddn, String ldn, String tel, String mail, String grade){
        String query = "UPDATE enseignant SET nom='"+nom+"',prenom='"+prenom+"',date_naiss='"+ddn+"',lieu_naiss='"+ldn+"',n_telephone='"+tel+"',email='"+mail+"',grade='"+grade+"' WHERE id = "+id+" ; ";
        
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