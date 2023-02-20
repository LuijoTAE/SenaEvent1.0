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

    
    ENT_USUARIO mod_usu = new ENT_USUARIO();
    SQL_USUARIO sql_usu = new SQL_USUARIO();
    
    ENT_ADMINISTRADOR mod_adm = new ENT_ADMINISTRADOR();
    
    public VTN_I_LOGIN() {
        initComponents();
        this.pnl_datos_personales.setVisible(false);
    }

    private void Animacio_btn(JLabel fron, JPanel back){
        back.setBackground(new Color(51,51,51));
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
        pnlL_ingresar = new javax.swing.JPanel();
        lbtL_ingresar = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
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
        btn_enviar = new javax.swing.JButton();
        txt_apellido = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        pnlRegistrar = new javax.swing.JPanel();
        txt_dni = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cmb_dni = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pnlL_validar = new javax.swing.JPanel();
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
        txt_usuario.setForeground(new java.awt.Color(102, 102, 102));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        pnlIniciarSesion.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setText("Contraseña");
        pnlIniciarSesion.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        pnlL_ingresar.setBackground(new java.awt.Color(92, 184, 92));

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

        javax.swing.GroupLayout pnlL_ingresarLayout = new javax.swing.GroupLayout(pnlL_ingresar);
        pnlL_ingresar.setLayout(pnlL_ingresarLayout);
        pnlL_ingresarLayout.setHorizontalGroup(
            pnlL_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlL_ingresarLayout.createSequentialGroup()
                .addComponent(lbtL_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlL_ingresarLayout.setVerticalGroup(
            pnlL_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlL_ingresarLayout.createSequentialGroup()
                .addComponent(lbtL_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlIniciarSesion.add(pnlL_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, 40));
        pnlIniciarSesion.add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));
        pnlIniciarSesion.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, 10));

        BG.add(pnlIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 230, 300));

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
        pnl_datos_personales.add(cmb_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 160, 30));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel16.setText("Genero");
        pnl_datos_personales.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel17.setText("Apellidos");
        pnl_datos_personales.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel18.setText("Correo electrónico");
        pnl_datos_personales.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setText("Teléfono");
        pnl_datos_personales.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        cmb_correo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_correo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@misena.edu.co" }));
        cmb_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_correoActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(cmb_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 160, 30));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel20.setText("Nombres");
        pnl_datos_personales.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btn_enviar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_enviar.setText("Enviar");
        btn_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_enviarMouseClicked(evt);
            }
        });
        pnl_datos_personales.add(btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 80, 30));
        pnl_datos_personales.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));
        pnl_datos_personales.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 160, 30));
        pnl_datos_personales.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 30));
        pnl_datos_personales.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 160, 30));
        pnl_datos_personales.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 300, 10));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnl_datos_personales.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 10, 240));

        BG.add(pnl_datos_personales, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 600, 300));

        pnlRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        pnlRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlRegistrar.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));

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
        pnlRegistrar.add(cmb_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 30));

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel12.setText("Registrarse ");
        pnlRegistrar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel21.setText("Tipo de DNI");
        pnlRegistrar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pnlL_validar.setBackground(new java.awt.Color(92, 184, 92));

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

        javax.swing.GroupLayout pnlL_validarLayout = new javax.swing.GroupLayout(pnlL_validar);
        pnlL_validar.setLayout(pnlL_validarLayout);
        pnlL_validarLayout.setHorizontalGroup(
            pnlL_validarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbtL_validar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        pnlL_validarLayout.setVerticalGroup(
            pnlL_validarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlL_validarLayout.createSequentialGroup()
                .addComponent(lbtL_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlRegistrar.add(pnlL_validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 190, -1));
        pnlRegistrar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 100, 10));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlRegistrar.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 10, 240));

        BG.add(pnlRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 230, 300));

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

    }//GEN-LAST:event_lbtL_validarMouseEntered

    private void lbtL_validarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validarMouseExited

    }//GEN-LAST:event_lbtL_validarMouseExited

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void lbtL_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseEntered

    }//GEN-LAST:event_lbtL_ingresarMouseEntered

    private void lbtL_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseExited

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
        
        if(!this.txt_usuario.getText().equals("") && !this.txt_clave.getText().equals("")){
            mod_usu.setUs_dni(Long.parseLong(this.txt_usuario.getText()));
            mod_usu.setUs_clave(this.txt_clave.getText());
            System.out.print(mod_usu.getUs_clave());
            
            
            if(sql_usu.Validar_ingreso(mod_usu)){
                
                if(mod_usu.getUs_rol().equals("FUNCIONARIO")){
                    FRM_FUN frm = new FRM_FUN();
                    frm.setVisible(true);
                }
                if(mod_usu.getUs_rol().equals("ADMINISTRADOR")){
                    FRM_ADM frm = new FRM_ADM();
                    frm.setVisible(true);
                }
                
            }
        }else{
            System.out.print("NO entró al primer if");
        }
    }//GEN-LAST:event_lbtL_ingresarMouseClicked

    private void lbtL_validarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validarMouseClicked
        
        if(!this.txt_dni.getText().equals("")){
            mod_usu.setUs_dni(Long.parseLong(this.txt_dni.getText()));
            mod_usu.setUs_tipo_dni(this.cmb_dni.getSelectedItem().toString());
            
            if(sql_usu.Verificar_usuario(mod_usu)){
                
                String usuario = String.valueOf(mod_usu.getUs_dni());
                JOptionPane.showMessageDialog(null, "El usuario | " +usuario+ " | ya exixte");
            }else{
                this.pnl_datos_personales.setVisible(true);
            }
        }else{
            JOptionPane.showConfirmDialog(null, "algo salió mal intenta otra vez", "¿Desea continuar con el proceso de pre registro?",1);
        }
    }//GEN-LAST:event_lbtL_validarMouseClicked

    private void btn_enviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enviarMouseClicked
        
        if(!this.txt_nombre.getText().equals("") && 
                !this.txt_apellido.getText().equals("") &&
                !this.txt_correo.getText().equals("") &&
                !this.txt_telefono.getText().equals("")){
            
            mod_usu.setUs_nombre(this.txt_nombre.getText());
            mod_usu.setUs_apellido(this.txt_apellido.getText());
            mod_usu.setUs_correo(this.txt_correo.getText() + 
                    this.cmb_correo.getSelectedItem().toString());
            mod_usu.setUs_telefono(Long.parseLong(this.txt_telefono.getText()));
            mod_usu.setUs_genero(this.cmb_genero.getSelectedItem().toString());
            
            if(sql_usu.Registrar(mod_usu)){
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }
        }
    }//GEN-LAST:event_btn_enviarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btn_enviar;
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
    private javax.swing.JPanel pnlIniciarSesion;
    private javax.swing.JPanel pnlL_ingresar;
    private javax.swing.JPanel pnlL_validar;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnl_datos_personales;
    private javax.swing.JPanel pnl_top;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_clave;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
