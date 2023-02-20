/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_MODELO;

import PAC_ENTIDAD.ENT_REGIONAL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
                return true;
            }

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
}
