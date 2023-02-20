
package PAC_MODELO;

import PAC_ENTIDAD.ENT_OPERATIVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SQL_OPERATIVO extends CONEXION{
    
    public ArrayList<ENT_OPERATIVO> getOperativo(ENT_OPERATIVO mod){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from OBJ_OPERATIVO where oe_nombre =? and oe_version=?";
        ArrayList<ENT_OPERATIVO> lista = new ArrayList();
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, mod.getOe_nombre());
            ps.setDouble(2, mod.getOe_version());
            rs = ps.executeQuery();
            while(rs.next()){
                ENT_OPERATIVO modd = new ENT_OPERATIVO();
                modd.setObo_nombre(rs.getString("obo_nombre"));
                modd.setObo_version(rs.getDouble("obo_version"));
                //System.out.print(mod);
                lista.add(modd);
            }
        }catch(SQLException e){
            System.out.print("\n"+e.toString());
        }
        return lista;
    }
    
    public boolean Registrar(ENT_OPERATIVO mod){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "insert into OBJ_OPERATIVO values(?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, mod.getObo_nombre());
            ps.setDouble(2, mod.getObo_version());
            ps.setString(3, mod.getOe_nombre());
            ps.setDouble(4, mod.getOe_version());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.print(e.toString());
            return false;
        }
    }
    
}
