package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Etudiant {
    public String getIdEtudiantByIdSujet(int id_sujet){
        String nom = null;
        ResultSet data;
        String query = "SELECT nom, prenom FROM etudiant WHERE id_sujet = "+id_sujet+" ;";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        try {
            while(data.next()){
                nom = data.getString("nom")+" "+data.getString("prenom");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nom;
    }
    public int getIdEtudiantFromCompte(int id_compte){
        int id = 0;
        ResultSet data;
        String query = "SELECT * FROM etudiant WHERE id_compte = "+id_compte+" ;";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        try {
            while(data.next()){
                id = data.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public ResultSet getEtudiant(int id){
        ResultSet data = null;
        String query = "SELECT * FROM etudiant WHERE id = "+id+" ;";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    public void updateEtudiant(int id, String nom, String prenom, String ddn, String ldn, String tel, String mail, String mc, String muf){
        String query = "UPDATE etudiant SET nom='"+nom+"',prenom='"+prenom+"',date_naiss='"+ddn+"',lieu_naiss='"+ldn+"',n_telephone='"+tel+"',email='"+mail+"',moyenne_cursus='"+mc+"',moyenne_uf='"+muf+"' WHERE id = "+id+" ; ";
        Connexion conne = new Connexion();
        conne.insertData(query);
    }
    public void updateSujetEtudiant(int id, int id_sujet){
        String query = "UPDATE etudiant SET id_sujet='"+id_sujet+"' WHERE id = "+id+" ; ";
        Connexion conne = new Connexion();
        conne.insertData(query);
    }
    public void updateSujetEtudiantNull(int id, String id_sujet){
        String query = "UPDATE etudiant SET id_sujet='"+id_sujet+"' WHERE id = "+id+" ; ";
        Connexion conne = new Connexion();
        conne.insertData(query);
    }
    public int getIdSujet(int id){
        int id_sujet = 0;
        ResultSet data;
        String query = "SELECT id_sujet FROM etudiant WHERE id = "+id+" ;";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        try {
            while(data.next()){
                id_sujet = data.getInt("id_sujet");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_sujet;
    }
    
    public boolean avoirSujet(int id){
        boolean avoir = false;
        ResultSet data;
        String query = "SELECT id_sujet FROM etudiant WHERE id = "+id+" ;";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        try {
            while(data.next()){
                int id_sujet = data.getInt("id_sujet");
                if(id_sujet!=0){
                    avoir = true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Etudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return avoir;
    }
    public int getIdEtudiantFromIdSujet(int id_sujet){
        int id = 0;
        ResultSet data;
        String query = "SELECT * FROM etudiant WHERE id_sujet = "+id_sujet+" ;";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        try {
            while(data.next()){
                id = data.getInt("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Etudiant.class.getName()).log(Level.SEVERE, null, ex);
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
