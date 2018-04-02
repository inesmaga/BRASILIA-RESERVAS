
package Logica;


import Datos.vconsumo;
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
public class fconsumo {
     private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;
    public Double totaldeconsumo;
        public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "IdApart", "Numero Apart.","IdReserva","Fecha_Ingreso","Fecha_Salida", "Periodo", "Precio", "Estado_Consumo"};
        String[] registro = new String[9];
        totalregistros = 0;
         totaldeconsumo = 0.0;
        modelo = new DefaultTableModel(null, titulos);
       sSQL = "select c.idconsumo,r.idapartamento,"
                +  "(select numero from apartamento where idapartamento=r.idapartamento) as numero," 
                +  " r.idReserva,r.fecha_reserva,r.fecha_ingreso,r.fecha_salida,"
                +  "c.periodo,c.precio,c.estado"
                +  " from consumo c inner join reserva r "
                +  " on ((c.idapartamento = r.idapartamento) and (c.idreserva=r.idReserva))"
                +  " where c.periodo like '%"+buscar+"%'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
               
                registro[0] = rs.getString("idconsumo");
                registro[1] = rs.getString("idapartamento");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idReserva");
                registro[4] = rs.getString("fecha_ingreso");
                registro[5] = rs.getString("fecha_salida");
                registro[6] = rs.getString("periodo");
                registro[7] = rs.getString("precio");
                registro[8] = rs.getString("estado");

                totalregistros = totalregistros + 1;
                totaldeconsumo= totaldeconsumo+(rs.getDouble("precio"));
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
        public DefaultTableModel mostrarpg(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "IdApart", "Numero Apart.","IdReserva","Fecha_Ingreso","Fecha_Salida", "Periodo", "Precio", "Estado_Consumo"};
        String[] registro = new String[9];
        totalregistros = 0;
         totaldeconsumo = 0.0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select c.idconsumo,r.idapartamento,"
                + "(select numero from apartamento where idapartamento=r.idapartamento) as numero," 
                +  " r.idReserva,r.fecha_reserva,r.fecha_ingreso,r.fecha_salida,"
                +  "c.periodo,c.precio,c.estado"
                +  " from consumo c inner join reserva r "
                +  " on ((c.idapartamento = r.idapartamento) and (c.idreserva=r.idReserva))"
                +  " where (c.idreserva= " + buscar + " ) and (!( c.estado='Pagado')) and ( c.idpago='0') order by  c.idconsumo desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
               
                registro[0] = rs.getString("idconsumo");
                registro[1] = rs.getString("idapartamento");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idReserva");
                registro[4] = rs.getString("fecha_ingreso");
                registro[5] = rs.getString("fecha_salida");
                registro[6] = rs.getString("periodo");
                registro[7] = rs.getString("precio");
                registro[8] = rs.getString("estado");

                totalregistros = totalregistros + 1;
                totaldeconsumo= totaldeconsumo+(rs.getDouble("precio"));
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    } 
        
        
      public boolean insertar(vconsumo dts){
    sSQL="insert into consumo(idreserva,idapartamento,periodo,precio,estado)values(?,?,?,?,?)";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            
           
            pst.setInt(1,dts.getIdreserva());
            pst.setInt(2,dts.getIdapartamento());
            pst.setString(3,dts.getPeriodo());
            pst.setDouble(4,dts.getPrecio());
            pst.setString(5,dts.getEstado());
            
            
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
       
     public boolean editar(vconsumo dts){
    sSQL="update consumo set idreserva=?,idapartamento=?,periodo=?,precio=?,estado=?"+
            "where idconsumo=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
             pst.setInt(1,dts.getIdreserva());
            pst.setInt(2,dts.getIdapartamento());
            pst.setString(3,dts.getPeriodo());
            pst.setDouble(4,dts.getPrecio());
            pst.setString(5,dts.getEstado());
            pst.setInt(6, dts.getIdconsumo());
             
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
 public boolean pagar(vconsumo dts){
    sSQL="update consumo set idpago =? ,estado='Pagado' where (idreserva=?) and (estado='Pendiente') ";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdpago());
              pst.setInt(2, dts.getIdreserva());
            
             
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
    public boolean eliminar(vconsumo dts) {
        sSQL = "delete from consumo where idconsumo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdconsumo());

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
