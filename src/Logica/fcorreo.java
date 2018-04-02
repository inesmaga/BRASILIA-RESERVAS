 
package Logica;


import Datos.vcorreo;
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
public class fcorreo {
    private final  Conexion mysql=new Conexion();
    private final Connection  cn= mysql.conectar();
    private String sSQL="";


    public void insertar(vcorreo dts){
    sSQL="insert into correo(UsuarioWeb,Asunto,MensajeRE)values(?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setString(1,dts.getUsuarioWeb());
            pst.setString(2,dts.getAsunto());
          pst.setString(3,dts.getMensajeRE());
            int n=pst.executeUpdate();
            
            if (n==0) {
               
            }
               
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            
        }
       
    }    
       
   
     
}
