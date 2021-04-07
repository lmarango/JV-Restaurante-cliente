/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.client.presentation;

/**
 *
 * @author Sergio Erazo
 */
public class InterfazRegistrarRestaurante extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistrarRestaurante
     */
    public InterfazRegistrarRestaurante() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRegistrar = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIdRestaurante = new javax.swing.JLabel();
        jLabelNombreRestaurante = new javax.swing.JLabel();
        jLabelDireccionRestaurante = new javax.swing.JLabel();
        jLabelDescripcionRestaurante = new javax.swing.JLabel();
        jTextFieldIdRestaurante = new javax.swing.JTextField();
        jTextFieldNombreRestaurante = new javax.swing.JTextField();
        jTextDireccionRestaurante = new javax.swing.JTextField();
        jTextDescripcionRestaurante = new javax.swing.JTextField();
        jPanelFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRegistrar.setBackground(new java.awt.Color(0, 102, 255));
        jButtonRegistrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 110, 50));

        jButtonVolver.setBackground(new java.awt.Color(0, 102, 255));
        jButtonVolver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 100, 50));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 27)); // NOI18N
        jLabelTitulo.setText("REGISTRAR RESTAURANTE");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabelIdRestaurante.setBackground(new java.awt.Color(255, 255, 255));
        jLabelIdRestaurante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelIdRestaurante.setText("ID Restaurante: ");
        getContentPane().add(jLabelIdRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 20));

        jLabelNombreRestaurante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelNombreRestaurante.setText("Nombre:");
        getContentPane().add(jLabelNombreRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabelDireccionRestaurante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDireccionRestaurante.setText("Dirección:");
        getContentPane().add(jLabelDireccionRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabelDescripcionRestaurante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDescripcionRestaurante.setText("Descripción:");
        getContentPane().add(jLabelDescripcionRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jTextFieldIdRestaurante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldIdRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdRestauranteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, 30));

        jTextFieldNombreRestaurante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldNombreRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreRestauranteActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombreRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, 30));

        jTextDireccionRestaurante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jTextDireccionRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 200, 30));

        jTextDescripcionRestaurante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jTextDescripcionRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 30));

        jPanelFondo.setBackground(new java.awt.Color(102, 153, 255));
        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextFieldIdRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdRestauranteActionPerformed

    private void jTextFieldNombreRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreRestauranteActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazRegistrarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrarRestaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistrarRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelDescripcionRestaurante;
    private javax.swing.JLabel jLabelDireccionRestaurante;
    private javax.swing.JLabel jLabelIdRestaurante;
    private javax.swing.JLabel jLabelNombreRestaurante;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextDescripcionRestaurante;
    private javax.swing.JTextField jTextDireccionRestaurante;
    private javax.swing.JTextField jTextFieldIdRestaurante;
    private javax.swing.JTextField jTextFieldNombreRestaurante;
    // End of variables declaration//GEN-END:variables
}
