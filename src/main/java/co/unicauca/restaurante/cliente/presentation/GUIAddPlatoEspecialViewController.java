
package co.unicauca.restaurante.cliente.presentation;
import co.unicauca.restaurante.cliente.acces.Factory;
import co.unicauca.restaurante.cliente.acces.IDishAccess;
import co.unicauca.restaurante.cliente.domain.services.DishService;
import static co.unicauca.restaurante.cliente.infra.Messages.successMessage;
import co.unicauca.restaurante.comunicacion.domain.Dish;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
/**
 *
 * @author HP
 */
public class GUIAddPlatoEspecialViewController extends javax.swing.JFrame {

   String ruta = null;
    public GUIAddPlatoEspecialViewController() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_IdPlato = new javax.swing.JLabel();
        lbl_NomPlato = new javax.swing.JLabel();
        lbl_DescripPlato = new javax.swing.JLabel();
        lbl_valorPlato = new javax.swing.JLabel();
        btn_AddPlato = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        txt_IdPlato = new javax.swing.JTextField();
        txt_NomPlato = new javax.swing.JTextField();
        txt_DescripPlato = new javax.swing.JTextField();
        txt_valorPlato = new javax.swing.JTextField();
        lbl_ImagenPlato = new javax.swing.JLabel();
        btn_ImagenPlato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Plato Especial");

        lbl_IdPlato.setText("Id");

        lbl_NomPlato.setText("Nombre");

        lbl_DescripPlato.setText("Descripcion");

        lbl_valorPlato.setText("Valor");

        btn_AddPlato.setText("Agregar Plato");
        btn_AddPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPlatoActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        txt_NomPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NomPlatoActionPerformed(evt);
            }
        });

        lbl_ImagenPlato.setBackground(new java.awt.Color(0, 0, 0));
        lbl_ImagenPlato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_ImagenPlato.setText("Elegir Imagen");
        btn_ImagenPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImagenPlatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_IdPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_NomPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DescripPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_valorPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_IdPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_NomPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DescripPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_valorPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ImagenPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btn_ImagenPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btn_AddPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_salir)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_IdPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lbl_NomPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lbl_DescripPlato)
                        .addGap(56, 56, 56)
                        .addComponent(lbl_valorPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_IdPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_NomPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_DescripPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_valorPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_ImagenPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_ImagenPlato)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AddPlato)
                    .addComponent(btn_salir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here: Boton salir
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_NomPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NomPlatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomPlatoActionPerformed

    private void btn_AddPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPlatoActionPerformed
        IDishAccess service = Factory.getInstance().getDishService();
        // Inyecta la dependencia
        DishService plateService = new DishService(service);

        Dish plate = new Dish();
        plate.setDishID(Integer.parseInt(txt_IdPlato.getText()));
        plate.setDishName(txt_NomPlato.getText());
        plate.setDishDescription(txt_DescripPlato.getText());
        plate.setDishPrice(Double.parseDouble(txt_valorPlato.getText()));
        //plate.setDishImage(Byte.valueOf(lbl_ImagenPlato.getText()));

        try {
            String response = plateService.save(plate);
            successMessage("Plato Especial "+ response + " agregado con éxito.", "Atención");
            clearControls();            
            btn_AddPlato.setVisible(false);

        } catch (Exception ex) {
            successMessage(ex.getMessage(), "Atención");
        }
    }//GEN-LAST:event_btn_AddPlatoActionPerformed

    private void btn_ImagenPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImagenPlatoActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser();
        int ap= j.showOpenDialog(this);
        if(ap == JFileChooser.APPROVE_OPTION){
            ruta=j.getSelectedFile().getAbsolutePath();
            lbl_ImagenPlato.setIcon(new ImageIcon(ruta));
        }
    }//GEN-LAST:event_btn_ImagenPlatoActionPerformed
    public void clearControls() {
        txt_IdPlato.setText("");
        txt_NomPlato.setText("");
        txt_DescripPlato.setText("");
        txt_valorPlato.setText("");
        lbl_ImagenPlato.setText("");       
    }
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
            java.util.logging.Logger.getLogger(GUIAddPlatoEspecialViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAddPlatoEspecialViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAddPlatoEspecialViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAddPlatoEspecialViewController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAddPlatoEspecialViewController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AddPlato;
    private javax.swing.JButton btn_ImagenPlato;
    private javax.swing.JButton btn_salir;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_DescripPlato;
    private javax.swing.JLabel lbl_IdPlato;
    private javax.swing.JLabel lbl_ImagenPlato;
    private javax.swing.JLabel lbl_NomPlato;
    private javax.swing.JLabel lbl_valorPlato;
    private javax.swing.JTextField txt_DescripPlato;
    private javax.swing.JTextField txt_IdPlato;
    private javax.swing.JTextField txt_NomPlato;
    private javax.swing.JTextField txt_valorPlato;
    // End of variables declaration//GEN-END:variables
}
