
package PAC_MODELO;

import PAC_ENTIDAD.ENT_CARGOS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SQL_CARGOS extends CONEXION{
    
    public ArrayList<ENT_CARGOS> getCargos(){
        
        ArrayList<ENT_CARGOS> lista = new ArrayList();
        
        PreparedStatement ps = null;
        Connection cn = getConexion();
        ResultSet rs = null;
        String sql = "select * from CARGOS";
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ENT_CARGOS mod = new ENT_CARGOS();
                mod.setIdCargo(rs.getInt("id"));
                mod.setNombre(rs.getString("nombre"));
                mod.setSiglas(rs.getString("siglas"));
                lista.add(mod);
            }
        }catch(SQLException e){
            System.out.print("\n" + e.toString());
        }
        return lista;
    }
}
