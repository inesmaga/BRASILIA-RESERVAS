
package Datos;

import java.sql.Date;

/**
 *
 * @author inesm
 */
public class vApartamento {
    private int idapartamento;
    private String  numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private Double preciodbaja;
    private Double preciodalta;
    private Date UltimaOcupacion;
    private String Estado;
    private String tipo_apartamento;

    public vApartamento(int idapartamento, String numero, String piso, String descripcion, String caracteristicas, Double preciodbaja,Double preciodalta,Date UltimaOcupacion, String estado, String tipo_apartamento) {
        this.idapartamento = idapartamento;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.preciodbaja= preciodbaja;
        this.preciodalta = preciodalta;
        this.UltimaOcupacion=UltimaOcupacion;
        this.Estado = estado;
        this.tipo_apartamento = tipo_apartamento;
    }

    public vApartamento() {
    }

    public int getIdapartamento() {
        return idapartamento;
    }

    public void setIdapartamento(int idapartamento) {
        this.idapartamento = idapartamento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Double getPreciodbaja() {
        return preciodbaja;
    }

    public void setPreciodbaja(Double preciodbaja) {
        this.preciodbaja = preciodbaja;
    }

    public Double getPreciodalta() {
        return preciodalta;
    }

    public void setPreciodalta(Double preciodalta) {
        this.preciodalta = preciodalta;
    }

    public Date getUltimaOcupacion() {
        return UltimaOcupacion;
    }

    public void setUltimaOcupacion(Date UltimaOcupacion) {
        this.UltimaOcupacion = UltimaOcupacion;
    }

      

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTipo_apartamento() {
        return tipo_apartamento;
    }

    public void setTipo_apartamento(String tipo_apartamento) {
        this.tipo_apartamento = tipo_apartamento;
    }

    
    
    
}

