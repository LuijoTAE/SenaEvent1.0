package PAC_MODELO;

import PAC_ENTIDAD.ENT_CIUDAD;
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

public class SQL_CIUDAD extends CONEXION {

    public boolean Verificar(ENT_CIUDAD mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "select * from CIUDAD where ci_codigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getCi_codigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                mod.setCi_nombre(rs.getString("ci_nombre"));
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

    public ArrayList<ENT_CIUDAD> getCiudad(ENT_CIUDAD mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from CIUDAD ";
        String where = "";
        if(mod.getDe_codigo() != 0){
           where  = " where de_codigo=?";
        }
        
        ArrayList<ENT_CIUDAD> lista = new ArrayList();
        try {
            ps = con.prepareStatement(sql + where);
            if (mod.getDe_codigo() != 0) {
                ps.setLong(1, mod.getDe_codigo());
            }
            rs = ps.executeQuery();
            while (rs.next()) {

                ENT_CIUDAD modd = new ENT_CIUDAD();
                modd.setCi_nombre(rs.getString("ci_nombre"));
                modd.setCi_codigo(rs.getLong("ci_codigo"));
                lista.add(modd);
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return lista;
    }

    public boolean Registrar(ENT_CIUDAD mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into CIUDAD values (?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getCi_codigo());
            ps.setLong(2, mod.getDe_codigo());
            ps.setString(3, mod.getCi_nombre());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n El municipio " + mod.getCi_nombre() + " fue registrado exitosamente");
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

    public boolean Modificar(ENT_CIUDAD mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "update CIUDAD set ci_nombre=? where ci_codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mod.getCi_nombre());
            ps.setLong(2, mod.getCi_codigo());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n El municipio " + mod.getCi_nombre() + " fue registrado exitosamente");
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

    public void Cargar(JTable tabla, String Departamento, String Municipio) {

        String departamento = "";
        String municipio = "";
        if (!Departamento.equals("")) {
            departamento = " and de_nombre like '" + Departamento +"'";
        }
        if (!Municipio.equals("")) {
            municipio = " and ci_nombre like '" + Municipio + "'";
        }

        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = getConexion();
            String select = "select PAIS.pa_codigo, PAIS.pa_nombre, DEPARTAMENTO.de_codigo, DEPARTAMENTO.de_nombre, CIUDAD.ci_codigo, CIUDAD.ci_nombre";
            String from = " from PAIS, DEPARTAMENTO, CIUDAD ";

            String where = "where PAIS.pa_codigo = DEPARTAMENTO.pa_codigo and DEPARTAMENTO.de_codigo = CIUDAD.de_codigo ";
            ps = con.prepareStatement(select + from + where + departamento + municipio);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Código");
            modelo.addColumn("País");
            modelo.addColumn("Código");
            modelo.addColumn("Departamento");
            modelo.addColumn("Código");
            modelo.addColumn("Municipio");
            int[] anchos = {50, 100, 50, 100, 50, 100};
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
