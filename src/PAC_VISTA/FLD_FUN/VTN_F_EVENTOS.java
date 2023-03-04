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
        sqlEv.Cargar(tabla,"","");
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

        modo = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        pnl_top = new javax.swing.JPanel();
        rbtActualizar = new javax.swing.JRadioButton();
        rbtRgistrar = new javax.swing.JRadioButton();
        lbl_actualizar = new javax.swing.JLabel();
        pnlEventoInfo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
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
        jLabel24 = new javax.swing.JLabel();
        cmbDepa = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        pnlConsulta = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        txtEventoConsul = new javax.swing.JTextField();
        btnEventoConsul = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtMunicipioConsul = new javax.swing.JTextField();
        btnMunicipioConsul = new javax.swing.JButton();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_top.setBackground(new java.awt.Color(0, 150, 70));
        pnl_top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbtActualizar.setBackground(new java.awt.Color(0, 150, 70));
        modo.add(rbtActualizar);
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
        modo.add(rbtRgistrar);
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

        pnlEventoInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlEventoInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel10.setText("Evento");
        pnlEventoInfo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        pnlEventoInfo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 70, 30));

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

        jLabel23.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel23.setText("Lugar");
        pnlLugar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlLugar.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 10, 160));

        BG.add(pnlLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 250, 230));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 250, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 220, 20));

        pnlConsulta.setBackground(new java.awt.Color(255, 255, 255));
        pnlConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel27.setText("Area de conusulta");
        pnlConsulta.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        pnlConsulta.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 270, 10));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel15.setText("Evento");
        pnlConsulta.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtEventoConsul.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEventoConsul.setForeground(new java.awt.Color(102, 102, 102));
        txtEventoConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEventoConsulActionPerformed(evt);
            }
        });
        txtEventoConsul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEventoConsulKeyReleased(evt);
            }
        });
        pnlConsulta.add(txtEventoConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 200, 30));

        btnEventoConsul.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEventoConsul.setText("V");
        btnEventoConsul.setBorder(null);
        btnEventoConsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEventoConsulMouseClicked(evt);
            }
        });
        pnlConsulta.add(btnEventoConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 30, 30));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setText("Municipio");
        pnlConsulta.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtMunicipioConsul.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMunicipioConsul.setForeground(new java.awt.Color(102, 102, 102));
        txtMunicipioConsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMunicipioConsulActionPerformed(evt);
            }
        });
        txtMunicipioConsul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMunicipioConsulKeyReleased(evt);
            }
        });
        pnlConsulta.add(txtMunicipioConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 30));

        btnMunicipioConsul.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnMunicipioConsul.setText("V");
        btnMunicipioConsul.setBorder(null);
        btnMunicipioConsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMunicipioConsulMouseClicked(evt);
            }
        });
        pnlConsulta.add(btnMunicipioConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 30, 30));

        BG.add(pnlConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 420, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtEventoConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEventoConsulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEventoConsulActionPerformed

    private void btnEventoConsulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEventoConsulMouseClicked
        sqlEv.Cargar(tabla, this.txtEventoConsul.getText(), "");
    }//GEN-LAST:event_btnEventoConsulMouseClicked

    private void txtMunicipioConsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMunicipioConsulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMunicipioConsulActionPerformed

    private void btnMunicipioConsulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMunicipioConsulMouseClicked
        sqlEv.Cargar(tabla, "", this.txtMunicipioConsul.getText());
    }//GEN-LAST:event_btnMunicipioConsulMouseClicked

    private void txtEventoConsulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEventoConsulKeyReleased
        sqlEv.Cargar(tabla, this.txtEventoConsul.getText(), "");
    }//GEN-LAST:event_txtEventoConsulKeyReleased

    private void txtMunicipioConsulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioConsulKeyReleased
        sqlEv.Cargar(tabla, "", this.txtMunicipioConsul.getText());
    }//GEN-LAST:event_txtMunicipioConsulKeyReleased

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
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
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void rbtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtActualizarMouseClicked

    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRgistrarMouseClicked

    }//GEN-LAST:event_rbtRgistrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnCverificar;
    private javax.swing.JButton btnEventoConsul;
    private javax.swing.JButton btnFcalendario;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMunicipioConsul;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_CIUDAD> cmbCiudad;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_DEPARTAMENTO> cmbDepa;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_ESTRATEGICO> cmbEstrategico;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_OPERATIVO> cmbOperativo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.ButtonGroup modo;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlEventoInfo;
    private javax.swing.JPanel pnlLugar;
    private javax.swing.JPanel pnlObjetivos;
    private javax.swing.JPanel pnl_top;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEventoConsul;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMunicipioConsul;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtProposito;
    // End of variables declaration//GEN-END:variables
}
