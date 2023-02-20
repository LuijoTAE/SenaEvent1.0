/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA.FLD_FUN;

import PAC_ENTIDAD.ENT_ASISTENCIAS;
import PAC_ENTIDAD.ENT_CENTRO;
import PAC_ENTIDAD.ENT_EVENTO;
import PAC_ENTIDAD.ENT_FICHA;
import PAC_ENTIDAD.ENT_PROGRAMA;
import PAC_MODELO.SQL_ASISTENCIAS;
import PAC_MODELO.SQL_CENTRO;
import PAC_MODELO.SQL_EVENTO;
import PAC_MODELO.SQL_FICHA;
import PAC_MODELO.SQL_PROGRAMA;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author windows21
 */
public class VTN_ASISTENCIAS extends javax.swing.JPanel {

    ENT_CENTRO modCe = new ENT_CENTRO();
    SQL_CENTRO sqlCe = new SQL_CENTRO();

    ENT_EVENTO modEv = new ENT_EVENTO();
    SQL_EVENTO sqlEv = new SQL_EVENTO();

    ENT_FICHA modFi = new ENT_FICHA();
    SQL_FICHA sqlFi = new SQL_FICHA();

    ENT_PROGRAMA modPr = new ENT_PROGRAMA();
    SQL_PROGRAMA sqlPr = new SQL_PROGRAMA();

    ENT_ASISTENCIAS modAs = new ENT_ASISTENCIAS();
    SQL_ASISTENCIAS sqlAs = new SQL_ASISTENCIAS();

    public VTN_ASISTENCIAS() {
        initComponents();
        LlenarCentro();
        LlenarPrograma();
        LlenarEvento();
        sqlAs.Cargar(1, 1, 1, 1, tblTabla);
    }

    private void LlenarCentro() {
        ArrayList<ENT_CENTRO> lista = sqlCe.getCentro();
        this.cmbCentro.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbCentro.addItem(new ENT_CENTRO(lista.get(i).getCf_nombre(),
                    lista.get(i).getCf_codigo()));
        }
    }

    private void LlenarPrograma() {
        ArrayList<ENT_PROGRAMA> lista = sqlPr.getPrograma();
        this.cmbPrograma.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbPrograma.addItem(new ENT_PROGRAMA(lista.get(i).getPf_codigo(),
                    lista.get(i).getPf_version(), lista.get(i).getPf_nombre()));
        }
    }

    private void LlenarFicha() {
        modFi.setPf_codifo(this.cmbPrograma.getItemAt(this.cmbPrograma.getSelectedIndex()).getPf_codigo());
        ArrayList<ENT_FICHA> lista = sqlFi.getFicha(modFi);
        this.cmbFicha.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbFicha.addItem(new ENT_FICHA(lista.get(i).getFi_codigo(), lista.get(i).getCf_codigo(), lista.get(i).getPf_codigo()));
        }
    }

    private void LlenarEvento() {
        ArrayList<ENT_EVENTO> lista = sqlEv.getEvento(modEv);
        this.cmbEventos.removeAllItems();
        for (int i = 0; i < lista.size(); i++) {
            this.cmbEventos.addItem(new ENT_EVENTO(lista.get(i).getEv_nombre(), lista.get(i).getEv_codigo()));

        }
    }

    private void OpcionesCarga() {
        long centro;
        long programa;
        long ficha;

        // Selecionan TRES los filtros
        if (this.rbtCentro.isSelected() && this.rbtPrograma.isSelected() && this.rbtFicha.isSelected()) {
            centro = this.cmbCentro.getItemAt(this.cmbCentro.getSelectedIndex()).getCf_codigo();
            programa = this.cmbPrograma.getItemAt(this.cmbPrograma.getSelectedIndex()).getPf_codigo();
            ficha = 2397712;
            sqlAs.Cargar(1, centro, programa, ficha, tblTabla);
        } else {

            // Seleccionan DOS filtros CENTRO Y PROGRAMA
            if (this.rbtCentro.isSelected() && this.rbtPrograma.isSelected()) {
                centro = this.cmbCentro.getItemAt(this.cmbCentro.getSelectedIndex()).getCf_codigo();
                programa = this.cmbPrograma.getItemAt(this.cmbPrograma.getSelectedIndex()).getPf_codigo();
                sqlAs.Cargar(1, centro, programa, 1, tblTabla);
            } else {

                // Selecciona UN filtro CENTRO DE FORMACION
                if (this.rbtCentro.isSelected()) {
                    centro = this.cmbCentro.getItemAt(this.cmbCentro.getSelectedIndex()).getCf_codigo();
                    sqlAs.Cargar(1, centro, 1, 1, tblTabla);
                }
            }

            // Selecciona DOS filtros PROGRAMA Y FICHA
            if (this.rbtPrograma.isSelected() && this.rbtFicha.isSelected()) {
                programa = this.cmbPrograma.getItemAt(this.cmbPrograma.getSelectedIndex()).getPf_codigo();
                ficha = 2397712;
                sqlAs.Cargar(1, 1, programa, ficha, tblTabla);
            } else {

                // Seleciona UN filtro PROGRAMA
                if (this.rbtPrograma.isSelected()) {
                    programa = this.cmbPrograma.getItemAt(this.cmbPrograma.getSelectedIndex()).getPf_codigo();
                    sqlAs.Cargar(1, 1, programa, 1, tblTabla);
                }
            }
        }
    }

    private void Clear(){
        this.txtNombreCompleto.setText("");
        this.txtDni.setText("");
    }
    
    private void AnimacionCMBbefor(JComboBox cmb){
        //cmb.setSize(250, 40);
    }
    
    private void AnimacionCMBafter(JComboBox cmb){
        //cmb.setSize(210, 30);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbModo = new javax.swing.ButtonGroup();
        BG = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        lbl_actualizar = new javax.swing.JLabel();
        rbtActualizar = new javax.swing.JRadioButton();
        rbtRgistrar = new javax.swing.JRadioButton();
        pnlAsistencia = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cmbEventos = new javax.swing.JComboBox<>();
        txtEventos = new javax.swing.JTextField();
        btnEventos = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        pnlConsulta = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        cmbCentro = new javax.swing.JComboBox<>();
        rbtPrograma = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbtCentro = new javax.swing.JRadioButton();
        txtAprendiz = new javax.swing.JTextField();
        btnAprendiz = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtFuncionario = new javax.swing.JTextField();
        btnFuncionario = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        cmbPrograma = new javax.swing.JComboBox<>();
        cmbFicha = new javax.swing.JComboBox<>();
        rbtFicha = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnAprendiz1 = new javax.swing.JButton();
        scrTabla = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();

        BG.setBackground(new java.awt.Color(250, 250, 250));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTop.setBackground(new java.awt.Color(0, 150, 70));
        pnlTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_actualizar.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lbl_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_actualizar.setText("MODO");
        lbl_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlTop.add(lbl_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 96, 35));

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
        pnlTop.add(rbtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 120, 40));

        rbtRgistrar.setBackground(new java.awt.Color(0, 150, 70));
        grbModo.add(rbtRgistrar);
        rbtRgistrar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        rbtRgistrar.setForeground(new java.awt.Color(255, 255, 255));
        rbtRgistrar.setSelected(true);
        rbtRgistrar.setText("Registrar");
        rbtRgistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtRgistrarMouseClicked(evt);
            }
        });
        pnlTop.add(rbtRgistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 110, 40));

        BG.add(pnlTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1305, 50));

        pnlAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        pnlAsistencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel3.setText("Asistencias a Evento");
        pnlAsistencia.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        pnlAsistencia.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Eventos");
        pnlAsistencia.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        cmbEventos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cmbEventos.setAutoscrolls(true);
        pnlAsistencia.add(cmbEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 30));

        txtEventos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnlAsistencia.add(txtEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 110, 30));

        btnEventos.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnEventos.setText("V");
        btnEventos.setBorder(null);
        pnlAsistencia.add(btnEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 30, 30));

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlAsistencia.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 10, 70));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setText("Confirmar Asistencia");
        pnlAsistencia.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(51, 51, 51));
        pnlAsistencia.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 610, 10));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Nombre completo");
        pnlAsistencia.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        txtNombreCompleto.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreCompleto.setEnabled(false);
        pnlAsistencia.add(txtNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 250, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("Número DNI");
        pnlAsistencia.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        txtDni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDni.setEnabled(false);
        pnlAsistencia.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 170, 30));

        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btnGuardar.setText("CONFIRMAR");
        btnGuardar.setBorder(null);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        pnlAsistencia.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 120, 30));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        pnlAsistencia.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1140, 10));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setText("Tipo de usuario");
        pnlAsistencia.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, -1, -1));

        txtRol.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtRol.setEnabled(false);
        pnlAsistencia.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 170, 30));

        BG.add(pnlAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 1240, 160));

        pnlConsulta.setBackground(new java.awt.Color(255, 255, 255));
        pnlConsulta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel8.setText("Area  Consulta");
        pnlConsulta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));
        pnlConsulta.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 340, 10));

        cmbCentro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cmbCentro.setAutoscrolls(true);
        cmbCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbCentroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmbCentroMouseExited(evt);
            }
        });
        pnlConsulta.add(cmbCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 250, 30));

        rbtPrograma.setBackground(new java.awt.Color(255, 255, 255));
        rbtPrograma.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbtPrograma.setText("Programa de formación");
        rbtPrograma.setBorder(null);
        rbtPrograma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtPrograma.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        pnlConsulta.add(rbtPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Funcionario");
        pnlConsulta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        rbtCentro.setBackground(new java.awt.Color(255, 255, 255));
        rbtCentro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbtCentro.setText("Centro de formación");
        rbtCentro.setBorder(null);
        rbtCentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtCentro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtCentro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        pnlConsulta.add(rbtCentro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        txtAprendiz.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnlConsulta.add(txtAprendiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 180, 30));

        btnAprendiz.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnAprendiz.setText("V");
        btnAprendiz.setBorder(null);
        btnAprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAprendizMouseClicked(evt);
            }
        });
        pnlConsulta.add(btnAprendiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 30, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Aprendiz");
        pnlConsulta.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        txtFuncionario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnlConsulta.add(txtFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 30));

        btnFuncionario.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnFuncionario.setText("V");
        btnFuncionario.setBorder(null);
        pnlConsulta.add(btnFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 30, 30));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlConsulta.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 10, 30));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlConsulta.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 10, 70));

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlConsulta.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 10, 30));

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel9.setText("Filtros  Consulta");
        pnlConsulta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));
        pnlConsulta.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 500, 10));

        cmbPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbProgramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmbProgramaMouseExited(evt);
            }
        });
        pnlConsulta.add(cmbPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 250, 30));

        cmbFicha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cmbFicha.setAutoscrolls(true);
        pnlConsulta.add(cmbFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 80, 130, 30));

        rbtFicha.setBackground(new java.awt.Color(255, 255, 255));
        rbtFicha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rbtFicha.setText("Ficha");
        rbtFicha.setBorder(null);
        rbtFicha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbtFicha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rbtFicha.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        pnlConsulta.add(rbtFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlConsulta.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 70, 10, 30));

        btnAprendiz1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        btnAprendiz1.setText("V");
        btnAprendiz1.setBorder(null);
        btnAprendiz1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAprendiz1MouseClicked(evt);
            }
        });
        pnlConsulta.add(btnAprendiz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, 30, 30));

        tblTabla.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Centro de formación", "Programa de Formacion", "Ficha", "Número DNI", "Nombre ", "Apellido", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTablaMouseClicked(evt);
            }
        });
        scrTabla.setViewportView(tblTabla);

        pnlConsulta.add(scrTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1240, 200));

        BG.add(pnlConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 1260, 350));

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

    private void btnAprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAprendizMouseClicked
        if (!this.txtAprendiz.getText().equals("")) {
            long usuario = Long.parseLong(this.txtAprendiz.getText());
            sqlAs.Cargar(usuario, 1, 1, 1, tblTabla);
        }
    }//GEN-LAST:event_btnAprendizMouseClicked

    private void btnAprendiz1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAprendiz1MouseClicked
        OpcionesCarga();
    }//GEN-LAST:event_btnAprendiz1MouseClicked

    private void cmbProgramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProgramaMouseEntered
        AnimacionCMBbefor(this.cmbPrograma);
    }//GEN-LAST:event_cmbProgramaMouseEntered

    private void cmbProgramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbProgramaMouseExited
        AnimacionCMBafter(this.cmbPrograma);
    }//GEN-LAST:event_cmbProgramaMouseExited

    private void cmbCentroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCentroMouseEntered
        AnimacionCMBbefor(this.cmbCentro);
    }//GEN-LAST:event_cmbCentroMouseEntered

    private void cmbCentroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCentroMouseExited
        AnimacionCMBafter(this.cmbCentro);
    }//GEN-LAST:event_cmbCentroMouseExited

    private void tblTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTablaMouseClicked
        Clear();
        int fila = this.tblTabla.getSelectedRow();
        String dni = this.tblTabla.getValueAt(fila, 3).toString();
        String nombre = this.tblTabla.getValueAt(fila, 4).toString() +" "+ this.tblTabla.getValueAt(fila, 5).toString();
        String rol = this.tblTabla.getValueAt(fila, 6).toString();
        this.txtDni.setText(dni);
        this.txtNombreCompleto.setText(nombre);
        this.txtRol.setText(rol);
        
    }//GEN-LAST:event_tblTablaMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        modAs.setEvCodigo(this.cmbEventos.getItemAt(this.cmbEventos.getSelectedIndex()).getEv_codigo());
        modAs.setUsDni(Long.parseLong(this.txtDni.getText()));
        if(this.txtRol.getText().equals("APRENDIZ")){
            sqlAs.Registrar(modAs,1);
        }
        
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void rbtActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtActualizarMouseClicked
        //Animacion(this.rbtActualizar);
    }//GEN-LAST:event_rbtActualizarMouseClicked

    private void rbtRgistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtRgistrarMouseClicked
        //Animacion(this.rbtRgistrar);
    }//GEN-LAST:event_rbtRgistrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnAprendiz;
    private javax.swing.JButton btnAprendiz1;
    private javax.swing.JButton btnEventos;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<ENT_CENTRO> cmbCentro;
    private javax.swing.JComboBox<ENT_EVENTO> cmbEventos;
    private javax.swing.JComboBox<ENT_FICHA> cmbFicha;
    private javax.swing.JComboBox<ENT_PROGRAMA> cmbPrograma;
    private javax.swing.ButtonGroup grbModo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_actualizar;
    private javax.swing.JPanel pnlAsistencia;
    private javax.swing.JPanel pnlConsulta;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JRadioButton rbtActualizar;
    private javax.swing.JRadioButton rbtCentro;
    private javax.swing.JRadioButton rbtFicha;
    private javax.swing.JRadioButton rbtPrograma;
    private javax.swing.JRadioButton rbtRgistrar;
    private javax.swing.JScrollPane scrTabla;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtAprendiz;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEventos;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtRol;
    // End of variables declaration//GEN-END:variables
}
