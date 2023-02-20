package PAC_ENTIDAD;

public class ENT_EVENTO {

    private long ev_codigo;
    private String obo_nombre;
    private double obo_version;
    private long ci_codigo;
    private String ev_nombre;
    private String ev_fecha;
    private String ev_proposito;

    public ENT_EVENTO(){
        
    }
    
    public ENT_EVENTO(String ev_nombre, long ev_codigo){
        this.ev_nombre = ev_nombre;
        this.ev_codigo = ev_codigo;
    }
    
    public long getEv_codigo() {
        return ev_codigo;
    }

    public void setEv_codigo(long ev_codigo) {
        this.ev_codigo = ev_codigo;
    }

    public String getObo_nombre() {
        return obo_nombre;
    }

    public void setObo_nombre(String obo_nombre) {
        this.obo_nombre = obo_nombre;
    }

    public double getObo_version() {
        return obo_version;
    }

    public void setObo_version(double obo_version) {
        this.obo_version = obo_version;
    }

    public long getCi_codigo() {
        return ci_codigo;
    }

    public void setCi_codigo(long ci_codigo) {
        this.ci_codigo = ci_codigo;
    }

    public String getEv_nombre() {
        return ev_nombre;
    }

    public void setEv_nombre(String ev_nombre) {
        this.ev_nombre = ev_nombre;
    }

    public String getEv_fecha() {
        return ev_fecha;
    }

    public void setEv_fecha(String ev_fecha) {
        this.ev_fecha = ev_fecha;
    }

    public String getEv_proposito() {
        return ev_proposito;
    }

    public void setEv_proposito(String ev_proposito) {
        this.ev_proposito = ev_proposito;
    }
    
    public String toString(){
        return ev_nombre;
    }
}
