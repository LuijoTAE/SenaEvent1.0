package PAC_MODELO;

import PAC_ENTIDAD.ENT_EVENTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

    public ArrayList<ENT_EVENTO> getEvento(String name) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from EVENTO";
        if (!name.equals("")) {
            sql += " where ev_nombre like '" + name + "'";
        }
        ArrayList<ENT_EVENTO> lista = new ArrayList();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ENT_EVENTO mod = new ENT_EVENTO();
                mod.setEv_codigo(rs.getLong("ev_codigo"));
                mod.setEv_nombre(rs.getString("ev_nombre"));
                lista.add(mod);
            }
        } catch (SQLException e) {
            System.out.print("\n" + e.toString());
        }
        return lista;
    }

    public void Cargar(JTable tabla, String evento, String municipio) {

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection cn = getConexion();
            String select = "select EVENTO.ev_codigo, ev_nombre, ev_fecha, ev_proposito, ci_nombre, OBJ_OPERATIVO.obo_nombre ";
            String from = " from EVENTO, OBJ_OPERATIVO, CIUDAD ";
            String where = " where OBJ_OPERATIVO.obo_nombre = EVENTO.obo_nombre AND CIUDAD.ci_codigo = EVENTO.ci_codigo ";

            if (!evento.equals("")) {
                where += " and EVENTO.ev_nombre like '" +evento+ "' ";
            }else{
                if(!municipio.equals("")){
                    where += " and CIUDAD.ci_nombre like '" +municipio+ "' ";
                }
            }

            ps = cn.prepareStatement(select + from + where);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Código");
            modelo.addColumn("Evento");
            modelo.addColumn("Fecha");
            modelo.addColumn("Proposito");
            modelo.addColumn("Municipio");
            modelo.addColumn("Objetivo operativo");

            int[] anchos = {50, 100, 50, 150, 100, 200};
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
            System.out.print("\n" + e.toString());
        }
    }
}
