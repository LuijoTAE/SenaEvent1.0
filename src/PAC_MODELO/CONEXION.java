
package PAC_MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class CONEXION {
    
   public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://localhost:1433; "
                + "database=SE_DB2; "
                + "user=ADM; "
                + "password=123; "
                + "loginTimeout=30";
        
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(SQLException e){
            System.out.print(e.toString());
            return null;
        }
    }
}
