package PAC_MODELO;

import PAC_ENTIDAD.ENT_PAIS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SQL_PAIS extends CONEXION {

    public boolean Verificar(ENT_PAIS mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from PAIS where pa_codigo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getPaCodigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                mod.setPaNombre(rs.getString("pa_nombre"));
                JOptionPane.showMessageDialog(null, "...MODO *ACTUALIZAR* ACTIVO...");
                return true;
            }
            JOptionPane.showMessageDialog(null, "...MODO *REGISTRAR* ACTIVO...");
            return false;
        } catch (SQLException e) {
            System.out.print("\n" + e.toString());
            return false;
        }
    }

    public ArrayList<ENT_PAIS> getPais() {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from PAIS";

        ArrayList<ENT_PAIS> lista = new ArrayList();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ENT_PAIS modd = new ENT_PAIS();
                modd.setPaNombre(rs.getString("pa_nombre"));
                modd.setPaCodigo(rs.getLong("pa_codigo"));
                lista.add(modd);
            }

        } catch (SQLException e) {
            System.out.print("\n" + e.toString());
        }
        return lista;
    }
    
    public boolean Registrar (ENT_PAIS mod){
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "insert into PAIS values(?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getPaCodigo());
            ps.setLong(2, mod.getUsCodigo());
            ps.setString(3, mod.getPaNombre());
            if(!this.Verificar(mod)){
                ps.execute();
                JOptionPane.showMessageDialog(null, " !YES!...\n El país " + mod.getPaNombre()+ " fue registrado exitosamente");
            return true;
            }else{
                JOptionPane.showMessageDialog(null,"El pais ya existe");
                return false;
            }
        }catch(SQLException e){
            System.out.print("\n"+e.toString());
            return false;
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.print(e.toString());
            }
        }     
    }
}
