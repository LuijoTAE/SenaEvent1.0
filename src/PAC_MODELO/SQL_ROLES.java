package PAC_MODELO;

import PAC_ENTIDAD.ENT_ROLES;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL_ROLES extends CONEXION {

    public int VerificarRol(long dni) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select * from USUARIO where=?";
        String rol = "";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                rol = rs.getString("us_rol");
                if (rol.equals("APRENDIZ")) {
                    return 2;
                } else {
                    if (rol.equals("FUNCIONARIO")) {
                        return 3;
                    } else {
                        if (rol.equals("ADMINISTRADOR")) {
                            return 4;
                        }
                    }
                }
            }
            return 1;
        } catch (SQLException e) {
            System.out.print("\n" + e.toString());
            return 1;
        }
    }

    public boolean Registrar(ENT_ROLES mod, long dni) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "";
        int rol = VerificarRol(dni);

        try {
            if (rol == 2) {
                sql ="insert into APRENDIZ(us_dni, fi_codigo) values(?,?)";
                ps = con.prepareStatement(sql);
                ps.setLong(1, mod.getUsDni());
                ps.setLong(2, mod.getFicha());
            }
            if (rol == 3) {
                sql = "insert into FUNCIONARIO(us_dni,cargo) values(?,?)";
                ps = con.prepareStatement(sql);
                ps.setLong(1, mod.getUsDni());
                ps.setInt(2, mod.getCargo());
            }
            if (rol == 4) {
                sql ="insert into ADMINISTRADOR values(?)";
                ps = con.prepareStatement(sql);
                ps.setLong(1, mod.getUsDni());
            }

            ps.execute();
        } catch (SQLException e) {
            System.out.print("\n" + e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.print(e.toString());
            }
        }

        return false;
    }
}
