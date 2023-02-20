
package PAC_ENTIDAD;


public class ENT_CIUDAD {
    private long ci_codigo;
    private long de_codigo;
    private String ci_nombre;

    public ENT_CIUDAD(){
        
    }
    
    public ENT_CIUDAD(String ci_nombre, long ci_codigo){
        this.ci_nombre = ci_nombre;
        this.ci_codigo = ci_codigo;
    }
    
    public String toString(){
        return ci_nombre;
    }
    
    public long getCi_codigo() {
        return ci_codigo;
    }

    public void setCi_codigo(long ci_codigo) {
        this.ci_codigo = ci_codigo;
    }

    public long getDe_codigo() {
        return de_codigo;
    }

    public void setDe_codigo(long de_codigo) {
        this.de_codigo = de_codigo;
    }

    public String getCi_nombre() {
        return ci_nombre;
    }

    public void setCi_nombre(String ci_nombre) {
        this.ci_nombre = ci_nombre;
    }
    
}
