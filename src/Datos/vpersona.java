
package Datos;

/**
 *
 * @author inesm
 */
public class vpersona {
   private int idpersona;
   private String nombre;
   private String PrimerApellido;
   private String SegundApellido;
   private String tipo_documento;
   private String num_documento;
   private String direccion;
   private String telefono;
   private String email;
  

    public vpersona() {
    }

    public vpersona(int idpersona, String nombre, String PrimerApellido, String SegundApellido, String tipo_documento, String num_documento, String direccion, String telefono, String email) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundApellido = SegundApellido;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundApellido() {
        return SegundApellido;
    }

    public void setSegundApellido(String SegundApellido) {
        this.SegundApellido = SegundApellido;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
   
   
   
   
   
   
}
