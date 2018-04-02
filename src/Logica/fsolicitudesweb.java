package Logica;

import Datos.vcorreo;
import Datos.vsolicitudesweb;
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
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.FlagTerm;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inesm
 */
public class fsolicitudesweb {

	private final Conexion mysql = new Conexion();
	private final Connection cn = mysql.conectar();
	private String sSQL = "";
	private String sSQL2 = "";
	public Integer totalregistros;

	public DefaultTableModel mostrar(String buscar) {
		DefaultTableModel modelo;
		String[] titulos = {"ID", "idapartamento", "Número", "Tipo_Apartamento", "FechaIngresoDeseada", "FechaSalidaDeseada", "Estado", "Email"};
		String[] registro = new String[8];
		totalregistros = 0;
		modelo = new DefaultTableModel(null, titulos);
		sSQL = "select idsolicitud,idapartamento,numero,"
			+ " Tipo,FechaIngresoDeseada,FechasalidaDeseada,Estado,email"
			+ " from solicitudesweb where ((FechaIngresoDeseada like '%" + buscar + "%') and (!(Estado='Gestionada'))) order by  idsolicitud asc";

		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sSQL);
			while (rs.next()) {
				registro[0] = rs.getString("idSolicitud");
				registro[1] = rs.getString("idapartamento");
				registro[2] = rs.getString("Numero");
				registro[3] = rs.getString("Tipo");
				registro[4] = rs.getString("FechaIngresoDeseada");
				registro[5] = rs.getString("FechaSalidaDeseada");
				registro[6] = rs.getString("Estado");
				registro[7] = rs.getString("email");

				totalregistros = totalregistros + 1;
				modelo.addRow(registro);

			}
			return modelo;

		} catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			return null;
		}
	}

	public boolean insertar(vsolicitudesweb dts) {
		sSQL = "insert into solicitudesweb(idapartamento,numero,Tipo,FechaIngresoDeseada,FechaSalidaDeseada,Estado,email)values (?,?,?,?,?,?,?)";

		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);

			pst.setInt(1, dts.getIdapartamento());
			pst.setString(2, dts.getNumero());
			pst.setString(3, dts.getTipo());
			pst.setDate(4, dts.getFechaIngresoDeseada());
			pst.setDate(5, dts.getFechaSalidaDeseada());
			pst.setString(6, dts.getEstado());
			pst.setString(7, dts.getEmail());

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

	public boolean editar(vsolicitudesweb dts) {
		sSQL = "update solicitudesweb set Estado=? where idSolicitud=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);

			pst.setString(1, dts.getEstado());
			pst.setInt(2, dts.getIdSolicitud());
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

	public boolean eliminar(vsolicitudesweb dts) {
		sSQL = "delete from solicitudesweb where idsolicitud=?";

		try {
			PreparedStatement pst = cn.prepareStatement(sSQL);

			pst.setInt(1, dts.getIdSolicitud());

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
	String con = null;

	public boolean recibirCorreo(Correo c) {

		try {

// Create empty properties
			Properties prop = new Properties();
			prop.setProperty("mail.pop3.starttls.enable", "false");
			prop.setProperty(
				"mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			prop.setProperty("mail.pop3.socketFactory.fallback", "false");
			prop.setProperty("mail.pop3.port", "995");
			prop.setProperty("mail.pop3.socketFactory.port", "995");
			Session sesion = Session.getInstance(prop);
			/*sesion.setDebug(true);*/

// Get the store
			Store store = sesion.getStore("pop3");
			store.connect("pop.gmail.com", "aptosbrasilia@gmail.com", "ebfwndfprykkhrqy");
// Get folder

			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_WRITE);
FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.RECENT), false);
			

// Get message
			Message[] mensajes = folder.getMessages();

			for (int i = 0, n = mensajes.length; i < n; i++) {
				c.setDesde(mensajes[i].getFrom()[0].toString());
				c.setAsuntore(mensajes[i].getSubject());
				mensajes[i].writeTo(System.out);
				// Se visualiza, si se sabe como, el contenido de cada mensaje
				con = analizaParteDeMensaje(mensajes[i]);

				c.setMensare(con);
			Recibidoweb(c.getDesde(), c.getAsuntore(), c.getMensare());
		mensajes[i].setFlag(Flags.Flag.SEEN, true);
			}

			// Close connection 
			folder.close(false);
			store.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public void Recibidoweb(String Usuario, String Asunto, String Mensaje) throws java.text.ParseException {
		vcorreo dts = new vcorreo();
		fcorreo func = new fcorreo();

		dts.setUsuarioWeb(Usuario);
		dts.setAsunto(Asunto);
		dts.setMensajeRE(Mensaje);
		func.insertar(dts);
		String id = Mensaje.substring(64, 65);

		String Tip = Mensaje.substring(32, 51);
		String Num = Mensaje.substring(53, 57);

		String FeIn = Mensaje.substring(71,82);
		String FeSal = Mensaje.substring(85, 97);

		java.util.Date FeIN;
		FeIN = new java.util.Date(FeIn);
		java.sql.Date FechaIn = new java.sql.Date(FeIN.getTime());
		java.util.Date FeSA;
		FeSA = new java.util.Date(FeSal);
		java.sql.Date FechaSal = new java.sql.Date(FeSA.getTime());

		vsolicitudesweb dts2 = new vsolicitudesweb();
		fsolicitudesweb func2 = new fsolicitudesweb();
		dts2.setIdapartamento(Integer.parseInt(id));
		dts2.setNumero(Num);
		dts2.setTipo(Tip);
		dts2.setFechaIngresoDeseada(FechaIn);
		dts2.setFechaSalidaDeseada(FechaSal);
		dts2.setEstado("Recibida");
		dts2.setEmail(Usuario);
		func2.insertar(dts2);

	}
	String cor = null;

	public String analizaParteDeMensaje(Part unaParte) {

		try {
			// Si es multipart, se analiza cada una de sus partes recursivamente.
			if (unaParte.isMimeType("multipart/*")) {
				Multipart multi;
				multi = (Multipart) unaParte.getContent();

				for (int j = 0; j < multi.getCount(); j++) {
					analizaParteDeMensaje(multi.getBodyPart(j));
				}
			} else {
				// Si es texto, se devuelve el texto.
				if (unaParte.isMimeType("text/plain")) {

					cor = (unaParte.getContent().toString());

					return cor;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return cor;
	}

	public boolean disponi(Integer id, Date fei){
		boolean esta=false;
		 sSQL = "select idapartamento,Fecha_Salida from reserva";

		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sSQL);
			while (rs.next()) {
				if (rs.getInt("idapartamento") == id) {
					esta=true;
					if (rs.getDate("Fecha_salida").before(fei)) {

						int n = rs.getRow();
						if (n != 0) {
							return true;
						} 
					}
				}
			}
			if (!rs.next()){
				
				if(!esta){
	 
				return true;
				}
			}
		}catch (SQLException e) {
			JOptionPane.showConfirmDialog(null, e);
			return false;
		}
	return false;	

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
			e.printStackTrace();
			return false;
		}
	}

	
	
}
