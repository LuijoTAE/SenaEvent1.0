/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_FUN;

import PAC_ENTIDAD.ENT_CIUDAD;
import PAC_ENTIDAD.ENT_DEPARTAMENTO;
import PAC_ENTIDAD.ENT_ESTRATEGICO;
import PAC_ENTIDAD.ENT_EVENTO;
import PAC_ENTIDAD.ENT_OPERATIVO;
import PAC_MODELO.SQL_CIUDAD;
import PAC_MODELO.SQL_DEPARTAMENTO;
import PAC_MODELO.SQL_ESTRATEGICO;
import PAC_MODELO.SQL_EVENTO;
import PAC_MODELO.SQL_OPERATIVO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author windows21
 */
public class VTN_F_EVENTOS extends javax.swing.JPanel {

    ENT_EVENTO modEv = new ENT_EVENTO();
    SQL_EVENTO sqlEv = new SQL_EVENTO();
    
    ENT_OPERATIVO modOp = new ENT_OPERATIVO();
    
    ENT_DEPARTAMENTO modDp = new ENT_DEPARTAMENTO();
    SQL_DEPARTAMENTO sqlDp = new SQL_DEPARTAMENTO();
    
    ENT_CIUDAD modCi = new ENT_CIUDAD();
    SQL_CIUDAD sqlCi = new SQL_CIUDAD();
    
    SQL_ESTRATEGICO sqlEs = new SQL_ESTRATEGICO();
    SQL_OPERATIVO sqlOp = new SQL_OPERATIVO();
    
    

    public VTN_F_EVENTOS() {
        initComponents();
        LlenarEstrategico();
        LlenarDepa();
    }

    private void LlenarEstrategico() {
        ArrayList<ENT_ESTRATEGICO> lista = sqlEs.getEstrategico();
        this.cmbEstrategico.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbEstrategico.addItem(new ENT_ESTRATEGICO(lista.get(i).getOe_nombre(), lista.get(i).getOe_version()));
        }
    }

    private void LlenarOperativo() {

        modOp.setOe_nombre(this.cmbEstrategico.getItemAt(this.cmbEstrategico.getSelectedIndex()).getOe_nombre());
        modOp.setOe_version(this.cmbEstrategico.getItemAt(this.cmbEstrategico.getSelectedIndex()).getOe_version());

        ArrayList<ENT_OPERATIVO> lista = sqlOp.getOperativo(modOp);
        this.cmbOperativo.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbOperativo.addItem(new ENT_OPERATIVO(lista.get(i).getObo_nombre(), lista.get(i).getObo_version()));
        }
    }

    private void LlenarDepa() {
        modDp.setPa_codigo(57);

        ArrayList<ENT_DEPARTAMENTO> lista = sqlDp.getDepartamento(modDp);
        this.cmbDepa.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbDepa.addItem(new ENT_DEPARTAMENTO(lista.get(i).getDe_nombre(), lista.get(i).getDe_codigo()));
        }
    }

    private void LlenarMunicipio() {
        modCi.setDe_codigo(this.cmbDepa.getItemAt(this.cmbDepa.getSelectedIndex()).getDe_codigo());
        ArrayList<ENT_CIUDAD> lista = sqlCi.getCiudad(modCi);
        this.cmbCiudad.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbCiudad.addItem(new ENT_CIUDAD(lista.get(i).getCi_nombre(), lista.get(i).getCi_codigo()));
        }
    }

    private void HabilitarRegistro(boolean estado) {
        this.txtFecha.setEnabled(estado);
        this.txtNombre.setEnabled(estado);
        this.txtProposito.setEnabled(estado);
        this.cmbDepa.setEnabled(estado);
        this.cmbCiudad.setEnabled(estado);
        this.cmbEstrategico.setEnabled(estado);
        this.cmbOperativo.setEnabled(estado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BG = new javax.swing.JPanel();
        pnl_top = new javax.swing.JPanel();
        pnlL_validar2 = new javax.swing.JPanel();
        lbtL_validar2 = new javax.swing.JLabel();
        pnlL_validar3 = new javax.swing.JPanel();
        lbtL_validar3 = new javax.swing.JLabel();
        pnlGuardar = new javax.swing.JPanel();
        lblEguardar = new javax.swing.JLabel();
        pnlEventoInfo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnCverificar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnFcalendario = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProposito = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        pnlObjetivos = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbEstrategico = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        cmbOperativo = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        pnlLugar = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmbDepa = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_top.setBackground(new java.awt.Color(0, 150, 70));
        pnl_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlL_validar2.setBackground(new java.awt.Color(0, 150, 70));

        lbtL_validar2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbtL_validar2.setForeground(new java.awt.Color(255, 255, 255));
        lbtL_validar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtL_validar2.setText("Actualizar");
        lbtL_validar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbtL_validar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbtL_validar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbtL_validar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbtL_validar2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlL_validar2Layout = new javax.swing.GroupLayout(pnlL_validar2);
        pnlL_validar2.setLayout(pnlL_validar2Layout);
        pnlL_validar2Layout.setHorizontalGroup(
            pnlL_validar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtL_validar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnlL_validar2Layout.setVerticalGroup(
            pnlL_validar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlL_validar2Layout.createSequentialGroup()
                .addComponent(lbtL_validar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnl_top.add(pnlL_validar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, 40));

        pnlL_validar3.setBackground(new java.awt.Color(0, 150, 70));

        lbtL_validar3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbtL_validar3.setForeground(new java.awt.Color(255, 255, 255));
        lbtL_validar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtL_validar3.setText("Registrar");
        lbtL_validar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbtL_validar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbtL_validar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbtL_validar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbtL_validar3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlL_validar3Layout = new javax.swing.GroupLayout(pnlL_validar3);
        pnlL_validar3.setLayout(pnlL_validar3Layout);
        pnlL_validar3Layout.setHorizontalGroup(
            pnlL_validar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlL_validar3Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(lbtL_validar3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlL_validar3Layout.setVerticalGroup(
            pnlL_validar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlL_validar3Layout.createSequentialGroup()
                .addComponent(lbtL_validar3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnl_top.add(pnlL_validar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 40));

        pnlGuardar.setBackground(new java.awt.Color(0, 150, 70));

        lblEguardar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblEguardar.setForeground(new java.awt.Color(255, 255, 255));
        lblEguardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEguardar.setText("Guardar");
        lblEguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEguardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEguardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEguardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlGuardarLayout = new javax.swing.GroupLayout(pnlGuardar);
        pnlGuardar.setLayout(pnlGuardarLayout);
        pnlGuardarLayout.setHorizontalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGuardarLayout.setVerticalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEguardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnl_top.add(pnlGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 100, 30));

        BG.add(pnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        pnlEventoInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlEventoInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel10.setText("Evento");
        pnlEventoInfo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Código");
        pnlEventoInfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        pnlEventoInfo.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setText("Proposito");
        pnlEventoInfo.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setEnabled(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        pnlEventoInfo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 30));

        btnCverificar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnCverificar.setText("V");
        btnCverificar.setBorder(null);
        btnCverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCverificarMouseClicked(evt);
            }
        });
        pnlEventoInfo.add(btnCverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 30, 30));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel21.setText("Fecha");
        pnlEventoInfo.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(102, 102, 102));
        txtFecha.setEnabled(false);
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        pnlEventoInfo.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 200, 30));

        btnFcalendario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnFcalendario.setText("#");
        btnFcalendario.setBorder(null);
        btnFcalendario.setEnabled(false);
        pnlEventoInfo.add(btnFcalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 30, 30));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel26.setText("Nombre");
        pnlEventoInfo.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        txtProposito.setColumns(20);
        txtProposito.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtProposito.setRows(5);
        txtProposito.setEnabled(false);
        jScrollPane1.setViewportView(txtProposito);

        pnlEventoInfo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 230, 100));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlEventoInfo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 10, 390));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        pnlEventoInfo.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 190, 10));

        BG.add(pnlEventoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 280, 520));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabla);

        BG.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 960, 260));

        pnlObjetivos.setBackground(new java.awt.Color(255, 255, 255));
        pnlObjetivos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel12.setText("Objetivos");
        pnlObjetivos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setText("Estratégico");
        pnlObjetivos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cmbEstrategico.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbEstrategico.setEnabled(false);
        cmbEstrategico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstrategicoItemStateChanged(evt);
            }
        });
        cmbEstrategico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstrategicoActionPerformed(evt);
            }
        });
        pnlObjetivos.add(cmbEstrategico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 30));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel22.setText("Operativo");
        pnlObjetivos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        cmbOperativo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbOperativo.setEnabled(false);
        cmbOperativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperativoActionPerformed(evt);
            }
        });
        pnlObjetivos.add(cmbOperativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlObjetivos.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 10, 160));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        pnlObjetivos.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, 10));

        BG.add(pnlObjetivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 290, 230));

        pnlLugar.setBackground(new java.awt.Color(255, 255, 255));
        pnlLugar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel23.setText("Lugar");
        pnlLugar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel24.setText("Departamento");
        pnlLugar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cmbDepa.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbDepa.setEnabled(false);
        cmbDepa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDepaItemStateChanged(evt);
            }
        });
        cmbDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepaActionPerformed(evt);
            }
        });
        pnlLugar.add(cmbDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 30));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel25.setText("Municipio");
        pnlLugar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        cmbCiudad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbCiudad.setEnabled(false);
        cmbCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadActionPerformed(evt);
            }
        });
        pnlLugar.add(cmbCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        pnlLugar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 180, 10));

        BG.add(pnlLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 280, 230));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 250, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 220, 20));

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
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmbEstrategicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstrategicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstrategicoActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void cmbOperativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperativoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOperativoActionPerformed

    private void cmbDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepaActionPerformed

    private void cmbCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCiudadActionPerformed

    private void lbtL_validar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbtL_validar2MouseClicked

    private void lbtL_validar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbtL_validar2MouseEntered

    private void lbtL_validar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbtL_validar2MouseExited

    private void lbtL_validar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbtL_validar3MouseClicked

    private void lbtL_validar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbtL_validar3MouseEntered

    private void lbtL_validar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbtL_validar3MouseExited

    private void lblEguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEguardarMouseClicked

        modEv.setEv_codigo(Long.parseLong(this.txtCodigo.getText()));
        modEv.setObo_nombre(this.cmbOperativo.getItemAt(this.cmbOperativo.getSelectedIndex()).getObo_nombre());
        modEv.setObo_version(this.cmbOperativo.getItemAt(this.cmbOperativo.getSelectedIndex()).getObo_version());
        modEv.setCi_codigo(this.cmbCiudad.getItemAt(this.cmbCiudad.getSelectedIndex()).getCi_codigo());
        modEv.setEv_nombre(this.txtNombre.getText());
        modEv.setEv_fecha(this.txtFecha.getText());
        modEv.setEv_proposito(this.txtProposito.getText());
        if (!sqlEv.Verificar(modEv)) {
            System.out.print("No entró al registro");
            sqlEv.Registrar(modEv);
        }

    }//GEN-LAST:event_lblEguardarMouseClicked

    private void lblEguardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEguardarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEguardarMouseEntered

    private void lblEguardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEguardarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEguardarMouseExited

    private void cmbEstrategicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstrategicoItemStateChanged
        LlenarOperativo();
    }//GEN-LAST:event_cmbEstrategicoItemStateChanged

    private void cmbDepaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDepaItemStateChanged
        LlenarMunicipio();
    }//GEN-LAST:event_cmbDepaItemStateChanged

    private void btnCverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCverificarMouseClicked
        if (!this.txtCodigo.getText().equals("")) {
            modEv.setEv_codigo(Long.parseLong(this.txtCodigo.getText()));
            if (!sqlEv.Verificar(modEv)) {
                HabilitarRegistro(true);
            }else{
                HabilitarRegistro(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar el campo CÓDIGO para poder continuar");
        }

    }//GEN-LAST:event_btnCverificarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnCverificar;
    private javax.swing.JButton btnFcalendario;
    private javax.swing.JComboBox<ENT_CIUDAD> cmbCiudad;
    private javax.swing.JComboBox<ENT_DEPARTAMENTO> cmbDepa;
    private javax.swing.JComboBox<ENT_ESTRATEGICO> cmbEstrategico;
    private javax.swing.JComboBox<ENT_OPERATIVO> cmbOperativo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEguardar;
    private javax.swing.JLabel lbtL_validar2;
    private javax.swing.JLabel lbtL_validar3;
    private javax.swing.JPanel pnlEventoInfo;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JPanel pnlL_validar2;
    private javax.swing.JPanel pnlL_validar3;
    private javax.swing.JPanel pnlLugar;
    private javax.swing.JPanel pnlObjetivos;
    private javax.swing.JPanel pnl_top;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtProposito;
    // End of variables declaration//GEN-END:variables
}
