/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_ENTIDAD;

/**
 *
 * @author windows21
 */
public class ENT_CENTRO {
    
    private long cf_codigo;
    private long re_codigo;
    private String cf_nombre;
    
    public ENT_CENTRO(){
        
    }
    
    public ENT_CENTRO(String cf_nombre, long cf_codigo){
        this.cf_nombre = cf_nombre;
        this.cf_codigo = cf_codigo;
        
    }

    public long getCf_codigo() {
        return cf_codigo;
    }

    public void setCf_codigo(long cf_codigo) {
        this.cf_codigo = cf_codigo;
    }

    public long getRe_codigo() {
        return re_codigo;
    }

    public void setRe_codigo(long re_codigo) {
        this.re_codigo = re_codigo;
    }

    public String getCf_nombre() {
        return cf_nombre;
    }

    public void setCf_nombre(String cf_nombre) {
        this.cf_nombre = cf_nombre;
    }
    
    public String toString() {
        return cf_nombre;
    }
}
