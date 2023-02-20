package PAC_ENTIDAD;

import javax.swing.JComboBox;

/**
 *
 * @author windows21
 */
public class ENT_USUARIO {

    private long us_dni;
    private long us_telefono;
    private String us_tipo_dni;
    private String us_nombre;
    private String us_apellido;
    private String us_genero;
    private String us_correo;
    private String us_clave;
    private String us_rol;

    public ENT_USUARIO() {

    }

    public ENT_USUARIO(String us_nombre, String us_apellido, long us_dni) {
        this.us_nombre = us_nombre;
        this.us_apellido = us_apellido;
        this.us_dni = us_dni;
    }

    public long getUs_dni() {
        return us_dni;
    }

    public void setUs_dni(long us_dni) {
        this.us_dni = us_dni;
    }

    public long getUs_telefono() {
        return us_telefono;
    }

    public void setUs_telefono(long us_telefono) {
        this.us_telefono = us_telefono;
    }

    public String getUs_tipo_dni() {
        return us_tipo_dni;
    }

    public void setUs_tipo_dni(String us_tipo_dni) {
        this.us_tipo_dni = us_tipo_dni;
    }

    public String getUs_nombre() {
        return us_nombre;
    }

    public void setUs_nombre(String us_nombre) {
        this.us_nombre = us_nombre;
    }

    public String getUs_apellido() {
        return us_apellido;
    }

    public void setUs_apellido(String us_apellido) {
        this.us_apellido = us_apellido;
    }

    public String getUs_genero() {
        return us_genero;
    }

    public void setUs_genero(String us_genero) {
        this.us_genero = us_genero;
    }

    public String getUs_correo() {
        return us_correo;
    }

    public void setUs_correo(String us_correo) {
        this.us_correo = us_correo;
    }

    public String getUs_clave() {
        return us_clave;
    }

    public void setUs_clave(String us_clave) {
        this.us_clave = us_clave;
    }

    public String getUs_rol() {
        return us_rol;
    }

    public void setUs_rol(String us_rol) {
        this.us_rol = us_rol;
    }

    public String toString() {
        return us_nombre + " " + us_apellido;
    }
    
}
