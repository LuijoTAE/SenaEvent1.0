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
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

/**
 *
 * @author windows21
 */
public class VTN_PROGRAMA extends javax.swing.JPanel {

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
        sqlFi.Cargar("", 1, 1, tblFicha);
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

        this.txtPcodigo.setText("");
        this.txtPnombre.setText("");
        this.txtPversion.setText("");
    }
    
    private void ClearConsult(){
        this.txtSiglas.setText("");
        this.txtCodConsul.setText("");
        this.txtFichaConsul.setText("");
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
    
    private void cmbAnimacionA(JComboBox cmb){
        cmb.setSize(300, 35);
    }
    private void cmbAnimacionB(JComboBox cmb){
        cmb.setSize(220, 35);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        barTop = new javax.swing.JPanel();
        rbtActualizar = new javax.swing.JRadioButton();
        rbtRegistrar = new javax.swing.JRadioButton();
        lbl_actualizar = new javax.swing.JLabel();
        pnl_buscar = new javax.swing.JPanel();
        pnlFicha = new javax.swing.JPanel();
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
        pnlPrograma = new javax.swing.JPanel();
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
        jSeparator4 = new javax.swing.JSeparator();
        pnlConsultas = new javax.swing.JPanel();
        lbl13 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtSiglas = new javax.swing.JTextField();
        btnSiglas = new javax.swing.JButton();
        lbl11 = new javax.swing.JLabel();
        txtCodConsul = new javax.swing.JTextField();
        btnCodConsul = new javax.swing.JButton();
        lbl12 = new javax.swing.JLabel();
        txtFichaConsul = new javax.swing.JTextField();
        btnFichaConsul = new javax.swing.JButton();
        scrTablaPF = new javax.swing.JScrollPane();
        tblFicha = new javax.swing.JTable();
        btn_Fverificar1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barTop.setBackground(new java.awt.Color(0, 150, 70));
        barTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        rbtRegistrar.setBackground(new java.awt.Color(0, 150, 70));
        rbtRegistrar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        rbtRegistrar.setText("Registrar");
        rbtRegistrar.setEnabled(false);
        rbtRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtRegistrarMouseClicked(evt);
            }
        });
        barTop.add(rbtRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 40));

        lbl_actualizar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbl_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_actualizar.setText("MODO");
        lbl_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barTop.add(lbl_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 96, 35));

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

        barTop.add(pnl_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 90, -1));

        BG.add(barTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 50));

        pnlFicha.setBackground(new java.awt.Color(255, 255, 255));
        pnlFicha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setText("Ficha de Formación");
        lbl9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFicha.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btn_Fguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Fguardar.setText("Guardar");
        btn_Fguardar.setBorder(null);
        btn_Fguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FguardarMouseClicked(evt);
            }
        });
        pnlFicha.add(btn_Fguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 70, 35));

        lbl4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setText("Número de Ficha");
        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFicha.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txt_Fcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Fcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txt_Fcodigo.setToolTipText("");
        pnlFicha.add(txt_Fcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, 35));

        btn_Fverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Fverificar.setText("V");
        btn_Fverificar.setBorder(null);
        btn_Fverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FverificarMouseClicked(evt);
            }
        });
        pnlFicha.add(btn_Fverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 30, 35));

        lbl6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setText("Modalidad");
        lbl6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFicha.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cmb_Fmodalidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Fmodalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRESENCIAL", "VIRTUAL" }));
        pnlFicha.add(cmb_Fmodalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 35));

        txt18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt18.setText("Centro de Formación");
        txt18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFicha.add(txt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        cmb_Fcentro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Fcentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmb_FcentroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmb_FcentroMouseExited(evt);
            }
        });
        cmb_Fcentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_FcentroActionPerformed(evt);
            }
        });
        pnlFicha.add(cmb_Fcentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 220, 35));

        lbl5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setText("Jornada");
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFicha.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        cmb_Fjornada.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Fjornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TECNICO", "TEGNOLOGO" }));
        pnlFicha.add(cmb_Fjornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, 35));

        lbl7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setText("Programa de Formación");
        lbl7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlFicha.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        cmb_Fprograma.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Fprograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmb_FprogramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmb_FprogramaMouseExited(evt);
            }
        });
        pnlFicha.add(cmb_Fprograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 220, 35));
        pnlFicha.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 470, 10));

        BG.add(pnlFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 700, 220));

        pnlPrograma.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrograma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setText("Programa de Formación");
        lbl8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPrograma.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        btn_Pguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Pguardar.setText("Guardar");
        btn_Pguardar.setBorder(null);
        btn_Pguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PguardarMouseClicked(evt);
            }
        });
        pnlPrograma.add(btn_Pguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, 30));

        lbl1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setText("Código");
        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPrograma.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtPcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txtPcodigo.setToolTipText("");
        pnlPrograma.add(txtPcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 35));

        btn_Pverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Pverificar.setText("V");
        btn_Pverificar.setBorder(null);
        btn_Pverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PverificarMouseClicked(evt);
            }
        });
        pnlPrograma.add(btn_Pverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 30, 35));

        lbl2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setText("Nombre");
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPrograma.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        txtPnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPnombre.setForeground(new java.awt.Color(20, 7, 7));
        txtPnombre.setToolTipText("");
        pnlPrograma.add(txtPnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 190, 35));

        lbl3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setText("Nivel de Formación");
        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPrograma.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        cmbPnivel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbPnivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TECNICO", "TEGNOLOGO" }));
        pnlPrograma.add(cmbPnivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 190, 35));

        lbl.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("Versión");
        lbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPrograma.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtPversion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPversion.setForeground(new java.awt.Color(20, 7, 7));
        pnlPrograma.add(txtPversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 35));
        pnlPrograma.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 230, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlPrograma.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 10, 150));

        BG.add(pnlPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 460, 220));
        BG.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 275, 1010, 10));

        pnlConsultas.setBackground(new java.awt.Color(255, 255, 255));
        pnlConsultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl13.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl13.setText("Area de Consultas");
        lbl13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsultas.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbl10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10.setText("Siglas");
        lbl10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsultas.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        pnlConsultas.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 890, 20));

        txtSiglas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtSiglas.setForeground(new java.awt.Color(20, 7, 7));
        txtSiglas.setToolTipText("");
        pnlConsultas.add(txtSiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 160, 35));

        btnSiglas.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnSiglas.setText("V");
        btnSiglas.setBorder(null);
        btnSiglas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiglasMouseClicked(evt);
            }
        });
        pnlConsultas.add(btnSiglas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 30, 35));

        lbl11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11.setText("Código");
        lbl11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsultas.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtCodConsul.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCodConsul.setForeground(new java.awt.Color(20, 7, 7));
        txtCodConsul.setToolTipText("");
        pnlConsultas.add(txtCodConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 160, 35));

        btnCodConsul.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnCodConsul.setText("V");
        btnCodConsul.setBorder(null);
        btnCodConsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCodConsulMouseClicked(evt);
            }
        });
        pnlConsultas.add(btnCodConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 30, 35));

        lbl12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl12.setText("Ficha");
        lbl12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlConsultas.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        txtFichaConsul.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFichaConsul.setForeground(new java.awt.Color(20, 7, 7));
        txtFichaConsul.setToolTipText("");
        pnlConsultas.add(txtFichaConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 160, 35));

        btnFichaConsul.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnFichaConsul.setText("V");
        btnFichaConsul.setBorder(null);
        btnFichaConsul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFichaConsulMouseClicked(evt);
            }
        });
        pnlConsultas.add(btnFichaConsul, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 30, 35));

        tblFicha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
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
        tblFicha.setColumnSelectionAllowed(false);
        tblFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblFicha.setRowHeight(20);
        scrTablaPF.setViewportView(tblFicha);

        pnlConsultas.add(scrTablaPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 820, 230));

        btn_Fverificar1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Fverificar1.setText("O");
        btn_Fverificar1.setBorder(null);
        btn_Fverificar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Fverificar1MouseClicked(evt);
            }
        });
        pnlConsultas.add(btn_Fverificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 30, 35));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlConsultas.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 20, 210));

        BG.add(pnlConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 1080, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtActualizarMouseClicked

    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRegistrarMouseClicked

    }//GEN-LAST:event_rbtRegistrarMouseClicked

    private void btn_PguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PguardarMouseClicked
        if (!this.txtPcodigo.getText().equals("") && !this.txtPnombre.getText().equals("")) {
            modPr.setPf_codigo(Long.parseLong(this.txtPcodigo.getText()));
            modPr.setPf_nombre(this.txtPnombre.getText());
            modPr.setPf_version(Double.parseDouble(this.txtPversion.getText()));
            modPr.setPf_nivel(this.cmbPnivel.getSelectedItem().toString());

            if (this.rbtRegistrar.isSelected()) {
                sqlPr.Registrar(modPr);
            } else {
                if (this.rbtActualizar.isSelected()) {
                    // Aqui debe ir Actualizar
                }
            }
        }
        Clear();
        LlenarPrograma();
        sqlFi.Cargar("", 1, 1, tblFicha);
    }//GEN-LAST:event_btn_PguardarMouseClicked

    private void btn_FguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FguardarMouseClicked
       if(!this.txt_Fcodigo.getText().equals("")){
           modFi.setFi_codigo(Long.parseLong(this.txt_Fcodigo.getText()));
           modFi.setFi_jornada(this.cmb_Fjornada.getSelectedItem().toString());
           modFi.setFi_modalidad(this.cmb_Fmodalidad.getSelectedItem().toString());
           modFi.setPf_codifo(this.cmb_Fprograma.getItemAt(this.cmb_Fprograma.getSelectedIndex()).getPf_codigo());
           modFi.setCf_codigo(this.cmb_Fcentro.getItemAt(this.cmb_Fcentro.getSelectedIndex()).getCf_codigo());
           if(this.rbtRegistrar.isSelected()){
               sqlFi.Registrar(modFi);
               sqlFi.Cargar("", 1, 1, tblFicha);
               this.txt_Fcodigo.setText("");
           }else{
               //Aquí debe ir módificar
           }
       }

    }//GEN-LAST:event_btn_FguardarMouseClicked

    private void btn_PverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PverificarMouseClicked
        if (!this.txtPcodigo.getText().equals("")) {
            modPr.setPf_codigo(Long.parseLong(this.txtPcodigo.getText()));
            if (!sqlPr.Vereficar(modPr)) {
                this.rbtRegistrar.setSelected(true);
                this.txtPnombre.setText("");
                Animacion(rbtRegistrar);
            } else {
                this.rbtActualizar.setSelected(true);
                this.txtPnombre.setText(modPr.getPf_nombre());
                Animacion(rbtActualizar);
            }
        }
    }//GEN-LAST:event_btn_PverificarMouseClicked

    private void btn_FverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FverificarMouseClicked
        if(!this.txt_Fcodigo.getText().equals("")){
            modFi.setFi_codigo(Long.parseLong(this.txt_Fcodigo.getText()));
            if(!sqlFi.Verificar(modFi)){
                this.rbtRegistrar.setSelected(true);
                this.txt_Fcodigo.setText("");
                this.Animacion(rbtRegistrar);
            }else{
                this.rbtActualizar.setSelected(true);
                this.txt_Fcodigo.setText(""+modFi.getFi_codigo());
            }
        }
    }//GEN-LAST:event_btn_FverificarMouseClicked

    private void btnSiglasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiglasMouseClicked
        String siglas = this.txtSiglas.getText();
        sqlFi.Cargar(siglas, 1, 1, tblFicha);
        this.ClearConsult();
    }//GEN-LAST:event_btnSiglasMouseClicked

    private void btnCodConsulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCodConsulMouseClicked
        sqlFi.Cargar("", Long.parseLong(this.txtCodConsul.getText()), 1, tblFicha);
        this.ClearConsult();
    }//GEN-LAST:event_btnCodConsulMouseClicked

    private void btnFichaConsulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFichaConsulMouseClicked
        sqlFi.Cargar("", 1, Long.parseLong(this.txtFichaConsul.getText()), tblFicha);
        this.ClearConsult();
    }//GEN-LAST:event_btnFichaConsulMouseClicked

    private void btn_Fverificar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Fverificar1MouseClicked
        sqlFi.Cargar("", 1, 1, tblFicha);
    }//GEN-LAST:event_btn_Fverificar1MouseClicked

    private void cmb_FcentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_FcentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_FcentroActionPerformed

    private void cmb_FprogramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_FprogramaMouseEntered
        cmbAnimacionA(this.cmb_Fprograma);
    }//GEN-LAST:event_cmb_FprogramaMouseEntered

    private void cmb_FprogramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_FprogramaMouseExited
        cmbAnimacionB(this.cmb_Fprograma);
    }//GEN-LAST:event_cmb_FprogramaMouseExited

    private void cmb_FcentroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_FcentroMouseEntered
        cmbAnimacionA(this.cmb_Fcentro);
    }//GEN-LAST:event_cmb_FcentroMouseEntered

    private void cmb_FcentroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_FcentroMouseExited
        cmbAnimacionB(this.cmb_Fcentro);
    }//GEN-LAST:event_cmb_FcentroMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel barTop;
    private javax.swing.JButton btnCodConsul;
    private javax.swing.JButton btnFichaConsul;
    private javax.swing.JButton btnSiglas;
    private javax.swing.JButton btn_Fguardar;
    private javax.swing.JButton btn_Fverificar;
    private javax.swing.JButton btn_Fverificar1;
    private javax.swing.JButton btn_Pguardar;
    private javax.swing.JButton btn_Pverificar;
    private javax.swing.JComboBox<String> cmbPnivel;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_CENTRO> cmb_Fcentro;
    private javax.swing.JComboBox<String> cmb_Fjornada;
    private javax.swing.JComboBox<String> cmb_Fmodalidad;
    private javax.swing.JComboBox<PAC_ENTIDAD.ENT_PROGRAMA> cmb_Fprograma;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JPanel pnlConsultas;
    private javax.swing.JPanel pnlFicha;
    private javax.swing.JPanel pnlPrograma;
    private javax.swing.JPanel pnl_buscar;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtRegistrar;
    private javax.swing.JScrollPane scrTablaPF;
    private javax.swing.JTable tblFicha;
    private javax.swing.JLabel txt18;
    private javax.swing.JTextField txtCodConsul;
    private javax.swing.JTextField txtFichaConsul;
    private javax.swing.JTextField txtPcodigo;
    private javax.swing.JTextField txtPnombre;
    private javax.swing.JTextField txtPversion;
    private javax.swing.JTextField txtSiglas;
    private javax.swing.JTextField txt_Fcodigo;
    // End of variables declaration//GEN-END:variables
}
