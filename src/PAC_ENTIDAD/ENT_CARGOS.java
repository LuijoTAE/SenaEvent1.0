
package PAC_ENTIDAD;


public class ENT_CARGOS {

    public ENT_CARGOS() {
    }
    
    public ENT_CARGOS(int idCargo, String nombre, String siglas) {
        this.idCargo = idCargo;
        this.nombre  = nombre;
        this.siglas = siglas;
    }
    
    public String toString(){
        return  nombre;
    }
    private int idCargo;
    private String nombre;
    private String siglas;

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
}
