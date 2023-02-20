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
        jLabel12 = new javax.swing.JLabel();
        pnlL_validar = new javax.swing.JPanel();
        lbtL_validar = new javax.swing.JLabel();
        pnl_bar_left = new javax.swing.JPanel();
        pnl_rigch2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        pnlL_ingresar = new javax.swing.JPanel();
        lbtL_ingresar = new javax.swing.JLabel();
        pnl_top = new javax.swing.JPanel();
        txt_dni = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        cmb_dni = new javax.swing.JComboBox<>();
        pnl_datos_personales = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        cmb_genero = new javax.swing.JComboBox<>();
        txt_nombre = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        cmb_correo = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        btn_enviar = new javax.swing.JButton();

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel12.setText("Registrarse ");
        BG.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

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
            .addGroup(pnlL_validarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtL_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlL_validarLayout.setVerticalGroup(
            pnlL_validarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlL_validarLayout.createSequentialGroup()
                .addComponent(lbtL_validar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BG.add(pnlL_validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        pnl_bar_left.setBackground(new java.awt.Color(250, 250, 250));

        pnl_rigch2.setBackground(new java.awt.Color(255, 255, 255));
        pnl_rigch2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        jLabel10.setText("Iniciar Sesión");
        pnl_rigch2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel11.setText("Usuario");
        pnl_rigch2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(102, 102, 102));
        txt_usuario.setBorder(null);
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        pnl_rigch2.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, 40));
        pnl_rigch2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 260, 10));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel14.setText("Contraseña");
        pnl_rigch2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txt_clave.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_clave.setForeground(new java.awt.Color(102, 102, 102));
        txt_clave.setBorder(null);
        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });
        pnl_rigch2.add(txt_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 260, 40));
        pnl_rigch2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 260, 10));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlL_ingresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbtL_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
        );
        pnlL_ingresarLayout.setVerticalGroup(
            pnlL_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlL_ingresarLayout.createSequentialGroup()
                .addComponent(lbtL_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_rigch2.add(pnlL_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 351, 260, 40));

        javax.swing.GroupLayout pnl_bar_leftLayout = new javax.swing.GroupLayout(pnl_bar_left);
        pnl_bar_left.setLayout(pnl_bar_leftLayout);
        pnl_bar_leftLayout.setHorizontalGroup(
            pnl_bar_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bar_leftLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_rigch2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        pnl_bar_leftLayout.setVerticalGroup(
            pnl_bar_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bar_leftLayout.createSequentialGroup()
                .addComponent(pnl_rigch2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        BG.add(pnl_bar_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 390, 490));

        pnl_top.setBackground(new java.awt.Color(92, 184, 92));

        javax.swing.GroupLayout pnl_topLayout = new javax.swing.GroupLayout(pnl_top);
        pnl_top.setLayout(pnl_topLayout);
        pnl_topLayout.setHorizontalGroup(
            pnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        pnl_topLayout.setVerticalGroup(
            pnl_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        BG.add(pnl_top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 70));

        txt_dni.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_dni.setForeground(new java.awt.Color(102, 102, 102));
        txt_dni.setText("Ingrese su usuario...");
        txt_dni.setBorder(null);
        txt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniActionPerformed(evt);
            }
        });
        BG.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 240, 40));
        BG.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 240, 10));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel13.setText("Número DNI");
        BG.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        cmb_dni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_dni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Tarjeta de identidad", "DNI extranjero" }));
        cmb_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_dniActionPerformed(evt);
            }
        });
        BG.add(cmb_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 240, 40));

        pnl_datos_personales.setBackground(new java.awt.Color(250, 250, 250));
        pnl_datos_personales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel15.setText("Formulario Solicitud De Registro");
        pnl_datos_personales.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cmb_genero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F", "NB" }));
        cmb_genero.setBorder(null);
        cmb_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_generoActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(cmb_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 240, 40));

        txt_nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombre.setText("Ingrese su usuario...");
        txt_nombre.setBorder(null);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 240, 40));
        pnl_datos_personales.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 10));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel16.setText("Genero");
        pnl_datos_personales.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel17.setText("Apellidos");
        pnl_datos_personales.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txt_apellido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellido.setText("Ingrese su usuario...");
        txt_apellido.setBorder(null);
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, 40));
        pnl_datos_personales.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 240, 10));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel18.setText("Correo electrónico");
        pnl_datos_personales.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        txt_telefono.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(102, 102, 102));
        txt_telefono.setText("Ingrese su usuario...");
        txt_telefono.setBorder(null);
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 40));
        pnl_datos_personales.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 240, 10));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel19.setText("Teléfono");
        pnl_datos_personales.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txt_correo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(102, 102, 102));
        txt_correo.setText("Ingrese su usuario...");
        txt_correo.setBorder(null);
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 240, 40));
        pnl_datos_personales.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 240, 10));

        cmb_correo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmb_correo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@misena.edu.co" }));
        cmb_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_correoActionPerformed(evt);
            }
        });
        pnl_datos_personales.add(cmb_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 240, 40));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel20.setText("Nombres");
        pnl_datos_personales.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btn_enviar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_enviar.setText("Enviar");
        btn_enviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_enviarMouseClicked(evt);
            }
        });
        pnl_datos_personales.add(btn_enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 80, 30));

        BG.add(pnl_datos_personales, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 570, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbtL_validarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validarMouseEntered

    }//GEN-LAST:event_lbtL_validarMouseEntered

    private void lbtL_validarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_validarMouseExited

    }//GEN-LAST:event_lbtL_validarMouseExited

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_claveActionPerformed

    private void lbtL_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseEntered

    }//GEN-LAST:event_lbtL_ingresarMouseEntered

    private void lbtL_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbtL_ingresarMouseExited

    }//GEN-LAST:event_lbtL_ingresarMouseExited

    private void txt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dniActionPerformed

    private void cmb_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_dniActionPerformed

    private void cmb_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_generoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbtL_ingresar;
    private javax.swing.JLabel lbtL_validar;
    private javax.swing.JPanel pnlL_ingresar;
    private javax.swing.JPanel pnlL_validar;
    private javax.swing.JPanel pnl_bar_left;
    private javax.swing.JPanel pnl_datos_personales;
    private javax.swing.JPanel pnl_rigch2;
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
