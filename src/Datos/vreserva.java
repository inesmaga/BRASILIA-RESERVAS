
package Datos;

import java.sql.Date;

/**
 *
 * @author inesm
 */
public class vreserva {
    private int idReserva;
    private int idapartamento;
    private int idcliente;
    private int idtrabajador;
    private int idDP;
    private  String tipo_reserva;
    private Date fecha_reserva;
    private Date fecha_ingreso;
    private Date fecha_salida;
    private Date fecha_InicPro;
    private String temporada;
    private Double costo_mensual;
    private Double costo_total;
    private String estado;
    private Double pagado;
     private Double pagadore;
    public vreserva() {
    }

    public vreserva(int idReserva, int idapartamento, int idcliente, int idtrabajador,int idDP, String tipo_reserva, Date fecha_reserva, Date fecha_ingreso, Date fecha_salida,Date fecha_InicPro,String temporada,Double costo_mensual, Double costo_total, String estado,Double pagado ,Double pagadore) {
        this.idReserva = idReserva;
        this.idapartamento = idapartamento;
        this.idcliente = idcliente;
        this.idtrabajador = idtrabajador;
        this.idDP=idDP;
        this.tipo_reserva = tipo_reserva;
        this.fecha_reserva = fecha_reserva;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.fecha_InicPro = fecha_InicPro;
       this.temporada = temporada;
         this.costo_mensual = costo_mensual;
        this.costo_total = costo_total;
        this.estado = estado;
        this.pagado= pagado;
        this.pagadore=pagadore;
    }

    public Double getPagadore() {
        return pagadore;
    }

    public void setPagadore(Double pagadore) {
        this.pagadore = pagadore;
    }

    public Date getFecha_InicPro() {
        return fecha_InicPro;
    }

    public void setFecha_InicPro(Date fecha_InicPro) {
        this.fecha_InicPro = fecha_InicPro;
    }

    public Double getCosto_mensual() {
        return costo_mensual;
    }

    public void setCosto_mensual(Double costo_mensual) {
        this.costo_mensual = costo_mensual;
    }

    public Double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(Double costo_total) {
        this.costo_total = costo_total;
    }

    public Double getPagado() {
        return pagado;
    }

    public void setPagado(Double pagado) {
        this.pagado = pagado;
    }

   

    public int getIdDP() {
        return idDP;
    }

    public void setIdDP(int idDP) {
        this.idDP = idDP;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

  

    public int getIdapartamento() {
        return idapartamento;
    }

    public void setIdapartamento(int idapartamento) {
        this.idapartamento = idapartamento;
    }

   

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(int idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    
   

    public String getTipo_reserva() {
        return tipo_reserva;
    }

    public void setTipo_reserva(String tipo_reserva) {
        this.tipo_reserva = tipo_reserva;
    }

    public Date getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(Date fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

 

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
   
    
      
    
    
    
}




