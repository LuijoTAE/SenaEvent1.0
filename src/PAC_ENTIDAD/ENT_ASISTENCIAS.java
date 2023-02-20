
package PAC_ENTIDAD;


public class ENT_ASISTENCIAS {

    public ENT_ASISTENCIAS() {
    }
    
    public ENT_ASISTENCIAS(long evCodigo, long usDni){
        this.evCodigo = evCodigo;
        this.usDni = usDni;
    }
    
    public String toString(){
        return ""+evCodigo+" "+usDni;
    }
    
    private long evCodigo;
    private long usDni;

    public long getEvCodigo() {
        return evCodigo;
    }

    public void setEvCodigo(long evCodigo) {
        this.evCodigo = evCodigo;
    }

    public long getUsDni() {
        return usDni;
    }

    public void setUsDni(long usDni) {
        this.usDni = usDni;
    }
    
}
