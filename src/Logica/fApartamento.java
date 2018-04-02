
package Logica;

import Datos.vApartamento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inesm
 */
public class fApartamento {
    private final  Conexion mysql=new Conexion();
    private final Connection  cn= mysql.conectar();
    private String sSQL="";
    public Integer  totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
    DefaultTableModel modelo;
    String [] titulos={"ID","Numero","Piso","Descripcion","Caracteristicas","PrecioB","PrecioA","Ultima_Ocupac.","Estado","Tipo_apartamento"};
    String [] registro = new String[10];
    totalregistros=0;
    modelo = new DefaultTableModel(null,titulos);
    sSQL="select * from apartamento where numero like '%"+buscar+"%' order by  idapartamento";
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while(rs.next()){
            registro[0]=rs.getString("idapartamento");
            registro[1]=rs.getString("numero");
            registro[2]=rs.getString("piso");
            registro[3]=rs.getString("descripcion");
            registro[4]=rs.getString("caracteristicas");
            registro[5]=rs.getString("preciodbaja");
            registro[6]=rs.getString("preciodalta");
            registro[7]=rs.getString("UltimaOcupacion");
            registro[8]=rs.getString("estado");
            registro[9]=rs.getString("tipo_apartamento");
            
            totalregistros=totalregistros+1;
            modelo.addRow(registro);
                   
            }
            return modelo;
            
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e);
                        return null;
        }
    }
    public boolean insertar(vApartamento dts){
    sSQL="insert into apartamento(numero,piso,descripcion,caracteristicas,preciodbaja,preciodalta,ultimaocupacion,estado,tipo_apartamento)values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
            pst.setString(1,dts.getNumero());
            pst.setString(2,dts.getPiso());
            pst.setString(3,dts.getDescripcion());
            pst.setString(4,dts.getCaracteristicas());
            pst.setDouble(5,dts.getPreciodbaja());
            pst.setDouble(6,dts.getPreciodalta());
            pst.setDate(7,dts.getUltimaOcupacion());
            pst.setString(8,dts.getEstado());
            pst.setString(9,dts.getTipo_apartamento());
            
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
       
     public boolean editar(vApartamento dts){
    sSQL="update apartamento set numero=?,piso=?,Descripcion=?,Caracteristicas=?,preciodbaja=?,preciodalta=?,UltimaOcupacion=?,Estado=?,tipo_apartamento=?"+
            "where idapartamento=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getNumero());
            pst.setString(2, dts.getPiso());
            pst.setString(3, dts.getDescripcion());
            pst.setString(4, dts.getCaracteristicas());
            pst.setDouble(5, dts.getPreciodbaja());
             pst.setDouble(6,dts.getPreciodalta());
             pst.setDate(7, dts.getUltimaOcupacion());
             pst.setString(8, dts.getEstado());
            pst.setString(9, dts.getTipo_apartamento());
             pst.setInt(10, dts.getIdapartamento());
             
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
     
      public boolean ofertar(vApartamento dts){
    sSQL="update apartamento set estado='Ofertable',UltimaOcupacion=?  where idapartamento=?";
    
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
             
              pst.setDate(1, dts.getUltimaOcupacion());
              pst.setInt(2, dts.getIdapartamento());
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
      
      public static java.util.Date Sumdy(Date fo,int dy){
        
          Calendar cal = Calendar.getInstance();
          cal.setTime(fo);
          cal.add(Calendar.DAY_OF_YEAR, dy);
          
       return  cal.getTime();
       
      
      }
      
      
       public boolean desocupar(vApartamento dts){
    sSQL="update apartamento set estado='Limpieza' where idapartamento=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
             pst.setInt(1, dts.getIdapartamento());
             
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
         public boolean ocupar(vApartamento dts){
    sSQL="update apartamento set estado='Ocupado' where idapartamento=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
             pst.setInt(1, dts.getIdapartamento());
             
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
     
     
     
      public boolean eliminar(vApartamento dts){
    sSQL="delete from apartamento where idApartamento=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
             pst.setInt(1,dts.getIdapartamento());
            
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
     public DefaultTableModel mostrarvista(String buscar){
    DefaultTableModel modelo;
    String [] titulos={"ID","Numero","Piso","Descripcion","Caracteristicas","PrecioB","PrecioA","Ultima_Ocup.","Estado","Tipo_apartamento"};
    String [] registro = new String[10];
    totalregistros=0;
    modelo = new DefaultTableModel(null,titulos);
    sSQL="select * from apartamento where numero like '%"+buscar+"%' and (estado='Disponible' or estado='Limpieza'  or estado='Ofertable') order by  idapartamento";
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while(rs.next()){
            registro[0]=rs.getString("idapartamento");
            registro[1]=rs.getString("numero");
            registro[2]=rs.getString("piso");
            registro[3]=rs.getString("descripcion");
            registro[4]=rs.getString("caracteristicas");
            registro[5]=rs.getString("preciodbaja");
             registro[6]=rs.getString("preciodalta");
            registro[7]=rs.getString("UltimaOcupacion");
            registro[8]=rs.getString("estado");
            registro[9]=rs.getString("tipo_apartamento");
            
            totalregistros=totalregistros+1;
            modelo.addRow(registro);
                   
            }
            return modelo;
            
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e);
                        return null;
        }
    }   
       
     
      public DefaultTableModel mostrarvistag(String buscar){
    DefaultTableModel modelo;
    String [] titulos={"ID","Numero","Piso","Descripcion","Caracteristicas","PrecioB","PrecioA","Ultima_Ocup.","Estado","Tipo_apartamento"};
    String [] registro = new String[10];
    totalregistros=0;
    modelo = new DefaultTableModel(null,titulos);
    sSQL="select * from apartamento where piso like '%"+buscar+"%'  order by  idapartamento";
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while(rs.next()){
            registro[0]=rs.getString("idapartamento");
            registro[1]=rs.getString("numero");
            registro[2]=rs.getString("piso");
            registro[3]=rs.getString("descripcion");
            registro[4]=rs.getString("caracteristicas");
            registro[5]=rs.getString("preciodbaja");
             registro[6]=rs.getString("preciodalta");
            registro[7]=rs.getString("UltimaOcupacion");
            registro[8]=rs.getString("estado");
            registro[9]=rs.getString("tipo_apartamento");
            
            totalregistros=totalregistros+1;
            modelo.addRow(registro);
                   
            }
            return modelo;
            
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e);
                        return null;
        }
    }   
       
     public DefaultTableModel mostrarvistap(String buscar){
    DefaultTableModel modelo;
    String [] titulos={"ID","Numero","Piso","Descripcion","Caracteristicas","PrecioB","PrecioA","UltimaOcupac.","Estado","Tipo_apartamento"};
    String [] registro = new String[10];
    totalregistros=0;
    modelo = new DefaultTableModel(null,titulos);
    sSQL="select * from apartamento where piso like '%"+buscar+"%' and estado='Ocupado' order by  idapartamento";
    
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while(rs.next()){
            registro[0]=rs.getString("idapartamento");
            registro[1]=rs.getString("numero");
            registro[2]=rs.getString("piso");
            registro[3]=rs.getString("descripcion");
            registro[4]=rs.getString("caracteristicas");
            registro[5]=rs.getString("preciodbaja");
             registro[6]=rs.getString("preciodalta");
            registro[7]=rs.getString("UltimaOcupacion");
            registro[8]=rs.getString("estado");
            registro[9]=rs.getString("tipo_apartamento");
            
            totalregistros=totalregistros+1;
            modelo.addRow(registro);
                   
            }
            return modelo;
            
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e);
                        return null;
        }
    }   
      public DefaultTableModel mostrarvistar(String buscar){
    DefaultTableModel modelo;
    String [] titulos={"ID","Numero","Piso","Descripcion","Caracteristicas","PrecioB","PrecioA","Estado","Tipo_apartamento"};
    String [] registro = new String[9];
    totalregistros=0;
    modelo = new DefaultTableModel(null,titulos);
    sSQL= "select a.idapartamento,a.numero,a.piso,a.Descripcion,a.Caracteristicas,a.preciodbaja,"
	    +" a.preciodalta,a.estado,a.tipo_Apartamento,r.idapartamento,r.fecha_salida,r.fecha_InicPro"
	    + " from apartamento a inner join reserva r "
	    + " on a.idapartamento = r.idapartamento "
	    + " where (a.tipo_Apartamento = '"+ buscar +"' )and ((a.estado='Ofertable') or(a.estado='Disponible'))"
	    + " and (r.fecha_salida= r.fecha_InicPro ) group by  a.idapartamento order by a.numero ";
  
        try {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sSQL);
            while(rs.next()){
            registro[0]=rs.getString("idapartamento");
            registro[1]=rs.getString("numero");
            registro[2]=rs.getString("piso");
            registro[3]=rs.getString("descripcion");
            registro[4]=rs.getString("caracteristicas");
            registro[5]=rs.getString("preciodbaja");
             registro[6]=rs.getString("preciodalta");
            registro[7]=rs.getString("estado");
            registro[8]=rs.getString("tipo_apartamento");
            
            totalregistros=totalregistros+1;
            modelo.addRow(registro);
                   
            }
            return modelo;
            
                    } catch (SQLException e) {
                        JOptionPane.showConfirmDialog(null, e);
                        return null;
        }
    }     
     
}





