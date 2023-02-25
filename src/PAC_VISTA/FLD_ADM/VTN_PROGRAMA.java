/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_ADM;

import PAC_ENTIDAD.ENT_CENTRO;
import PAC_ENTIDAD.ENT_FICHA;
import PAC_ENTIDAD.ENT_PROGRAMA;
import PAC_ENTIDAD.ENT_REGIONAL;
import PAC_ENTIDAD.ENT_USUARIO;
import PAC_MODELO.SQL_CENTRO;
import PAC_MODELO.SQL_FICHA;
import PAC_MODELO.SQL_PROGRAMA;
import PAC_MODELO.SQL_REGIONAL;
import PAC_MODELO.SQL_USUARIO;
import java.util.ArrayList;

/**
 *
 * @author windows21
 */
public class VTN_PROGRAMA extends javax.swing.JPanel {

    ENT_REGIONAL modRe = new ENT_REGIONAL();
    SQL_REGIONAL sqlRe = new SQL_REGIONAL();

    ENT_USUARIO modUsu = new ENT_USUARIO();
    SQL_USUARIO sqlUsu = new SQL_USUARIO();

    ENT_CENTRO modCe = new ENT_CENTRO();
    SQL_CENTRO sqlCe = new SQL_CENTRO();

    ENT_PROGRAMA modPr = new ENT_PROGRAMA();
    SQL_PROGRAMA sqlPr = new SQL_PROGRAMA();

    ENT_FICHA modFi = new ENT_FICHA();
    SQL_FICHA sqlFi = new SQL_FICHA();
    
    public VTN_PROGRAMA() {
        initComponents();
        LlenarCentro();
        LlenarPrograma();
    }

    private void LlenarCentro() {
        ArrayList<ENT_CENTRO> lista = sqlCe.getCentro();
        this.cmb_Fcentro.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmb_Fcentro.addItem(new ENT_CENTRO(lista.get(i).getCf_nombre(),
                    lista.get(i).getCf_codigo()));
        }
    }

    private void LlenarPrograma() {
        ArrayList<ENT_PROGRAMA> lista = sqlPr.getPrograma();
        this.cmb_Fprograma.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmb_Fprograma.addItem(new ENT_PROGRAMA(lista.get(i).getPf_codigo(),
                    lista.get(i).getPf_version(), lista.get(i).getPf_nombre()));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        bar_top = new javax.swing.JPanel();
        rbtActualizar = new javax.swing.JRadioButton();
        rbtRgistrar = new javax.swing.JRadioButton();
        lbl_actualizar = new javax.swing.JLabel();
        pnl_buscar = new javax.swing.JPanel();
        pnl_Fprograma = new javax.swing.JPanel();
        lbl9 = new javax.swing.JLabel();
        btn_Fguardar = new javax.swing.JButton();
        lbl4 = new javax.swing.JLabel();
        txt_Fcodigo = new javax.swing.JTextField();
        btn_Fverificar = new javax.swing.JButton();
        lbl6 = new javax.swing.JLabel();
        cmb_Fmodalidad = new javax.swing.JComboBox<>();
        txt18 = new javax.swing.JLabel();
        cmb_Fcentro = new javax.swing.JComboBox<>();
        lbl5 = new javax.swing.JLabel();
        cmb_Fjornada = new javax.swing.JComboBox<>();
        lbl7 = new javax.swing.JLabel();
        cmb_Fprograma = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lbl8 = new javax.swing.JLabel();
        btn_Pguardar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        txtPcodigo = new javax.swing.JTextField();
        btn_Pverificar = new javax.swing.JButton();
        lbl2 = new javax.swing.JLabel();
        txtPnombre = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        cmbPnivel = new javax.swing.JComboBox<>();
        lbl = new javax.swing.JLabel();
        txtPversion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        scrTablaPF = new javax.swing.JScrollPane();
        tblFicha = new javax.swing.JTable();
        jSeparator4 = new javax.swing.JSeparator();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar_top.setBackground(new java.awt.Color(0, 150, 70));
        bar_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        bar_top.add(rbtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 40));

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
        bar_top.add(rbtRgistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 40));

        lbl_actualizar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbl_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_actualizar.setText("MODO");
        lbl_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bar_top.add(lbl_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 96, 35));

        pnl_buscar.setBackground(new java.awt.Color(0, 150, 70));

        javax.swing.GroupLayout pnl_buscarLayout = new javax.swing.GroupLayout(pnl_buscar);
        pnl_buscar.setLayout(pnl_buscarLayout);
        pnl_buscarLayout.setHorizontalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        pnl_buscarLayout.setVerticalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        bar_top.add(pnl_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 90, -1));

        BG.add(bar_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        pnl_Fprograma.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Fprograma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setText("Ficha de Formación");
        lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btn_Fguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Fguardar.setText("Guardar");
        btn_Fguardar.setBorder(null);
        btn_Fguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FguardarMouseClicked(evt);
            }
        });
        pnl_Fprograma.add(btn_Fguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 70, 30));

        lbl4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Número de Ficha");
        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txt_Fcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Fcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txt_Fcodigo.setToolTipText("");
        pnl_Fprograma.add(txt_Fcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        btn_Fverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Fverificar.setText("V");
        btn_Fverificar.setBorder(null);
        btn_Fverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FverificarMouseClicked(evt);
            }
        });
        pnl_Fprograma.add(btn_Fverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 30, 30));

        lbl6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("Modalidad");
        lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cmb_Fmodalidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Fmodalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRESENCIAL", "VIRTUAL" }));
        pnl_Fprograma.add(cmb_Fmodalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 30));

        txt18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt18.setText("Centro de Formación");
        txt18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        cmb_Fcentro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_Fprograma.add(cmb_Fcentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 190, 30));

        lbl5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("Jornada");
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        cmb_Fjornada.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Fjornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TECNICO", "TEGNOLOGO" }));
        pnl_Fprograma.add(cmb_Fjornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, 30));

        lbl7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("Programa de Formación");
        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        cmb_Fprograma.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_Fprograma.add(cmb_Fprograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, 30));
        pnl_Fprograma.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 470, 10));

        BG.add(pnl_Fprograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 700, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setText("Programa de Formación");
        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btn_Pguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Pguardar.setText("Guardar");
        btn_Pguardar.setBorder(null);
        btn_Pguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PguardarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Pguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, 30));

        lbl1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Código");
        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtPcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txtPcodigo.setToolTipText("");
        jPanel1.add(txtPcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        btn_Pverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Pverificar.setText("V");
        btn_Pverificar.setBorder(null);
        btn_Pverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PverificarMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Pverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 30, 30));

        lbl2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Nombre");
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        txtPnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPnombre.setForeground(new java.awt.Color(20, 7, 7));
        txtPnombre.setToolTipText("");
        jPanel1.add(txtPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, 30));

        lbl3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("Nivel de Formación");
        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        cmbPnivel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbPnivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TECNICO", "TEGNOLOGO" }));
        jPanel1.add(cmbPnivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, 30));

        lbl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("Versión");
        lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtPversion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPversion.setForeground(new java.awt.Color(20, 7, 7));
        jPanel1.add(txtPversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 230, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 10, 150));

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 460, 220));

        tblFicha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblFicha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Programa de Formación", "Nivel", "Ficha", "Modalidad", "Jornada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrTablaPF.setViewportView(tblFicha);

        BG.add(scrTablaPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 710, 220));
        BG.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 1040, 10));

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
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtActualizarMouseClicked

    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRgistrarMouseClicked

    }//GEN-LAST:event_rbtRgistrarMouseClicked

    private void btn_PguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PguardarMouseClicked

    }//GEN-LAST:event_btn_PguardarMouseClicked

    private void btn_FguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FguardarMouseClicked

       
    }//GEN-LAST:event_btn_FguardarMouseClicked

    private void btn_PverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PverificarMouseClicked
       
    }//GEN-LAST:event_btn_PverificarMouseClicked

    private void btn_FverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FverificarMouseClicked
        
    }//GEN-LAST:event_btn_FverificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel bar_top;
    private javax.swing.JButton btn_Fguardar;
    private javax.swing.JButton btn_Fverificar;
    private javax.swing.JButton btn_Pguardar;
    private javax.swing.JButton btn_Pverificar;
    private javax.swing.JComboBox<String> cmbPnivel;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_CENTRO> cmb_Fcentro;
    private javax.swing.JComboBox<String> cmb_Fjornada;
    private javax.swing.JComboBox<String> cmb_Fmodalidad;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_PROGRAMA> cmb_Fprograma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JPanel pnl_Fprograma;
    private javax.swing.JPanel pnl_buscar;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JScrollPane scrTablaPF;
    private javax.swing.JTable tblFicha;
    private javax.swing.JLabel txt18;
    private javax.swing.JTextField txtPcodigo;
    private javax.swing.JTextField txtPnombre;
    private javax.swing.JTextField txtPversion;
    private javax.swing.JTextField txt_Fcodigo;
    // End of variables declaration//GEN-END:variables
}
