package PAC_MODELO;

import static PAC_MODELO.CONEXION.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class REPORTE {

    public void loadReportHead(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String select = " select DISTINCT  ci_nombre, ev_fecha, re_nombre, "
                +" cf_Nombre,OBJ_ESTRATEGICO.oe_nombre,"
                +" OBJ_OPERATIVO.obo_nombre, ev_nombre, ev_proposito ";

        String from = " from USUARIO, FUNCIONARIO, ASISTENCIA_FUNCIONARIO,"
                +" EVENTO, CIUDAD, ADMINISTRADOR, CENTRO_FORMACION ,REGIONAL, "
                +" OBJ_OPERATIVO, OBJ_ESTRATEGICO ";
        
        String where = "where CENTRO_FORMACION.re_codigo = REGIONAL.re_codigo"
                + " and REGIONAL.us_dni = ADMINISTRADOR.us_dni"
                + " and ADMINISTRADOR.us_dni =  USUARIO.us_dni "
                + " and ADMINISTRADOR.us_dni = FUNCIONARIO.us_dni "
                + " and FUNCIONARIO.us_dni = ASISTENCIA_FUNCIONARIO.us_dni "
                + " and EVENTO.ev_codigo = ASISTENCIA_FUNCIONARIO.ev_codigo "
                + " and EVENTO.ci_codigo = CIUDAD.ci_codigo "
                + " and EVENTO.obo_nombre = OBJ_OPERATIVO.obo_nombre "
                + " and OBJ_OPERATIVO.oe_nombre = OBJ_ESTRATEGICO.oe_nombre ";
        
        
        try{
            ps = con.prepareStatement(select + from + where);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Municipio");
            modelo.addColumn("Fecha");
            modelo.addColumn("Regional");
            modelo.addColumn("Centro de formación");
            modelo.addColumn("Objetivo estratégico");
            modelo.addColumn("Objetivo Operativo");
            modelo.addColumn("Evento");
            modelo.addColumn("Proposito");
            /*
            int[] anchos = {200, 200, 50, 100, 100, 150, 100};
            for (int i = 0; i < colum; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }*/
            while (rs.next()) {
                Object[] filas = new Object[colum];
                for (int i = 0; i < colum; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        }catch(SQLException e){
            System.out.print("\n"+e.toString());
        }
    }
    
    public void loadReportBody(JTable tabla, String evento) {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String select = " select us_nombre, us_apellido, us_tipo_dni, "
                +" USUARIO.us_dni, us_genero, FICHA.fi_codigo, "
                +" fi_modalidad, pf_nombre, fi_jornada, pf_nivel, "
                +" cf_Nombre, us_correo, us_telefono";

        String from = " from USUARIO, APRENDIZ, "
                +" ASISTENCIA_APRENDIZ, EVENTO ,FICHA, "
                +" PROGRAMA_FORMACION, CENTRO_FORMACION ";
        
        String where = "where PROGRAMA_FORMACION.pf_codigo = FICHA.pf_codigo " 
                +" and CENTRO_FORMACION.cf_codigo = FICHA.cf_codigo " 
                +" and FICHA.fi_codigo = APRENDIZ.fi_codigo " 
                +" and APRENDIZ.us_dni = ASISTENCIA_APRENDIZ.us_dni " 
                +" and ASISTENCIA_APRENDIZ.ev_codigo = EVENTO.ev_codigo " 
                +" and APRENDIZ.us_dni = USUARIO.us_dni " 
                ;
        
        String Evento = "";
        if(!evento.equals("")){
            Evento = " and EVENTO.ev_nombre like '"+evento+"'";
        }
        
        try{
            ps = con.prepareStatement(select + from + where + Evento);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Tipo DNI");
            modelo.addColumn("Número DNI");
            modelo.addColumn("Género");
            modelo.addColumn("Ficha");
            modelo.addColumn("Modalidad");
            modelo.addColumn("Programa de formación");
            modelo.addColumn("Jornada");
            modelo.addColumn("Nivel");
            modelo.addColumn("Centro de formación");
            modelo.addColumn("Correo electrónico");
            modelo.addColumn("Teléfono");
            
            /*
            int[] anchos = {200, 200, 50, 100, 100, 150, 100};
            for (int i = 0; i < colum; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }*/
            while (rs.next()) {
                Object[] filas = new Object[colum];
                for (int i = 0; i < colum; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        }catch(SQLException e){
            System.out.print("\n"+e.toString());
        }
    }
}
