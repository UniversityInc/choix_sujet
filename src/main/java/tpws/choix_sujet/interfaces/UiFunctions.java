/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpws.choix_sujet.interfaces;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sofiane
 */
public class UiFunctions {
    public static void changecolor(JPanel b,JPanel b1,JPanel b2,JPanel b3,JPanel b4,JPanel b5){
        b1.setBackground(new java.awt.Color(34,34,34));
        b2.setBackground(new java.awt.Color(34,34,34));
        b3.setBackground(new java.awt.Color(34,34,34));
        b4.setBackground(new java.awt.Color(34,34,34));
        b5.setBackground(new java.awt.Color(34,34,34));
        b.setBackground(new java.awt.Color(68,67,67));
    }
    public static void switchpanel(JPanel panel, JPanel panel2) {
        panel2.removeAll();
        panel2.add(panel);
        panel2.repaint();
        panel2.revalidate();
    }
    public static DefaultTableModel tableModel(){
            DefaultTableModel model = null;
            model = new DefaultTableModel(new String[]{"ID", "Titre", "Disponibilité", "Enseignant"}, 0);
        return model;
        }
    public static DefaultTableModel tableModel1(){
            DefaultTableModel model = null;
            model = new DefaultTableModel(new String[]{"ID", "Titre", "Enonce", "Disponibilité"}, 0);
        return model;
        }
}
