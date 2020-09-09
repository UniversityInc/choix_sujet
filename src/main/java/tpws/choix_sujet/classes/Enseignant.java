package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Enseignant {
    public int getIdFromCompte(int id_compte){
        int id = 0;
        ResultSet data;
        String query = "SELECT * FROM enseignant WHERE id_compte = "+id_compte+" ;";
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
    public ResultSet getEnseignant(int id){
        ResultSet data = null;
        String query = "SELECT * FROM enseignant WHERE id = "+id+" ;";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    public void updateEnseignant(int id, String nom, String prenom, String ddn, String ldn, String tel, String mail, String grade){
        String query = "UPDATE enseignant SET nom='"+nom+"',prenom='"+prenom+"',date_naiss='"+ddn+"',lieu_naiss='"+ldn+"',n_telephone='"+tel+"',email='"+mail+"',grade='"+grade+"' WHERE id = "+id+" ; ";
        Connexion conne = new Connexion();
        conne.insertData(query);
    }
}
