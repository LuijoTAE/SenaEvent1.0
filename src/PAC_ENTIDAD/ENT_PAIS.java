
package PAC_ENTIDAD;


public class ENT_PAIS {

    public ENT_PAIS() {
    }
    
    public ENT_PAIS(String paNombre, long paCodigo){
        this.paNombre = paNombre;
        this.paCodigo = paCodigo;
    }
    
    public String toString(){
        return paNombre;
    }
    
    private long paCodigo;
    private String paNombre;
    private long usCodigo;

    public long getPaCodigo() {
        return paCodigo;
    }

    public void setPaCodigo(long paCodigo) {
        this.paCodigo = paCodigo;
    }

    public String getPaNombre() {
        return paNombre;
    }

    public void setPaNombre(String paNombre) {
        this.paNombre = paNombre;
    }

    public long getUsCodigo() {
        return usCodigo;
    }

    public void setUsCodigo(long usCodigo) {
        this.usCodigo = usCodigo;
    }
    
}
