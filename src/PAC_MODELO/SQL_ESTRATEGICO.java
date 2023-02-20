
package PAC_MODELO;

import PAC_ENTIDAD.ENT_ESTRATEGICO;
import static PAC_MODELO.CONEXION.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class SQL_ESTRATEGICO extends CONEXION{
    
    public ArrayList<ENT_ESTRATEGICO> getEstrategico(){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        ArrayList<ENT_ESTRATEGICO> lista = new ArrayList();
        
        try{
            ps = con.prepareStatement("select * from OBJ_ESTRATEGICO");
            rs = ps.executeQuery();
            while(rs.next()){
                ENT_ESTRATEGICO mod = new ENT_ESTRATEGICO();
                mod.setOe_nombre(rs.getString("oe_nombre"));
                mod.setOe_version(rs.getDouble("oe_version"));
                lista.add(mod);
            }
        }catch(SQLException e){
            System.out.print(e.toString());
        }
        return lista;
    } 
}
