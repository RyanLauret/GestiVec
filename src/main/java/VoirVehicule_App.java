/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thega
 */
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class VoirVehicule_App extends javax.swing.JFrame {

    Statement st;
    DBConnect DBC = new DBConnect();
    DefaultTableModel model = new DefaultTableModel();

    static String recup;

    /**
     * Creates new form VoirVehicule_App
     */
    public VoirVehicule_App() {
        initComponents();

        model.addColumn("Marque");
        model.addColumn("Modèle");
        model.addColumn("Année de sortie");
        model.addColumn("Prix d'achat");
        model.addColumn("Nombre de kilométrage");
        model.addColumn("Nombre de portes");
        model.addColumn("Couleur");
        model.addColumn("Type de carburant");
        model.addColumn("Puissance Fiscale");
        model.addColumn("Boite de vitesse");

        String rqt = "SELECT * FROM vehicule, couleur, moteur WHERE vehicule.idCouleur = couleur.idCouleur AND vehicule.idMoteur = moteur.idMoteur";

        try {
            st = DBC.ObtenirConnexion().createStatement();
            ResultSet resultat = st.executeQuery(rqt);
            while (resultat.next()) {
                model.addRow(new Object[]{resultat.getString("marque"), resultat.getString("modele"), resultat.getString("anneeSortie"), resultat.getString("prixAchat") + " €", resultat.getString("kilometrage"), resultat.getString("nbrePortes"), resultat.getString("nomCouleur"), resultat.getString("carburant"), resultat.getString("puissanceFiscale"), resultat.getString("boiteVitesse")});
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }

        listeTable.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titreListeLabel = new javax.swing.JLabel();
        gestionVehicule = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeTable = new javax.swing.JTable();
        fermer = new javax.swing.JButton();
        supp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 200));

        titreListeLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        titreListeLabel.setForeground(new java.awt.Color(255, 255, 255));
        titreListeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreListeLabel.setText("Liste des Vehicules");
        titreListeLabel.setAlignmentY(0.0F);

        gestionVehicule.setBackground(new java.awt.Color(255, 255, 255));
        gestionVehicule.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        gestionVehicule.setForeground(new java.awt.Color(255, 255, 255));
        gestionVehicule.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\assets\\GestiVec.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titreListeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gestionVehicule)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titreListeLabel)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gestionVehicule))
        );

        listeTable.setBackground(new java.awt.Color(255, 255, 255));
        listeTable.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        listeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        listeTable.setRowHeight(35);
        listeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeTable);

        fermer.setBackground(new java.awt.Color(204, 204, 204));
        fermer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fermer.setForeground(new java.awt.Color(0, 56, 168));
        fermer.setText("Fermer");
        fermer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fermer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fermerMouseClicked(evt);
            }
        });
        fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermerActionPerformed(evt);
            }
        });

        supp.setBackground(new java.awt.Color(204, 204, 204));
        supp.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        supp.setForeground(new java.awt.Color(0, 56, 168));
        supp.setText("Supprimer");
        supp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        supp.setPreferredSize(new java.awt.Dimension(89, 40));
        supp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppMouseClicked(evt);
            }
        });
        supp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1376, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fermer)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fermer)
                    .addComponent(supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1422, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseClicked
        dispose();
    }//GEN-LAST:event_fermerMouseClicked

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fermerActionPerformed

    private void suppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppActionPerformed
        int Selection = listeTable.getSelectedRow();
        String cell = listeTable.getModel().getValueAt(Selection, 0).toString();
        String rqt = "DELETE FROM vehicule WHERE marque = '" + cell + "'";
        ((DefaultTableModel) listeTable.getModel()).removeRow(Selection);

        try {
            st = DBC.ObtenirConnexion().createStatement();
            st.executeUpdate(rqt);
            JOptionPane.showMessageDialog(null, "Votre véhicule a bien été supprimé !");

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_suppActionPerformed

    private void suppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_suppMouseClicked

    private void listeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeTableMouseClicked
        ModifVehicule_App AppelFenetreModif = new ModifVehicule_App();

        int index = listeTable.getSelectedRow();
        TableModel model = listeTable.getModel();

        String marque = model.getValueAt(index, 0).toString();
        String modele = model.getValueAt(index, 1).toString();
        String annee = model.getValueAt(index, 2).toString();
        String prix = model.getValueAt(index, 3).toString();
        String kilometre = model.getValueAt(index, 4).toString();
        String portes = model.getValueAt(index, 5).toString();
        String couleur = model.getValueAt(index, 6).toString();
        String carburant = model.getValueAt(index, 7).toString();
        String puissFiscale = model.getValueAt(index, 8).toString();
        String boiteVit = model.getValueAt(index, 9).toString();
        
        AppelFenetreModif.setVisible(true);
        AppelFenetreModif.pack();
        AppelFenetreModif.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        AppelFenetreModif.marqueText.setText(marque);
        AppelFenetreModif.modeleText.setText(modele);
        AppelFenetreModif.anneeSortieText.setText(annee);
        AppelFenetreModif.prixAchatText.setText(prix);
        AppelFenetreModif.kilomText.setText(kilometre);
        AppelFenetreModif.porteText.setText(portes);
        AppelFenetreModif.couleur_jComboBox.setSelectedItem(couleur);
        AppelFenetreModif.carburant_jComboBox.setSelectedItem(carburant);
        AppelFenetreModif.puissFiscText.setText(puissFiscale);
        AppelFenetreModif.boiteVit_jComboBox.setSelectedItem(boiteVit);
    }//GEN-LAST:event_listeTableMouseClicked

    ModifVehicule_App modif = new ModifVehicule_App();

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
            java.util.logging.Logger.getLogger(VoirVehicule_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VoirVehicule_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VoirVehicule_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VoirVehicule_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoirVehicule_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fermer;
    private javax.swing.JLabel gestionVehicule;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listeTable;
    private javax.swing.JButton supp;
    private javax.swing.JLabel titreListeLabel;
    // End of variables declaration//GEN-END:variables

    void recupData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
