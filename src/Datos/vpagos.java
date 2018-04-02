
package Datos;

import java.sql.Date;

/**
 *
 * @author inesm
 */
public class vpagos {
    
    private int idpago;
    private int idreserva;
    
    private String tipo_comprobante;
    private String num_comprobante;
    private Double total_pago;
    private Double pagoreserva;
    private Double pagoconsumo;
    private Date fecha_emision;
     private Date fecha_pago;  
     private int iva;
     private String tipo_pago;
     
     private String num_tarjeta;
     private String estado;

  
    public vpagos() {
    }

    public vpagos(int idpago, int idreserva,  String tipo_comprobante, String num_comprobante, Double total_pago, Double pagoreserva, Double pagoconsumo, Date fecha_emision, Date fecha_pago, int iva, String tipo_pago, String num_tarjeta, String estado) {
        this.idpago = idpago;
        this.idreserva = idreserva;
        
        this.tipo_comprobante = tipo_comprobante;
        this.num_comprobante = num_comprobante;
        this.total_pago = total_pago;
       this.pagoreserva=pagoreserva;
       this.pagoconsumo=pagoconsumo;
        this.fecha_emision = fecha_emision;
        this.fecha_pago = fecha_pago;
        this.iva = iva;
        this.tipo_pago = tipo_pago;
        this.num_tarjeta = num_tarjeta;
        this.estado = estado;
    }

    public Double getPagoreserva() {
        return pagoreserva;
    }

    public void setPagoreserva(Double pagoreserva) {
        this.pagoreserva = pagoreserva;
    }

    public Double getPagoconsumo() {
        return pagoconsumo;
    }

    public void setPagoconsumo(Double pagoconsumo) {
        this.pagoconsumo = pagoconsumo;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

   

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getNum_comprobante() {
        return num_comprobante;
    }

    public void setNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }

    public Double getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(Double total_pago) {
        this.total_pago = total_pago;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public String getNum_tarjeta() {
        return num_tarjeta;
    }

    public void setNum_tarjeta(String num_tarjeta) {
        this.num_tarjeta = num_tarjeta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
    
    
}
