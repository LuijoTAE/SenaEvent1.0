/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_ADM;

import PAC_ENTIDAD.ENT_CARGOS;
import PAC_ENTIDAD.ENT_ROLES;
import PAC_ENTIDAD.ENT_USUARIO;
import PAC_MODELO.SQL_CARGOS;
import PAC_MODELO.SQL_ROLES;
import PAC_MODELO.SQL_USUARIO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class VTN_USUARIO extends javax.swing.JPanel {

    ENT_USUARIO modUsu = new ENT_USUARIO();
    SQL_USUARIO sqlUsu = new SQL_USUARIO();

    ENT_CARGOS modCa = new ENT_CARGOS();
    SQL_CARGOS sqlCa = new SQL_CARGOS();
    
    ENT_ROLES modRo = new ENT_ROLES();
    SQL_ROLES sqlRo = new SQL_ROLES();

    public VTN_USUARIO() {
        initComponents();
        sqlUsu.ConsultarA(0, 1, jTable1);
        LlenarCargos();
    }

    private void LlenarCargos() {
        ArrayList<ENT_CARGOS> lista = sqlCa.getCargos();

        this.cmbCArgos.removeAllItems();

        for (int i = 0; i < lista.size(); i++) {
            this.cmbCArgos.addItem(new ENT_CARGOS(lista.get(i).getIdCargo(), lista.get(i).getNombre(), lista.get(i).getSiglas()));
        }
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
        jSeparator5 = new javax.swing.JSeparator();
        pnlConfirmacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        pnlInfoConfirmacion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbCArgos = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        pnlConsulta = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        rbtAprendiz = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        rbtNull = new javax.swing.JRadioButton();
        rbtFuncionario = new javax.swing.JRadioButton();
        txtNull = new javax.swing.JTextField();
        txtAprendiz = new javax.swing.JTextField();
        btnAprendiz = new javax.swing.JButton();
        btnNull = new javax.swing.JButton();
        txtFuncionario = new javax.swing.JTextField();
        btnFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

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

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BG.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 10, 160));

        pnlConfirmacion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Confirmación de registro");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel.setText("Rol de usuario");
        jLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cmbRol.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "APRENDIZ", "FUNCIONARIO" }));

        javax.swing.GroupLayout pnlConfirmacionLayout = new javax.swing.GroupLayout(pnlConfirmacion);
        pnlConfirmacion.setLayout(pnlConfirmacionLayout);
        pnlConfirmacionLayout.setHorizontalGroup(
            pnlConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                .addGroup(pnlConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel)
                        .addGap(188, 188, 188)
                        .addComponent(jButton1))
                    .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        pnlConfirmacionLayout.setVerticalGroup(
            pnlConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConfirmacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(pnlConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConfirmacionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        BG.add(pnlConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 430, 150));

        pnlInfoConfirmacion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuario por confirmar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Número DNI");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(20, 7, 7));
        txtNombre.setToolTipText("");
        txtNombre.setEnabled(false);

        txtDni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(20, 7, 7));
        txtDni.setToolTipText("");
        txtDni.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cargos existentes");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nuevo Cargo");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cmbCArgos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cmbCArgos.setToolTipText("");

        jTextField5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(20, 7, 7));
        jTextField5.setToolTipText("");

        jButton5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jButton5.setText("V");
        jButton5.setBorder(null);

        javax.swing.GroupLayout pnlInfoConfirmacionLayout = new javax.swing.GroupLayout(pnlInfoConfirmacion);
        pnlInfoConfirmacion.setLayout(pnlInfoConfirmacionLayout);
        pnlInfoConfirmacionLayout.setHorizontalGroup(
            pnlInfoConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoConfirmacionLayout.createSequentialGroup()
                .addGroup(pnlInfoConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoConfirmacionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoConfirmacionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel5))
                    .addGroup(pnlInfoConfirmacionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoConfirmacionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel8))
                    .addGroup(pnlInfoConfirmacionLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cmbCArgos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        pnlInfoConfirmacionLayout.setVerticalGroup(
            pnlInfoConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoConfirmacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pnlInfoConfirmacionLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(pnlInfoConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addGroup(pnlInfoConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlInfoConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addGroup(pnlInfoConfirmacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCArgos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG.add(pnlInfoConfirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 420, 210));

        pnlConsulta.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

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

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Opciones de consulta");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        txtNull.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNull.setForeground(new java.awt.Color(20, 7, 7));
        txtNull.setToolTipText("");

        txtAprendiz.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtAprendiz.setForeground(new java.awt.Color(20, 7, 7));
        txtAprendiz.setToolTipText("");

        btnAprendiz.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnAprendiz.setText("V");
        btnAprendiz.setBorder(null);
        btnAprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAprendizMouseClicked(evt);
            }
        });

        btnNull.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnNull.setText("V");
        btnNull.setBorder(null);
        btnNull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNullMouseClicked(evt);
            }
        });

        txtFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFuncionario.setForeground(new java.awt.Color(20, 7, 7));
        txtFuncionario.setToolTipText("");

        btnFuncionario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnFuncionario.setText("V");
        btnFuncionario.setBorder(null);
        btnFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFuncionarioMouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
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
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnlConsultaLayout = new javax.swing.GroupLayout(pnlConsulta);
        pnlConsulta.setLayout(pnlConsultaLayout);
        pnlConsultaLayout.setHorizontalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConsultaLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(pnlConsultaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(rbtAprendiz)
                                .addGap(151, 151, 151)
                                .addComponent(rbtNull)
                                .addGap(157, 157, 157)
                                .addComponent(rbtFuncionario))
                            .addGroup(pnlConsultaLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtNull, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnNull, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        pnlConsultaLayout.setVerticalGroup(
            pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConsultaLayout.createSequentialGroup()
                        .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlConsultaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtAprendiz)
                            .addComponent(rbtNull)
                            .addComponent(rbtFuncionario))
                        .addGap(7, 7, 7)
                        .addGroup(pnlConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAprendiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNull, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNull, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        BG.add(pnlConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 730, 430));

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

        if (!this.txtDni.getText().equals("")) {
            modUsu.setUs_rol(this.cmbRol.getSelectedItem().toString());
            modUsu.setUs_clave(String.valueOf(modUsu.getUs_dni()));
            modUsu.setUs_dni(Long.parseLong(this.txtDni.getText()));
            sqlUsu.Modificar(modUsu);
            
            long dni = modUsu.getUs_dni();
            modRo.setCargo(this.cmbCArgos.getItemAt(this.cmbCArgos.getSelectedIndex()).getIdCargo());
            modRo.setUsDni(dni);
            sqlRo.Registrar(modRo, dni);
        } else {
            JOptionPane.showMessageDialog(null, "...Recuerda que debes seleccionar al usuario que deseas modificar de la tabla...");
        }

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel barTop;
    private javax.swing.JButton btnAprendiz;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnNull;
    private javax.swing.JComboBox<ENT_CARGOS> cmbCArgos;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.ButtonGroup grbModo;
    private javax.swing.ButtonGroup grbRolConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JPanel pnlConfirmacion;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlInfoConfirmacion;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtAprendiz;
    private javax.swing.JRadioButton rbtFuncionario;
    private javax.swing.JRadioButton rbtNull;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JTextField txtAprendiz;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNull;
    // End of variables declaration//GEN-END:variables
}
