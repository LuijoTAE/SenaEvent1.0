package PAC_MODELO;

import PAC_ENTIDAD.ENT_DEPARTAMENTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SQL_DEPARTAMENTO extends CONEXION {

    public boolean Verificar(ENT_DEPARTAMENTO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "select * from DEPARTAMENTO where de_codigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getDe_codigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                mod.setDe_nombre(rs.getString("de_nombre"));
                System.out.print(mod.getDe_nombre());
                return true;
            }

            return false;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;
        }
    }
    
    public ArrayList<ENT_DEPARTAMENTO> getDepartamento(ENT_DEPARTAMENTO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from DEPARTAMENTO where pa_codigo=?";
        ArrayList<ENT_DEPARTAMENTO> lista = new ArrayList();
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getPa_codigo());
            rs = ps.executeQuery();
            while (rs.next()) {
                ENT_DEPARTAMENTO mod2 = new ENT_DEPARTAMENTO();
                mod2.setDe_nombre(rs.getString("de_nombre"));
                mod2.setDe_codigo(rs.getLong("de_codigo"));
                lista.add(mod2);
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return lista;
    }

    public boolean Registrar(ENT_DEPARTAMENTO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into DEPARTAMENTO values (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getDe_codigo());
            ps.setLong(2, mod.getPa_codigo());
            ps.setString(3, mod.getDe_nombre());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n El departamento " + mod.getDe_nombre() + " fue registrado exitosamente");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print("\n" + e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.print(e.toString());
            }
        }
    }

    public boolean Modificar(ENT_DEPARTAMENTO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update DEPARTAMENTO set de_nombre=? where de_codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mod.getDe_nombre());
            ps.setLong(2, mod.getDe_codigo());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n El departamento " + mod.getDe_nombre() + " fue modificado exitosamente");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print("\n" + e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.print(e.toString());
            }
        }
    }
}
