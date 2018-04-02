
package Datos;

/**
 *
 * @author inesm
 */
public class vtrabajador extends vpersona {
    String acceso;
    String login;
    String password;
    String estado;

    public vtrabajador() {
    }

    public vtrabajador(String acceso, String login, String password, String estado) {
        this.acceso = acceso;
        this.login = login;
        this.password = password;
        this.estado = estado;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
