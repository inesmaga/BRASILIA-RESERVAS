
package Datos;

/**
 *
 * @author inesm
 */
public class vconsumo {
    private int idconsumo;
    private int idreserva;
    private int idapartamento;
    private String periodo;
    private Double precio;
    private String estado;
    private int idpago;

    public vconsumo() {
    }

    public vconsumo(int idconsumo, int idreserva, int idapartamento, String periodo, Double precio, String estado, int idpago) {
        this.idconsumo = idconsumo;
        this.idreserva = idreserva;
        this.idapartamento = idapartamento;
        this.periodo = periodo;
        this.precio = precio;
        this.estado = estado;
        this.idpago = idpago;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getIdconsumo() {
        return idconsumo;
    }

    public void setIdconsumo(int idconsumo) {
        this.idconsumo = idconsumo;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIdapartamento() {
        return idapartamento;
    }

    public void setIdapartamento(int idapartamento) {
        this.idapartamento = idapartamento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
