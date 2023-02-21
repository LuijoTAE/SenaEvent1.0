/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_VISTA;

import PAC_VISTA.FLD_ADM.FRM_ADM;
import PAC_ENTIDAD.ENT_ADMINISTRADOR;
import PAC_ENTIDAD.ENT_USUARIO;
import PAC_MODELO.SQL_USUARIO;
import PAC_VISTA.FLD_FUN.FRM_FUN;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author windows21
 */
public class VTN_I_LOGIN extends javax.swing.JPanel {

    ENT_USUARIO modUs = new ENT_USUARIO();
    SQL_USUARIO sqlUs = new SQL_USUARIO();

    ENT_ADMINISTRADOR mod_adm = new ENT_ADMINISTRADOR();

    public VTN_I_LOGIN() {
        initComponents();
        this.pnl_datos_personales.setVisible(false);
    }

    private void AnimacioBtn1(JPanel back) {
        back.setBackground(new Color(51, 51, 51));
    }

    private void AnimacioBtn2(JPanel back) {
        back.setBackground(new Color(0, 150, 70));
    }

    private void Clear() {
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_telefono.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        pnlIniciarSesion = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pnlIngresar = new javax.swing.JPanel();
        lbtL_ingresar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtClave = new javax.swing.JPasswordField();
        pnl_top = new javax.swing.JPanel();
        pnl_datos_personales = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cmb_genero = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmb_correo = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        pnlRegistrar = new javax.swing.JPanel();
        txt_dni = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmb_dni = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pnlValidar = new javax.swing.JPanel();
        lbtL_validar = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        pnlIniciarSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel10.setText("Iniciar Sesión");
        pnlIniciarSesion.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setText("Usuario");
        pnlIniciarSesion.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        pnlIniciarSesion.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setText("Contraseña");
        pnlIniciarSesion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        pnlIngresar.setBackground(new java.awt.Color(0, 150, 70));

        lbtL_ingresar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbtL_ingresar.setForeground(new java.awt.Color(255, 255, 255));
        lbtL_ingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtL_ingresar.setText("INGRESAR");
        lbtL_ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbtL_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbtL_ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbtL_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbtL_ingresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlIngresarLayout = new javax.swing.GroupLayout(pnlIngresar);
        pnlIngresar.setLayout(pnlIngresarLayout);
        pnlIngresarLayout.setHorizontalGroup(
            pnlIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresarLayout.createSequentialGroup()
                .addComponent(lbtL_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlIngresarLayout.setVerticalGroup(
            pnlIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresarLayout.createSequentialGroup()
                .addComponent(lbtL_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlIniciarSesion.add(pnlIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 40));
        pnlIniciarSesion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, 10));

        txtClave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClave.setText("jPasswordField1");
        pnlIniciarSesion.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, 30));

        BG.add(pnlIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 240, 300));

        pnl_top.setBackground(new java.awt.Color(0, 150, 70));

        javax.swing.GroupLayout pnl_topLayout = new javax.swing.GroupLayout(pnl_top);
        pnl_top.setLayout(pnl_topLayout);
        pnl_topLayout.setHorizontalGroup(
            pnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        pnl_topLayout.setVerticalGroup(
            pnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        BG.add(pnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 50));

        pnl_datos_personales.setBackground(new java.awt.Color(250, 250, 250));
        pnl_datos_personales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel15.setText("Formulario Solicitud De Registro");
        pnl_datos_personales.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        cmb_genero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "NB" }));
        cmb_genero.setBorder(null);
        cmb_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_generoActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(cmb_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 190, 30));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setText("Genero");
        pnl_datos_personales.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setText("Apellidos");
        pnl_datos_personales.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setText("Correo electrónico");
        pnl_datos_personales.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setText("Teléfono");
        pnl_datos_personales.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        cmb_correo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_correo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@misena.edu.co" }));
        cmb_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_correoActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(cmb_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 190, 30));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setText("Nombres");
        pnl_datos_personales.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txt_apellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_datos_personales.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, 30));

        txt_telefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_datos_personales.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 190, 30));

        txt_nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_datos_personales.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 30));

        txt_correo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnl_datos_personales.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 190, 30));
        pnl_datos_personales.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 370, 10));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_datos_personales.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 10, 240));

        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        BG.add(pnl_datos_personales, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 670, 300));

        pnlRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_dni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        pnlRegistrar.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setText("Número DNI");
        pnlRegistrar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        cmb_dni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_dni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Tarjeta de identidad", "DNI extranjero" }));
        cmb_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_dniActionPerformed(evt);
            }
        });
        pnlRegistrar.add(cmb_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel12.setText("Registrarse ");
        pnlRegistrar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel21.setText("Tipo de DNI");
        pnlRegistrar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pnlValidar.setBackground(new java.awt.Color(0, 150, 70));

        lbtL_validar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbtL_validar.setForeground(new java.awt.Color(255, 255, 255));
        lbtL_validar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbtL_validar.setText("VALIDAR");
        lbtL_validar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbtL_validar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbtL_validarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbtL_validarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbtL_validarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlValidarLayout = new javax.swing.GroupLayout(pnlValidar);
        pnlValidar.setLayout(pnlValidarLayout);
        pnlValidarLayout.setHorizontalGroup(
            pnlValidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtL_validar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        pnlValidarLayout.setVerticalGroup(
            pnlValidarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValidarLayout.createSequentialGroup()
                .addComponent(lbtL_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlRegistrar.add(pnlValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 40));
        pnlRegistrar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 100, 10));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlRegistrar.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 10, 240));

        BG.add(pnlRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 240, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbtL_validarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validarMouseEntered
        this.AnimacioBtn1(this.pnlValidar);
    }//GEN-LAST:event_lbtL_validarMouseEntered

    private void lbtL_validarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validarMouseExited
        this.AnimacioBtn2(this.pnlValidar);
    }//GEN-LAST:event_lbtL_validarMouseExited

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void lbtL_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseEntered
        this.AnimacioBtn1(this.pnlIngresar);
    }//GEN-LAST:event_lbtL_ingresarMouseEntered

    private void lbtL_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseExited
        this.AnimacioBtn2(this.pnlIngresar);
    }//GEN-LAST:event_lbtL_ingresarMouseExited

    private void cmb_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_dniActionPerformed

    private void cmb_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_generoActionPerformed

    private void cmb_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_correoActionPerformed

    private void lbtL_ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseClicked

        if (!this.txt_usuario.getText().equals("") && !this.txtClave.getText().equals("")) {
            modUs.setUs_dni(Long.parseLong(this.txt_usuario.getText()));
            modUs.setUs_clave(this.txtClave.getText());
            System.out.print(modUs.getUs_clave());

            if (sqlUs.Validar_ingreso(modUs)) {

                if (modUs.getUs_rol().equals("FUNCIONARIO")) {
                    FRM_FUN frm = new FRM_FUN();
                    frm.setVisible(true);
                }
                if (modUs.getUs_rol().equals("ADMINISTRADOR")) {
                    FRM_ADM frm = new FRM_ADM();
                    frm.setVisible(true);
                }

            }
        } else {
            System.out.print("NO entró al primer if");
        }
    }//GEN-LAST:event_lbtL_ingresarMouseClicked

    private void lbtL_validarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validarMouseClicked

        if (!this.txt_dni.getText().equals("")) {
            modUs.setUs_dni(Long.parseLong(this.txt_dni.getText()));
            modUs.setUs_tipo_dni(this.cmb_dni.getSelectedItem().toString());

            if (sqlUs.Verificar_usuario(modUs)) {

                String usuario = String.valueOf(modUs.getUs_dni());
                JOptionPane.showMessageDialog(null, "El usuario | " + usuario + " | ya exixte");
            } else {
                this.pnl_datos_personales.setVisible(true);
            }
        } else {
            JOptionPane.showConfirmDialog(null, "algo salió mal intenta otra vez", "¿Desea continuar con el proceso de pre registro?", 1);
        }
    }//GEN-LAST:event_lbtL_validarMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro que deseas continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (option != JOptionPane.YES_OPTION) {
            Clear();
        } else {
            modUs.setUs_nombre(this.txt_nombre.getText());
            modUs.setUs_apellido(this.txt_apellido.getText());
            modUs.setUs_telefono(Long.parseLong(this.txt_telefono.getText()));
            modUs.setUs_genero(this.cmb_genero.getSelectedItem().toString());
            modUs.setUs_correo(this.txt_correo.getText() + this.cmb_correo.getSelectedItem().toString());

            if (!sqlUs.Registrar(modUs)) {
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmb_correo;
    private javax.swing.JComboBox<String> cmb_dni;
    private javax.swing.JComboBox<String> cmb_genero;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbtL_ingresar;
    private javax.swing.JLabel lbtL_validar;
    private javax.swing.JPanel pnlIngresar;
    private javax.swing.JPanel pnlIniciarSesion;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlValidar;
    private javax.swing.JPanel pnl_datos_personales;
    private javax.swing.JPanel pnl_top;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
