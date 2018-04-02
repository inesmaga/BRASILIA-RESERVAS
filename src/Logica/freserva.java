package Logica;

import Datos.vreserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;

/**
 *
 * @author inesm
 */
public class freserva {

    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";

    public Integer totalregistros;
    public int ida,dias, vidp;
    public double vpd,pa,pb;

    public DefaultTableModel mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "IdApart", "Num.Apart.", "idcliente", "Cliente", "idtrabajador", "Trabajador", "IDDP", "Tipo_Reserva", "Fech_Reserva", "Fech_Ingreso", "Fech_Salida", "Fech_InicPro", "Temporada", "Costo_AlojM", "Costo_AlojT", "Estado_Reserva","Pagado_Reserv.","Pagado_Tot."};
        String[] registro = new String[19];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select r.idReserva,r.idapartamento,a.numero,r.idcliente,"
                + "(select nombre from persona where idpersona=r.idcliente)as clienten,"
                + " (select primerapellido from persona where idpersona=r.idcliente)as clienteap,"
                + " r.idtrabajador,(select nombre from persona where idpersona=r.idtrabajador)as trabajadorn,"
                + " (select primerapellido from persona where idpersona=r.idtrabajador)as trabajadorap,"
                + " r.idDp,r.tipo_reserva,r.fecha_reserva,r.fecha_ingreso,r.fecha_salida,r.fecha_InicPro,r.temporada,r.costo_mensual,r.costo_total,r.estado,r.pagadore,r.pagado"
                + " from reserva r inner join apartamento a "
                + " on r.idapartamento = a.idapartamento "
                + " where r.fecha_reserva like '%" + buscar + "%'order by  idreserva asc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idReserva");
                registro[1] = rs.getString("idapartamento");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idcliente");
                registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[5] = rs.getString("idtrabajador");
                registro[6] = rs.getString("trabajadorn") + " " + rs.getString("trabajadorap");
                registro[7] = rs.getString("idDP");
                registro[8] = rs.getString("tipo_reserva");
                registro[9] = rs.getString("fecha_reserva");
                registro[10] = rs.getString("fecha_ingreso");
                registro[11] = rs.getString("fecha_salida");
                registro[12] = rs.getString("fecha_InicPro");
                registro[13] = rs.getString("temporada");
                registro[14] = rs.getString("costo_mensual");
                registro[15] = rs.getString("costo_total");
                registro[16] = rs.getString("estado");
                 registro[17] = rs.getString("pagadore");
                registro[18] = rs.getString("pagado");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean insertar(vreserva dts) {
        sSQL = "insert into reserva(idapartamento,idcliente,idtrabajador,idDP,tipo_reserva,fecha_reserva,fecha_ingreso,fecha_salida,fecha_InicPro,temporada,costo_mensual,costo_total,pagadore,pagado,estado)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, dts.getIdapartamento());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdtrabajador());
            pst.setInt(4, dts.getIdDP());
            pst.setString(5, dts.getTipo_reserva());
            pst.setDate(6, dts.getFecha_reserva());
            pst.setDate(7, dts.getFecha_ingreso());
            pst.setDate(8, dts.getFecha_salida());
            pst.setDate(9, dts.getFecha_InicPro());
            pst.setString(10, dts.getTemporada());
            pst.setDouble(11, dts.getCosto_mensual());
            pst.setDouble(12, dts.getCosto_total());
            pst.setDouble(13, dts.getPagadore());
            pst.setDouble(14, dts.getPagado());
            pst.setString(15, dts.getEstado());

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

    public boolean editar(vreserva dts) {
        sSQL = "update reserva set idapartamento=?,idcliente=?,idtrabajador=?,idDP=?,tipo_reserva=?,fecha_reserva=?,fecha_ingreso=?,fecha_salida=?,fecha_InicPro=?,temporada=?,costo_mensual=?,costo_total=?,Estado=?"
                + "where idreserva=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdapartamento());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdtrabajador());
            pst.setInt(4, dts.getIdDP());
            pst.setString(5, dts.getTipo_reserva());
            pst.setDate(6, dts.getFecha_reserva());
            pst.setDate(7, dts.getFecha_ingreso());
            pst.setDate(8, dts.getFecha_salida());
            pst.setDate(9, dts.getFecha_InicPro());
            pst.setString(10, dts.getTemporada());
            pst.setDouble(11, dts.getCosto_mensual());
            pst.setDouble(12, dts.getCosto_total());
            pst.setString(13, dts.getEstado());
            pst.setInt(14, dts.getIdReserva());

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
     public boolean pagar(vreserva dts) {
           sSQL = "update reserva set pagadore = pagadore + ?, pagado= pagado + ?, estado='Pagada_Mensual' where idreserva=?"; 
            
       
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           
            pst.setDouble(1, dts.getPagado());
            pst.setDouble(2, dts.getPagadore());
            pst.setInt(3, dts.getIdReserva());
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
      public boolean pagart(vreserva dts) {
           sSQL = "update reserva set pagadore= pagadore + ?,pagado= pagado + ?, estado='Pagada_Total' where idreserva=?"; 
            
       
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setDouble(1, dts.getPagadore());
            pst.setDouble(2, dts.getPagado());
            pst.setInt(3, dts.getIdReserva());
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
     public boolean nopro(vreserva dts) {
           sSQL = "update reserva set fecha_InicPro = '2000/01/01' where idreserva=?"; 
            
       
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           
           
            pst.setInt(1, dts.getIdReserva());
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
     
    public boolean editarp(vreserva dts) {
        sSQL = "update reserva set idapartamento=?,idcliente=?,idtrabajador=?,idDP=?,tipo_reserva=?,fecha_salida=?,fecha_InicPro=?,temporada=?,costo_mensual=?,costo_total=?,Estado=?"
                + "where idreserva=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdapartamento());
            pst.setInt(2, dts.getIdcliente());
            pst.setInt(3, dts.getIdtrabajador());
            pst.setInt(4, dts.getIdDP());
            pst.setString(5, dts.getTipo_reserva());
            pst.setDate(6, dts.getFecha_salida());
            pst.setDate(7, dts.getFecha_InicPro());
            pst.setString(8, dts.getTemporada());
            pst.setDouble(9, dts.getCosto_mensual());
            pst.setDouble(10, dts.getCosto_total());
            pst.setString(11, dts.getEstado());
            pst.setInt(12, dts.getIdReserva());

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

    public boolean eliminar(vreserva dts) {
        sSQL = "delete from reserva where idreserva=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdReserva());

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

    public int diferenciaEnDias(Date fecha_salida, Date fecha_ingreso) {
        long diferenciaEnms = fecha_salida.getTime() - fecha_ingreso.getTime();
        long dias = diferenciaEnms / (1000 * 60 * 60 * 24);
        return (int) dias;
    }

    public int diferenciaEnMeses(Date fecha_ingreso, Date fecha_salida) {
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(fecha_ingreso);
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(fecha_salida);
        int startMes = (startCalendar.get(Calendar.YEAR) * 12) + startCalendar.get(Calendar.MONTH);
        int endMesMes = (endCalendar.get(Calendar.YEAR) * 12) + endCalendar.get(Calendar.MONTH);

        int difMonth = endMesMes - startMes;

        return (int) difMonth;
    }
    
    public double buscapreb(Integer Id) {

        sSQL = "select idapartamento,preciodbaja  from apartamento  order by idapartamento asc ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                if (rs.getInt("idapartamento") == Id) {
                    pb = rs.getDouble("preciodbaja");

                    return pb;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return pb;
        }
        return 0;
    }

    public double buscaprea(Integer Ida) {

        sSQL = "select idapartamento,preciodalta  from apartamento  order by idapartamento asc ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                if (rs.getInt("idapartamento") == Ida) {
                    pa = rs.getDouble("preciodalta");

                    return pa;

                }

            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return pa;
        }
        return 0;
    }

    public double buscaVDP(Integer dias) {

        sSQL = "select periodo,valor  from dp  order by idDP asc ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                if ((rs.getInt("periodo") >= dias)) {
                    vpd = rs.getDouble("valor");

                    return vpd;
                }

            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return dias;
        }
        return 0;
    }

    public int buscaIDP(Integer dias) {

        sSQL = "select idDP,periodo  from dp  order by idDP asc ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                if ((rs.getInt("periodo") >= dias)) {
                    vidp = rs.getInt("idDP");

                    return vidp;
                }

            }

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return dias;
        }
        return 0;
    }

    public DefaultTableModel mostrarvista(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "IdApart", "Num.Apart.", "Tipo_Reserva", "Fech_Ingreso", "Fech_Salida", "Fech_InicPro", "Costo_Aloj.Mes", "Costo_Aloj.Tot", "Estado_Reserva"};
        String[] registro = new String[10];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select r.idReserva,r.idapartamento,a.numero,"
                + " r.tipo_reserva,r.fecha_ingreso,r.fecha_salida,r.fecha_InicPro,r.costo_mensual,r.costo_total,r.estado"
                + " from reserva r inner join apartamento a "
                + " on r.idapartamento = a.idapartamento "
                + " where r.fecha_reserva like '%" + buscar + "%' and (r.tipo_reserva= 'Alquiler') order by  idreserva asc";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idReserva");
                registro[1] = rs.getString("idapartamento");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("tipo_reserva");
                registro[4] = rs.getString("fecha_ingreso");
                registro[5] = rs.getString("fecha_salida");
                registro[6] = rs.getString("fecha_InicPro");
                registro[7] = rs.getString("costo_mensual");
                registro[8] = rs.getString("costo_total");
                registro[9] = rs.getString("estado");

                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel mostrarvistap(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "IdApart", "Num.Apart.", "Id.Cliente", "Cliente", "idDp", "Tipo_Reserva", "Fech_Salida", "Fech_InicPro", "Temporada", "Costo_Aloj.Mes", "Costo_Aloj.Tot", "Estado_Reserva"};
        String[] registro = new String[13];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select r.idReserva,r.idapartamento,a.numero,r.idcliente,"
                + "(select nombre from persona where idpersona=r.idcliente)as clienten,"
                + " (select primerapellido from persona where idpersona=r.idcliente)as clienteap,"
                + "r.idDP, r.tipo_reserva,r.fecha_salida,r.fecha_InicPro,r.temporada,r.costo_mensual,r.costo_total,r.estado"
                + " from reserva r inner join apartamento a "
                + " on r.idapartamento = a.idapartamento "
                + " where r.fecha_reserva like '%" + buscar + "%' and (r.estado= 'Pagada_Total') and (r.tipo_reserva= 'Alquiler')order by  idreserva asc";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idReserva");
                registro[1] = rs.getString("idapartamento");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idcliente");
                registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[5] = rs.getString("idDP");
                registro[6] = rs.getString("tipo_reserva");
                registro[7] = rs.getString("fecha_salida");
                registro[8] = rs.getString("fecha_InicPro");
                registro[9] = rs.getString("temporada");
                registro[10] = rs.getString("costo_mensual");
                registro[11] = rs.getString("costo_total");
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

    public DefaultTableModel mostrarp(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "IdApart", "Num.Apart.", "idcliente", "Cliente", "idtrabajador", "Trabajador", "IDDP", "Tipo_Reserva", "Fech_Reserva", "Fech_Ingreso", "Fech_Salida", "Fech_InicPro", "Temporada", "Costo_AlojM", "Costo_AlojT", "Estado_Reserva"};
        String[] registro = new String[17];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select r.idReserva,r.idapartamento,a.numero,r.idcliente,"
                + "(select nombre from persona where idpersona=r.idcliente)as clienten,"
                + " (select primerapellido from persona where idpersona=r.idcliente)as clienteap,"
                + " r.idtrabajador,(select nombre from persona where idpersona=r.idtrabajador)as trabajadorn,"
                + " (select primerapellido from persona where idpersona=r.idtrabajador)as trabajadorap,"
                + " r.idDP,r.tipo_reserva,r.fecha_reserva,r.fecha_ingreso,r.fecha_salida,r.fecha_InicPro,r.temporada,r.costo_mensual,r.costo_total,r.estado"
                + " from reserva r inner join apartamento a "
                + " on r.idapartamento = a.idapartamento "
                + " where r.fecha_reserva like '%" + buscar + "%' and (r.tipo_reserva= 'Prorrogada')"
                + " order by  idReserva desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idReserva");
                registro[1] = rs.getString("idapartamento");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idcliente");
                registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[5] = rs.getString("idtrabajador");
                registro[6] = rs.getString("trabajadorn") + " " + rs.getString("trabajadorap");
                registro[7] = rs.getString("idDP");
                registro[8] = rs.getString("tipo_reserva");
                registro[9] = rs.getString("fecha_reserva");
                registro[10] = rs.getString("fecha_ingreso");
                registro[11] = rs.getString("fecha_salida");
                registro[12] = rs.getString("fecha_InicPro");
                registro[13] = rs.getString("temporada");
                registro[14] = rs.getString("costo_mensual");
                registro[15] = rs.getString("costo_total");
                registro[16] = rs.getString("estado");

                totalregistros = totalregistros + 1;
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
        String[] titulos = {"ID", "IdApart", "Num.Apart.", "idcliente", "Cliente", "idtrabajador", "Trabajador", "IDDP", "Tipo_Reserva", "Fech_Reserva", "Fech_Ingreso", "Fech_Salida", "Fech_InicPro", "Temporada", "Costo_AlojM", "Costo_AlojT", "Estado_Reserva"};
        String[] registro = new String[17];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select r.idReserva,r.idapartamento,a.numero,r.idcliente,"
                + "(select nombre from persona where idpersona=r.idcliente)as clienten,"
                + " (select primerapellido from persona where idpersona=r.idcliente)as clienteap,"
                + " r.idtrabajador,(select nombre from persona where idpersona=r.idtrabajador)as trabajadorn,"
                + " (select primerapellido from persona where idpersona=r.idtrabajador)as trabajadorap,"
                + " r.idDP,r.tipo_reserva,r.fecha_reserva,r.fecha_ingreso,r.fecha_salida,r.fecha_InicPro,r.temporada,r.costo_mensual,r.costo_total,r.estado"
                + " from reserva r inner join apartamento a "
                + " on r.idapartamento = a.idapartamento "
                + " where r.fecha_reserva like '%" + buscar + "%' and (r.tipo_reserva= 'Alquiler')and (r.estado= 'Pagada-Total')"
                + " order by  idreserva desc";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idReserva");
                registro[1] = rs.getString("idapartamento");
                registro[2] = rs.getString("numero");
                registro[3] = rs.getString("idcliente");
                registro[4] = rs.getString("clienten") + " " + rs.getString("clienteap");
                registro[5] = rs.getString("idtrabajador");
                registro[6] = rs.getString("trabajadorn") + " " + rs.getString("trabajadorap");
                registro[7] = rs.getString("idDP");
                registro[8] = rs.getString("tipo_reserva");
                registro[9] = rs.getString("fecha_reserva");
                registro[10] = rs.getString("fecha_ingreso");
                registro[11] = rs.getString("fecha_salida");
                registro[12] = rs.getString("fecha_InicPro");
                registro[13] = rs.getString("temporada");
                registro[14] = rs.getString("costo_mensual");
                registro[15] = rs.getString("costo_total");
                registro[16] = rs.getString("estado");

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
