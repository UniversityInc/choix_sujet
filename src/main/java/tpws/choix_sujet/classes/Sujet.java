package tpws.choix_sujet.classes;

import java.sql.Connection;
import java.sql.ResultSet;

public class Sujet {
    public ResultSet getAllSujet(){
        ResultSet data = null;  
        String query = "SELECT s.id, s.titre, s.enonce, s.pris, e.nom, e.prenom FROM sujet as s INNER JOIN enseignant as e on s.id_enseignant = e.id";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    public ResultSet getSujet(int id){
        ResultSet data = null;  
        String query = "select * from sujet where id = "+id+" ";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    public ResultSet getAllSujetEnseigant(int id_enseignant){
        ResultSet data = null;  
        String query = "select * from sujet where id_enseignant = "+id_enseignant+" ";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    public ResultSet getSujetEnseignant(int id){
        ResultSet data = null;  
        String query = "SELECT s.id, s.titre, s.enonce, s.pris, e.nom, e.prenom FROM sujet as s INNER JOIN enseignant as e on s.id_enseignant = e.id WHERE s.id = "+id+" ";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    public ResultSet getSujetEtudiant(int id){
        ResultSet data = null;  
        String query = "SELECT s.id, s.titre, s.enonce, s.pris, e.id, e.nom, e.prenom, e.moyenne_cursus, e.moyenne_uf FROM etudiant as e INNER JOIN sujet as s on e.id_sujet = s.id WHERE e.id_sujet = "+id+" ";
        Connexion conne = new Connexion();
        data = conne.getData(query);
        return data;
    }
    public void updateSujet(int id, int pris){
        String query = "UPDATE sujet SET pris='"+pris+"' WHERE id = "+id+" ; ";
        Connexion conne = new Connexion();
        conne.insertData(query);
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
        Connexion conne = new Connexion();
        conne.insertData(query);
    }
    
}