/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import Datos.vsolicitudescalls;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javaemail.Correo;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;


/**
 *
 * @author inesm
 */
public class fsolicitudesCalls {
    private final Conexion mysql = new Conexion();
    private final Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;

	public DefaultTableModel mostrar(String buscar) {
		DefaultTableModel modelo;
		String[] titulos = {"ID", "#Llamante","Fechallamada","Tipo_Apartto","FechaIngresoDeseada", "FechaSalidaDeseada","idapartamento", "#Aptto","#SolicitudWeb","#Cliente","# Reserva", "Estado", "Trabajador"};
		String[] registro = new String[13];
		totalregistros = 0;
		modelo = new DefaultTableModel(null, titulos);
		sSQL = "select idllamada,Numllaman,FechaSol,TipoA,"
			+ " FechaIngresoDeseada,FechasalidaDeseada,idapartamento,numero,"
			+ " idSolicitudweb,idcliente,idreserva,Estado,idtrabajador"
			+ " from solicitudescalls where ((Numllaman like '%" + buscar + "%') and (!(Estado='Cancelada') )) order by  idllamada asc";

		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sSQL);
			while (rs.next()) {
				registro[0] = rs.getString("idllamada");
				registro[1] = rs.getString("Numllaman");
				registro[2] = rs.getString("FechaSol");
				registro[3] = rs.getString("TipoA");
				registro[4] = rs.getString("FechaIngresoDeseada");
				registro[5] = rs.getString("FechaSalidaDeseada");
				registro[6] = rs.getString("idapartamento");
				registro[7] = rs.getString("Numero");
				registro[8] = rs.getString("idSolicitudWeb");
				registro[9] = rs.getString("idcliente");
				registro[10] = rs.getString("idreserva");
				registro[11] = rs.getString("Estado");
				registro[12] = rs.getString("idTrabajador");

				totalregistros = totalregistros + 1;
				modelo.addRow(registro);

			}
			return modelo;

		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			return null;
		}
	}

	
    public boolean insertar(vsolicitudescalls dts) {
		sSQL = "insert into solicitudescalls(Numllaman,FechaSol,TipoA,FechaIngresoDeseada,FechaSalidaDeseada,idapartamento,numero,idSolicitudWeb,idcliente,idreserva,Estado,idTrabajador)values (?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);

			
			pst.setString(1, dts.getNumllaman());
			pst.setDate(2, dts.getFechaSol());
			pst.setString(3, dts.getTipoA());
			pst.setDate(4, dts.getFechaIngresoDeseada());
			pst.setDate(5, dts.getFechaSalidaDeseada());
			pst.setInt(6, dts.getIdapartamento());
			pst.setInt(7, dts.getNumero());
			pst.setInt(8, dts.getIdsolicitudWeb());
			pst.setInt(9, dts.getIdcliente());
			pst.setInt(10, dts.getIdreserva());
			pst.setString(11, dts.getEstado());
			pst.setInt(12, dts.getIdtrabajador());

			int n = pst.executeUpdate();

			if (n != 0) {

				return true;

			} else {
				return false;
			}

		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			return false;
		}

	}

	public boolean editar(vsolicitudescalls dts) {
		sSQL = "update solicitudescalls set Estado=? where idllamada=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);

			pst.setString(1, dts.getEstado());
			pst.setInt(2, dts.getIdllamada());
			int n = pst.executeUpdate();

			if (n != 0) {
				return true;

			} else {
				return false;
			}

		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			return false;
		}

	}

	public boolean eliminar(vsolicitudescalls dts) {
		sSQL = "delete from solicitudescalls where idllamada=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);

			pst.setInt(1, dts.getIdllamada());

			int n = pst.executeUpdate();

			if (n != 0) {

				return true;

			} else {
				return false;
			}

		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			return false;
		}

	}
     public int buscid(vsolicitudescalls dts) {

        sSQL = "select idllamada  from solicitudescalls order by idllamada desc limit 1";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                int ned = (rs.getInt("idllamada")+1);

                return ned;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return 0;  
}
      public int buscid2(Integer nu) {

        sSQL = "select idapartamento  from apartamento where numero like '%" + nu + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                int ned = rs.getInt("idapartamento");
                return ned;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return 0;  
}
        public String buscemail(Integer nu) {

        sSQL = "select email  from persona where idpersona like '%" + nu + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
             String ned = rs.getString("email");
                return ned;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return "";  
}
     public String buscestado(String buscar) {

        sSQL = "select estado  from solicitudesweb where idsolicitud like '%" + buscar + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                String est = rs.getString("estado");
                return est;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return " ";  
}
       public Date buscfein(String buscar) {

        sSQL = "select FechaIngresoDeseada  from solicitudesweb where idsolicitud like '%" + buscar + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                Date fe = rs.getDate("FechaIngresoDeseada");
                return fe;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return null;  
}
         public Date buscfesa(String buscar) {

         sSQL = "select FechaSalidaDeseada  from solicitudesweb where idsolicitud like '%" + buscar + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                Date fesa = rs.getDate("FechaSalidaDeseada");
                return fesa;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return null;  
}
	   public String busctipo(String buscar) {

        sSQL = "select tipo  from solicitudesweb where idsolicitud like '%" + buscar + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
               String tip = rs.getString("tipo");
                return tip;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return " ";  
}
	     public int buscidA(String buscar) {

        sSQL = "select idapartamento  from solicitudesweb where idsolicitud like '%" + buscar + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                int ned = rs.getInt("idapartamento");
                return ned;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return 0;  
}
	       public int buscapt(String buscar) {

        sSQL = "select numero  from solicitudesweb where idsolicitud like '%" + buscar + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                int apt = rs.getInt("numero");
                return apt;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return 0;  
}
         public String buscema(String buscar) {

         sSQL = "select email  from solicitudesweb where idsolicitud like '%" + buscar + "%'  ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                String ema = rs.getString("email");
                return ema;

            }
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
          
        }

   return " ";  
}
      
      public int diferenciaEnDias(Date fecha_salida, Date fecha_ingreso) {
        long diferenciaEnms = fecha_salida.getTime() - fecha_ingreso.getTime();
        long dias = diferenciaEnms / (1000 * 60 * 60 * 24);
        return (int) dias;
    }  
   Correo c = new Correo();

	public boolean enviarCorreo(Correo c) {
		try {
			Properties p = new Properties();
			p.put("mail.smtp.host", "smtp.gmail.com");
			p.setProperty("mail.smtp.starttls.enable", "true");
			p.setProperty("mail.smtp.port", "587");
			p.setProperty("mail.smtp.user", c.getUsuarioCorreo());
			p.setProperty("mail.smtp.auth", "true");

			Session s = Session.getDefaultInstance(p, null);

			BodyPart texto = new MimeBodyPart();
			texto.setText(c.getMensaje());
			BodyPart adjunto = new MimeBodyPart();

			if (!c.getRutaArchivo().equals("")) {
				adjunto.setDataHandler(new DataHandler(new FileDataSource(c.getRutaArchivo())));
				adjunto.setFileName(c.getNombreArchivo());
			}
			MimeMultipart m = new MimeMultipart();
			m.addBodyPart(texto);
			if (!c.getRutaArchivo().equals("")) {
				m.addBodyPart(adjunto);
			}
			MimeMessage mensaje = new MimeMessage(s);
			mensaje.setFrom(new InternetAddress(c.getUsuarioCorreo()));
			mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(c.getDestino()));
			mensaje.setSubject(c.getAsunto());
			mensaje.setContent(m);

			Transport t = s.getTransport("smtp");
			t.connect(c.getUsuarioCorreo(), c.getContrasenia());
			t.sendMessage(mensaje, mensaje.getAllRecipients());
			t.close();
			return true;

		} catch (Exception e) {
			
			return false;
		}
	}
public static void exportToPdf(String path){

	
	    try {
		    JasperExportManager.exportReportToPdfFile(path);
		    
	    } catch (JRException ex) {
		  ex.printStackTrace();;
	    }
}

}
