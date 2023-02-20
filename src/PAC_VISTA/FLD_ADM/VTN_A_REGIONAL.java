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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author windows21
 */
public class VTN_A_REGIONAL extends javax.swing.JPanel {

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

    public VTN_A_REGIONAL() {
        initComponents();
        this.grpRegional.add(this.rbtActualizar);
        this.grpRegional.add(this.rbtRgistrar);
        LlenarUsuarios();
        LlenarRegional();
        LlenarCentro();
        LlenarPrograma();
        sqlCe.Cargar("", this.tblCentro);
        sqlFi.Cargar("", this.tblFicha);
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

    private void Animacion(JRadioButton btn) {
        if (btn.isSelected() && btn.getText().equals("Actualizar")) {
            this.bar_top.setBackground(new Color(51, 51, 51));
            this.pnl_buscar.setBackground(new Color(51, 51, 51));
            this.txt_buscar.setBackground(new Color(51, 51, 51));
        } else {
            if (btn.isSelected() && btn.getText().equals("Registrar")) {
                this.bar_top.setBackground(new Color(0, 150, 70));
                this.pnl_buscar.setBackground(new Color(0, 150, 70));
                this.txt_buscar.setBackground(new Color(0, 150, 70));
            }
        }

    }

    private void HabilitarCampos(JRadioButton btn, JTextField txtC, JTextField txtN, JComboBox cmb) {
        if (btn.isSelected() && btn.getText().equals("Actualizar")) {
            txtC.setEnabled(false);
            txtN.setEnabled(true);
            cmb.setEnabled(false);

        }
        if (btn.isSelected() && btn.getText().equals("Registrar")) {
            txtC.setEnabled(true);
            txtN.setEnabled(true);
            cmb.setEnabled(true);

        }

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
        jSeparator1 = new javax.swing.JSeparator();
        txt_buscar = new javax.swing.JTextField();
        pnl_buscar = new javax.swing.JPanel();
        lbl_buscar = new javax.swing.JLabel();
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
        jSeparator3 = new javax.swing.JSeparator();
        pnl_Fprograma = new javax.swing.JPanel();
        txt7 = new javax.swing.JLabel();
        btn_Pguardar = new javax.swing.JButton();
        txt13 = new javax.swing.JLabel();
        btn_Fguardar = new javax.swing.JButton();
        txt4 = new javax.swing.JLabel();
        txt_Pcodigo = new javax.swing.JTextField();
        btn_Pverificar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        txt14 = new javax.swing.JLabel();
        txt_Fcodigo = new javax.swing.JTextField();
        btn_Fverificar = new javax.swing.JButton();
        txt16 = new javax.swing.JLabel();
        cmb_Fmodalidad = new javax.swing.JComboBox<>();
        txt8 = new javax.swing.JLabel();
        txt_Pnombre = new javax.swing.JTextField();
        txt18 = new javax.swing.JLabel();
        cmb_Fcentro = new javax.swing.JComboBox<>();
        txt17 = new javax.swing.JLabel();
        cmb_Fjornada = new javax.swing.JComboBox<>();
        txt12 = new javax.swing.JLabel();
        cmb_Pnivel = new javax.swing.JComboBox<>();
        txt10 = new javax.swing.JLabel();
        txt_Pversion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        txt15 = new javax.swing.JLabel();
        cmb_Fprograma = new javax.swing.JComboBox<>();
        scrTablaPF = new javax.swing.JScrollPane();
        tblFicha = new javax.swing.JTable();
        scrTablaRC = new javax.swing.JScrollPane();
        tblCentro = new javax.swing.JTable();

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
        bar_top.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 140, 10));

        txt_buscar.setBackground(new java.awt.Color(0, 150, 70));
        txt_buscar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(255, 255, 255));
        txt_buscar.setText("Consultar...");
        txt_buscar.setBorder(null);
        bar_top.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 140, 40));

        pnl_buscar.setBackground(new java.awt.Color(0, 150, 70));

        lbl_buscar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_buscar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_buscar.setText("Buscar");
        lbl_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnl_buscarLayout = new javax.swing.GroupLayout(pnl_buscar);
        pnl_buscar.setLayout(pnl_buscarLayout);
        pnl_buscarLayout.setHorizontalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        pnl_buscarLayout.setVerticalGroup(
            pnl_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bar_top.add(pnl_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 90, -1));

        BG.add(bar_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 50));

        pnl_Rgestion.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Rgestion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5.setText("Gestion de Regional");
        txt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        btn_Rguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Rguardar.setText("Enviar");
        btn_Rguardar.setBorder(null);
        btn_Rguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RguardarMouseClicked(evt);
            }
        });
        pnl_Rgestion.add(btn_Rguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, 30));

        txt2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Código");
        txt2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txt_Rcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Rcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txt_Rcodigo.setToolTipText("");
        pnl_Rgestion.add(txt_Rcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 30));

        btn_Rverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Rverificar.setText("V");
        btn_Rverificar.setBorder(null);
        btn_Rverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RverificarMouseClicked(evt);
            }
        });
        pnl_Rgestion.add(btn_Rverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 30, 30));

        txt.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt.setText("Nombre");
        txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txt_Rnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Rnombre.setForeground(new java.awt.Color(20, 7, 7));
        txt_Rnombre.setToolTipText("");
        pnl_Rgestion.add(txt_Rnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 30));

        txt11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt11.setText("Usuario");
        txt11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Rgestion.add(txt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        cmb_Rusuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_Rgestion.add(cmb_Rusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_Rgestion.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 10, 240));

        BG.add(pnl_Rgestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 270, 310));

        pnl_Fcentro.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Fcentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6.setText("Centro de Formación");
        txt6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fcentro.add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        btn_Cguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Cguardar.setText("Enviar");
        btn_Cguardar.setBorder(null);
        btn_Cguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CguardarMouseClicked(evt);
            }
        });
        pnl_Fcentro.add(btn_Cguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, 30));

        txt3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("Código");
        txt3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fcentro.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txt_Ccodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Ccodigo.setForeground(new java.awt.Color(20, 7, 7));
        txt_Ccodigo.setToolTipText("");
        pnl_Fcentro.add(txt_Ccodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 30));

        btn_Cverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Cverificar.setText("V");
        btn_Cverificar.setBorder(null);
        btn_Cverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CverificarMouseClicked(evt);
            }
        });
        pnl_Fcentro.add(btn_Cverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 30, 30));

        txt1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Nombre");
        txt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fcentro.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txt_Cnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Cnombre.setForeground(new java.awt.Color(20, 7, 7));
        txt_Cnombre.setToolTipText("");
        pnl_Fcentro.add(txt_Cnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 30));

        txt9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt9.setText("Regional");
        txt9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fcentro.add(txt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        cmb_Cregional.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Cregional.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_CregionalItemStateChanged(evt);
            }
        });
        pnl_Fcentro.add(cmb_Cregional, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_Fcentro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 10, 240));

        BG.add(pnl_Fcentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 270, 310));

        pnl_Fprograma.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Fprograma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt7.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt7.setText("Programa de Formación");
        txt7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        btn_Pguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Pguardar.setText("Enviar");
        btn_Pguardar.setBorder(null);
        btn_Pguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PguardarMouseClicked(evt);
            }
        });
        pnl_Fprograma.add(btn_Pguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 30));

        txt13.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt13.setText("Ficha de Formación");
        txt13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        btn_Fguardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Fguardar.setText("Enviar");
        btn_Fguardar.setBorder(null);
        btn_Fguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FguardarMouseClicked(evt);
            }
        });
        pnl_Fprograma.add(btn_Fguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 70, 30));

        txt4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("Código");
        txt4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txt_Pcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Pcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txt_Pcodigo.setToolTipText("");
        pnl_Fprograma.add(txt_Pcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, 30));

        btn_Pverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Pverificar.setText("V");
        btn_Pverificar.setBorder(null);
        btn_Pverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_PverificarMouseClicked(evt);
            }
        });
        pnl_Fprograma.add(btn_Pverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 30, 30));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_Fprograma.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 10, 160));

        txt14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt14.setText("Número de Ficha");
        txt14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt14, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        txt_Fcodigo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Fcodigo.setForeground(new java.awt.Color(20, 7, 7));
        txt_Fcodigo.setToolTipText("");
        pnl_Fprograma.add(txt_Fcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 160, 30));

        btn_Fverificar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_Fverificar.setText("V");
        btn_Fverificar.setBorder(null);
        btn_Fverificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_FverificarMouseClicked(evt);
            }
        });
        pnl_Fprograma.add(btn_Fverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 30, 30));

        txt16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt16.setText("Modalidad");
        txt16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, -1, -1));

        cmb_Fmodalidad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Fmodalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRESENCIAL", "VIRTUAL" }));
        pnl_Fprograma.add(cmb_Fmodalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 190, 30));

        txt8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt8.setText("Nombre");
        txt8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txt_Pnombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Pnombre.setForeground(new java.awt.Color(20, 7, 7));
        txt_Pnombre.setToolTipText("");
        pnl_Fprograma.add(txt_Pnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 30));

        txt18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt18.setText("Centro de Formación");
        txt18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        cmb_Fcentro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_Fprograma.add(cmb_Fcentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 190, 30));

        txt17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt17.setText("Jornada");
        txt17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        cmb_Fjornada.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Fjornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TECNICO", "TEGNOLOGO" }));
        pnl_Fprograma.add(cmb_Fjornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 190, 30));

        txt12.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt12.setText("Nivel de Formación");
        txt12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        cmb_Pnivel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_Pnivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TECNICO", "TEGNOLOGO" }));
        pnl_Fprograma.add(cmb_Pnivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 30));

        txt10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt10.setText("Versión");
        txt10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        txt_Pversion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Pversion.setForeground(new java.awt.Color(20, 7, 7));
        pnl_Fprograma.add(txt_Pversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 170, 30));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_Fprograma.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 10, 40));

        txt15.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt15.setText("Programa de Formación");
        txt15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnl_Fprograma.add(txt15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        cmb_Fprograma.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_Fprograma.add(cmb_Fprograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 190, 30));

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

        pnl_Fprograma.add(scrTablaPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 710, 170));

        BG.add(pnl_Fprograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 740, 500));

        tblCentro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
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
        scrTablaRC.setViewportView(tblCentro);

        BG.add(scrTablaRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 380, 520, 170));

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
                HabilitarCampos(this.rbtRgistrar, this.txt_Rnombre, this.txt_Rnombre, this.cmb_Rusuario);
                LlenarUsuarios();
            } else {
                this.rbtActualizar.setSelected(true);
                Animacion(this.rbtActualizar);
                HabilitarCampos(this.rbtActualizar, this.txt_Rnombre, this.txt_Rnombre, this.cmb_Rusuario);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresra un valor para verificar");
        }
    }//GEN-LAST:event_btn_RverificarMouseClicked

    private void btn_RguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RguardarMouseClicked

        modRe.setRe_codigo(Long.parseLong(this.txt_Rcodigo.getText()));
        modRe.setRe_nombre(this.txt_Rnombre.getText());

        if (this.rbtRgistrar.isSelected()) {
            long usuario = this.cmb_Rusuario.getItemAt(this.cmb_Rusuario.getSelectedIndex()).getUs_dni();
            sqlRe.Registrar(modRe, usuario);
        }
        if (this.rbtActualizar.isSelected()) {
            sqlRe.Modificar(modRe);
        }
    }//GEN-LAST:event_btn_RguardarMouseClicked

    private void btn_CverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CverificarMouseClicked
        if (!this.txt_Ccodigo.getText().equals("")) {
            modCe.setCf_codigo(Long.parseLong(this.txt_Ccodigo.getText()));

            if (!sqlCe.Verificar(modCe)) {
                this.rbtRgistrar.setSelected(true);
                Animacion(this.rbtRgistrar);
                HabilitarCampos(this.rbtRgistrar, this.txt_Cnombre, this.txt_Cnombre, this.cmb_Cregional);
                LlenarRegional();
            } else {
                this.rbtActualizar.setSelected(true);
                Animacion(this.rbtActualizar);
                HabilitarCampos(this.rbtActualizar, this.txt_Cnombre, this.txt_Cnombre, this.cmb_Cregional);
            }
        }
    }//GEN-LAST:event_btn_CverificarMouseClicked

    private void btn_CguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CguardarMouseClicked

        modCe.setCf_codigo(Long.parseLong(this.txt_Ccodigo.getText()));
        modCe.setCf_nombre(this.txt_Cnombre.getText());

        if (this.rbtRgistrar.isSelected()) {
            long regional = this.cmb_Cregional.getItemAt(this.cmb_Cregional.getSelectedIndex()).getRe_codigo();
            modCe.setRe_codigo(regional);
            sqlCe.Registrar(modCe);
        }
        if (this.rbtActualizar.isSelected()) {
            sqlCe.Modificar(modCe);
        }

    }//GEN-LAST:event_btn_CguardarMouseClicked

    private void cmb_CregionalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_CregionalItemStateChanged

    }//GEN-LAST:event_cmb_CregionalItemStateChanged

    private void btn_PverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PverificarMouseClicked
        if (!this.txt_Pcodigo.getText().equals("")) {

            modPr.setPf_codigo(Long.parseLong(this.txt_Pcodigo.getText()));
            if (!sqlPr.Vereficar(modPr)) {
                this.rbtRgistrar.setSelected(true);
                Animacion(this.rbtRgistrar);
                HabilitarCampos(this.rbtRgistrar, this.txt_Pversion, this.txt_Pnombre, this.cmb_Pnivel);
            } else {
                this.rbtActualizar.setSelected(true);
                Animacion(this.rbtActualizar);
                HabilitarCampos(this.rbtRgistrar, this.txt_Pversion, this.txt_Pnombre, this.cmb_Pnivel);
                this.txt_Pversion.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btn_PverificarMouseClicked

    private void btn_PguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PguardarMouseClicked

        modPr.setPf_nombre(this.txt_Pnombre.getText());
        modPr.setPf_version(Double.parseDouble(this.txt_Pversion.getText()));
        modPr.setPf_nivel(this.cmb_Pnivel.getSelectedItem().toString());
        if (this.rbtRgistrar.isSelected()) {
            modPr.setPf_codigo(Long.parseLong(this.txt_Pcodigo.getText()));
            sqlPr.Registrar(modPr);
        }
        if (this.rbtActualizar.isSelected()) {

        }

    }//GEN-LAST:event_btn_PguardarMouseClicked

    private void btn_FguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FguardarMouseClicked

        modFi.setFi_codigo(Long.parseLong(this.txt_Fcodigo.getText()));
        modFi.setCf_codigo(this.cmb_Fcentro.getItemAt(this.cmb_Fcentro.getSelectedIndex()).getCf_codigo());
        modFi.setPf_codifo(this.cmb_Fprograma.getItemAt(this.cmb_Fprograma.getSelectedIndex()).getPf_codigo());
        modFi.setFi_jornada(this.cmb_Fjornada.getSelectedItem().toString());
        modFi.setFi_modalidad(this.cmb_Fmodalidad.getSelectedItem().toString());
        if (!sqlFi.Verificar(modFi)) {
            sqlFi.Registrar(modFi);
        } else {
            //Modificar
        }
    }//GEN-LAST:event_btn_FguardarMouseClicked

    private void btn_FverificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FverificarMouseClicked
        if (!this.txt_Fcodigo.getText().equals("")) {
            modFi.setFi_codigo(Long.parseLong(this.txt_Fcodigo.getText()));
            if (!sqlFi.Verificar(modFi)) {
                this.rbtRgistrar.setSelected(true);
                Animacion(this.rbtRgistrar);
                LlenarCentro();
                LlenarPrograma();
            } else {
                this.rbtActualizar.setSelected(true);
                Animacion(this.rbtActualizar);
                LlenarCentro();
                LlenarPrograma();
            }

        }
    }//GEN-LAST:event_btn_FverificarMouseClicked

    private void rbtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtActualizarMouseClicked

    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRgistrarMouseClicked

    }//GEN-LAST:event_rbtRgistrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel bar_top;
    private javax.swing.JButton btn_Cguardar;
    private javax.swing.JButton btn_Cverificar;
    private javax.swing.JButton btn_Fguardar;
    private javax.swing.JButton btn_Fverificar;
    private javax.swing.JButton btn_Pguardar;
    private javax.swing.JButton btn_Pverificar;
    private javax.swing.JButton btn_Rguardar;
    private javax.swing.JButton btn_Rverificar;
    private javax.swing.JComboBox<ENT_REGIONAL> cmb_Cregional;
    private javax.swing.JComboBox<ENT_CENTRO> cmb_Fcentro;
    private javax.swing.JComboBox<String> cmb_Fjornada;
    private javax.swing.JComboBox<String> cmb_Fmodalidad;
    private javax.swing.JComboBox<ENT_PROGRAMA> cmb_Fprograma;
    private javax.swing.JComboBox<String> cmb_Pnivel;
    private javax.swing.JComboBox<ENT_USUARIO> cmb_Rusuario;
    private javax.swing.ButtonGroup grpRegional;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JLabel lbl_buscar;
    private javax.swing.JPanel pnl_Fcentro;
    private javax.swing.JPanel pnl_Fprograma;
    private javax.swing.JPanel pnl_Rgestion;
    private javax.swing.JPanel pnl_buscar;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JScrollPane scrTablaPF;
    private javax.swing.JScrollPane scrTablaRC;
    private javax.swing.JTable tblCentro;
    private javax.swing.JTable tblFicha;
    private javax.swing.JLabel txt;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt10;
    private javax.swing.JLabel txt11;
    private javax.swing.JLabel txt12;
    private javax.swing.JLabel txt13;
    private javax.swing.JLabel txt14;
    private javax.swing.JLabel txt15;
    private javax.swing.JLabel txt16;
    private javax.swing.JLabel txt17;
    private javax.swing.JLabel txt18;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txt8;
    private javax.swing.JLabel txt9;
    private javax.swing.JTextField txt_Ccodigo;
    private javax.swing.JTextField txt_Cnombre;
    private javax.swing.JTextField txt_Fcodigo;
    private javax.swing.JTextField txt_Pcodigo;
    private javax.swing.JTextField txt_Pnombre;
    private javax.swing.JTextField txt_Pversion;
    private javax.swing.JTextField txt_Rcodigo;
    private javax.swing.JTextField txt_Rnombre;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
