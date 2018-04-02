
package Datos;

import java.sql.Date;

/**
 *
 * @author inesm
 */
public class vsolicitudesweb {
    private int idSolicitud;
    private int idapartamento;
    private String numero;
    private String tipo;
    private Date FechaIngresoDeseada;
    private Date FechaSalidaDeseada;
    private String Estado;
    private String email;
   
    
    
    
    public vsolicitudesweb(int idSolicitud,int idapartamento,String numero,String tipo,Date FechaIngresoDeseada,Date FechaSalidaDeseada,String Estado, String email) {
	 this.idSolicitud = idSolicitud;   
        this.idapartamento = idapartamento;
	this.numero= numero;
        this.tipo = tipo;
        this.FechaIngresoDeseada = FechaIngresoDeseada;
        this.FechaSalidaDeseada = FechaSalidaDeseada;
        this.Estado = Estado;
        this.email = email;
    }

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public vsolicitudesweb() {
	}

	public int getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public int getIdapartamento() {
		return idapartamento;
	}

	public void setIdapartamento(int idapartamento) {
		this.idapartamento = idapartamento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaIngresoDeseada() {
		return FechaIngresoDeseada;
	}

	public void setFechaIngresoDeseada(Date FechaIngresoDeseada) {
		this.FechaIngresoDeseada = FechaIngresoDeseada;
	}

	public Date getFechaSalidaDeseada() {
		return FechaSalidaDeseada;
	}

	public void setFechaSalidaDeseada(Date FechaSalidaDeseada) {
		this.FechaSalidaDeseada = FechaSalidaDeseada;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String Estado) {
		this.Estado = Estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
  
}

