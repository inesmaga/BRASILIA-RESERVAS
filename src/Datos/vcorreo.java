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
public class vcorreo {

	public String getUsuarioWeb() {
		return UsuarioWeb;
	}

	public void setUsuarioWeb(String UsuarioWeb) {
		this.UsuarioWeb = UsuarioWeb;
	}

	

	/**
	 * @return the Asunto
	 */
	public String getAsunto() {
		return Asunto;
	}

	/**
	 * @param Asunto the Asunto to set
	 */
	public void setAsunto(String Asunto) {
		this.Asunto = Asunto;
	}

	/**
	 * @return the MensajeRE
	 */
	public String getMensajeRE() {
		return MensajeRE;
	}

	/**
	 * @param MensajeRE the MensajeRE to set
	 */
	public void setMensajeRE(String MensajeRE) {
		this.MensajeRE = MensajeRE;
	}
	private String UsuarioWeb;
	private String Asunto;
	private String MensajeRE;
}
