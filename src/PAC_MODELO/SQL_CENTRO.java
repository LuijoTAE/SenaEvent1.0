/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_MODELO;

import PAC_ENTIDAD.ENT_CENTRO;
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

/**
 *
 * @author windows21
 */
public class SQL_CENTRO {

    public ArrayList<ENT_CENTRO> getCentro() {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        ArrayList<ENT_CENTRO> lista = new ArrayList();

        try {
            ps = con.prepareStatement("select * from CENTRO_FORMACION");
            rs = ps.executeQuery();
            while (rs.next()) {
                ENT_CENTRO mod = new ENT_CENTRO();
                mod.setCf_codigo(rs.getLong("cf_codigo"));
                mod.setCf_nombre(rs.getString("cf_nombre"));
                lista.add(mod);
            }
        } catch (SQLException e) {
            System.out.print(e.toString());
        }
        return lista;
    }

    public boolean Verificar(ENT_CENTRO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "select * from CENTRO_FORMACION where cf_codigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getCf_codigo());
            rs = ps.executeQuery();

            if (rs.next()) {
                mod.setCf_nombre(rs.getString("cf_nombre"));
                System.out.print(mod.getCf_nombre());
                return true;
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print("\n"+e.toString());
            return false;
        }
    }

    public boolean Registrar(ENT_CENTRO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "insert into CENTRO_FORMACION VALUES (?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setLong(1, mod.getCf_codigo());
            ps.setLong(2, mod.getRe_codigo());
            ps.setString(3, mod.getCf_nombre());
            ps.execute();
            JOptionPane.showMessageDialog(null, " !YES!...\n La ficha " + mod.getCf_nombre() + " fue registrada exitosamente");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print("\n"+e.toString());
            return false;
        }
    }

    public boolean Modificar(ENT_CENTRO mod) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;

        String sql = "update CENTRO_FORMACION set cf_nombre =? where cf_codigo=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mod.getCf_nombre());
            ps.setLong(2, mod.getCf_codigo());
            ps.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
            System.out.print("\n"+e.toString());
            return false;
        }
    }

    public void Cargar(String condicion, JTable tabla){
        String where = "";
        if(!"".equals(condicion)){
            where = " where re_codigo = " +condicion;
        }
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection con = getConexion();
            String sql = "select REGIONAL.re_codigo, re_nombre, cf_codigo, cf_Nombre from CENTRO_FORMACION, REGIONAL where REGIONAL.re_codigo = CENTRO_FORMACION.re_codigo" ;//+where;
            // testing System.out.print(sql);
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int colum = rsmd.getColumnCount();
            modelo.addColumn("Código");
            modelo.addColumn("Regional");
            modelo.addColumn("Código");
            modelo.addColumn("Centro de formación");
            int[] anchos = {50,100,70,300};
            for(int i=0;i<colum;i++){
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while(rs.next()){
                Object[] filas = new Object[colum];
                for(int i=0;i<colum;i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "¡UPS!...\nAlgo salió mal..!\nRevisa que los campos fueron diligenciados de forma correcta");
        }
    }
}
