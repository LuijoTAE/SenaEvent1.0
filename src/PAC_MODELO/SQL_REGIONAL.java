/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_MODELO;

import PAC_ENTIDAD.ENT_REGIONAL;
import static PAC_MODELO.CONEXION.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author windows21
 */
public class SQL_REGIONAL extends CONEXION {

    ENT_REGIONAL mod = new ENT_REGIONAL();

    public boolean Verificar(ENT_REGIONAL mod) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "SELECT * FROM REGIONAL WHERE re_codigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getRe_codigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                mod.setRe_nombre(rs.getString("re_nombre"));
                JOptionPane.showMessageDialog(null, "...MODO *ACTUALIZAR* ACTIVO...");
                return true; 
            }
            JOptionPane.showMessageDialog(null, "...MODO *REGISTRAR* ACTIVO...");
            return false;
        } catch (SQLException e) {

            System.out.print(e.toString());
            return false;
        }
    }

    public boolean Registrar(ENT_REGIONAL mod, long usu) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "insert into REGIONAL (re_codigo, us_dni, re_nombre) VALUES (?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getRe_codigo());
            ps.setLong(2, usu);
            ps.setString(3, mod.getRe_nombre());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n La ficha " + mod.getRe_nombre() + " fue registrada exitosamente");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " !UPS! \n Algo salió mal verificar que el si hace falat un campo por llenar");
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

    public boolean Modificar(ENT_REGIONAL mod) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "update REGIONAL set re_nombre =? where re_codigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mod.getRe_nombre());
            ps.setLong(2, mod.getRe_codigo());
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

    public ArrayList<ENT_REGIONAL> getRegional() {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        ArrayList<ENT_REGIONAL> listar = new ArrayList();

        try {
            ps = con.prepareStatement("select * from REGIONAL");
            rs = ps.executeQuery();
            while (rs.next()) {
                ENT_REGIONAL mod = new ENT_REGIONAL();
                mod.setRe_nombre(rs.getString("re_nombre"));
                mod.setRe_codigo(rs.getLong("re_codigo"));
                listar.add(mod);
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }

        return listar;
    }

    public void Cargar(long condicion, JTable tabla){
        String Where = "";
        if(condicion != 1){
            Where = " and re_codigo =" +condicion;
        }
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = getConexion();
            String select = "select USUARIO.us_dni, us_nombre, REGIONAL.re_codigo, re_nombre ";
            String from = "from USUARIO, ADMINISTRADOR, REGIONAL ";
            String where = "where USUARIO.us_dni = ADMINISTRADOR.us_dni and ADMINISTRADOR.us_dni = REGIONAL.us_dni " +Where;
            ps = con.prepareStatement(select + from + where);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Número DNI");
            modelo.addColumn("Administrador");
            modelo.addColumn("Código");
            modelo.addColumn("Regional");
            int[] anchos = {100, 100, 70, 300};
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
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
        }
    }
    
}
