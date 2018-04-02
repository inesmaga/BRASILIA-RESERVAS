 
package Logica;


import Datos.vDP;
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
public class fDP {
    private final  Conexion mysql=new Conexion();
    private final Connection  cn= mysql.conectar();
    private String sSQL="";

public DefaultTableModel mostrar(String buscar){
    DefaultTableModel modelo;
    String [] titulos={"ID","Periodo(en Dias)","Valor a Aplicar(%)"};
    String [] registro = new String[3];
   
    modelo = new DefaultTableModel(null,titulos);
    sSQL="select * from dp where periodo like '%"+buscar+"%' order by  idDP";
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while(rs.next()){
            registro[0]=rs.getString("idDP");
            registro[1]=rs.getString("periodo");
            registro[2]=rs.getString("valor");
            
            modelo.addRow(registro);
                   
            }
            return modelo;
            
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e);
                        return null;
        }
    }
    public boolean insertar(vDP dts){
    sSQL="insert into dp(periodo,valor)values(?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setInt(1,dts.getPeriodo());
            pst.setDouble(2,dts.getValor());
          
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
       
     public boolean editar(vDP dts){
    sSQL="update dp set periodo=?,valor=?"
            +  " where idDP=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getPeriodo());
            pst.setDouble(2, dts.getValor());
           pst.setInt(3, dts.getIdDP());
             
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
