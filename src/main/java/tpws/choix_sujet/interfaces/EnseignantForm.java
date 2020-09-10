package tpws.choix_sujet.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tpws.choix_sujet.classes.Enseignant;
import tpws.choix_sujet.classes.Etudiant;
import tpws.choix_sujet.classes.Sujet;
import static tpws.choix_sujet.interfaces.SinginForm.global_id_compte;

public class EnseignantForm extends javax.swing.JFrame {
    Enseignant ensg = new Enseignant();
    Sujet sjt = new Sujet();
    Etudiant etd = new Etudiant();
    int global_id;
    public EnseignantForm() {
        initComponents();
        setTitle("Enseignant");
        setLocationRelativeTo(null);
        UiFunctions.changecolor(b1, b2, b3, b4, b5, b6);
        
        int id_compte = global_id_compte;
        global_id = ensg.getIdFromCompte(id_compte);
 
                e1.setText(ensg.getNom(global_id));
                e2.setText(ensg.getPrenom(global_id));
                e3.setText(ensg.getDate(global_id));
                e4.setText(ensg.getLieu(global_id));
                e5.setText(ensg.getNumero(global_id));
                e6.setText(ensg.getEmail(global_id));
                e7.setText(ensg.getGrade(global_id));
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Sidebar = new javax.swing.JPanel();
        b1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        b2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        b4 = new javax.swing.JPanel();
        b5 = new javax.swing.JPanel();
        b6 = new javax.swing.JPanel();
        transferedID = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        panelb1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        modifier = new javax.swing.JButton();
        enregistrer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        e4 = new javax.swing.JTextField();
        e1 = new javax.swing.JTextField();
        e2 = new javax.swing.JTextField();
        e3 = new javax.swing.JTextField();
        e5 = new javax.swing.JTextField();
        e6 = new javax.swing.JTextField();
        e7 = new javax.swing.JTextField();
        panelb2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        info = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sujet = new javax.swing.JLabel();
        panelb3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        titre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        enonce = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));

        mainPanel.setLayout(new java.awt.BorderLayout());

        Sidebar.setLayout(new java.awt.GridLayout(6, 0));

        b1.setBackground(new java.awt.Color(34, 34, 34));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        b1.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Information");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        b1.add(jLabel3, java.awt.BorderLayout.CENTER);

        Sidebar.add(b1);

        b2.setBackground(new java.awt.Color(34, 34, 34));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        b2.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vos Sujets");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        b2.add(jLabel2, java.awt.BorderLayout.CENTER);

        Sidebar.add(b2);

        b3.setBackground(new java.awt.Color(34, 34, 34));
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        b3.setLayout(new java.awt.BorderLayout());
        Sidebar.add(b3);

        b4.setBackground(new java.awt.Color(34, 34, 34));
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout b4Layout = new javax.swing.GroupLayout(b4);
        b4.setLayout(b4Layout);
        b4Layout.setHorizontalGroup(
            b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        b4Layout.setVerticalGroup(
            b4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        Sidebar.add(b4);

        b5.setBackground(new java.awt.Color(34, 34, 34));
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout b5Layout = new javax.swing.GroupLayout(b5);
        b5.setLayout(b5Layout);
        b5Layout.setHorizontalGroup(
            b5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 262, Short.MAX_VALUE)
        );
        b5Layout.setVerticalGroup(
            b5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        Sidebar.add(b5);

        b6.setBackground(new java.awt.Color(34, 34, 34));
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });
        b6.setLayout(new java.awt.BorderLayout());

        transferedID.setBackground(new java.awt.Color(255, 255, 255));
        transferedID.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        transferedID.setForeground(new java.awt.Color(255, 255, 255));
        transferedID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b6.add(transferedID, java.awt.BorderLayout.CENTER);

        Sidebar.add(b6);

        mainPanel.add(Sidebar, java.awt.BorderLayout.LINE_START);

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new java.awt.CardLayout());

        panelb1.setBackground(new java.awt.Color(255, 255, 255));
        panelb1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        modifier.setBackground(new java.awt.Color(255, 255, 255));
        modifier.setText("Modifier");
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });
        jPanel2.add(modifier);

        enregistrer.setBackground(new java.awt.Color(255, 255, 255));
        enregistrer.setText("Enregistrer");
        enregistrer.setEnabled(false);
        enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerActionPerformed(evt);
            }
        });
        jPanel2.add(enregistrer);

        panelb1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nom");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date de naissance");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("N téléphone");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Grade");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Prénom");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lieu de naissance");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("E-mail");

        e4.setEnabled(false);
        e4.setMinimumSize(new java.awt.Dimension(300, 44));
        e4.setPreferredSize(new java.awt.Dimension(300, 44));

        e1.setEnabled(false);
        e1.setMinimumSize(new java.awt.Dimension(300, 44));
        e1.setPreferredSize(new java.awt.Dimension(300, 44));

        e2.setEnabled(false);
        e2.setMinimumSize(new java.awt.Dimension(300, 44));
        e2.setPreferredSize(new java.awt.Dimension(300, 44));

        e3.setEnabled(false);
        e3.setMinimumSize(new java.awt.Dimension(300, 44));
        e3.setPreferredSize(new java.awt.Dimension(300, 44));

        e5.setEnabled(false);
        e5.setMinimumSize(new java.awt.Dimension(300, 44));
        e5.setPreferredSize(new java.awt.Dimension(300, 44));

        e6.setEnabled(false);
        e6.setMinimumSize(new java.awt.Dimension(300, 44));
        e6.setPreferredSize(new java.awt.Dimension(300, 44));

        e7.setEnabled(false);
        e7.setMinimumSize(new java.awt.Dimension(300, 44));
        e7.setPreferredSize(new java.awt.Dimension(300, 44));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(e7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelb1.add(jPanel1, java.awt.BorderLayout.CENTER);

        Main.add(panelb1, "card2");

        panelb2.setBackground(new java.awt.Color(255, 255, 255));
        panelb2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        info.setBackground(new java.awt.Color(255, 255, 255));
        info.setText("Ajouter Sujet");
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel4.add(info);

        panelb2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelb2.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Le sujet est pris par : ");

        sujet.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(sujet)
                .addContainerGap(681, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sujet))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        panelb2.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        Main.add(panelb2, "card3");

        panelb3.setBackground(new java.awt.Color(255, 255, 255));
        panelb3.setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);

        panelb3.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2);

        panelb3.add(jPanel8, java.awt.BorderLayout.PAGE_END);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Titre : ");

        jLabel14.setText("Enoncé : ");

        titre.setPreferredSize(new java.awt.Dimension(300, 44));
        titre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titreActionPerformed(evt);
            }
        });

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        enonce.setColumns(20);
        enonce.setRows(5);
        jScrollPane2.setViewportView(enonce);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(titre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        panelb3.add(jPanel9, java.awt.BorderLayout.CENTER);

        Main.add(panelb3, "card4");

        mainPanel.add(Main, java.awt.BorderLayout.CENTER);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        UiFunctions.changecolor(b1, b2, b3, b4, b5, b6);
        UiFunctions.switchpanel(panelb1, Main);
    }//GEN-LAST:event_jLabel3MousePressed

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        UiFunctions.changecolor(b2, b1, b3, b4, b5, b6);
        UiFunctions.switchpanel(panelb2, Main);
        
        DefaultTableModel model = UiFunctions.tableModel1();
        
        ResultSet data = null;
        String query = "select * from sujet where id_enseignant = "+global_id+" ";
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
        
        jTable1.setRowHeight(100);
        try {
            while(data.next()){
                String id = Integer.toString(data.getInt("id"));
                String titre = data.getString("titre");
                String enonce = data.getString("enonce");
                
                int dispo = data.getInt(4);
                String disponibilite = sjt.checkDispo(dispo);
                
                model.addRow(new Object[]{id, titre, enonce, disponibilite});
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(model);
    }//GEN-LAST:event_jLabel2MousePressed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b3MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b4MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b5MouseClicked

    private void b5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MousePressed

    }//GEN-LAST:event_b5MousePressed

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b6MouseClicked

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:
        enregistrer.setEnabled(true);
        e1.setEnabled(true);
        e2.setEnabled(true);
        e3.setEnabled(true);
        e4.setEnabled(true);
        e5.setEnabled(true);
        e6.setEnabled(true);
        e7.setEnabled(true);
    }//GEN-LAST:event_modifierActionPerformed

    private void enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerActionPerformed
        // TODO add your handling code here:
        ensg.updateEnseignant(global_id, e1.getText(), e2.getText(), e3.getText(), e4.getText(), e5.getText(), e6.getText(), e7.getText());
        enregistrer.setEnabled(false);
        e1.setEnabled(false);
        e2.setEnabled(false);
        e3.setEnabled(false);
        e4.setEnabled(false);
        e5.setEnabled(false);
        e6.setEnabled(false);
        e7.setEnabled(false);
    }//GEN-LAST:event_enregistrerActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
        Main.removeAll();
        Main.add(panelb3);
        Main.repaint();
        Main.revalidate();
    }//GEN-LAST:event_infoActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        String id_sujet = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        int id_sujet_i = Integer.valueOf(id_sujet);
        String disponibilite = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 3);
        if(disponibilite.equals("Disponible")){
            sujet.setText("Personne");
        }else{
            String nom = etd.getIdEtudiantByIdSujet(id_sujet_i);
            sujet.setText(nom);
        }
        
    }//GEN-LAST:event_jTable1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main.removeAll();
        Main.add(panelb2);
        Main.repaint();
        Main.revalidate();
        DefaultTableModel model = UiFunctions.tableModel1();        
        
        ResultSet data = null;
        String query = "select * from sujet where id_enseignant = "+global_id+" ";
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
        jTable1.setRowHeight(100);
        try {
            while(data.next()){
                String id = Integer.toString(data.getInt("id"));
                String titre = data.getString("titre");
                String enonce = data.getString("enonce");
                
                int dispo = data.getInt(4);
                String disponibilite = sjt.checkDispo(dispo);
                
                model.addRow(new Object[]{id, titre, enonce, disponibilite});
            }
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTable1.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(titre.getText().isEmpty() || enonce.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Remplissez les champs SVP", "Erreur", JOptionPane.ERROR_MESSAGE);
        }else{
            sjt.addSujet(titre.getText(), enonce.getText(), global_id);
            JOptionPane.showMessageDialog(null, "Ajouter Avec Succes", "Succes", JOptionPane.INFORMATION_MESSAGE);
            titre.setText("");
            enonce.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void titreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titreActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EnseignantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnseignantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnseignantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnseignantForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnseignantForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPanel b3;
    private javax.swing.JPanel b4;
    private javax.swing.JPanel b5;
    private javax.swing.JPanel b6;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e2;
    private javax.swing.JTextField e3;
    private javax.swing.JTextField e4;
    private javax.swing.JTextField e5;
    private javax.swing.JTextField e6;
    private javax.swing.JTextField e7;
    private javax.swing.JTextArea enonce;
    private javax.swing.JButton enregistrer;
    private javax.swing.JButton info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton modifier;
    private javax.swing.JPanel panelb1;
    private javax.swing.JPanel panelb2;
    private javax.swing.JPanel panelb3;
    private javax.swing.JLabel sujet;
    private javax.swing.JTextField titre;
    private javax.swing.JLabel transferedID;
    // End of variables declaration//GEN-END:variables
}
