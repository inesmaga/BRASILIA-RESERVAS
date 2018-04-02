
package Logica;


import Datos.vcliente;
import Datos.vtrabajador;
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
public class ftrabajador {

    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    private String sSQL2 = "";
    public Integer totalregistros;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Nombre", "PrimerApellido", "SegundApellido", "tipo_documento", "num_documento", "dirección", "telefono", "email","Acceso","Login","Password","Estado"};
        String[] registro = new String[13];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select p.idpersona,p.nombre,p.PrimerApellido,p.SegundApellido,p.tipo_documento,p.num_documento,"
                + "p.direccion,p.telefono,p.email,t.acceso,t.login,t.password,t.estado from persona as p inner join trabajador as t "
                + "on p.idpersona=t.idpersona where(( p.nombre  like '%"
                + buscar + "%') or (p.PrimerApellido  like '%"
                + buscar + "%') or (p.SegundApellido  like '%"
                + buscar + "%')) order by  idpersona desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("PrimerApellido");
                registro[3] = rs.getString("SegundApellido");
                registro[4] = rs.getString("tipo_documento");
                registro[5] = rs.getString("num_documento");
                registro[6] = rs.getString("direccion");
                registro[7] = rs.getString("telefono");
                registro[8] = rs.getString("email");
                registro[9] = rs.getString("acceso");
                registro[10] = rs.getString("login");
                registro[11] = rs.getString("password");
                registro[12] = rs.getString("estado");
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(vtrabajador dts) {
        sSQL = "insert into persona(nombre,PrimerApellido,SegundApellido,tipo_documento,num_documento,direccion,telefono,email)values(?,?,?,?,?,?,?,?)";
        sSQL2 = "insert into trabajador(idpersona,acceso,login,password,estado)"
                + "values((select idpersona from persona order by idpersona desc limit 1 ),?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getPrimerApellido());
            pst.setString(3, dts.getSegundApellido());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNum_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());

            pst2.setString(1, dts.getAcceso());
            pst2.setString(2, dts.getLogin());
            pst2.setString(3, dts.getPassword());
            pst2.setString(4, dts.getEstado());
            
            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean editar(vtrabajador dts) {
        sSQL = "update persona set nombre=?,PrimerApellido=?,SegundApellido=?,tipo_documento=?,num_documento=?,direccion=?,telefono=?,email=?"
                + "where idpersona=?";
        sSQL2 = "update trabajador set acceso=?,login=?,password=?,estado=?"
                + "where idpersona=?";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            pst.setString(1, dts.getNombre());
            pst.setString(2, dts.getPrimerApellido());
            pst.setString(3, dts.getSegundApellido());
            pst.setString(4, dts.getTipo_documento());
            pst.setString(5, dts.getNum_documento());
            pst.setString(6, dts.getDireccion());
            pst.setString(7, dts.getTelefono());
            pst.setString(8, dts.getEmail());
            pst.setInt(9, dts.getIdpersona());

            pst2.setString(1, dts.getAcceso());
             pst2.setString(2, dts.getLogin());
              pst2.setString(3, dts.getPassword());
               pst2.setString(4, dts.getEstado());
            pst2.setInt(5, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }

    public boolean eliminar(vtrabajador dts) {
        sSQL = "delete from trabajador where idpersona=?";
        sSQL2 = "delete from persona where idpersona=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);
            
            pst.setInt(1, dts.getIdpersona());

           
            pst2.setInt(1, dts.getIdpersona());

            int n = pst.executeUpdate();

            if (n != 0) {
                int n2 = pst2.executeUpdate();

                if (n2 != 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }
    public DefaultTableModel login(String login,String password) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Nombre", "PrimerApellido", "SegundApellido","Acceso","Login","Password","Estado"};
        String[] registro = new String[8];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select p.idpersona,p.nombre,p.PrimerApellido,p.SegundApellido,t.acceso,t.login,t.password,t.estado from persona as p inner join trabajador as t "
                + "on p.idpersona=t.idpersona where(( t.login  ='"
                + login + "') and (t.password='" + password + "') and (t.estado='A'))";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idpersona");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("PrimerApellido");
                registro[3] = rs.getString("SegundApellido");
                registro[4] = rs.getString("acceso");
                registro[5] = rs.getString("login");
                registro[6] = rs.getString("password");
                registro[7] = rs.getString("estado");
                
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}