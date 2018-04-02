
package Datos;

/**
 *
 * @author inesm
 */
public class vcomprobantesp {
    private int idComprobantesP;
    private String  nombre;
    private  int valor;

    public vcomprobantesp() {
    }

    public vcomprobantesp(int idComprobantep, String nombre, int valor) {
        this.idComprobantesP = idComprobantesP;
        this.nombre = nombre;
        this.valor=valor;
    }

	public int getIdComprobantesP() {
		return idComprobantesP;
	}

	public void setIdComprobantesP(int idComprobantesP) {
		this.idComprobantesP = idComprobantesP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}


    
    
}
