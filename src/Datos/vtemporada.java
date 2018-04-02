/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author inesm
 */
public class vtemporada {
	private int  idtemporada;
	private int periodotemp;
	private String temporada;

	public vtemporada() {
	}

	public vtemporada(int idtemporada, String periodtemp, String temporada) {
		this.idtemporada = idtemporada;
		this.periodotemp = periodotemp;
		this.temporada = temporada;
	}

	public int getIdtemporada() {
		return idtemporada;
	}

	public void setIdtemporada(int idtemporada) {
		this.idtemporada = idtemporada;
	}

	public int getPeriodotemp() {
		return periodotemp;
	}

	public void setPeriodotemp(int periodotemp) {
		this.periodotemp = periodotemp;
	}

	
	

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
