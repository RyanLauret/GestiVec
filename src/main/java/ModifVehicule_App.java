/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java;

/**
 *
 * @author ASUS
 */
public class ModifVehicule_App extends javax.swing.JFrame {

    /**
     * Creates new form ModifVehicule_App
     */
    public ModifVehicule_App() {
        initComponents();
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
        gestionVehicule = new javax.swing.JLabel();
        titreModifLabel = new javax.swing.JLabel();
        marqueLabel = new javax.swing.JLabel();
        modeleLabel = new javax.swing.JLabel();
        dateAchatLabel = new javax.swing.JLabel();
        prixAchatLabel = new javax.swing.JLabel();
        nbreKilomLabel = new javax.swing.JLabel();
        nbrePorteLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        porteText = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        kilomText = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        prixAchatText = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        anneeSortieText = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        modeleText = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        marqueText = new javax.swing.JTextPane();
        couleurLabel = new javax.swing.JLabel();
        typeCarburLabel = new javax.swing.JLabel();
        refMoteurLabel = new javax.swing.JLabel();
        puissFiscLabel = new javax.swing.JLabel();
        boitVitessLabel = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        couleurText = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        carburantText = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        refMotText = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        puissFiscText = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        nbreVitesseText = new javax.swing.JTextPane();
        register = new javax.swing.JButton();
        fermer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1125, 630));
        setMinimumSize(new java.awt.Dimension(1125, 630));
        setPreferredSize(new java.awt.Dimension(1125, 630));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 200));

        gestionVehicule.setBackground(new java.awt.Color(255, 255, 255));
        gestionVehicule.setFont(new java.awt.Font("Dialog", 3, 48)); // NOI18N
        gestionVehicule.setForeground(new java.awt.Color(255, 255, 255));
        gestionVehicule.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Travails\\NetBeansProjects\\Vehicule\\assets\\GestiVec.png")); // NOI18N

        titreModifLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        titreModifLabel.setForeground(new java.awt.Color(255, 255, 255));
        titreModifLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreModifLabel.setText("Modifier un Vehicule");
        titreModifLabel.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(titreModifLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gestionVehicule)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(gestionVehicule))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titreModifLabel)
                .addGap(48, 48, 48))
        );

        marqueLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        marqueLabel.setForeground(new java.awt.Color(0, 56, 168));
        marqueLabel.setText("Marque: ");

        modeleLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        modeleLabel.setForeground(new java.awt.Color(0, 56, 168));
        modeleLabel.setText("Modèle:");

        dateAchatLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dateAchatLabel.setForeground(new java.awt.Color(0, 56, 168));
        dateAchatLabel.setText("Année d'achat: ");

        prixAchatLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        prixAchatLabel.setForeground(new java.awt.Color(0, 56, 168));
        prixAchatLabel.setText("Prix d'achat: ");

        nbreKilomLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nbreKilomLabel.setForeground(new java.awt.Color(0, 56, 168));
        nbreKilomLabel.setText("Kilométrages:");

        nbrePorteLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nbrePorteLabel.setForeground(new java.awt.Color(0, 56, 168));
        nbrePorteLabel.setText("Nombre portes:");

        porteText.setContentType(""); // NOI18N
        porteText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        porteText.setToolTipText("\"Nissan\", \"Renault\", \"Audi\"...");
        porteText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        porteText.setName("AjoutMarque"); // NOI18N
        jScrollPane7.setViewportView(porteText);

        kilomText.setContentType(""); // NOI18N
        kilomText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kilomText.setToolTipText("\"Nissan\", \"Renault\", \"Audi\"...");
        kilomText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kilomText.setName("AjoutMarque"); // NOI18N
        jScrollPane6.setViewportView(kilomText);

        prixAchatText.setContentType(""); // NOI18N
        prixAchatText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        prixAchatText.setToolTipText("\"25000\", \"18000\", \"27000\"...");
        prixAchatText.setName("AjoutMarque"); // NOI18N
        jScrollPane4.setViewportView(prixAchatText);

        anneeSortieText.setContentType(""); // NOI18N
        anneeSortieText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        anneeSortieText.setToolTipText("\"2012\", \"1998\", 2006\"...");
        anneeSortieText.setName("AjoutMarque"); // NOI18N
        jScrollPane3.setViewportView(anneeSortieText);

        modeleText.setContentType(""); // NOI18N
        modeleText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        modeleText.setToolTipText("\"2012\", \"1998\", 2006\"...");
        modeleText.setName("AjoutMarque"); // NOI18N
        jScrollPane5.setViewportView(modeleText);

        marqueText.setContentType(""); // NOI18N
        marqueText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        marqueText.setToolTipText("\"Nissan\", \"Renault\", \"Audi\"...");
        marqueText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        marqueText.setName("AjoutMarque"); // NOI18N
        jScrollPane2.setViewportView(marqueText);

        couleurLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        couleurLabel.setForeground(new java.awt.Color(0, 56, 168));
        couleurLabel.setText("Couleur:");

        typeCarburLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        typeCarburLabel.setForeground(new java.awt.Color(0, 56, 168));
        typeCarburLabel.setText("Type carburant:");

        refMoteurLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        refMoteurLabel.setForeground(new java.awt.Color(0, 56, 168));
        refMoteurLabel.setText("Référence moteur:");

        puissFiscLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        puissFiscLabel.setForeground(new java.awt.Color(0, 56, 168));
        puissFiscLabel.setText("Puissance fiscale:");

        boitVitessLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        boitVitessLabel.setForeground(new java.awt.Color(0, 56, 168));
        boitVitessLabel.setText("Nombre de vitesse:");

        couleurText.setContentType(""); // NOI18N
        couleurText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        couleurText.setToolTipText("\"Nissan\", \"Renault\", \"Audi\"...");
        couleurText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        couleurText.setName("AjoutMarque"); // NOI18N
        jScrollPane8.setViewportView(couleurText);

        carburantText.setContentType(""); // NOI18N
        carburantText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        carburantText.setToolTipText("\"2012\", \"1998\", 2006\"...");
        carburantText.setName("AjoutMarque"); // NOI18N
        jScrollPane12.setViewportView(carburantText);

        refMotText.setContentType(""); // NOI18N
        refMotText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        refMotText.setToolTipText("\"Nissan\", \"Renault\", \"Audi\"...");
        refMotText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        refMotText.setName("AjoutMarque"); // NOI18N
        jScrollPane9.setViewportView(refMotText);

        puissFiscText.setContentType(""); // NOI18N
        puissFiscText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        puissFiscText.setToolTipText("\"Nissan\", \"Renault\", \"Audi\"...");
        puissFiscText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        puissFiscText.setName("AjoutMarque"); // NOI18N
        jScrollPane10.setViewportView(puissFiscText);

        nbreVitesseText.setContentType(""); // NOI18N
        nbreVitesseText.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nbreVitesseText.setToolTipText("\"Nissan\", \"Renault\", \"Audi\"...");
        nbreVitesseText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nbreVitesseText.setName("AjoutMarque"); // NOI18N
        jScrollPane11.setViewportView(nbreVitesseText);

        register.setBackground(new java.awt.Color(204, 204, 204));
        register.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        register.setForeground(new java.awt.Color(0, 56, 168));
        register.setText("Enregistrer");
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.setMaximumSize(new java.awt.Dimension(89, 40));
        register.setMinimumSize(new java.awt.Dimension(89, 40));
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        fermer.setBackground(new java.awt.Color(204, 204, 204));
        fermer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fermer.setForeground(new java.awt.Color(0, 56, 168));
        fermer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fermer.setLabel("Fermer");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(modeleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nbreKilomLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nbrePorteLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(242, 242, 242))
                                .addComponent(marqueLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(prixAchatLabel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateAchatLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(couleurLabel)
                            .addComponent(refMoteurLabel)
                            .addComponent(typeCarburLabel)
                            .addComponent(puissFiscLabel)
                            .addComponent(boitVitessLabel))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fermer)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(couleurLabel)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marqueLabel)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modeleLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(typeCarburLabel))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(refMoteurLabel))
                            .addComponent(dateAchatLabel)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(puissFiscLabel)
                                .addComponent(prixAchatLabel))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boitVitessLabel)
                            .addComponent(nbreKilomLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbrePorteLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(fermer)))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

    }//GEN-LAST:event_registerActionPerformed

    private void fermerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fermerMouseClicked
        dispose();
    }//GEN-LAST:event_fermerMouseClicked

    private void fermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fermerActionPerformed

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
            java.util.logging.Logger.getLogger(ModifVehicule_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifVehicule_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifVehicule_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifVehicule_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifVehicule_App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane anneeSortieText;
    private javax.swing.JLabel boitVitessLabel;
    private javax.swing.JTextPane carburantText;
    private javax.swing.JLabel couleurLabel;
    private javax.swing.JTextPane couleurText;
    private javax.swing.JLabel dateAchatLabel;
    private javax.swing.JButton fermer;
    private javax.swing.JLabel gestionVehicule;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane kilomText;
    private javax.swing.JLabel marqueLabel;
    private javax.swing.JTextPane marqueText;
    private javax.swing.JLabel modeleLabel;
    private javax.swing.JTextPane modeleText;
    private javax.swing.JLabel nbreKilomLabel;
    private javax.swing.JLabel nbrePorteLabel;
    private javax.swing.JTextPane nbreVitesseText;
    private javax.swing.JTextPane porteText;
    private javax.swing.JLabel prixAchatLabel;
    private javax.swing.JTextPane prixAchatText;
    private javax.swing.JLabel puissFiscLabel;
    private javax.swing.JTextPane puissFiscText;
    private javax.swing.JTextPane refMotText;
    private javax.swing.JLabel refMoteurLabel;
    private javax.swing.JButton register;
    private javax.swing.JLabel titreModifLabel;
    private javax.swing.JLabel typeCarburLabel;
    // End of variables declaration//GEN-END:variables
}
