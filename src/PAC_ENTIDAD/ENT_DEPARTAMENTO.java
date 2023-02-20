
package PAC_ENTIDAD;


public class ENT_DEPARTAMENTO {
    private long de_codigo;
    private long pa_codigo;
    private String de_nombre;
    
    public ENT_DEPARTAMENTO(){
        
    }
    
    public ENT_DEPARTAMENTO(String de_nombre, long de_codigo){
        this.de_nombre = de_nombre;
        this.de_codigo = de_codigo;
    }
    
    public String toString(){
        return de_nombre;
    }

    public long getDe_codigo() {
        return de_codigo;
    }

    public void setDe_codigo(long de_codigo) {
        this.de_codigo = de_codigo;
    }

    public long getPa_codigo() {
        return pa_codigo;
    }

    public void setPa_codigo(long pa_codigo) {
        this.pa_codigo = pa_codigo;
    }

    public String getDe_nombre() {
        return de_nombre;
    }

    public void setDe_nombre(String de_nombre) {
        this.de_nombre = de_nombre;
    }
    
}
