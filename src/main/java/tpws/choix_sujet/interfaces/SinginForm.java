package tpws.choix_sujet.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import tpws.choix_sujet.classes.Enseignant;
import tpws.choix_sujet.classes.Etudiant;
import tpws.choix_sujet.classes.Sujet;
import tpws.choix_sujet.classes.Utilisateur;

public class SinginForm extends javax.swing.JFrame {
    Enseignant ensg = new Enseignant();
    Sujet sjt = new Sujet();
    Etudiant etd = new Etudiant();
    Utilisateur usr = new Utilisateur();
    public static ResultSet transfertdata;
    public static int global_id_compte;
    public SinginForm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("S'identifier");
        incorrectPass.setVisible(false);
        incorrectUser.setVisible(false);
        incorrectUser1.setVisible(false);
        incorrectUser2.setVisible(false);
        idlabel.setVisible(false);
        idlabele.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Main = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        incorrectUser = new javax.swing.JLabel();
        incorrectPass = new javax.swing.JLabel();
        Insc = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userField1 = new javax.swing.JTextField();
        passField1 = new javax.swing.JPasswordField();
        incorrectUser1 = new javax.swing.JLabel();
        enseignantB = new javax.swing.JRadioButton();
        etudiantB = new javax.swing.JRadioButton();
        incorrectUser2 = new javax.swing.JLabel();
        Etudiant = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        etudnom = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        etudddn = new javax.swing.JTextField();
        etudprenom = new javax.swing.JTextField();
        etudldn = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        etudtel = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        etudmc = new javax.swing.JTextField();
        etudmail = new javax.swing.JTextField();
        etudmuf = new javax.swing.JTextField();
        idlabele = new javax.swing.JLabel();
        Enseignant = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        ennom = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        enddn = new javax.swing.JTextField();
        enprenom = new javax.swing.JTextField();
        enldn = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        entel = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        engrade = new javax.swing.JTextField();
        enmail = new javax.swing.JTextField();
        idlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 300));
        setResizable(false);

        Main.setPreferredSize(new java.awt.Dimension(800, 300));
        Main.setLayout(new java.awt.CardLayout());

        Login.setBackground(new java.awt.Color(255, 255, 255));
        Login.setMinimumSize(new java.awt.Dimension(800, 300));
        Login.setPreferredSize(new java.awt.Dimension(800, 300));
        Login.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("S'inscrire");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Quitter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        Login.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nom d'utilisateur : ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mot de passe : ");

        userField.setBackground(new java.awt.Color(255, 255, 255));
        userField.setPreferredSize(new java.awt.Dimension(400, 44));

        passField.setBackground(new java.awt.Color(255, 255, 255));
        passField.setPreferredSize(new java.awt.Dimension(400, 44));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("S'identifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        incorrectUser.setForeground(new java.awt.Color(204, 0, 0));
        incorrectUser.setText("User introuvable");

        incorrectPass.setForeground(new java.awt.Color(204, 0, 0));
        incorrectPass.setText("Password incorrect");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incorrectUser)
                    .addComponent(incorrectPass))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incorrectUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incorrectPass))
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        Login.add(jPanel1, java.awt.BorderLayout.CENTER);

        Main.add(Login, "card2");

        Insc.setBackground(new java.awt.Color(255, 255, 255));
        Insc.setMinimumSize(new java.awt.Dimension(800, 300));
        Insc.setPreferredSize(new java.awt.Dimension(800, 300));
        Insc.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Retour");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Suivant");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);

        Insc.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nom d'utilisateur : ");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("S'inscrire en tant que :");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Mot de passe : ");

        userField1.setBackground(new java.awt.Color(255, 255, 255));
        userField1.setPreferredSize(new java.awt.Dimension(400, 44));

        passField1.setBackground(new java.awt.Color(255, 255, 255));
        passField1.setPreferredSize(new java.awt.Dimension(400, 44));

        incorrectUser1.setForeground(new java.awt.Color(204, 0, 0));
        incorrectUser1.setText("Déja Utilisé ");

        enseignantB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(enseignantB);
        enseignantB.setForeground(new java.awt.Color(0, 0, 0));
        enseignantB.setText("Enseignant");

        etudiantB.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(etudiantB);
        etudiantB.setForeground(new java.awt.Color(0, 0, 0));
        etudiantB.setSelected(true);
        etudiantB.setText("Etudiant");

        incorrectUser2.setForeground(new java.awt.Color(204, 0, 0));
        incorrectUser2.setText("Entrer un pass");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(etudiantB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enseignantB)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(incorrectUser2)
                    .addComponent(incorrectUser1))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(userField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incorrectUser1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incorrectUser2))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enseignantB)
                    .addComponent(etudiantB)
                    .addComponent(jLabel4))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        Insc.add(jPanel6, java.awt.BorderLayout.CENTER);

        Main.add(Insc, "card3");

        Etudiant.setBackground(new java.awt.Color(255, 255, 255));
        Etudiant.setMinimumSize(new java.awt.Dimension(800, 300));
        Etudiant.setPreferredSize(new java.awt.Dimension(800, 300));
        Etudiant.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("S'inscrire");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);

        Etudiant.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nom : ");

        etudnom.setBackground(new java.awt.Color(255, 255, 255));
        etudnom.setForeground(new java.awt.Color(0, 0, 0));
        etudnom.setMinimumSize(new java.awt.Dimension(180, 44));
        etudnom.setPreferredSize(new java.awt.Dimension(180, 44));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Date de naissance : ");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Prénom : ");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Lieu de naissance : ");

        etudddn.setBackground(new java.awt.Color(255, 255, 255));
        etudddn.setForeground(new java.awt.Color(0, 0, 0));
        etudddn.setMinimumSize(new java.awt.Dimension(180, 44));
        etudddn.setPreferredSize(new java.awt.Dimension(180, 44));

        etudprenom.setBackground(new java.awt.Color(255, 255, 255));
        etudprenom.setForeground(new java.awt.Color(0, 0, 0));
        etudprenom.setMinimumSize(new java.awt.Dimension(180, 44));
        etudprenom.setPreferredSize(new java.awt.Dimension(180, 44));

        etudldn.setBackground(new java.awt.Color(255, 255, 255));
        etudldn.setForeground(new java.awt.Color(0, 0, 0));
        etudldn.setMinimumSize(new java.awt.Dimension(180, 44));
        etudldn.setPreferredSize(new java.awt.Dimension(180, 44));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("N Téléphone : ");

        etudtel.setBackground(new java.awt.Color(255, 255, 255));
        etudtel.setForeground(new java.awt.Color(0, 0, 0));
        etudtel.setMinimumSize(new java.awt.Dimension(180, 44));
        etudtel.setPreferredSize(new java.awt.Dimension(180, 44));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Moyenne cursus : ");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Email : ");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Moyenne UF : ");

        etudmc.setBackground(new java.awt.Color(255, 255, 255));
        etudmc.setForeground(new java.awt.Color(0, 0, 0));
        etudmc.setMinimumSize(new java.awt.Dimension(180, 44));
        etudmc.setPreferredSize(new java.awt.Dimension(180, 44));

        etudmail.setBackground(new java.awt.Color(255, 255, 255));
        etudmail.setForeground(new java.awt.Color(0, 0, 0));
        etudmail.setMinimumSize(new java.awt.Dimension(180, 44));
        etudmail.setPreferredSize(new java.awt.Dimension(180, 44));

        etudmuf.setBackground(new java.awt.Color(255, 255, 255));
        etudmuf.setForeground(new java.awt.Color(0, 0, 0));
        etudmuf.setMinimumSize(new java.awt.Dimension(180, 44));
        etudmuf.setPreferredSize(new java.awt.Dimension(180, 44));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etudmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etudtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etudnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etudddn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etudldn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(etudprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idlabele))
                    .addComponent(etudmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etudmuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(etudnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etudprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(idlabele)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etudddn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(etudldn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(etudtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etudmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etudmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(etudmuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        Etudiant.add(jPanel4, java.awt.BorderLayout.CENTER);

        Main.add(Etudiant, "card4");

        Enseignant.setBackground(new java.awt.Color(255, 255, 255));
        Enseignant.setForeground(new java.awt.Color(255, 255, 255));
        Enseignant.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("S'inscrire");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton7);

        Enseignant.add(jPanel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Nom : ");

        ennom.setBackground(new java.awt.Color(255, 255, 255));
        ennom.setForeground(new java.awt.Color(0, 0, 0));
        ennom.setMinimumSize(new java.awt.Dimension(180, 44));
        ennom.setPreferredSize(new java.awt.Dimension(180, 44));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Date de naissance : ");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Prénom : ");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Lieu de naissance : ");

        enddn.setBackground(new java.awt.Color(255, 255, 255));
        enddn.setForeground(new java.awt.Color(0, 0, 0));
        enddn.setMinimumSize(new java.awt.Dimension(180, 44));
        enddn.setPreferredSize(new java.awt.Dimension(180, 44));

        enprenom.setBackground(new java.awt.Color(255, 255, 255));
        enprenom.setForeground(new java.awt.Color(0, 0, 0));
        enprenom.setMinimumSize(new java.awt.Dimension(180, 44));
        enprenom.setPreferredSize(new java.awt.Dimension(180, 44));

        enldn.setBackground(new java.awt.Color(255, 255, 255));
        enldn.setForeground(new java.awt.Color(0, 0, 0));
        enldn.setMinimumSize(new java.awt.Dimension(180, 44));
        enldn.setPreferredSize(new java.awt.Dimension(180, 44));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("N Téléphone : ");

        entel.setBackground(new java.awt.Color(255, 255, 255));
        entel.setForeground(new java.awt.Color(0, 0, 0));
        entel.setMinimumSize(new java.awt.Dimension(180, 44));
        entel.setPreferredSize(new java.awt.Dimension(180, 44));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Grade : ");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Email : ");

        engrade.setBackground(new java.awt.Color(255, 255, 255));
        engrade.setForeground(new java.awt.Color(0, 0, 0));
        engrade.setMinimumSize(new java.awt.Dimension(180, 44));
        engrade.setPreferredSize(new java.awt.Dimension(180, 44));

        enmail.setBackground(new java.awt.Color(255, 255, 255));
        enmail.setForeground(new java.awt.Color(0, 0, 0));
        enmail.setMinimumSize(new java.awt.Dimension(180, 44));
        enmail.setPreferredSize(new java.awt.Dimension(180, 44));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel24)
                    .addComponent(jLabel17)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(engrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ennom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enddn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28)
                            .addComponent(jLabel25))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enldn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(idlabel))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(ennom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enddn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(enldn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(entel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(engrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(idlabel))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        Enseignant.add(jPanel8, java.awt.BorderLayout.CENTER);

        Main.add(Enseignant, "card5");

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Main.removeAll();
        Main.add(Insc);
        Main.repaint();
        Main.revalidate();
        
        userField.setText("");
        passField.setText("");
        incorrectUser.setVisible(false);
        incorrectPass.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String inputUser = userField.getText();
        String inputPass = passField.getText();
        boolean acces = false;
        
        incorrectUser.setVisible(false);
        incorrectPass.setVisible(false);
        
        String pass = usr.getPass(inputUser);
        int check = usr.checkUser(pass, inputPass);
        
        switch (check) {
            case 0:
                incorrectUser.setVisible(true);
                break;
            case 1:
                incorrectPass.setVisible(true);
                break;
            default:
                acces = true;
                break;
        }
        if(acces){
            String role = usr.getRole(inputUser);
            global_id_compte = usr.getId(inputUser);
            if(role.equals("etudiant")){
                EtudiantForm etudf = new EtudiantForm();
                etudf.setVisible(true);
                dispose();
            }else{
                EnseignantForm ensf = new EnseignantForm();
                ensf.setVisible(true);
                dispose();
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Main.removeAll();
        Main.add(Login);
        Main.repaint();
        Main.revalidate();
        
        userField1.setText("");
        passField1.setText("");
        incorrectUser1.setVisible(false);
        incorrectUser2.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        incorrectUser1.setVisible(false);
        incorrectUser2.setVisible(false);
        
        String role;
        if(etudiantB.isSelected()){
            role = "etudiant";
        }else role = "enseignant";
        
        String user = userField1.getText();
        String pass = passField1.getText();
        
        if(user.equals("")){
            incorrectUser1.setText("Entrer un user");
            incorrectUser1.setVisible(true);
        }else if(pass.equals("")){
            incorrectUser2.setText("Entrer un pass");
            incorrectUser2.setVisible(true);
        }else{
            boolean exist = usr.checkUserExist(user);

            if(exist){
                incorrectUser1.setText("user existant");
                incorrectUser1.setVisible(true);
            }else{
                String query = "INSERT INTO compte(user, pass, role) values('"+user+"', '"+pass+"', '"+role+"') ";
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
                
                int id = usr.getId(user);
                
                if(role.equals("etudiant")){
                    Main.removeAll();
                    Main.add(Etudiant);
                    Main.repaint();
                    Main.revalidate();
                    idlabele.setText(String.valueOf(id));
                }else {
                    Main.removeAll();
                    Main.add(Enseignant);
                    Main.repaint();
                    Main.revalidate();
                    idlabel.setText(String.valueOf(id));
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String nom = etudnom.getText();
        String prenom = etudprenom.getText();
        String ddn = etudddn.getText();
        String ldn = etudldn.getText();
        String telephone = etudtel.getText();
        String email = etudmail.getText();
        String mc = etudmc.getText();
        String muf = etudmuf.getText();
        String idc = idlabele.getText();
        String query = "INSERT INTO etudiant(nom, prenom, date_naiss, lieu_naiss, n_telephone, email, moyenne_cursus, moyenne_uf, id_sujet, id_compte) values ('"+nom+"', '"+prenom+"', '"+ddn+"', '"+ldn+"', '"+telephone+"', '"+email+"', '"+mc+"', '"+muf+"', NULL, '"+idc+"')";
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
        
        Main.removeAll();
        Main.add(Login);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String nom = ennom.getText();
        String prenom = enprenom.getText();
        String ddn = enddn.getText();
        String ldn = enldn.getText();
        String telephone = entel.getText();
        String email = enmail.getText();
        String grade = engrade.getText();
        String idc = idlabel.getText();
        String query = "INSERT INTO enseignant(nom, prenom, date_naiss, lieu_naiss, n_telephone, email, grade, id_compte) values ('"+nom+"', '"+prenom+"', '"+ddn+"', '"+ldn+"', '"+telephone+"', '"+email+"', '"+grade+"', '"+idc+"')";
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
        
        Main.removeAll();
        Main.add(Login);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_jButton7ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SinginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Enseignant;
    private javax.swing.JPanel Etudiant;
    private javax.swing.JPanel Insc;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel Main;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField enddn;
    private javax.swing.JTextField engrade;
    private javax.swing.JTextField enldn;
    private javax.swing.JTextField enmail;
    private javax.swing.JTextField ennom;
    private javax.swing.JTextField enprenom;
    private javax.swing.JRadioButton enseignantB;
    private javax.swing.JTextField entel;
    private javax.swing.JTextField etudddn;
    private javax.swing.JRadioButton etudiantB;
    private javax.swing.JTextField etudldn;
    private javax.swing.JTextField etudmail;
    private javax.swing.JTextField etudmc;
    private javax.swing.JTextField etudmuf;
    private javax.swing.JTextField etudnom;
    private javax.swing.JTextField etudprenom;
    private javax.swing.JTextField etudtel;
    private javax.swing.JLabel idlabel;
    private javax.swing.JLabel idlabele;
    private javax.swing.JLabel incorrectPass;
    private javax.swing.JLabel incorrectUser;
    private javax.swing.JLabel incorrectUser1;
    private javax.swing.JLabel incorrectUser2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField passField;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JTextField userField;
    private javax.swing.JTextField userField1;
    // End of variables declaration//GEN-END:variables
}
