
package PAC_ENTIDAD;


public class ENT_FUNCIONARIO {

    public ENT_FUNCIONARIO() {
    }
    
    public ENT_FUNCIONARIO(long usDni, String fuCargo){
        this.usDni = usDni;
        this.fuCargo = fuCargo;
    }
    
    private long usDni;
    private String fuCargo;

    public long getUsDni() {
        return usDni;
    }

    public void setUsDni(long usDni) {
        this.usDni = usDni;
    }

    public String getFuCargo() {
        return fuCargo;
    }

    public void setFuCargo(String fuCargo) {
        this.fuCargo = fuCargo;
    }
    
}
