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
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author windows21
 */
public class VTN_REGIONAL extends javax.swing.JPanel {

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

    public VTN_REGIONAL() {
        initComponents();
        this.grpRegional.add(this.rbtActualizar);
        this.grpRegional.add(this.rbtRgistrar);
        LlenarUsuarios();
        LlenarRegional();
        sqlCe.Cargar(1, this.tblCentro);
    }

    private void LlenarUsuarios() {

        ArrayList<ENT_USUARIO> lista = sqlUsu.getUsuario();

        this.cmb_Rusuario.removeAllItems();

        for (int i = 0; i < lista.size(); i++) {
            this.cmb_Rusuario.addItem(new ENT_USUARIO(lista.get(i).getUs_nombre(), lista.get(i).getUs_apellido(), lista.get(i).getUs_dni()));
        }
    }

    private void LlenarRegional() {

        ArrayList<ENT_REGIONAL> lista = sqlRe.getRegional();

        this.cmb_Cregional.removeAllItems();

        for (int i = 0; i < lista.size(); i++) {
            this.cmb_Cregional.addItem(new ENT_REGIONAL(lista.get(i).getRe_nombre(), lista.get(i).getRe_codigo()));
        }
    }

    private void Animacion(JRadioButton btn) {
        if (btn.isSelected() && btn.getText().equals("Actualizar")) {
            this.bar_top.setBackground(new Color(51, 51, 51));
            this.pnl_buscar.setBackground(new Color(51, 51, 51));

        } else {
            if (btn.isSelected() && btn.getText().equals("Registrar")) {
                this.bar_top.setBackground(new Color(0, 150, 70));
                this.pnl_buscar.setBackground(new Color(0, 150, 70));
            }
        }

    }

    private void Clear() {
        this.txtCentro.setText("");
        this.txtRegional.setText("");
        this.txt_Ccodigo.setText("");
        this.txt_Cnombre.setText("");
        this.txt_Rcodigo.setText("");
        this.txt_Rnombre.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpRegional = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        bar_top = new javax.swing.JPanel();
        rbtActualizar = new javax.swing.JRadioButton();
        rbtRgistrar = new javax.swing.JRadioButton();
        lbl_actualizar = new javax.swing.JLabel();
        pnl_buscar = new javax.swing.JPanel();
        pnl_Rgestion = new javax.swing.JPanel();
        txt5 = new javax.swing.JLabel();
        btn_Rguardar = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        txt_Rcodigo = new javax.swing.JTextField();
        btn_Rverificar = new javax.swing.JButton();
        txt = new javax.swing.JLabel();
        txt_Rnombre = new javax.swing.JTextField();
        txt11 = new javax.swing.JLabel();
        cmb_Rusuario = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pnl_Fcentro = new javax.swing.JPanel();
        txt6 = new javax.swing.JLabel();
        btn_Cguardar = new javax.swing.JButton();
        txt3 = new javax.swing.JLabel();
        txt_Ccodigo = new javax.swing.JTextField();
        btn_Cverificar = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        txt_Cnombre = new javax.swing.JTextField();
        txt9 = new javax.swing.JLabel();
        cmb_Cregional = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        scrTablaRC = new javax.swing.JScrollPane();
        tblCentro = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtRegional = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCentro = new javax.swing.JTextField();
        btnRegional = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        btnCentro = new javax.swing.JButton();
        btnRegional1 = new javax.swing.JButton();

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

        pnl_Rgestion.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Rgestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5.setText("Gestion de Regional");
        txt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btn_Rguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Rguardar.setText("Guardar");
        btn_Rguardar.setBorder(null);
        btn_Rguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RguardarMouseClicked(evt);
            }
        });
        pnl_Rgestion.add(btn_Rguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 70, 30));

        txt2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Código");
        txt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txt_Rcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Rcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txt_Rcodigo.setToolTipText("");
        pnl_Rgestion.add(txt_Rcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 35));

        btn_Rverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Rverificar.setText("V");
        btn_Rverificar.setBorder(null);
        btn_Rverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RverificarMouseClicked(evt);
            }
        });
        pnl_Rgestion.add(btn_Rverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 30, 35));

        txt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setText("Nombre");
        txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txt_Rnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Rnombre.setForeground(new java.awt.Color(20, 7, 7));
        txt_Rnombre.setToolTipText("");
        pnl_Rgestion.add(txt_Rnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 35));

        txt11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt11.setText("Usuario");
        txt11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        cmb_Rusuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_Rgestion.add(cmb_Rusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 35));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");
        pnl_Rgestion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 10, 140));
        pnl_Rgestion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 260, 10));

        BG.add(pnl_Rgestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 460, 210));

        pnl_Fcentro.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Fcentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6.setText("Centro de Formación");
        txt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fcentro.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btn_Cguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Cguardar.setText("Guardar");
        btn_Cguardar.setBorder(null);
        btn_Cguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CguardarMouseClicked(evt);
            }
        });
        btn_Cguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CguardarActionPerformed(evt);
            }
        });
        pnl_Fcentro.add(btn_Cguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 70, 35));

        txt3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("Código");
        txt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fcentro.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txt_Ccodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Ccodigo.setForeground(new java.awt.Color(20, 7, 7));
        txt_Ccodigo.setToolTipText("");
        pnl_Fcentro.add(txt_Ccodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 35));

        btn_Cverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Cverificar.setText("V");
        btn_Cverificar.setBorder(null);
        btn_Cverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CverificarMouseClicked(evt);
            }
        });
        btn_Cverificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CverificarActionPerformed(evt);
            }
        });
        pnl_Fcentro.add(btn_Cverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 30, 35));

        txt1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Nombre");
        txt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fcentro.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txt_Cnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Cnombre.setForeground(new java.awt.Color(20, 7, 7));
        txt_Cnombre.setToolTipText("");
        pnl_Fcentro.add(txt_Cnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 35));

        txt9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt9.setText("Regional");
        txt9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fcentro.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        cmb_Cregional.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Cregional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_CregionalItemStateChanged(evt);
            }
        });
        pnl_Fcentro.add(cmb_Cregional, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 35));
        pnl_Fcentro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 250, 20));

        BG.add(pnl_Fcentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 440, 210));

        tblCentro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tblCentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Regional", "Código", "Centro de Formación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCentro.setRowHeight(20);
        tblCentro.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCentro.setShowVerticalLines(false);
        scrTablaRC.setViewportView(tblCentro);

        BG.add(scrTablaRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 620, 220));
        BG.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 820, 10));

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setText("Area  Consulta");
        BG.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));
        BG.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 730, 10));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Regional");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        txtRegional.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        BG.add(txtRegional, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 180, 35));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Centro Formación");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        txtCentro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        BG.add(txtCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 180, 35));

        btnRegional.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnRegional.setText("V");
        btnRegional.setBorder(null);
        btnRegional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegionalMouseClicked(evt);
            }
        });
        btnRegional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegionalActionPerformed(evt);
            }
        });
        BG.add(btnRegional, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 30, 35));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BG.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 10, 120));

        btnCentro.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnCentro.setText("V");
        btnCentro.setBorder(null);
        btnCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCentroMouseClicked(evt);
            }
        });
        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });
        BG.add(btnCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 30, 35));

        btnRegional1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnRegional1.setText("O");
        btnRegional1.setBorder(null);
        btnRegional1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegional1MouseClicked(evt);
            }
        });
        btnRegional1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegional1ActionPerformed(evt);
            }
        });
        BG.add(btnRegional1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 310, 30, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RverificarMouseClicked

        if (!this.txt_Rcodigo.getText().equals("")) {
            modRe.setRe_codigo(Long.parseLong(this.txt_Rcodigo.getText()));
            if (!sqlRe.Verificar(modRe)) {
                this.rbtRgistrar.setSelected(true);
                Animacion(this.rbtRgistrar);
                LlenarUsuarios();
            } else {
                this.rbtActualizar.setSelected(true);
                Animacion(this.rbtActualizar);
            }
        } else {
            JOptionPane.showMessageDialog(null, " !UPS! \n Algo salió mal verificar que el si hace falat un campo por llenar");
        }
        Clear();
    }//GEN-LAST:event_btn_RverificarMouseClicked

    private void btn_RguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RguardarMouseClicked
        if (!this.txt_Rcodigo.getText().equals("") && !this.txt_Rnombre.getText().equals("")) {
            modRe.setRe_codigo(Long.parseLong(this.txt_Rcodigo.getText()));
            modRe.setRe_nombre(this.txt_Rnombre.getText());

            if (this.rbtRgistrar.isSelected()) {
                long usuario = this.cmb_Rusuario.getItemAt(this.cmb_Rusuario.getSelectedIndex()).getUs_dni();
                sqlRe.Registrar(modRe, usuario);
            }
            if (this.rbtActualizar.isSelected()) {
                sqlRe.Modificar(modRe);
            }
        }else{
            JOptionPane.showMessageDialog(null, " !UPS! \n Algo salió mal verificar que el si hace falat un campo por llenar");
        }
        Clear();
    }//GEN-LAST:event_btn_RguardarMouseClicked

    private void btn_CverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CverificarMouseClicked
        if (!this.txt_Ccodigo.getText().equals("")) {
            modCe.setCf_codigo(Long.parseLong(this.txt_Ccodigo.getText()));

            if (!sqlCe.Verificar(modCe)) {
                this.rbtRgistrar.setSelected(true);
                Animacion(this.rbtRgistrar);
                LlenarRegional();
            } else {
                this.rbtActualizar.setSelected(true);
                Animacion(this.rbtActualizar);
            }
        } else {
            JOptionPane.showMessageDialog(null, " !UPS! \n Algo salió mal verificar que el si hace falat un campo por llenar");
        }
        Clear();
    }//GEN-LAST:event_btn_CverificarMouseClicked

    private void btn_CguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CguardarMouseClicked
        if (!this.txt_Ccodigo.getText().equals("") && !this.txt_Cnombre.getText().equals("")) {
            modCe.setCf_codigo(Long.parseLong(this.txt_Ccodigo.getText()));
            modCe.setCf_nombre(this.txt_Cnombre.getText());

            if (this.rbtRgistrar.isSelected()) {
                long reCodigo = this.cmb_Cregional.getItemAt(this.cmb_Cregional.getSelectedIndex()).getRe_codigo();
                modCe.setRe_codigo(reCodigo);
                sqlCe.Registrar(modCe);
            }
            if (this.rbtActualizar.isSelected()) {
                sqlCe.Modificar(modCe);
            }
        }else{
            JOptionPane.showMessageDialog(null, " !UPS! \n Algo salió mal verificar que el si hace falat un campo por llenar");
        }
        Clear();
    }//GEN-LAST:event_btn_CguardarMouseClicked

    private void cmb_CregionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_CregionalItemStateChanged

    }//GEN-LAST:event_cmb_CregionalItemStateChanged

    private void rbtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtActualizarMouseClicked

    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRgistrarMouseClicked

    }//GEN-LAST:event_rbtRgistrarMouseClicked

    private void btnRegionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegionalMouseClicked

        if (!this.txt_Rcodigo.getText().equals("")) {
            long codigo = Long.parseLong(this.txt_Rcodigo.getText());
            sqlRe.Cargar(codigo, tblCentro);
        } else {
            sqlRe.Cargar(1, tblCentro);
        }
        Clear();
    }//GEN-LAST:event_btnRegionalMouseClicked

    private void btnCentroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCentroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCentroMouseClicked

    private void btnRegional1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegional1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegional1MouseClicked

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
        if (!this.txtCentro.getText().equals("")) {
            long codigo = Long.parseLong(this.txtCentro.getText());
            sqlCe.Cargar(codigo, tblCentro);
        } else {
            sqlCe.Cargar(1, tblCentro);
        }
        Clear();
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnRegional1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegional1ActionPerformed
        sqlCe.Cargar(1, tblCentro);
    }//GEN-LAST:event_btnRegional1ActionPerformed

    private void btn_CguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CguardarActionPerformed

    }//GEN-LAST:event_btn_CguardarActionPerformed

    private void btn_CverificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CverificarActionPerformed

    }//GEN-LAST:event_btn_CverificarActionPerformed

    private void btnRegionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegionalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel bar_top;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnRegional;
    private javax.swing.JButton btnRegional1;
    private javax.swing.JButton btn_Cguardar;
    private javax.swing.JButton btn_Cverificar;
    private javax.swing.JButton btn_Rguardar;
    private javax.swing.JButton btn_Rverificar;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_REGIONAL> cmb_Cregional;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_USUARIO> cmb_Rusuario;
    private javax.swing.ButtonGroup grpRegional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JPanel pnl_Fcentro;
    private javax.swing.JPanel pnl_Rgestion;
    private javax.swing.JPanel pnl_buscar;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JScrollPane scrTablaRC;
    private javax.swing.JTable tblCentro;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt9;
    private javax.swing.JTextField txtCentro;
    private javax.swing.JTextField txtRegional;
    private javax.swing.JTextField txt_Ccodigo;
    private javax.swing.JTextField txt_Cnombre;
    private javax.swing.JTextField txt_Rcodigo;
    private javax.swing.JTextField txt_Rnombre;
    // End of variables declaration//GEN-END:variables
}
