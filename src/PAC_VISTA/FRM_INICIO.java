/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA;

import PAC_VISTA.FLD_ADM.FRM_ADM;
import PAC_ENTIDAD.ENT_USUARIO;
import PAC_MODELO.SQL_USUARIO;
import PAC_VISTA.FLD_FUN.FRM_FUN;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author windows21
 */
public class FRM_INICIO extends javax.swing.JFrame {

    VTN_I_LOGIN frml_login = new VTN_I_LOGIN();
    ENT_USUARIO mod_usu = new ENT_USUARIO();
    SQL_USUARIO sql_usuario = new SQL_USUARIO();

    public FRM_INICIO() {
        initComponents();
        ShowPanel(frml_login);
    }

    private void ShowPanel(JPanel hijo) {

        hijo.setSize(1320, 560);
        hijo.setLocation(0, 0);

        this.pnl_contenedor.removeAll();
        this.pnl_contenedor.add(hijo);
        this.pnl_contenedor.revalidate();
        this.pnl_contenedor.repaint();
    }

    private void AnimacioBtn1(JPanel back) {
        back.setBackground(new Color(51, 51, 51));
    }

    private void AnimacioBtn2(JPanel back) {
        back.setBackground(new Color(0, 150, 70));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        BG = new javax.swing.JPanel();
        pnlA_bar_top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txt_usuario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pnlL_ingresar = new javax.swing.JPanel();
        lbtL_ingresar = new javax.swing.JLabel();
        cmb_dni = new javax.swing.JComboBox<>();
        txt_clave = new javax.swing.JPasswordField();
        pnl_contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(0, 102, 102));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlA_bar_top.setBackground(new java.awt.Color(255, 255, 255));
        pnlA_bar_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ibarra Real Nova SemiBold", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 150, 70));
        jLabel1.setText("SenaEvents");
        pnlA_bar_top.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAC_IMG/logo_sena.jpg"))); // NOI18N
        pnlA_bar_top.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        pnlA_bar_top.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 10, 90));
        pnlA_bar_top.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 115, 150, 10));
        pnlA_bar_top.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 115, 150, 10));

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(102, 102, 102));
        txt_usuario.setText("Usuario...");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        pnlA_bar_top.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 150, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("Iniciar sesion ");
        pnlA_bar_top.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, -1));

        pnlL_ingresar.setBackground(new java.awt.Color(0, 150, 70));

        lbtL_ingresar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbtL_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        lbtL_ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtL_ingresar.setText("INGRESAR");
        lbtL_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbtL_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbtL_ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbtL_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbtL_ingresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlL_ingresarLayout = new javax.swing.GroupLayout(pnlL_ingresar);
        pnlL_ingresar.setLayout(pnlL_ingresarLayout);
        pnlL_ingresarLayout.setHorizontalGroup(
            pnlL_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtL_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        pnlL_ingresarLayout.setVerticalGroup(
            pnlL_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlL_ingresarLayout.createSequentialGroup()
                .addComponent(lbtL_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlA_bar_top.add(pnlL_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 80, 120, 40));

        cmb_dni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_dni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_dniActionPerformed(evt);
            }
        });
        pnlA_bar_top.add(cmb_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 240, 40));

        txt_clave.setText("jPasswordField1");
        txt_clave.setBorder(null);
        txt_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_claveMousePressed(evt);
            }
        });
        pnlA_bar_top.add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 90, 150, 30));

        BG.add(pnlA_bar_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 120));

        pnl_contenedor.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout pnl_contenedorLayout = new javax.swing.GroupLayout(pnl_contenedor);
        pnl_contenedor.setLayout(pnl_contenedorLayout);
        pnl_contenedorLayout.setHorizontalGroup(
            pnl_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        pnl_contenedorLayout.setVerticalGroup(
            pnl_contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        BG.add(pnl_contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1320, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void lbtL_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseClicked

        if (!this.txt_usuario.getText().equals("") && !this.txt_clave.getText().equals("")) {
            mod_usu.setUs_dni(Long.parseLong(this.txt_usuario.getText()));
            mod_usu.setUs_clave(this.txt_clave.getText());
            System.out.print(mod_usu.getUs_clave());

            if (sql_usuario.Validar_ingreso(mod_usu)) {

                if (mod_usu.getUs_rol().equals("FUNCIONARIO")) {
                    FRM_FUN frm = new FRM_FUN();
                    frm.setVisible(true);
                    this.dispose();
                } else {
                    if (mod_usu.getUs_rol().equals("ADMINISTRADOR")) {
                        FRM_ADM frm = new FRM_ADM();
                        frm.setVisible(true);
                        this.dispose();
                    }
                }
            }
        } else {
            System.out.print("NO entró al primer if");
        }
    }//GEN-LAST:event_lbtL_ingresarMouseClicked

    private void lbtL_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseEntered
        this.AnimacioBtn1(this.pnlL_ingresar);
    }//GEN-LAST:event_lbtL_ingresarMouseEntered

    private void lbtL_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseExited
        this.AnimacioBtn2(this.pnlL_ingresar);
    }//GEN-LAST:event_lbtL_ingresarMouseExited

    private void cmb_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_dniActionPerformed

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        this.txt_usuario.setText("");
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txt_claveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_claveMousePressed
        txt_clave.setText("");
    }//GEN-LAST:event_txt_claveMousePressed

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
            java.util.logging.Logger.getLogger(FRM_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_INICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel BG;
    private javax.swing.JComboBox<String> cmb_dni;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator9;
    public javax.swing.JLabel lbtL_ingresar;
    public javax.swing.JPanel pnlA_bar_top;
    public javax.swing.JPanel pnlL_ingresar;
    public javax.swing.JPanel pnl_contenedor;
    public javax.swing.JPasswordField txt_clave;
    public javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
