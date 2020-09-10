package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Etudiant {
    public String getNom(int id){
        String nom = null;
        String query = "SELECT nom FROM etudiant WHERE id = "+id+" ;";
        
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
        String query = "SELECT prenom FROM etudiant WHERE id = "+id+" ;";
        
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
        String query = "SELECT date_naiss FROM etudiant WHERE id = "+id+" ;";
        
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
        String query = "SELECT lieu_naiss FROM etudiant WHERE id = "+id+" ;";
        
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
        String query = "SELECT n_telephone FROM etudiant WHERE id = "+id+" ;";
        
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
        String query = "SELECT email FROM etudiant WHERE id = "+id+" ;";
        
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
    public float getMC(int id){
        float moyenne_cursus = 0;
        String query = "SELECT moyenne_cursus FROM etudiant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                moyenne_cursus = data.getFloat("moyenne_cursus");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return moyenne_cursus;
    }
    public float getMUF(int id){
        float moyenne_uf = 0;
        String query = "SELECT moyenne_uf FROM etudiant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                moyenne_uf = data.getFloat("moyenne_uf");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return moyenne_uf;
    }
    public int getIdSjt(int id){
        int id_sujet = 0;
        String query = "SELECT id_sujet FROM etudiant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                id_sujet = data.getInt("id_sujet");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_sujet;
    }
    public int getIdCompte(int id){
        int id_compte = 0;
        String query = "SELECT id_compte FROM etudiant WHERE id = "+id+" ;";
        
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
    public String getIdEtudiantByIdSujet(int id_sujet){
        String nom = null;
        String query = "SELECT nom, prenom FROM etudiant WHERE id_sujet = "+id_sujet+" ;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                nom = data.getString("nom")+" "+data.getString("prenom");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nom;
    }
    public int getIdEtudiantFromCompte(int id_compte){
        int id = 0;
        String query = "SELECT * FROM etudiant WHERE id_compte = "+id_compte+" ;";
        
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
    public void updateEtudiant(int id, String nom, String prenom, String ddn, String ldn, String tel, String mail, String mc, String muf){
        String query = "UPDATE etudiant SET nom='"+nom+"',prenom='"+prenom+"',date_naiss='"+ddn+"',lieu_naiss='"+ldn+"',n_telephone='"+tel+"',email='"+mail+"',moyenne_cursus='"+mc+"',moyenne_uf='"+muf+"' WHERE id = "+id+" ; ";
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
    public void updateSujetEtudiant(int id, int id_sujet){
        String query = "UPDATE etudiant SET id_sujet='"+id_sujet+"' WHERE id = "+id+" ; ";

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
    public void updateSujetEtudiantNull(int id, String id_sujet){
        String query = "UPDATE etudiant SET id_sujet='"+id_sujet+"' WHERE id = "+id+" ; ";
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
    public int getIdSujet(int id){
        int id_sujet = 0;
        String query = "SELECT id_sujet FROM etudiant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                id_sujet = data.getInt("id_sujet");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_sujet;
    }
    public boolean avoirSujet(int id){
        boolean avoir = false;
        String query = "SELECT id_sujet FROM etudiant WHERE id = "+id+" ;";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/choix_pfe?serverTimezone=UTC","root","");
            Statement stmt = con.createStatement();
            ResultSet data = stmt.executeQuery(query);
            while(data.next()){
                int id_sujet = data.getInt("id_sujet");
                if(id_sujet!=0){
                    avoir = true;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Enseignant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return avoir;
    }
    public int getIdEtudiantFromIdSujet(int id_sujet){
        int id = 0;
        String query = "SELECT * FROM etudiant WHERE id_sujet = "+id_sujet+" ;";
        
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
    public int compareMoy(float newMoy, float oldMoy){
        int sup = 0;
        if(newMoy>oldMoy){
            sup = 1;
        }else if(newMoy<oldMoy){
            sup = 0;
        }else if(newMoy==oldMoy){
            sup = 2;
        }
        return sup;
    }
}
