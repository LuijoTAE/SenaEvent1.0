/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_FUN;

import javax.swing.JPanel;

/**
 *
 * @author windows21
 */
public class FRM_FUN extends javax.swing.JFrame {

    
    public FRM_FUN() {
        initComponents();
        
    }

    
    
    private void ShowPanel(JPanel hijo){
        
        hijo.setSize(1320, 570);
        hijo.setLocation(0,0);
        
        this.pnl_contenedor.removeAll();
        this.pnl_contenedor.add(hijo);
        this.pnl_contenedor.revalidate();
        this.pnl_contenedor.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        pnlA_bar_top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        pnlAprendiz = new javax.swing.JPanel();
        lblF_aprendiz = new javax.swing.JLabel();
        pnlAsistencias = new javax.swing.JPanel();
        lblF_asistencias = new javax.swing.JLabel();
        pnlEventos = new javax.swing.JPanel();
        lblF_eventos = new javax.swing.JLabel();
        pnlReporte = new javax.swing.JPanel();
        lblF_reportes = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        pnl_contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(0, 102, 102));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlA_bar_top.setBackground(new java.awt.Color(255, 255, 255));
        pnlA_bar_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ibarra Real Nova SemiBold", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 184, 92));
        jLabel1.setText("SenaEvents");
        pnlA_bar_top.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PAC_IMG/logo_sena.jpg"))); // NOI18N
        pnlA_bar_top.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setFont(new java.awt.Font("Roboto Medium", 0, 11)); // NOI18N
        pnlA_bar_top.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 10, 90));

        pnlAprendiz.setBackground(new java.awt.Color(0, 150, 70));
        pnlAprendiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblF_aprendiz.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblF_aprendiz.setForeground(new java.awt.Color(255, 255, 255));
        lblF_aprendiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF_aprendiz.setText("Aprendiz");
        lblF_aprendiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlAprendizLayout = new javax.swing.GroupLayout(pnlAprendiz);
        pnlAprendiz.setLayout(pnlAprendizLayout);
        pnlAprendizLayout.setHorizontalGroup(
            pnlAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblF_aprendiz, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlAprendizLayout.setVerticalGroup(
            pnlAprendizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblF_aprendiz, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlA_bar_top.add(pnlAprendiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 95, 130, -1));

        pnlAsistencias.setBackground(new java.awt.Color(0, 150, 70));
        pnlAsistencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblF_asistencias.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblF_asistencias.setForeground(new java.awt.Color(255, 255, 255));
        lblF_asistencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF_asistencias.setText("Asistencias");
        lblF_asistencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblF_asistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblF_asistenciasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAsistenciasLayout = new javax.swing.GroupLayout(pnlAsistencias);
        pnlAsistencias.setLayout(pnlAsistenciasLayout);
        pnlAsistenciasLayout.setHorizontalGroup(
            pnlAsistenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblF_asistencias, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlAsistenciasLayout.setVerticalGroup(
            pnlAsistenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblF_asistencias, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlA_bar_top.add(pnlAsistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 95, 130, -1));

        pnlEventos.setBackground(new java.awt.Color(0, 150, 70));

        lblF_eventos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblF_eventos.setForeground(new java.awt.Color(255, 255, 255));
        lblF_eventos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF_eventos.setText("Eventos");
        lblF_eventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblF_eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblF_eventosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlEventosLayout = new javax.swing.GroupLayout(pnlEventos);
        pnlEventos.setLayout(pnlEventosLayout);
        pnlEventosLayout.setHorizontalGroup(
            pnlEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblF_eventos, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        pnlEventosLayout.setVerticalGroup(
            pnlEventosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblF_eventos, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlA_bar_top.add(pnlEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 95, 110, -1));

        pnlReporte.setBackground(new java.awt.Color(0, 150, 70));

        lblF_reportes.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblF_reportes.setForeground(new java.awt.Color(255, 255, 255));
        lblF_reportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF_reportes.setText("Reportes");
        lblF_reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlReporteLayout = new javax.swing.GroupLayout(pnlReporte);
        pnlReporte.setLayout(pnlReporteLayout);
        pnlReporteLayout.setHorizontalGroup(
            pnlReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblF_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        pnlReporteLayout.setVerticalGroup(
            pnlReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblF_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        pnlA_bar_top.add(pnlReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 95, 130, -1));
        pnlA_bar_top.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, -10, 120, 20));

        BG.add(pnlA_bar_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 130));

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

        BG.add(pnl_contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1320, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblF_eventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblF_eventosMouseClicked
        VTN_F_EVENTOS vtnFeventos = new VTN_F_EVENTOS();
        ShowPanel(vtnFeventos);
    }//GEN-LAST:event_lblF_eventosMouseClicked

    private void lblF_asistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblF_asistenciasMouseClicked
        VTN_ASISTENCIAS vtnAsistencias = new VTN_ASISTENCIAS();
        ShowPanel(vtnAsistencias);
    }//GEN-LAST:event_lblF_asistenciasMouseClicked

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
            java.util.logging.Logger.getLogger(FRM_FUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_FUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_FUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_FUN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_FUN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblF_aprendiz;
    private javax.swing.JLabel lblF_asistencias;
    private javax.swing.JLabel lblF_eventos;
    private javax.swing.JLabel lblF_reportes;
    public javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnlA_bar_top;
    private javax.swing.JPanel pnlAprendiz;
    private javax.swing.JPanel pnlAsistencias;
    private javax.swing.JPanel pnlEventos;
    private javax.swing.JPanel pnlReporte;
    private javax.swing.JPanel pnl_contenedor;
    // End of variables declaration//GEN-END:variables
}
