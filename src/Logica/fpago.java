package Logica;

import Datos.vconsumo;
import Datos.vpagos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.persistence.Convert;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inesm
 */
public class fpago {

	private final Conexion mysql = new Conexion();
	private final Connection cn = mysql.conectar();
	private String sSQL = "";
	private String sSQL2 = "";
	public Integer totalregistros;
	public Double totaldeconsumo;
	public Double totaldepago;
	public Double totaldreserva;

	public DefaultTableModel mostrar(String buscar) {
		DefaultTableModel modelo;
		String[] titulos = {"ID", "IdReserva", "Tipo_Comprob.", "Num_Comprob.", "Pagado_Reserva", "Pagado_Consumo", "Total_Pagado", "Fecha_Emisiòn", "Fecha_Pago", "IVA", "Tipo_Pago", "Num-Tarjeta", "Estado"};
		String[] registro = new String[13];
		totalregistros = 0;
		totaldeconsumo = 0.0;
		totaldepago = 0.0;

		modelo = new DefaultTableModel(null, titulos);
		sSQL = "select * from pago  order by idpago desc";

		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sSQL);
			while (rs.next()) {
				registro[0] = rs.getString("idpago");
				registro[1] = rs.getString("idreserva");

				registro[2] = rs.getString("tipo_comprobante");
				registro[3] = rs.getString("num_comprobante");
				registro[4] = rs.getString("pagoreserva");
				registro[5] = rs.getString("pagoconsumo");
				registro[6] = rs.getString("total_pago");
				registro[7] = rs.getString("fecha_emision");
				registro[8] = rs.getString("fecha_pago");
				registro[9] = rs.getString("iva");
				registro[10] = rs.getString("tipo_pago");
				registro[11] = rs.getString("num_tarjeta");
				registro[12] = rs.getString("estado");

				totalregistros = totalregistros + 1;

				totaldepago = Math.rint(totaldepago + (rs.getDouble("total_pago")));
				modelo.addRow(registro);

			}
			return modelo;

		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			return null;
		}
	}

	public DefaultTableModel mostrarpin(String buscar) {
		DefaultTableModel modelo;
		String[] titulos = {"ID", "IdReserva", "Número", "Fecha_Pago", "Tipo_Comprob.", "Num_Comprob.", "Pagado_Reserva", "Pagado_Consumo", "Estado", "Total_Pagado"};
		String[] registro = new String[10];
		totalregistros = 0;
		totaldeconsumo = 0.0;
		totaldepago = 0.0;
		totaldreserva = 0.00;
		modelo = new DefaultTableModel(null, titulos);
		sSQL = "select  r.idapartamento,r.idreserva,p.idpago,p.fecha_pago,p.tipo_comprobante,"
			+ "(select numero from apartamento where idapartamento=r.idapartamento  ) AS numero,"
			+ "p.num_comprobante,p.pagoreserva,p.pagoconsumo,p.estado,p.total_pago"
			+ " from reserva r inner join pago p "
			+ " on r.idreserva = p.idreserva "
			+ " where p.num_comprobante like '%" + buscar + "%'  group by num_comprobante";
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sSQL);
			while (rs.next()) {
				registro[0] = rs.getString("idpago");
				registro[1] = rs.getString("idreserva");
				registro[2] = rs.getString("numero");
				registro[3] = rs.getString("fecha_pago");
				registro[4] = rs.getString("tipo_comprobante");
				registro[5] = rs.getString("num_comprobante");
				registro[6] = rs.getString("pagoreserva");
				registro[7] = rs.getString("pagoconsumo");
				registro[8] = rs.getString("estado");
				registro[9] = rs.getString("total_pago");

				totalregistros = totalregistros + 1;
				totaldeconsumo = totaldeconsumo + (rs.getDouble("pagoconsumo"));
				totaldreserva = totaldreserva + (rs.getDouble("pagoreserva"));
				totaldepago = totaldepago + (rs.getDouble("total_pago"));
				modelo.addRow(registro);

			}
			return modelo;

		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			return null;
		}
	}

	public boolean insertar(vpagos dts) {
		sSQL = "insert into pago(idreserva,tipo_comprobante,num_comprobante,pagoreserva,pagoconsumo,total_pago,fecha_emision,fecha_pago,iva,tipo_pago,num_tarjeta,estado)"
			+ "values(?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);

			pst.setInt(1, dts.getIdreserva());

			pst.setString(2, dts.getTipo_comprobante());
			pst.setString(3, dts.getNum_comprobante());
			pst.setDouble(4, dts.getPagoreserva());
			pst.setDouble(5, dts.getPagoconsumo());
			pst.setDouble(6, dts.getTotal_pago());
			pst.setDate(7, dts.getFecha_emision());
			pst.setDate(8, dts.getFecha_pago());
			pst.setInt(9, dts.getIva());
			pst.setString(10, dts.getTipo_pago());
			pst.setString(11, dts.getNum_tarjeta());
			pst.setString(12, dts.getEstado());

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

	public boolean editar(vpagos dts) {
		sSQL = "update pago set idreserva=?,tipo_comprobante=?,num_comprobante=?,pagoreserva=?,pagoconsumo=?,total_pago=?,fecha_emision=?,fecha_pago=?,iva=?,tipo_pago=?,num_tarjeta=?,estado=?"
			+ "where idpago=?";
		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);
			pst.setInt(1, dts.getIdreserva());

			pst.setString(2, dts.getTipo_comprobante());
			pst.setString(3, dts.getNum_comprobante());
			pst.setDouble(4, dts.getPagoreserva());
			pst.setDouble(5, dts.getPagoconsumo());
			pst.setDouble(6, dts.getTotal_pago());
			pst.setDate(7, dts.getFecha_emision());
			pst.setDate(8, dts.getFecha_pago());
			pst.setInt(9, dts.getIva());
			pst.setString(10, dts.getTipo_pago());
			pst.setString(11, dts.getNum_tarjeta());
			pst.setString(12, dts.getEstado());

			pst.setInt(13, dts.getIdpago());

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

	public int buscid(vpagos dts) {

		sSQL = "select idpago   from pago order by idpago desc limit 1";

		try {

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sSQL);
			while (rs.next()) {
				int ned = (rs.getInt("idpago") + 1);

				return ned;

			}
		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);

		}

		return 0;
	}

	public boolean eliminar(vpagos dts) {
		sSQL = "delete from pago where idpago=?";
		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);
			pst.setInt(1, dts.getIdpago());

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

	public boolean validatarj(String tipo, String tarjeta) {
		int din = 0;
		if (tipo.equals("American Express")) {
			din = 3;
		} else {
			if (tipo.equals("Visa")) {
				din = 4;
			} else {
				if (tipo.equals("Mastercard")) {
					din = 5;
				} else {
					if (tipo.equals("Discover")) {
						din = 6;
					}
				}
			}
			String tt = tarjeta.substring(0, 1);
			int tss = Integer.parseInt(tt);
			if (!(tss == din)) {
				JOptionPane.showConfirmDialog(null, "La Tarjeta no es del tipo Seleccionado");
			} else {
				int i;
				int longitud = tarjeta.length();
				int cifra = 0;
				String cifra_cad = "";
				int suma = 0;
				String lcValidar = "";
				
				String cadena = tarjeta;
				
				}


		}
		return false;
}

public int buscavalor(String tipoc) {
		sSQL = "select valor  from ComprobantesP where nombre like '%" + tipoc + "%' ";

		try {

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sSQL);
			while (rs.next()) {
				int ned = (rs.getInt("valor") + 1);

				return ned;

			}
		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);

		}
		return 0;
	}

}
