/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_ADM;

import PAC_ENTIDAD.ENT_USUARIO;
import PAC_MODELO.SQL_USUARIO;
import java.awt.Color;
import javax.swing.JRadioButton;

public class VTN_USUARIO extends javax.swing.JPanel {

    ENT_USUARIO modUsu = new ENT_USUARIO();
    SQL_USUARIO sqlUsu = new SQL_USUARIO();

    public VTN_USUARIO() {
        initComponents();
        sqlUsu.ConsultarA(0, 1, jTable1);
    }

    private void Animacion(JRadioButton btn) {
        if (btn.isSelected() && btn.getText().equals("Actualizar")) {
            this.barTop.setBackground(new Color(51, 51, 51));
            //this.pnl_buscar.setBackground(new Color(51, 51, 51));
            //this.txt_buscar.setBackground(new Color(51, 51, 51));
        } else {
            if (btn.isSelected() && btn.getText().equals("Registrar")) {
                this.barTop.setBackground(new Color(0, 150, 70));
                //this.pnl_buscar.setBackground(new Color(90, 184, 90));
                //this.txt_buscar.setBackground(new Color(90, 184, 90));
            }
        }
    }

    private void Clear() {
        this.txtAprendiz.setText("");
        this.txtClave.setText("");
        this.txtDni.setText("");
        this.txtFuncionario.setText("");
        this.txtNombre.setText("");
        this.txtNull.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbModo = new javax.swing.ButtonGroup();
        grbRolConsulta = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        barTop = new javax.swing.JPanel();
        lbl_actualizar = new javax.swing.JLabel();
        rbtActualizar = new javax.swing.JRadioButton();
        rbtRgistrar = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        rbtAprendiz = new javax.swing.JRadioButton();
        rbtFuncionario = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtAprendiz = new javax.swing.JTextField();
        btnAprendiz = new javax.swing.JButton();
        txtFuncionario = new javax.swing.JTextField();
        btnFuncionario = new javax.swing.JButton();
        rbtNull = new javax.swing.JRadioButton();
        txtNull = new javax.swing.JTextField();
        btnNull = new javax.swing.JButton();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        BG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, 10, 560));

        barTop.setBackground(new java.awt.Color(0, 150, 70));
        barTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_actualizar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbl_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_actualizar.setText("MODO");
        lbl_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barTop.add(lbl_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 96, 35));

        rbtActualizar.setBackground(new java.awt.Color(0, 150, 70));
        grbModo.add(rbtActualizar);
        rbtActualizar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtActualizar.setForeground(new java.awt.Color(255, 255, 255));
        rbtActualizar.setText("Actualizar");
        rbtActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtActualizarMouseClicked(evt);
            }
        });
        barTop.add(rbtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 40));

        rbtRgistrar.setBackground(new java.awt.Color(0, 150, 70));
        grbModo.add(rbtRgistrar);
        rbtRgistrar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtRgistrar.setForeground(new java.awt.Color(255, 255, 255));
        rbtRgistrar.setText("Registrar");
        rbtRgistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtRgistrarMouseClicked(evt);
            }
        });
        barTop.add(rbtRgistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 40));

        BG.add(barTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Confirmación de registro");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        BG.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 30));

        jLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Rol de usuario");
        jLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        cmbRol.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "APRENDIZ", "FUNCIONARIO" }));
        BG.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 160, 30));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clave de usuario");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        txtClave.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtClave.setForeground(new java.awt.Color(20, 7, 7));
        txtClave.setToolTipText("");
        BG.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 160, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario por confirmar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(20, 7, 7));
        txtNombre.setToolTipText("");
        txtNombre.setEnabled(false);
        BG.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 160, 30));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Número DNI");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        txtDni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(20, 7, 7));
        txtDni.setToolTipText("");
        txtDni.setEnabled(false);
        BG.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 160, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cargos existentes");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "APRENDIZ", "FUNCIONARIO" }));
        BG.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 160, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nuevo Cargo");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jTextField5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(20, 7, 7));
        jTextField5.setToolTipText("");
        BG.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 140, 30));

        jButton5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton5.setText("V");
        jButton5.setBorder(null);
        BG.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 30, 30));

        jTable1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número DNI", "Nombre", "Apellido", "Correo", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        BG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 680, 220));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Opciones de consulta");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        rbtAprendiz.setBackground(new java.awt.Color(255, 255, 255));
        grbRolConsulta.add(rbtAprendiz);
        rbtAprendiz.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtAprendiz.setText("Aprendiz");
        rbtAprendiz.setBorder(null);
        rbtAprendiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtAprendiz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtAprendiz.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rbtAprendiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtAprendizActionPerformed(evt);
            }
        });
        BG.add(rbtAprendiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        rbtFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        grbRolConsulta.add(rbtFuncionario);
        rbtFuncionario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtFuncionario.setText("Funcionario");
        rbtFuncionario.setBorder(null);
        rbtFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rbtFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFuncionarioActionPerformed(evt);
            }
        });
        BG.add(rbtFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 150, -1, -1));

        jButton2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton2.setText("Enviar");
        BG.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 100, -1, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 10, 320));

        txtAprendiz.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAprendiz.setForeground(new java.awt.Color(20, 7, 7));
        txtAprendiz.setToolTipText("");
        BG.add(txtAprendiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 160, 30));

        btnAprendiz.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnAprendiz.setText("V");
        btnAprendiz.setBorder(null);
        btnAprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAprendizMouseClicked(evt);
            }
        });
        BG.add(btnAprendiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 30, 30));

        txtFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFuncionario.setForeground(new java.awt.Color(20, 7, 7));
        txtFuncionario.setToolTipText("");
        BG.add(txtFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 180, 160, 30));

        btnFuncionario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnFuncionario.setText("V");
        btnFuncionario.setBorder(null);
        btnFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuncionarioMouseClicked(evt);
            }
        });
        BG.add(btnFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 180, 30, 30));

        rbtNull.setBackground(new java.awt.Color(255, 255, 255));
        grbRolConsulta.add(rbtNull);
        rbtNull.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtNull.setText("Rol nulo");
        rbtNull.setBorder(null);
        rbtNull.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtNull.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtNull.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        rbtNull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNullActionPerformed(evt);
            }
        });
        BG.add(rbtNull, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

        txtNull.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNull.setForeground(new java.awt.Color(20, 7, 7));
        txtNull.setToolTipText("");
        BG.add(txtNull, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 160, 30));

        btnNull.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnNull.setText("V");
        btnNull.setBorder(null);
        btnNull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNullMouseClicked(evt);
            }
        });
        BG.add(btnNull, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtActualizarMouseClicked
        Animacion(this.rbtActualizar);
    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRgistrarMouseClicked
        Animacion(this.rbtRgistrar);
    }//GEN-LAST:event_rbtRgistrarMouseClicked

    private void rbtAprendizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtAprendizActionPerformed
        if (rbtAprendiz.isSelected()) {
            sqlUsu.ConsultarA(1, 1, jTable1);
        }
    }//GEN-LAST:event_rbtAprendizActionPerformed

    private void btnAprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAprendizMouseClicked
        if (rbtAprendiz.isSelected()) {
            sqlUsu.ConsultarA(1, Long.parseLong(this.txtAprendiz.getText()), jTable1);
        }

    }//GEN-LAST:event_btnAprendizMouseClicked

    private void btnFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFuncionarioMouseClicked
        if (rbtFuncionario.isSelected()) {
            sqlUsu.ConsultarA(2, Long.parseLong(this.txtFuncionario.getText()), jTable1);
        }
    }//GEN-LAST:event_btnFuncionarioMouseClicked

    private void btnNullMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNullMouseClicked
        if (rbtNull.isSelected()) {
            sqlUsu.ConsultarA(3, Long.parseLong(this.txtNull.getText()), jTable1);
        }
    }//GEN-LAST:event_btnNullMouseClicked

    private void rbtNullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNullActionPerformed
        if (rbtNull.isSelected()) {
            sqlUsu.ConsultarA(3, 1, jTable1);
        }
    }//GEN-LAST:event_rbtNullActionPerformed

    private void rbtFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFuncionarioActionPerformed
        if (rbtFuncionario.isSelected()) {
            sqlUsu.ConsultarA(2, 1, jTable1);
        }
    }//GEN-LAST:event_rbtFuncionarioActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        modUsu.setUs_rol(this.cmbRol.getSelectedItem().toString());
        modUsu.setUs_clave(this.txtClave.getText());
        modUsu.setUs_dni(Long.parseLong(this.txtDni.getText()));
        sqlUsu.Modificar(modUsu);
        Clear();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        Clear();
        int fila = this.jTable1.getSelectedRow();
        String dni = this.jTable1.getValueAt(fila, 0).toString();
        String nombre = this.jTable1.getValueAt(fila, 1).toString() + " " + this.jTable1.getValueAt(fila, 2).toString();
        this.txtDni.setText(dni);
        this.txtNombre.setText(nombre);
        if (this.rbtAprendiz.isSelected()) {
            this.txtAprendiz.setText(dni);
        }
        if (this.rbtFuncionario.isSelected()) {
            this.txtFuncionario.setText(dni);
        }


    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel barTop;
    private javax.swing.JButton btnAprendiz;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnNull;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.ButtonGroup grbModo;
    private javax.swing.ButtonGroup grbRolConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtAprendiz;
    private javax.swing.JRadioButton rbtFuncionario;
    private javax.swing.JRadioButton rbtNull;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JTextField txtAprendiz;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNull;
    // End of variables declaration//GEN-END:variables
}
