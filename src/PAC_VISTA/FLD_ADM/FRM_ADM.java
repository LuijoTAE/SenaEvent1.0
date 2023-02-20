/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_ADM;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author windows21
 */
public class FRM_ADM extends javax.swing.JFrame {
    
    VTN_A_REGIONAL vtn_a_regional = new VTN_A_REGIONAL();
    VTN_USUARIO vtnUsuario = new VTN_USUARIO();
    VTN_PAIS vtnPais = new VTN_PAIS();
    
    public FRM_ADM() {
        initComponents();
    }
    
    private void ShowPanel(JPanel hijo) {
        
        hijo.setSize(1320, 570);
        hijo.setLocation(0, 0);
        
        this.pnl_contenedor.removeAll();
        this.pnl_contenedor.add(hijo);
        this.pnl_contenedor.revalidate();
        this.pnl_contenedor.repaint();
    }
    
    private void AnimacionOscura(JPanel pnl) {
        pnl.setBackground(new Color(51, 51, 51));
    }
    private void AnimacionClara(JPanel pnl) {
        pnl.setBackground(new Color(0, 150, 70));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        pnlA_bar_top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        pnlDepartamento = new javax.swing.JPanel();
        lblA_pais = new javax.swing.JLabel();
        pnlRegional = new javax.swing.JPanel();
        lblA_regional = new javax.swing.JLabel();
        pnlUsuario = new javax.swing.JPanel();
        lblA_usuarios = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        pnl_contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        setBackground(new java.awt.Color(102, 255, 204));

        BG.setBackground(new java.awt.Color(0, 102, 102));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlA_bar_top.setBackground(new java.awt.Color(255, 255, 255));
        pnlA_bar_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ibarra Real Nova SemiBold", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 200, 92));
        jLabel1.setText("SenaEvents");
        pnlA_bar_top.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAC_IMG/logo_sena.jpg"))); // NOI18N
        pnlA_bar_top.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        pnlA_bar_top.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 10, 90));

        pnlDepartamento.setBackground(new java.awt.Color(0, 150, 70));
        pnlDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblA_pais.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblA_pais.setForeground(new java.awt.Color(255, 255, 255));
        lblA_pais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA_pais.setText("DEPARTAMENTO");
        lblA_pais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblA_pais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA_paisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblA_paisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblA_paisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlDepartamentoLayout = new javax.swing.GroupLayout(pnlDepartamento);
        pnlDepartamento.setLayout(pnlDepartamentoLayout);
        pnlDepartamentoLayout.setHorizontalGroup(
            pnlDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblA_pais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        pnlDepartamentoLayout.setVerticalGroup(
            pnlDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblA_pais, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlA_bar_top.add(pnlDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 85, 180, -1));

        pnlRegional.setBackground(new java.awt.Color(0, 150, 70));

        lblA_regional.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblA_regional.setForeground(new java.awt.Color(255, 255, 255));
        lblA_regional.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA_regional.setText("REGIONAL");
        lblA_regional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblA_regional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA_regionalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblA_regionalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblA_regionalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlRegionalLayout = new javax.swing.GroupLayout(pnlRegional);
        pnlRegional.setLayout(pnlRegionalLayout);
        pnlRegionalLayout.setHorizontalGroup(
            pnlRegionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblA_regional, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlRegionalLayout.setVerticalGroup(
            pnlRegionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblA_regional, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlA_bar_top.add(pnlRegional, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 85, 130, -1));

        pnlUsuario.setBackground(new java.awt.Color(0, 150, 70));

        lblA_usuarios.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lblA_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        lblA_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblA_usuarios.setText("USUARIOS");
        lblA_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblA_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblA_usuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblA_usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblA_usuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlUsuarioLayout = new javax.swing.GroupLayout(pnlUsuario);
        pnlUsuario.setLayout(pnlUsuarioLayout);
        pnlUsuarioLayout.setHorizontalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblA_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlUsuarioLayout.setVerticalGroup(
            pnlUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblA_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlA_bar_top.add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 85, 130, -1));
        pnlA_bar_top.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1184, 10, 120, 20));

        BG.add(pnlA_bar_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 120));

        pnl_contenedor.setBackground(new java.awt.Color(0, 102, 51));

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

    private void lblA_regionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_regionalMouseClicked
        ShowPanel(vtn_a_regional);
    }//GEN-LAST:event_lblA_regionalMouseClicked

    private void lblA_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_usuariosMouseClicked
        ShowPanel(vtnUsuario);
    }//GEN-LAST:event_lblA_usuariosMouseClicked

    private void lblA_paisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_paisMouseClicked
        ShowPanel(vtnPais);
    }//GEN-LAST:event_lblA_paisMouseClicked

    private void lblA_paisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_paisMouseEntered
        AnimacionOscura(this.pnlDepartamento);
    }//GEN-LAST:event_lblA_paisMouseEntered

    private void lblA_paisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_paisMouseExited
        AnimacionClara(this.pnlDepartamento);
    }//GEN-LAST:event_lblA_paisMouseExited

    private void lblA_regionalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_regionalMouseEntered
        AnimacionOscura(this.pnlRegional);
    }//GEN-LAST:event_lblA_regionalMouseEntered

    private void lblA_regionalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_regionalMouseExited
        AnimacionClara(this.pnlRegional);
    }//GEN-LAST:event_lblA_regionalMouseExited

    private void lblA_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_usuariosMouseEntered
        AnimacionOscura(this.pnlUsuario);
    }//GEN-LAST:event_lblA_usuariosMouseEntered

    private void lblA_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblA_usuariosMouseExited
        AnimacionClara(this.pnlUsuario);
    }//GEN-LAST:event_lblA_usuariosMouseExited

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
            java.util.logging.Logger.getLogger(FRM_ADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_ADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_ADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_ADM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_ADM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblA_pais;
    private javax.swing.JLabel lblA_regional;
    private javax.swing.JLabel lblA_usuarios;
    public javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnlA_bar_top;
    private javax.swing.JPanel pnlDepartamento;
    private javax.swing.JPanel pnlRegional;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JPanel pnl_contenedor;
    // End of variables declaration//GEN-END:variables
}
