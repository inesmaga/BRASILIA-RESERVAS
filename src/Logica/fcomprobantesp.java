 
package Logica;


import Datos.vcomprobantesp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inesm
 */
public class fcomprobantesp {
    private final  Conexion mysql=new Conexion();
    private final Connection  cn= mysql.conectar();
    private String sSQL="";

public DefaultTableModel mostrar(String buscar){
    DefaultTableModel modelo;
    String [] titulos={"ID","Nombre","Valor "};
    String [] registro = new String[3];
   
    modelo = new DefaultTableModel(null,titulos);
    sSQL="select * from comprobantesp where nombre like '%"+buscar+"%' order by  idcomprobantesp";
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while(rs.next()){
            registro[0]=rs.getString("idcomprobantesp");
            registro[1]=rs.getString("nombre");
            registro[2]=rs.getString("valor");
            
            modelo.addRow(registro);
                   
            }
            return modelo;
            
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e);
                        return null;
        }
    }
    public boolean insertar(vcomprobantesp dts){
    sSQL="insert into comprobantesp(nombre,valor)values(?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setString(1,dts.getNombre());
            pst.setInt(2,dts.getValor());
          
            int n=pst.executeUpdate();
            
            if (n==0) {
               return false;
            }
               
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }    
       
     public boolean editar(vcomprobantesp dts){
    sSQL="update comprobantesp set valor=?"
            +  " where nombre=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setInt(1, dts.getValor());
           pst.setString(2, dts.getNombre());
             
              int n=pst.executeUpdate();
              
       if(n==0){
           return false;
       }
       
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
     } 
     
}
