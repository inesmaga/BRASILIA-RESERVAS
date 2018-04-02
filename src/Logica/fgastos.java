
package Logica;


import Datos.vgastos;
import java.sql.Connection;
import java.sql.Date;
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
public class fgastos {
     private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;
    public Double totaldegastos;
        public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "IdApart", "Numero Apart.","Fecha_Gasto","Material","Cantidad","Reparación","Precio", "Total_Gastado"};
        String[] registro = new String[9];
        totalregistros = 0;
         totaldegastos = 0.0;
        modelo = new DefaultTableModel(null, titulos);
       sSQL = "select g.idgastos,g.idapartamento,"
                +  "a.numero ," 
                +  " g.fecha_gasto,g.material,cantidad,"
                +  "g.reparacion,g.precio,g.totalgastado"
                +  " from Gastos g  inner join apartamento a where a.numero like '%" + buscar + "%'  and  g.idapartamento=a.idapartamento ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
               
                registro[0] = rs.getString("idgastos");
                registro[1] = rs.getString("idapartamento");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("fecha_gasto");
                registro[4] = rs.getString("material");
                registro[5] = rs.getString("cantidad");
                registro[6] = rs.getString("reparacion");
                registro[7] = rs.getString("precio");
                registro[8] = rs.getString("totalgastado");

                totalregistros = totalregistros + 1;
                totaldegastos= totaldegastos+(rs.getDouble("totalgastado"));
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
       
        
      public boolean insertar(vgastos dts){
    sSQL="insert into gastos(idapartamento,fecha_gasto,material,cantidad,reparacion,precio,totalgastado)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
           
            
            pst.setInt(1,dts.getIdapartamento());
            pst.setDate(2,dts.getFecha_gasto());
            pst.setString(3,dts.getMaterial());
            pst.setInt(4,dts.getCantidad());
            pst.setString(5,dts.getReparacion());
            pst.setDouble(6,dts.getPrecio());
            pst.setDouble(7,dts.getTotalgastado());
            
            
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
       
     public boolean editar(vgastos dts){
    sSQL="update gastos set idapartamento=?,fecha_gasto=?,material=?,cantidad=?,reparacion=?,precio=?,totalgastado=?"+
            "where idgastos=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
             pst.setInt(1,dts.getIdapartamento());
            pst.setDate(2,dts.getFecha_gasto());
            pst.setString(3,dts.getMaterial());
            pst.setInt(4,dts.getCantidad());
            pst.setString(5,dts.getReparacion());
            pst.setDouble(6,dts.getPrecio());
            pst.setDouble(7,dts.getTotalgastado());
            pst.setInt(8, dts.getIdgastos());
             
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
 
    public boolean eliminar(vgastos dts) {
        sSQL = "delete from gastos where idgasto=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdgastos());

            int n = pst.executeUpdate();

            if (n == 0) {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
        return true;
    }

   
}
