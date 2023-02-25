package PAC_MODELO;

import PAC_ENTIDAD.ENT_FICHA;
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

public class SQL_FICHA {

    public boolean Verificar(ENT_FICHA mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "select * from FICHA where fi_codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getFi_codigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                mod.setFi_codigo(rs.getLong("fi_codigo"));
                JOptionPane.showMessageDialog(null, "...MODO *ACTUALIZAR* ACTIVO...");
                return true;
            }
            JOptionPane.showMessageDialog(null, "...MODO *REGISTRAR* ACTIVO...");
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print(e.toString());
            return false;
        }
    }

    public boolean Registrar(ENT_FICHA mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into FICHA values(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getFi_codigo());
            ps.setLong(2, mod.getCf_codigo());
            ps.setLong(3, mod.getPf_codigo());
            ps.setString(4, mod.getFi_jornada());
            ps.setString(5, mod.getFi_modalidad());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n La ficha " + mod.getFi_codigo() + " fue registrada exitosamente");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.print(e.toString());
            }
        }
    }

    public void Cargar(String ProgramaName, long ProgramaCod, long Ficha, JTable tabla) {

        String programa = "";
        if (!ProgramaName.equals("")) {
            programa = " and PROGRAMA_FORMACION.pf_siglas like '" + ProgramaName + "'";
        }
        if (ProgramaCod != 1) {
            programa = " and PROGRAMA_FORMACION.pf_codigo = " + ProgramaCod;
        }
        if (Ficha != 1) {
            programa = " and FICHA.fi_codigo = " + Ficha;
        }

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = getConexion();

            String select = "select PROGRAMA_FORMACION.pf_codigo, pf_nombre, pf_nivel, FICHA.fi_codigo, fi_modalidad, fi_jornada ";
            String from = " from PROGRAMA_FORMACION, FICHA ";
            String where = " where PROGRAMA_FORMACION.pf_codigo = FICHA.pf_codigo ";

            System.out.print("\n"+programa);
            ps = con.prepareStatement(select + from + where + programa);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Código");
            modelo.addColumn("Programa de formación");
            modelo.addColumn("Nivel");
            modelo.addColumn("Ficha");
            modelo.addColumn("Modalidad");
            modelo.addColumn("Jornada");
            int[] anchos = {40, 200, 40, 40, 40, 40};
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

        }
    }

    public ArrayList<ENT_FICHA> getFicha(ENT_FICHA mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from FICHA where pf_codigo =?";
        ArrayList<ENT_FICHA> lista = new ArrayList();
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getPf_codigo());
            rs = ps.executeQuery();
            while (rs.next()) {
                ENT_FICHA modd = new ENT_FICHA();
                modd.setFi_codigo(rs.getLong("fi_codigo"));
                lista.add(modd);
            }
        } catch (SQLException e) {

            System.out.print("\n" + e.toString());
        }
        return lista;
    }
}
