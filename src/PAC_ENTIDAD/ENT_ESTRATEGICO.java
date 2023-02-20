
package PAC_ENTIDAD;


public class ENT_ESTRATEGICO {
    
    private String oe_nombre;
    private double oe_version;
    private long us_dni;

    public ENT_ESTRATEGICO(){
        
    }
    
    public ENT_ESTRATEGICO(String oe_nombre, double oe_version){
        this.oe_nombre = oe_nombre;
        this.oe_version = oe_version;
    }
    
    public String toString(){
        return oe_nombre + "-" + oe_version;
    }
    
    public String getOe_nombre() {
        return oe_nombre;
    }

    public void setOe_nombre(String oe_nombre) {
        this.oe_nombre = oe_nombre;
    }

    public double getOe_version() {
        return oe_version;
    }

    public void setOe_version(double oe_version) {
        this.oe_version = oe_version;
    }

    public long getUs_dni() {
        return us_dni;
    }

    public void setUs_dni(long us_dni) {
        this.us_dni = us_dni;
    }
    
    
}
