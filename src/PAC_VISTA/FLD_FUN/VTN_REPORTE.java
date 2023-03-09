/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_FUN;

import PAC_ENTIDAD.ENT_CENTRO;
import PAC_ENTIDAD.ENT_CIUDAD;
import PAC_MODELO.REPORTE;
import PAC_MODELO.SQL_CENTRO;
import PAC_MODELO.SQL_CIUDAD;
import java.util.ArrayList;

/**
 *
 * @author windows21
 */
public class VTN_REPORTE extends javax.swing.JPanel {

    ENT_CIUDAD modCi = new ENT_CIUDAD();
    SQL_CIUDAD sqlCi = new SQL_CIUDAD();
    
    ENT_CENTRO modCentro = new  ENT_CENTRO();
    SQL_CENTRO sqlCe = new SQL_CENTRO();
    
    REPORTE reporte = new REPORTE();
    public VTN_REPORTE() {
        initComponents();
        LlenarMunicipio();
        LlenarCentro();
        reporte.loadReportHead(tblHead);
        reporte.loadReportBody(tblBody, "");
    }
    
    private void LlenarMunicipio() {
        modCi.setDe_codigo(0);
        ArrayList<ENT_CIUDAD> lista = sqlCi.getCiudad(modCi);
        this.cmbCiudad.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbCiudad.addItem(new ENT_CIUDAD(lista.get(i).getCi_nombre(), lista.get(i).getCi_codigo()));
        }
    }
    
    private void LlenarCentro() {
        ArrayList<ENT_CENTRO> lista = sqlCe.getCentro();
        this.cmbCentro.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbCentro.addItem(new ENT_CENTRO(lista.get(i).getCf_nombre(),
                    lista.get(i).getCf_codigo()));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        pnl_top = new javax.swing.JPanel();
        rbtActualizar = new javax.swing.JRadioButton();
        rbtRgistrar = new javax.swing.JRadioButton();
        lbl_actualizar = new javax.swing.JLabel();
        pnlAsistencia = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtEventos = new javax.swing.JTextField();
        btnEventos = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        cmbCentro = new javax.swing.JComboBox<>();
        cmbCiudad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        calendarInicio = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        calendarFin = new com.toedter.calendar.JDateChooser();
        scrTables = new javax.swing.JScrollPane();
        pnlScroll = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        scrTableAsistencia = new javax.swing.JScrollPane();
        tblBody = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHead = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_top.setBackground(new java.awt.Color(0, 150, 70));
        pnl_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtActualizar.setBackground(new java.awt.Color(0, 150, 70));
        rbtActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtActualizar.setForeground(new java.awt.Color(255, 255, 255));
        rbtActualizar.setText("Actualizar");
        rbtActualizar.setEnabled(false);
        rbtActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtActualizarMouseClicked(evt);
            }
        });
        pnl_top.add(rbtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 40));

        rbtRgistrar.setBackground(new java.awt.Color(0, 150, 70));
        rbtRgistrar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtRgistrar.setForeground(new java.awt.Color(255, 255, 255));
        rbtRgistrar.setText("Registrar");
        rbtRgistrar.setEnabled(false);
        rbtRgistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtRgistrarMouseClicked(evt);
            }
        });
        pnl_top.add(rbtRgistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 40));

        lbl_actualizar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbl_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_actualizar.setText("MODO");
        lbl_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_top.add(lbl_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 96, 35));

        BG.add(pnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        pnlAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        pnlAsistencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setText("Consultar Reporte");
        pnlAsistencia.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        pnlAsistencia.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 90, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");
        pnlAsistencia.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtEventos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEventos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEventosKeyReleased(evt);
            }
        });
        pnlAsistencia.add(txtEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        btnEventos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEventos.setText("V");
        btnEventos.setBorder(null);
        btnEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEventosMouseClicked(evt);
            }
        });
        pnlAsistencia.add(btnEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 30, 30));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlAsistencia.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 10, 70));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setText("Filtro de Búsqueda");
        pnlAsistencia.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(51, 51, 51));
        pnlAsistencia.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 630, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Centro de formción");
        pnlAsistencia.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        pnlAsistencia.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1140, 10));

        cmbCentro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbCentro.setAutoscrolls(true);
        cmbCentro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCentroItemStateChanged(evt);
            }
        });
        cmbCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCentroActionPerformed(evt);
            }
        });
        pnlAsistencia.add(cmbCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 210, 30));

        cmbCiudad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbCiudad.setAutoscrolls(true);
        cmbCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCiudadItemStateChanged(evt);
            }
        });
        cmbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadActionPerformed(evt);
            }
        });
        pnlAsistencia.add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 210, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setText("Fecha de inicio");
        pnlAsistencia.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, -1, -1));
        pnlAsistencia.add(calendarInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 150, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("Municipio");
        pnlAsistencia.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Fecha de fin");
        pnlAsistencia.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, -1, -1));
        pnlAsistencia.add(calendarFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 150, 30));

        BG.add(pnlAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 1200, 150));

        scrTables.setBackground(new java.awt.Color(255, 255, 255));

        pnlScroll.setBackground(new java.awt.Color(255, 255, 255));
        pnlScroll.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Información de encabezado");
        pnlScroll.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        pnlScroll.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 940, 10));

        tblBody.setModel(new javax.swing.table.DefaultTableModel(
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
        scrTableAsistencia.setViewportView(tblBody);

        pnlScroll.add(scrTableAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1190, 270));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Información de contenido");
        pnlScroll.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        tblHead.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblHead);

        pnlScroll.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1190, 190));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        pnlScroll.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 940, 10));

        scrTables.setViewportView(pnlScroll);

        BG.add(scrTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 210, 1240, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtActualizarMouseClicked

    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRgistrarMouseClicked

    }//GEN-LAST:event_rbtRgistrarMouseClicked

    private void txtEventosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEventosKeyReleased
      
    }//GEN-LAST:event_txtEventosKeyReleased

    private void btnEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventosMouseClicked
       
    }//GEN-LAST:event_btnEventosMouseClicked

    private void cmbCentroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCentroItemStateChanged

    }//GEN-LAST:event_cmbCentroItemStateChanged

    private void cmbCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCentroActionPerformed

    private void cmbCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCiudadItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadItemStateChanged

    private void cmbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnEventos;
    private com.toedter.calendar.JDateChooser calendarFin;
    private com.toedter.calendar.JDateChooser calendarInicio;
    private javax.swing.JComboBox<ENT_CENTRO> cmbCentro;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_CIUDAD> cmbCiudad;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JPanel pnlAsistencia;
    private javax.swing.JPanel pnlScroll;
    private javax.swing.JPanel pnl_top;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JScrollPane scrTableAsistencia;
    private javax.swing.JScrollPane scrTables;
    private javax.swing.JTable tblBody;
    private javax.swing.JTable tblHead;
    private javax.swing.JTextField txtEventos;
    // End of variables declaration//GEN-END:variables
}
