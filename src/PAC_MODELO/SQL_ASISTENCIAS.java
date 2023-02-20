package PAC_MODELO;

import PAC_ENTIDAD.ENT_ASISTENCIAS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SQL_ASISTENCIAS extends CONEXION {

    public boolean Registrar(ENT_ASISTENCIAS ent, int opcion) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "";
        if(opcion == 1){
            sql = "insert into ASISTENCIA_APRENDIZ values(?,?)";
        }else{
            sql = "insert into ASISTENCIA_FUNCIONARIO values(?,?)";
        }
        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, ent.getEvCodigo());
            ps.setLong(2, ent.getUsDni());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n La asistencia fue registrada exitosamente");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print("\n" + e.toString());
            return false;
        }
    }

    public void Cargar(long Usuario, long Centro, long Programa, long Ficha, JTable tabla) {
        String Cfwhere = "";
        String Pfwhere = "";
        String Fiwhere = "";
        String Uswhere = "";
        if (Centro != 1) {
            Cfwhere = " and CENTRO_FORMACION.cf_codigo =" + Centro;
        }
        if (Programa != 1) {
            Pfwhere = " and PROGRAMA_FORMACION.pf_codigo =" + Programa;
        }
        if (Ficha != 1) {
            Fiwhere = " and FICHA.fi_codigo =" + Ficha;
        }
        if (Usuario != 1) {
            Uswhere = " and APRENDIZ.us_dni =" + Usuario;
        }
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = getConexion();
            String select = " select cf_Nombre, pf_nombre, FICHA.fi_codigo, USUARIO.us_dni, us_nombre, us_apellido, us_rol ";
            String from = " from USUARIO, APRENDIZ, FICHA, PROGRAMA_FORMACION, CENTRO_FORMACION ";
            String where = " where USUARIO.us_dni = APRENDIZ.us_dni and APRENDIZ.fi_codigo = FICHA.fi_codigo and FICHA.pf_codigo = PROGRAMA_FORMACION.pf_codigo and FICHA.cf_codigo = CENTRO_FORMACION.cf_codigo ";
            System.out.print("\n" + select + "\n" + from + "\n" + where + "\n" + Uswhere + "\n" + Cfwhere + "\n" + Pfwhere + "\n" + Fiwhere);
            ps = con.prepareStatement(select + from + where + Uswhere + Cfwhere + Pfwhere + Fiwhere);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Centro de formación");
            modelo.addColumn("Programa de formación");
            modelo.addColumn("Ficha");
            modelo.addColumn("Número DNI");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Tipo de usuario");
            int[] anchos = {200, 200, 50, 100, 100, 150, 100};
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
