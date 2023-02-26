
package PAC_ENTIDAD;


public class ENT_ROLES {

    public ENT_ROLES() {
    }
    
    public ENT_ROLES(long usDni, int Cargo, long ficha){
        this.usDni = usDni;
        this.Cargo = Cargo;
        this.ficha = ficha;
    }
    
    private long usDni;
    private int Cargo;
    private long ficha;

    public long getUsDni() {
        return usDni;
    }

    public void setUsDni(long usDni) {
        this.usDni = usDni;
    }

    public int getCargo() {
        return Cargo;
    }

    public void setCargo(int Cargo) {
        this.Cargo = Cargo;
    }

    public long getFicha() {
        return ficha;
    }

    public void setFicha(long ficha) {
        this.ficha = ficha;
    }

       
}
