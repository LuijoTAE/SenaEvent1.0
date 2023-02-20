
package PAC_ENTIDAD;


public class ENT_OPERATIVO {
    
    private String obo_nombre;
    private double obo_version;
    private String oe_nombre;
    private double oe_version;
    
     public ENT_OPERATIVO(){
        
    }
    
    public  ENT_OPERATIVO(String obo_nombre, double obo_version){
        this.obo_nombre = obo_nombre;
        this.obo_version = obo_version;
    }
    
    public String toString(){
        return obo_nombre + "-" + obo_version;
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
    
   
    
}
