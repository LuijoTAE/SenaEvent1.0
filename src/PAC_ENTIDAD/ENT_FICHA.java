
package PAC_ENTIDAD;


public class ENT_FICHA {
    
    private long fi_codigo;
    private long cf_codigo;
    private long pf_codigo;
    private String fi_jornada;
    private String fi_modalidad;

    public ENT_FICHA(){
        
    }
    
    public ENT_FICHA(long fi_codigo, long cf_codigo, long pf_codigo){
        this.fi_codigo = fi_codigo;
        this.cf_codigo = cf_codigo;
        this.pf_codigo = pf_codigo;
    }
    
    public String toString(){
        return  "" + fi_codigo;
    }
    public long getFi_codigo() {
        return fi_codigo;
    }

    public void setFi_codigo(long fi_codigo) {
        this.fi_codigo = fi_codigo;
    }

    public long getCf_codigo() {
        return cf_codigo;
    }

    public void setCf_codigo(long cf_codigo) {
        this.cf_codigo = cf_codigo;
    }

    public long getPf_codigo() {
        return pf_codigo;
    }

    public void setPf_codifo(long pf_codigo) {
        this.pf_codigo = pf_codigo;
    }

    public String getFi_jornada() {
        return fi_jornada;
    }

    public void setFi_jornada(String fi_jornada) {
        this.fi_jornada = fi_jornada;
    }

    public String getFi_modalidad() {
        return fi_modalidad;
    }

    public void setFi_modalidad(String fi_modalidad) {
        this.fi_modalidad = fi_modalidad;
    }
}
