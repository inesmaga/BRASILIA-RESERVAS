/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import com.toedter.calendar.JDateChooser;
import java.sql.Date;

/**
 *
 * @author inesm
 */
public class vgastos {
     private int idgastos;
      private int idapartamento;
   private String material;
    private String reparacion;
    private int cantidad;
    private Double totalgastado;
    private Double precio;
    private Date fecha_gasto;

    public vgastos() {
    }

    public vgastos(int idgastos, int idapartamento, String material, String reparacion, int cantidad, Double totalgastado, Double precio, Date fecha_gasto) {
        this.idgastos = idgastos;
        this.idapartamento = idapartamento;
        this.material = material;
        this.reparacion = reparacion;
        this.cantidad = cantidad;
        this.totalgastado = totalgastado;
        this.precio = precio;
        this.fecha_gasto = fecha_gasto;
    }

    public String getReparacion() {
        return reparacion;
    }

    public void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    public int getIdgastos() {
        return idgastos;
    }

    public void setIdgastos(int idgastos) {
        this.idgastos = idgastos;
    }

   

   

    public int getIdapartamento() {
        return idapartamento;
    }

    public void setIdapartamento(int idapartamento) {
        this.idapartamento = idapartamento;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotalgastado() {
        return totalgastado;
    }

    public void setTotalgastado(Double totalgastado) {
        this.totalgastado = totalgastado;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFecha_gasto() {
        return fecha_gasto;
    }

    public void setFecha_gasto(Date fecha_gasto) {
        this.fecha_gasto = fecha_gasto;
    }

    public void setFecha_gasto(JDateChooser dcfechagasto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
    
    
}
