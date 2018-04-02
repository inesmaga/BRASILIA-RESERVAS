
package Datos;

/**
 *
 * @author inesm
 */
public class vDP {
    private int idDP;
    private int  periodo;
    private double valor;

    public vDP() {
    }

    public vDP(int idDP, int periodo, Double valor) {
        this.idDP = idDP;
        this.periodo = periodo;
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

   
    public int getIdDP() {
        return idDP;
    }

    public void setIdDP(int idDP) {
        this.idDP = idDP;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    

    
    
}
