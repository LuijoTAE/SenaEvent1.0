package PAC_MODELO;

import PAC_ENTIDAD.ENT_PROGRAMA;
import static PAC_MODELO.CONEXION.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SQL_PROGRAMA extends CONEXION {

    //MOD_PROGRAMA mod = new MOD_PROGRAMA();
    public ArrayList<ENT_PROGRAMA> getPrograma() {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        ArrayList<ENT_PROGRAMA> lista = new ArrayList();

        try {
            ps = con.prepareStatement("select * from PROGRAMA_FORMACION");
            rs = ps.executeQuery();
            while (rs.next()) {
                ENT_PROGRAMA mod = new ENT_PROGRAMA();
                mod.setPf_codigo(rs.getLong("pf_codigo"));
                mod.setPf_nombre(rs.getString("pf_nombre"));
                mod.setPf_version(rs.getDouble("pf_version"));
                lista.add(mod);
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return lista;
    }

    public boolean Vereficar(ENT_PROGRAMA mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "select * from PROGRAMA_FORMACION where pf_codigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getPf_codigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                mod.setPf_nombre(rs.getString("pf_nombre"));
                return true;
            }

            return false;
        } catch (SQLException e) {
            System.out.print(e.toString());
            return false;
        }
    }

    public boolean Registrar(ENT_PROGRAMA mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into PROGRAMA_FORMACION values(?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getPf_codigo());
            ps.setString(2, mod.getPf_nombre());
            ps.setDouble(3, mod.getPf_version());
            ps.setString(4, mod.getPf_nivel());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n La ficha " + mod.getPf_nombre()+ " fue registrada exitosamente");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.print(e.toString());
            }
        }
    }
}
