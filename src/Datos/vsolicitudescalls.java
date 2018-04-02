/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.sql.Date;
/**
 *
 * @author inesm
 */

public class vsolicitudescalls {
	private int idllamada;
	private String Numllaman;
	private Date FechaSol;
	private String tipoA;
	private Date FechaIngresoDeseada;
	private Date FechaSalidaDeseada;
	private int idapartamento;
	private int numero;
	private int idsolicitudWeb;
	private int idcliente;
	private int idreserva;
	private  String Estado;
	private int idtrabajador;
	
	
public vsolicitudescalls(int idllamada,String Numllaman,Date FechaSol,String tipoA,Date FechaIngresoDeseada,Date FechaSalidaDeseada,int idapartamento,int numero,int idsolicitudWeb,int idcliente,int idreserva,String Estado,int idtrabajador)	{
	
this.idllamada= idllamada;
this.Numllaman= Numllaman;
this.FechaSol= FechaSol;
this.tipoA=tipoA;
this.FechaIngresoDeseada = FechaIngresoDeseada;
this.FechaSalidaDeseada = FechaSalidaDeseada;
this.idapartamento= idapartamento;
this.numero=numero;
this.idsolicitudWeb = idsolicitudWeb;
this.idcliente = idcliente;
this.idreserva = idreserva;
this.Estado = Estado;
this.idtrabajador = idtrabajador;

}

	public vsolicitudescalls() {
		
	}

	


	public int getIdllamada() {
		return idllamada;
	}

	public void setIdllamada(int idllamada) {
		this.idllamada = idllamada;
	}

	public String getNumllaman() {
		return Numllaman;
	}

	public void setNumllaman(String Numllaman) {
		this.Numllaman = Numllaman;
	}

	public Date getFechaSol() {
		return FechaSol;
	}

	public void setFechaSol(Date FechaSol) {
		this.FechaSol = FechaSol;
	}

	public String getTipoA() {
		return tipoA;
	}

	public void setTipoA(String tipoA) {
		this.tipoA = tipoA;
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

	public int getIdapartamento() {
		return idapartamento;
	}

	public void setIdapartamento(int idapartamento) {
		this.idapartamento = idapartamento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIdsolicitudWeb() {
		return idsolicitudWeb;
	}

	public void setIdsolicitudWeb(int idsolicitudWeb) {
		this.idsolicitudWeb = idsolicitudWeb;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getIdreserva() {
		return idreserva;
	}

	public void setIdreserva(int idreserva) {
		this.idreserva = idreserva;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String Estado) {
		this.Estado = Estado;
	}

	public int getIdtrabajador() {
		return idtrabajador;
	}

	public void setIdtrabajador(int idtrabajador) {
		this.idtrabajador = idtrabajador;
}	
}
