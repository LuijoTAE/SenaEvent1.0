/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_ENTIDAD;

public class ENT_REGIONAL {

    private long re_codigo;
    private long us_dni;
    private String re_nombre;
    
    public ENT_REGIONAL(){
        
    }
    
    public ENT_REGIONAL(String re_nombre, long re_codigo){
        this.re_nombre = re_nombre;
        this.re_codigo = re_codigo;
    }

    public long getRe_codigo() {
        return re_codigo;
    }

    public void setRe_codigo(long re_codigo) {
        this.re_codigo = re_codigo;
    }

    public long getUs_dni() {
        return us_dni;
    }

    public void setUs_dni(long us_dni) {
        this.us_dni = us_dni;
    }

    public String getRe_nombre() {
        return re_nombre;
    }

    public void setRe_nombre(String re_nombre) {
        this.re_nombre = re_nombre;
    }
    
    public String toString() {
        return re_nombre;
    }

}
