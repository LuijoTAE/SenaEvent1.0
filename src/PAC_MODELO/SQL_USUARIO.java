/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_MODELO;

import PAC_ENTIDAD.ENT_USUARIO;
import static PAC_MODELO.CONEXION.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author windows21
 */
public class SQL_USUARIO extends CONEXION {

    public boolean Validar_ingreso(ENT_USUARIO mod_usu) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "SELECT us_dni,us_clave, us_rol FROM USUARIO WHERE us_dni =?";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod_usu.getUs_dni());
            rs = ps.executeQuery();

            if (rs.next()) {

                if (mod_usu.getUs_clave().equals(rs.getString("us_clave"))) {
                    mod_usu.setUs_rol(rs.getString("us_rol"));
                    JOptionPane.showMessageDialog(null, "Bienvenido \n" + mod_usu.getUs_rol());
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡...Usuario o contraseña incorrecta...!");
            System.out.print(e.toString());
            return false;
        }
    }

    public boolean Verificar_usuario(ENT_USUARIO us) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "SELECT * FROM USUARIO WHERE us_dni =?";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, us.getUs_dni());
            rs = ps.executeQuery();

            if (rs.next()) {
                us.setUs_dni(rs.getLong("us_dni"));
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;
        }
    }

    public boolean Registrar(ENT_USUARIO us) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO USUARIO (us_dni, us_telefono, us_tipo_dni, us_nombre, us_apellido, us_genero, us_correo, us_clave, us_rol) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, us.getUs_dni());
            ps.setLong(2, us.getUs_telefono());
            ps.setString(3, us.getUs_tipo_dni());
            ps.setString(4, us.getUs_nombre());
            ps.setString(5, us.getUs_apellido());
            ps.setString(6, us.getUs_genero());
            ps.setString(7, us.getUs_correo());
            ps.setString(8, us.getUs_clave());
            ps.setString(9, us.getUs_rol());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean Modificar(ENT_USUARIO us) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE USUARIO SET us_clave=?, us_rol=? WHERE us_dni=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, us.getUs_clave());
            ps.setString(2, us.getUs_rol());
            ps.setLong(3, us.getUs_dni());
            ps.execute();
            JOptionPane.showMessageDialog(null, "!YES!...\nEl usuario " + us.getUs_nombre() + " fue modificado exitosamente");
            return true;

        } catch (SQLException e) {
            System.out.print("\n" + e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public ResultSet Buscar(ENT_USUARIO us) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "SELECT * FROM USUARIO WHERE us_dni=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, us.getUs_dni());
            rs = ps.executeQuery();

            if (rs.next()) {
                us.setUs_dni(Long.parseLong(rs.getString("us_dni")));
                us.setUs_telefono(Long.parseLong(rs.getString("us_telefono")));
                us.setUs_tipo_dni(rs.getString("us_tipo_dni"));
                us.setUs_nombre(rs.getString("us_nombre"));
                us.setUs_apellido(rs.getString("us_apellido"));
                us.setUs_genero(rs.getString("us_genero"));
                us.setUs_correo(rs.getString("us_correo"));
                us.setUs_clave(rs.getString("us_clave"));
                us.setUs_rol(rs.getString("us_rol"));
                JOptionPane.showMessageDialog(null, us.getUs_nombre());
                return rs;
            }
            return null;

        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public ArrayList<ENT_USUARIO> getUsuario() {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        ArrayList<ENT_USUARIO> Listar_usu = new ArrayList();

        try {

            ps = con.prepareStatement("SELECT * FROM USUARIO WHERE us_rol ='ADMINISTRADOR'");
            rs = ps.executeQuery();

            while (rs.next()) {
                ENT_USUARIO mod_usu = new ENT_USUARIO();
                mod_usu.setUs_nombre(rs.getString("us_nombre"));
                mod_usu.setUs_apellido(rs.getString("us_apellido"));
                mod_usu.setUs_dni(rs.getLong("us_dni"));
                Listar_usu.add(mod_usu);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SQL_USUARIO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar_usu;
    }

    public void ConsultarA(int opcion, long condicion, JTable tabla) {
        String where = " where us_rol is null";

        if (opcion == 3) {
            if (condicion != 1) {
                where = " where us_rol is null and us_dni=" + condicion;
            } else {
                where = " where us_rol is null";
            }

        }
        if (opcion == 1) {
            if (condicion != 1) {
                where = " where  us_rol like 'APRENDIZ' and us_dni=" + condicion;
            } else {
                where = " where  us_rol like 'APRENDIZ'";
            }

        }
        if (opcion == 2) {
            if (condicion != 1) {
                where = " where  us_rol like 'FUNCIONARIO' and us_dni=" + condicion;
            } else {
                where = " where  us_rol like 'FUNCIONARIO'";
            }
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = getConexion();
            String sql = "select us_dni, us_nombre, us_apellido, us_correo, us_rol from USUARIO " + where;
            // testing System.out.print("\n"+sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Número DNI");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Correo");
            modelo.addColumn("Rol");
            int[] anchos = {40, 40, 50, 100, 40};
            for (int i = 0; i < colum; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while (rs.next()) {
                Object[] filas = new Object[colum];
                for (int i = 0; i < colum; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {

            System.out.print(e.toString());
        }
    }
}
