/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAC_ENTIDAD;


public class ENT_PROGRAMA {
    
    private long pf_codigo;
    private double pf_version;
    private String pf_nombre;
    private String pf_nivel;
    
    public ENT_PROGRAMA(){
        
    }
    
    public ENT_PROGRAMA(long pf_codigo, double pf_versio, String pf_nombre){
        this.pf_codigo = pf_codigo;
        this.pf_version = pf_versio;
        this.pf_nombre = pf_nombre;
    }
    
    public String toString(){
        return pf_nombre +" - "+ pf_version;
    }

    public String getPf_nivel() {
        return pf_nivel;
    }

    public void setPf_nivel(String pf_nivel) {
        this.pf_nivel = pf_nivel;
    }

    public long getPf_codigo() {
        return pf_codigo;
    }

    public void setPf_codigo(long pf_codigo) {
        this.pf_codigo = pf_codigo;
    }

    public double getPf_version() {
        return pf_version;
    }

    public void setPf_version(double pf_versio) {
        this.pf_version = pf_versio;
    }

    public String getPf_nombre() {
        return pf_nombre;
    }

    public void setPf_nombre(String pf_nombre) {
        this.pf_nombre = pf_nombre;
    }
}
