/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_ADM;

import PAC_ENTIDAD.ENT_CIUDAD;
import PAC_ENTIDAD.ENT_DEPARTAMENTO;
import PAC_ENTIDAD.ENT_PAIS;
import PAC_ENTIDAD.ENT_USUARIO;
import PAC_MODELO.SQL_CIUDAD;
import PAC_MODELO.SQL_DEPARTAMENTO;
import PAC_MODELO.SQL_PAIS;
import PAC_MODELO.SQL_USUARIO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JRadioButton;

/**
 *
 * @author windows21
 */
public class VTN_LOCACIONES extends javax.swing.JPanel {
    
    ENT_USUARIO modUsu = new ENT_USUARIO();
    SQL_USUARIO sqlUsu = new SQL_USUARIO();
    
    ENT_DEPARTAMENTO modDp = new ENT_DEPARTAMENTO();
    SQL_DEPARTAMENTO sqlDp = new SQL_DEPARTAMENTO();
    
    ENT_CIUDAD modCi = new ENT_CIUDAD();
    SQL_CIUDAD sqlCi = new SQL_CIUDAD();
    
    ENT_PAIS modPa = new ENT_PAIS();
    SQL_PAIS sqlPa = new SQL_PAIS();
    
    public VTN_LOCACIONES() {
        initComponents();
        LlenarPais();
        LlenarUsuarios();
        LlenarDepa();
        sqlCi.Cargar(this.tblTabla, "", "");
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
    
    private void LlenarUsuarios() {
        
        ArrayList<ENT_USUARIO> lista = sqlUsu.getUsuario();
        
        this.cmbUsuario.removeAllItems();
        
        for (int i = 0; i < lista.size(); i++) {
            this.cmbUsuario.addItem(new ENT_USUARIO(lista.get(i).getUs_nombre(), lista.get(i).getUs_apellido(), lista.get(i).getUs_dni()));
        }
    }
    
    private void LlenarDepa() {
        modDp.setPa_codigo(this.cmbPais.getItemAt(this.cmbPais.getSelectedIndex()).getPaCodigo());
        
        ArrayList<ENT_DEPARTAMENTO> lista = sqlDp.getDepartamento(modDp);
        this.cmbDepartamento.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbDepartamento.addItem(new ENT_DEPARTAMENTO(lista.get(i).getDe_nombre(), lista.get(i).getDe_codigo()));
        }
    }
    
    private void LlenarPais() {
        ArrayList<ENT_PAIS> lista = sqlPa.getPais();
        this.cmbPais.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbPais.addItem(new ENT_PAIS(lista.get(i).getPaNombre(), lista.get(i).getPaCodigo()));
        }
    }
    
    private void Clear(int x) {
        if (x == 1) {
            this.txtPcodigo.setText("");
            this.txtPnombre.setText("");
        }
        if (x == 2) {
            this.txtDcodigo.setText("");
            this.txtDnombre.setText("");
        }
        if (x == 3) {
            this.txtCcodigo.setText("");
            this.txtCnombre.setText("");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        barTop = new javax.swing.JPanel();
        lbl_actualizar = new javax.swing.JLabel();
        rbtActualizar = new javax.swing.JRadioButton();
        rbtRgistrar = new javax.swing.JRadioButton();
        pnl_Rgestion = new javax.swing.JPanel();
        txt5 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txtPcodigo = new javax.swing.JTextField();
        txt = new javax.swing.JLabel();
        txtPnombre = new javax.swing.JTextField();
        btnPverificar = new javax.swing.JButton();
        btnPguardar = new javax.swing.JButton();
        cmbUsuario = new javax.swing.JComboBox<>();
        txt11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnl_Rgestion1 = new javax.swing.JPanel();
        txt6 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txtDcodigo = new javax.swing.JTextField();
        txt1 = new javax.swing.JLabel();
        txtDnombre = new javax.swing.JTextField();
        btnDverificar = new javax.swing.JButton();
        btnDguardar = new javax.swing.JButton();
        cmbPais = new javax.swing.JComboBox<>();
        txt12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        pnl_Rgestion2 = new javax.swing.JPanel();
        txt7 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txtCcodigo = new javax.swing.JTextField();
        txt8 = new javax.swing.JLabel();
        txtCnombre = new javax.swing.JTextField();
        btnCverificar = new javax.swing.JButton();
        btnCguardar = new javax.swing.JButton();
        cmbDepartamento = new javax.swing.JComboBox<>();
        txt13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        btnDepartamento = new javax.swing.JButton();
        txtMunicipio = new javax.swing.JTextField();
        btnMunicipio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btnCverificar1 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barTop.setBackground(new java.awt.Color(0, 150, 70));
        barTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_actualizar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbl_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_actualizar.setText("MODO");
        lbl_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barTop.add(lbl_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 96, 35));

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
        barTop.add(rbtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 40));

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
        barTop.add(rbtRgistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 40));

        BG.add(barTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 50));

        pnl_Rgestion.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Rgestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5.setText("Gestion de Pais");
        txt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        txt2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Código");
        txt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtPcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txtPcodigo.setToolTipText("");
        pnl_Rgestion.add(txtPcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        txt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setText("Nombre");
        txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtPnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPnombre.setForeground(new java.awt.Color(20, 7, 7));
        txtPnombre.setToolTipText("");
        pnl_Rgestion.add(txtPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 30));

        btnPverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnPverificar.setText("V");
        btnPverificar.setBorder(null);
        btnPverificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPverificarMouseClicked(evt);
            }
        });
        pnl_Rgestion.add(btnPverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 30, 30));

        btnPguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnPguardar.setText("Guardar");
        btnPguardar.setBorder(null);
        btnPguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPguardarMouseClicked(evt);
            }
        });
        pnl_Rgestion.add(btnPguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 70, 30));

        cmbUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(cmbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 170, 30));

        txt11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt11.setText("Usuario");
        txt11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));
        pnl_Rgestion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 250, 10));

        BG.add(pnl_Rgestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 390, 220));

        pnl_Rgestion1.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Rgestion1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6.setText("Departamento");
        txt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion1.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txt3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("Código");
        txt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion1.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtDcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txtDcodigo.setToolTipText("");
        pnl_Rgestion1.add(txtDcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, 30));

        txt1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Nombre");
        txt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtDnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDnombre.setForeground(new java.awt.Color(20, 7, 7));
        txtDnombre.setToolTipText("");
        pnl_Rgestion1.add(txtDnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 30));

        btnDverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDverificar.setText("V");
        btnDverificar.setBorder(null);
        btnDverificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDverificarMouseClicked(evt);
            }
        });
        pnl_Rgestion1.add(btnDverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 30, 30));

        btnDguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDguardar.setText("Guardar");
        btnDguardar.setBorder(null);
        btnDguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDguardarMouseClicked(evt);
            }
        });
        pnl_Rgestion1.add(btnDguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 70, 30));

        cmbPais.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbPais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion1.add(cmbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 160, 30));

        txt12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt12.setText("Pais");
        txt12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion1.add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_Rgestion1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 10, 150));
        pnl_Rgestion1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 270, 10));

        BG.add(pnl_Rgestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 420, 220));

        pnl_Rgestion2.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Rgestion2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt7.setText("Municipio");
        txt7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion2.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txt4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("Código");
        txt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion2.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtCcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txtCcodigo.setToolTipText("");
        pnl_Rgestion2.add(txtCcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, 30));

        txt8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt8.setText("Nombre");
        txt8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion2.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtCnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCnombre.setForeground(new java.awt.Color(20, 7, 7));
        txtCnombre.setToolTipText("");
        pnl_Rgestion2.add(txtCnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 190, 30));

        btnCverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCverificar.setText("V");
        btnCverificar.setBorder(null);
        btnCverificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCverificarMouseClicked(evt);
            }
        });
        pnl_Rgestion2.add(btnCverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 30, 30));

        btnCguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCguardar.setText("Guardar");
        btnCguardar.setBorder(null);
        btnCguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCguardarMouseClicked(evt);
            }
        });
        pnl_Rgestion2.add(btnCguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 70, 30));

        cmbDepartamento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion2.add(cmbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 160, 30));

        txt13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt13.setText("Departamento");
        txt13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion2.add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_Rgestion2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 10, 150));
        pnl_Rgestion2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 310, 10));

        BG.add(pnl_Rgestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 410, 220));

        tblTabla.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "País", "Código", "Departamento", "Código", "Municipio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTabla);

        BG.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 750, 210));
        BG.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 1120, 10));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Municipio");
        BG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel2.setText("Area de consulta");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, 20));

        txtDepartamento.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDepartamento.setForeground(new java.awt.Color(20, 7, 7));
        txtDepartamento.setToolTipText("");
        BG.add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 140, 30));

        btnDepartamento.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnDepartamento.setText("V");
        btnDepartamento.setBorder(null);
        btnDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepartamentoMouseClicked(evt);
            }
        });
        BG.add(btnDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 30, 30));

        txtMunicipio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtMunicipio.setForeground(new java.awt.Color(20, 7, 7));
        txtMunicipio.setToolTipText("");
        BG.add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 140, 30));

        btnMunicipio.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnMunicipio.setText("V");
        btnMunicipio.setBorder(null);
        btnMunicipio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMunicipio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMunicipioMouseClicked(evt);
            }
        });
        BG.add(btnMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 30, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Departamento");
        BG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, 20));
        BG.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 800, 10));

        btnCverificar1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCverificar1.setText("O");
        btnCverificar1.setToolTipText("");
        btnCverificar1.setBorder(null);
        btnCverificar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCverificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCverificar1MouseClicked(evt);
            }
        });
        BG.add(btnCverificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 310, 30, 30));

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        BG.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 20, 120));

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

    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRgistrarMouseClicked
        if (!this.txtPcodigo.getText().equals("")) {
            modPa.setPaCodigo(Long.parseLong(this.txtPcodigo.getText()));
            sqlPa.Verificar(modPa);
        }
    }//GEN-LAST:event_rbtRgistrarMouseClicked

    private void btnPverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPverificarMouseClicked
        
    }//GEN-LAST:event_btnPverificarMouseClicked

    private void btnPguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPguardarMouseClicked
        
        if (!this.txtPcodigo.getText().equals("") && !this.txtPnombre.getText().equals("")) {
            modPa.setPaCodigo(Long.parseLong(this.txtPcodigo.getText()));
            modPa.setPaNombre(this.txtPnombre.getText());
            modPa.setUsCodigo(this.cmbUsuario.getItemAt(this.cmbUsuario.getSelectedIndex()).getUs_dni());
            sqlPa.Registrar(modPa);
        }
    }//GEN-LAST:event_btnPguardarMouseClicked

    private void btnDverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDverificarMouseClicked
        if (!this.txtDcodigo.getText().equals("")) {
            modDp.setDe_codigo(Long.parseLong(this.txtDcodigo.getText()));
            
            if (!sqlDp.Verificar(modDp)) {
                this.rbtRgistrar.setSelected(true);
                Animacion(this.rbtRgistrar);
            } else {
                this.rbtActualizar.setSelected(true);
                Animacion(this.rbtActualizar);
                this.txtDnombre.setText(modDp.getDe_nombre());
            }
        }
    }//GEN-LAST:event_btnDverificarMouseClicked

    private void btnDguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDguardarMouseClicked
        
        modDp.setDe_codigo(Long.parseLong(this.txtDcodigo.getText()));
        modDp.setPa_codigo(57);
        modDp.setDe_nombre(this.txtDnombre.getText());
        if (this.rbtRgistrar.isSelected()) {
            sqlDp.Registrar(modDp);
            LlenarDepa();
        } else {
            sqlDp.Modificar(modDp);
            LlenarDepa();
        }

    }//GEN-LAST:event_btnDguardarMouseClicked

    private void btnCverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCverificarMouseClicked
        if (!this.txtCcodigo.getText().equals("")) {
            modCi.setDe_codigo(Long.parseLong(this.txtCcodigo.getText()));
            
            if (!sqlCi.Verificar(modCi)) {
                this.rbtRgistrar.setSelected(true);
                Animacion(this.rbtRgistrar);
            } else {
                this.rbtActualizar.setSelected(true);
                Animacion(this.rbtActualizar);
                this.txtCnombre.setText(modCi.getCi_nombre());
            }
        }
    }//GEN-LAST:event_btnCverificarMouseClicked

    private void btnCguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCguardarMouseClicked
        modCi.setCi_codigo(Long.parseLong(this.txtCcodigo.getText()));
        modCi.setCi_nombre(this.txtCnombre.getText());
        modCi.setDe_codigo(this.cmbDepartamento.getItemAt(this.cmbDepartamento.getSelectedIndex()).getDe_codigo());
        if (this.rbtRgistrar.isSelected()) {
            sqlCi.Registrar(modCi);
        } else {
            sqlCi.Modificar(modCi);
        }
    }//GEN-LAST:event_btnCguardarMouseClicked

    private void btnDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartamentoMouseClicked
        if (!this.txtDepartamento.getText().equals("")) {
            sqlCi.Cargar(tblTabla, this.txtDepartamento.getText(), "");
        } else {
            sqlCi.Cargar(tblTabla, "", "");
        }
    }//GEN-LAST:event_btnDepartamentoMouseClicked

    private void btnMunicipioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMunicipioMouseClicked
        if (!this.txtMunicipio.getText().equals("")) {
            sqlCi.Cargar(tblTabla, "", this.txtMunicipio.getText());
        } else {
            sqlCi.Cargar(tblTabla, "", "");
        }
    }//GEN-LAST:event_btnMunicipioMouseClicked

    private void btnCverificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCverificar1MouseClicked
        sqlCi.Cargar(tblTabla, "", "");
    }//GEN-LAST:event_btnCverificar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel barTop;
    private javax.swing.JButton btnCguardar;
    private javax.swing.JButton btnCverificar;
    private javax.swing.JButton btnCverificar1;
    private javax.swing.JButton btnDepartamento;
    private javax.swing.JButton btnDguardar;
    private javax.swing.JButton btnDverificar;
    private javax.swing.JButton btnMunicipio;
    private javax.swing.JButton btnPguardar;
    private javax.swing.JButton btnPverificar;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_DEPARTAMENTO> cmbDepartamento;
    private javax.swing.JComboBox<ENT_PAIS> cmbPais;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_USUARIO> cmbUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JPanel pnl_Rgestion;
    private javax.swing.JPanel pnl_Rgestion1;
    private javax.swing.JPanel pnl_Rgestion2;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JTable tblTabla;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt12;
    private javax.swing.JLabel txt13;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JTextField txtCcodigo;
    private javax.swing.JTextField txtCnombre;
    private javax.swing.JTextField txtDcodigo;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDnombre;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtPcodigo;
    private javax.swing.JTextField txtPnombre;
    // End of variables declaration//GEN-END:variables
}
