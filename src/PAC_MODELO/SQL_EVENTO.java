package PAC_MODELO;

import PAC_ENTIDAD.ENT_EVENTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SQL_EVENTO extends CONEXION {

    public boolean Verificar(ENT_EVENTO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from EVENTO where ev_codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getEv_codigo());
            rs = ps.executeQuery();
            if (rs.next()) {
                mod.setEv_codigo(rs.getLong("ev_codigo"));
                mod.setEv_nombre(rs.getString("ev_nombre"));
                JOptionPane.showMessageDialog(null, "El código " + mod.getEv_codigo() + " está siendo usado por el evento " + mod.getEv_nombre());
                return true;
            }
            return false;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;
        }
    }

    public boolean Registrar(ENT_EVENTO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into EVENTO values(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getEv_codigo());
            ps.setString(2, mod.getObo_nombre());
            ps.setDouble(3, mod.getObo_version());
            ps.setLong(4, mod.getCi_codigo());
            ps.setString(5, mod.getEv_nombre());
            ps.setString(6, mod.getEv_fecha());
            ps.setString(7, mod.getEv_proposito());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;
        }
    }

    public ArrayList<ENT_EVENTO> getEvento(ENT_EVENTO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from EVENTO";
        ArrayList<ENT_EVENTO> lista = new ArrayList();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ENT_EVENTO modd = new ENT_EVENTO();
                modd.setEv_codigo(rs.getLong("ev_codigo"));
                modd.setEv_nombre(rs.getString("ev_nombre"));
                lista.add(modd);
            }
        } catch (SQLException e) {
            System.out.print("\n" + e.toString());
        }
        return lista;
    }
}
