/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.vsolicitudescalls;
import Datos.vsolicitudesweb;
import Logica.Conexion;
import Logica.fsolicitudesCalls;
import Logica.fsolicitudesweb;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author inesm
 */
public class frmGestionCalls extends javax.swing.JInternalFrame {

	/**
	 * Creates new form frmGestionCalls
	 */
	private String accion;
	public static String idllamada;
	public static Boolean emailreser;
	public static Boolean solweb;
	public Date finw, fsaw, fsol, fit, fidt, fst;
	public int f, df;
	Calendar cal, cal1, cal2, cal3, cal4;
	int d, m, m1, m2, m3, m4, a;

	public frmGestionCalls() {
		initComponents();
		inhabilitar();
		txtidllamada.setText(idllamada);
	}

	void inhabilitar() {
		txtidllamada.setEnabled(false);
		
		
		txtTelfllaman.setEnabled(true);
		dcFechasol.setEnabled(true);
		txttrabajador.setEnabled(false);
		txtidapartaT.setEnabled(false);
		txtidapartaW.setEnabled(false);
		txtidtrabajador.setEnabled(false);
		chbNoweb.setEnabled(false);
		chbsolWeb.setEnabled(false);
		chbvsolweb.setEnabled(false);
		chbvsolweb.setVisible(false);
		lbtipoAT.setEnabled(false);
		cbotipoA.setEnabled(false);
		lbfeinT.setEnabled(false);
		dcfeindesT.setEnabled(false);
		lbfesaT.setEnabled(false);
		dcfesadesT.setEnabled(false);
		txtidapartaT.setEnabled(false);
		chbdispo.setEnabled(false);
		lbaptoT.setEnabled(false);
		cboapto.setEnabled(false);
		lbclienteT.setEnabled(false);
		lblTsolweb.setEnabled(false);
		lblTsolweb.setVisible(false);
		lbllamada.setEnabled(false);
		lbllamada.setVisible(false);
		lbreserva.setEnabled(false);
		txtidreserva.setEnabled(false);
		lbestadoT.setEnabled(false);
		cboestadoT.setEnabled(false);
		lbnsolweb.setEnabled(false);
		txtsolicitud.setEnabled(false);
		chbvsolweb.setEnabled(false);
		lbfeinW.setEnabled(false);
		dcFeinW.setEnabled(false);
		lbfesaW.setEnabled(false);
		dcfesaW.setEnabled(false);
		lbestadoW.setEnabled(false);
		txtestadoW.setEnabled(false);
		lbaptoW.setEnabled(false);
		txtAptoW.setEnabled(false);
		lbtipoAW.setEnabled(false);
		txttipoA.setEnabled(false);
		lbemail.setEnabled(false);
		txtidapartaW.setEnabled(false);
		lbidapW.setEnabled(false);
		txtemail.setVisible(false);
		txtidapartaT.setVisible(false);
		txtidreserva.setVisible(false);
		txtsolicitud.setVisible(false);
		dcFechasol.setVisible(true);
		dcFeinW.setVisible(false);
		dcfesaW.setVisible(false);
		txtAptoW.setVisible(false);
		txtemail.setVisible(false);
		txtestadoW.setVisible(false);
		txttipoA.setVisible(false);
		txtidapartaW.setVisible(false);
		txtidtrabajador.setVisible(false);
		lbtipoAT.setVisible(false);
		lbfeinT.setVisible(false);
		lbfesaT.setVisible(false);
		lbaptoT.setVisible(false);
		lbclienteT.setVisible(false);
		lbreserva.setVisible(false);
		lbestadoT.setVisible(false);
		lbnsolweb.setVisible(false);
		lbfeinW.setVisible(false);
		lbfesaW.setVisible(false);
		lbestadoW.setVisible(false);
		lbaptoW.setVisible(false);
		lbtipoAW.setVisible(false);
		lbemail.setVisible(false);
		txtidllamada.setVisible(true);
		txtTelfllaman.setVisible(true);
		dcFechasol.setVisible(true);
		txttrabajador.setVisible(true);
		chbNoweb.setVisible(true);
		chbsolWeb.setVisible(true);
		chbdispo.setVisible(false);
		cboapto.setVisible(false);
		txtcliente.setEnabled(false);
		txtcliente.setVisible(false);
		cbotipoA.setVisible(false);
		cboestadoT.setVisible(false);
		chbvsolweb.setVisible(false);
		dcfeindesT.setVisible(false);
		dcfesadesT.setVisible(false);
		txtidapartaT.setVisible(false);
		txtidapartaW.setVisible(false);
		txtidapartaW.setVisible(false);
		lbidapW.setVisible(false);
		btnid.setEnabled(false);
		btnid.setVisible(false);
		
	}

	void habilitarT() {
		chbNoweb.setSelected(true);
		chbsolWeb.setVisible(false);
		chbvsolweb.setEnabled(false);
		chbvsolweb.setVisible(false);
		lbllamada.setEnabled(true);
		lbllamada.setVisible(true);
		lbtipoAT.setEnabled(true);
		cbotipoA.setEnabled(true);
		lbtipoAT.setVisible(true);
		cbotipoA.setVisible(true);
		lbfeinT.setEnabled(true);
		dcfeindesT.setEnabled(true);
		lbfesaT.setEnabled(true);
		dcfesadesT.setEnabled(true);
		lbfeinT.setVisible(true);
		lbfesaT.setVisible(true);
		dcfeindesT.setVisible(true);
		dcfesadesT.setVisible(true);
		lbaptoT.setEnabled(true);
		cboapto.setEnabled(true);
		lbaptoT.setVisible(true);
		cboapto.setVisible(true);
		lbclienteT.setEnabled(true);
		txtcliente.setEnabled(true);
		txtcliente.setVisible(true);
		lbclienteT.setVisible(true);
		btnid.setEnabled(true);
		btnid.setVisible(true);
		lbreserva.setEnabled(true);
		txtidreserva.setEnabled(true);
		lbestadoT.setEnabled(true);
		cboestadoT.setEnabled(true);
		lbreserva.setVisible(true);
		txtidreserva.setVisible(true);
		lbestadoT.setVisible(true);
		cboestadoT.setVisible(true);
		chbdispo.setEnabled(true);
		chbdispo.setVisible(true);
		txtidapartaT.setVisible(true);
		
		

	}

	void habilitarW() {
		
		lblTsolweb.setEnabled(true);
		lblTsolweb.setVisible(true);
		chbvsolweb.setEnabled(true);
		chbvsolweb.setVisible(true);
		chbsolWeb.setSelected(true);
		chbsolWeb.setVisible(true);
		chbNoweb.setVisible(false);
		lbnsolweb.setEnabled(true);
		txtsolicitud.setEnabled(true);
		lbnsolweb.setVisible(true);
		txtsolicitud.setVisible(true);

		lbfeinW.setEnabled(true);
		dcFeinW.setEnabled(true);
		lbfeinW.setVisible(true);
		dcFeinW.setVisible(true);

		lbfesaW.setEnabled(true);
		dcfesaW.setEnabled(true);
		lbfesaW.setVisible(true);
		dcfesaW.setVisible(true);

		lbestadoW.setEnabled(true);
		txtestadoW.setEnabled(true);
		lbestadoW.setVisible(true);
		txtestadoW.setVisible(true);

		lbtipoAW.setEnabled(true);
		txttipoA.setEnabled(true);
		lbtipoAW.setVisible(true);
		txttipoA.setVisible(true);

		lbaptoW.setEnabled(true);
		txtAptoW.setEnabled(true);
		lbaptoW.setVisible(true);
		txtAptoW.setVisible(true);
		
		
		lbemail.setEnabled(true);
		txtemail.setEnabled(true);
		lbemail.setVisible(true);
		txtemail.setVisible(true);
		lbclienteT.setEnabled(true);
		txtcliente.setEnabled(true);
		txtcliente.setVisible(true);
		lbclienteT.setVisible(true);
		txtidapartaW.setEnabled(true);
		lbidapW.setVisible(true);
		lbreserva.setEnabled(true);
		txtidreserva.setEnabled(true);
		lbestadoT.setEnabled(true);
		cboestadoT.setEnabled(true);
		lbreserva.setVisible(true);
		txtidreserva.setVisible(true);
		lbestadoT.setVisible(true);
		cboestadoT.setVisible(true);
		txtidapartaW.setVisible(true);
		lbidapW.setEnabled(true);
		lbidapW.setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jDateChooser1 = new com.toedter.calendar.JDateChooser();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                txtidllamada = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                txttrabajador = new javax.swing.JTextField();
                txtidtrabajador = new javax.swing.JTextField();
                txtTelfllaman = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                chbNoweb = new javax.swing.JCheckBox();
                chbsolWeb = new javax.swing.JCheckBox();
                jSeparator1 = new javax.swing.JSeparator();
                lbllamada = new javax.swing.JLabel();
                lbtipoAT = new javax.swing.JLabel();
                lbfeinT = new javax.swing.JLabel();
                dcfeindesT = new com.toedter.calendar.JDateChooser();
                lbfesaT = new javax.swing.JLabel();
                dcfesadesT = new com.toedter.calendar.JDateChooser();
                txtidapartaT = new javax.swing.JTextField();
                chbdispo = new javax.swing.JCheckBox();
                lbaptoT = new javax.swing.JLabel();
                cboapto = new javax.swing.JComboBox<>();
                lbclienteT = new javax.swing.JLabel();
                txtcliente = new javax.swing.JTextField();
                lbreserva = new javax.swing.JLabel();
                txtidreserva = new javax.swing.JTextField();
                lbestadoT = new javax.swing.JLabel();
                cboestadoT = new javax.swing.JComboBox<>();
                jSeparator2 = new javax.swing.JSeparator();
                lblTsolweb = new javax.swing.JLabel();
                lbnsolweb = new javax.swing.JLabel();
                txtsolicitud = new javax.swing.JTextField();
                lbestadoW = new javax.swing.JLabel();
                txtestadoW = new javax.swing.JTextField();
                lbfeinW = new javax.swing.JLabel();
                lbfesaW = new javax.swing.JLabel();
                lbtipoAW = new javax.swing.JLabel();
                txttipoA = new javax.swing.JTextField();
                txtidapartaW = new javax.swing.JTextField();
                lbaptoW = new javax.swing.JLabel();
                txtAptoW = new javax.swing.JTextField();
                lbemail = new javax.swing.JLabel();
                txtemail = new javax.swing.JTextField();
                btngcliente = new javax.swing.JButton();
                btngreserva = new javax.swing.JButton();
                btngllam = new javax.swing.JButton();
                chbvsolweb = new javax.swing.JCheckBox();
                lbidapW = new javax.swing.JLabel();
                cbotipoA = new javax.swing.JComboBox<>();
                btnid = new javax.swing.JButton();
                dcFechasol = new com.toedter.calendar.JDateChooser();
                dcFeinW = new com.toedter.calendar.JDateChooser();
                dcfesaW = new com.toedter.calendar.JDateChooser();
                btnenviareaserva = new javax.swing.JButton();
                nombre = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                lblnombre = new javax.swing.JLabel();
                btncsol = new javax.swing.JButton();

                setClosable(true);
                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setIconifiable(true);
                setMaximizable(true);
                setResizable(true);

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Brasilia13.png"))); // NOI18N

                jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 153, 204));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Gestionando Solicitud-Reserva Telefónicas");

                jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(0, 153, 204));
                jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel9.setText("Fecha:");

                jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(0, 153, 204));
                jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel8.setText("# LLamada:");

                jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(0, 153, 204));
                jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel10.setText("Trabajador:");

                txtTelfllaman.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

                jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(0, 153, 204));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("# LLamante:");

                chbNoweb.setBackground(new java.awt.Color(0, 0, 0));
                chbNoweb.setForeground(new java.awt.Color(0, 153, 204));
                chbNoweb.setText("NO POSEE SOLICITUD WEB");
                chbNoweb.setNextFocusableComponent(cbotipoA);
                chbNoweb.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                chbNowebItemStateChanged(evt);
                        }
                });
                chbNoweb.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                chbNowebMouseClicked(evt);
                        }
                });
                chbNoweb.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chbNowebActionPerformed(evt);
                        }
                });

                chbsolWeb.setBackground(new java.awt.Color(0, 0, 0));
                chbsolWeb.setForeground(new java.awt.Color(0, 153, 204));
                chbsolWeb.setText("POSEE SOLICITUD WEB");
                chbsolWeb.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                chbsolWebItemStateChanged(evt);
                        }
                });
                chbsolWeb.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                chbsolWebMouseClicked(evt);
                        }
                });
                chbsolWeb.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chbsolWebActionPerformed(evt);
                        }
                });

                lbllamada.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbllamada.setForeground(new java.awt.Color(0, 0, 0));
                lbllamada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbllamada.setText("LLAMADA  ACTUAL");

                lbtipoAT.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbtipoAT.setForeground(new java.awt.Color(0, 153, 204));
                lbtipoAT.setText("Tipo-Apto:");

                lbfeinT.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbfeinT.setForeground(new java.awt.Color(0, 153, 204));
                lbfeinT.setText("FechaIngreso-Deseada:");

                dcfeindesT.setDateFormatString("yyyy-MM-dd");

                lbfesaT.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbfesaT.setForeground(new java.awt.Color(0, 153, 204));
                lbfesaT.setText("FechaSalida-Deseada:");

                dcfesadesT.setDateFormatString("yyyy-MM-dd");

                chbdispo.setBackground(new java.awt.Color(0, 0, 0));
                chbdispo.setForeground(new java.awt.Color(0, 153, 204));
                chbdispo.setText("VERIFICANDO DISPONIBILIDAD REAL.");
                chbdispo.addItemListener(new java.awt.event.ItemListener() {
                        public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                chbdispoItemStateChanged(evt);
                        }
                });
                chbdispo.addChangeListener(new javax.swing.event.ChangeListener() {
                        public void stateChanged(javax.swing.event.ChangeEvent evt) {
                                chbdispoStateChanged(evt);
                        }
                });
                chbdispo.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                chbdispoMouseClicked(evt);
                        }
                });
                chbdispo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chbdispoActionPerformed(evt);
                        }
                });

                lbaptoT.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbaptoT.setForeground(new java.awt.Color(0, 153, 204));
                lbaptoT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbaptoT.setText("# Apto:");

                cboapto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103", "104", "105", "106", "107", "201", "202", "203", "204", "205", "206", "207", "301", "302", "303", "304", "305", "306", "307", "308", "401", "402", "403", "404", "405", "406", "407", "501", "502", "503", "504", "505", "506", "507", "601", "602", "603", "604", "605", "606", "607", "701", "702", "703", "704", "705", "706", "801", "802", "803", "804", "805", "806", "807" }));

                lbclienteT.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbclienteT.setForeground(new java.awt.Color(0, 153, 204));
                lbclienteT.setText("Cliente:");

                txtcliente.setToolTipText("");

                lbreserva.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbreserva.setForeground(new java.awt.Color(0, 153, 204));
                lbreserva.setText("# Reserva:");

                lbestadoT.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbestadoT.setForeground(new java.awt.Color(0, 153, 204));
                lbestadoT.setText("Estado:");

                cboestadoT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Tramite", "Tramitada", "Cancelada" }));
                cboestadoT.setNextFocusableComponent(txtsolicitud);

                lblTsolweb.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lblTsolweb.setForeground(new java.awt.Color(0, 0, 0));
                lblTsolweb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblTsolweb.setText("SOLICITUD WEB");

                lbnsolweb.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbnsolweb.setForeground(new java.awt.Color(0, 153, 204));
                lbnsolweb.setText("# SolicitudWeb:");

                lbestadoW.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbestadoW.setForeground(new java.awt.Color(0, 153, 204));
                lbestadoW.setText("Estado  de la Solicitud:");

                lbfeinW.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbfeinW.setForeground(new java.awt.Color(0, 153, 204));
                lbfeinW.setText("FechaIngreso-Deseada:");

                lbfesaW.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbfesaW.setForeground(new java.awt.Color(0, 153, 204));
                lbfesaW.setText("FechaSalida-Deseada:");

                lbtipoAW.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbtipoAW.setForeground(new java.awt.Color(0, 153, 204));
                lbtipoAW.setText("Tipo-Apto:");

                txttipoA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

                txtidapartaW.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtidapartaWActionPerformed(evt);
                        }
                });

                lbaptoW.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbaptoW.setForeground(new java.awt.Color(0, 153, 204));
                lbaptoW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbaptoW.setText("# Apto:");

                lbemail.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbemail.setForeground(new java.awt.Color(0, 153, 204));
                lbemail.setText("Email:");

                btngcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/user.png"))); // NOI18N
                btngcliente.setText("GESTIONAR CLIENTE");
                btngcliente.setOpaque(false);
                btngcliente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btngclienteActionPerformed(evt);
                        }
                });

                btngreserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/archive(1).png"))); // NOI18N
                btngreserva.setText("GESTIONAR RESERVA");
                btngreserva.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btngreservaActionPerformed(evt);
                        }
                });

                btngllam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/phone-call(1).png"))); // NOI18N
                btngllam.setText("GUARDAR LLAMADA");
                btngllam.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btngllamMouseClicked(evt);
                        }
                });
                btngllam.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btngllamActionPerformed(evt);
                        }
                });

                chbvsolweb.setBackground(new java.awt.Color(0, 0, 0));
                chbvsolweb.setForeground(new java.awt.Color(0, 153, 204));
                chbvsolweb.setText("VERIFICANDO SOLICITUD");
                chbvsolweb.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                chbvsolwebMouseClicked(evt);
                        }
                });
                chbvsolweb.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                chbvsolwebActionPerformed(evt);
                        }
                });

                lbidapW.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbidapW.setForeground(new java.awt.Color(0, 153, 204));
                lbidapW.setText("IdApto:");

                cbotipoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudio  _ Abierto", "Habitacion_Abierta", "Habitacion_Cerrada" }));

                btnid.setText("Buscar ID");
                btnid.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnidActionPerformed(evt);
                        }
                });

                btnenviareaserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/email.png"))); // NOI18N
                btnenviareaserva.setText("ENVIAR RESERVA");
                btnenviareaserva.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btnenviareaservaMouseClicked(evt);
                        }
                });
                btnenviareaserva.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnenviareaservaActionPerformed(evt);
                        }
                });

                btncsol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/phone-call(2).png"))); // NOI18N
                btncsol.setText("CANCELAR LLAMADA");
                btncsol.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncsolActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(dcFechasol, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(chbNoweb, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(97, 97, 97)
                                                                                .addComponent(chbsolWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtidllamada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(36, 36, 36)
                                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGap(126, 126, 126)
                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(txtTelfllaman, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblnombre)
                                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lbclienteT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(lbreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lbestadoT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(cboestadoT, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(chbvsolweb, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbestadoW, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(txtestadoW, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(340, 340, 340)
                                .addComponent(lblTsolweb, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(btngcliente)
                                .addGap(18, 18, 18)
                                .addComponent(btngreserva)
                                .addGap(18, 18, 18)
                                .addComponent(btngllam)
                                .addGap(18, 18, 18)
                                .addComponent(btnenviareaserva, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncsol)
                                .addGap(35, 35, 35))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lbtipoAT)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(lbfeinT)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(dcfeindesT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(74, 74, 74)
                                                                .addComponent(lbfesaT)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(dcfesadesT, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(32, 32, 32)
                                                                .addComponent(cbotipoA, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(56, 56, 56)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(180, 180, 180)
                                                .addComponent(lbnsolweb, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(txtsolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(318, 318, 318)
                                                .addComponent(chbdispo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(lbaptoT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cboapto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnid, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtidapartaT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(351, 351, 351)
                                                .addComponent(lbllamada, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbfeinW, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dcFeinW, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbfesaW, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(dcfesaW, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(lbtipoAW, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txttipoA))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(lbidapW, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtidapartaW, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbaptoW, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(txtAptoW, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(lbemail, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel9))
                                                        .addComponent(dcFechasol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel10)
                                                                .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel8)
                                                                .addComponent(txtidllamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(8, 8, 8)
                                                                .addComponent(jLabel3))
                                                        .addComponent(txtTelfllaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(chbNoweb)
                                                        .addComponent(chbsolWeb))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbllamada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbtipoAT)
                                                        .addComponent(cbotipoA, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(dcfeindesT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(lbfeinT)
                                                                .addComponent(dcfesadesT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(lbfesaT))
                                                        .addComponent(jLabel4)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblnombre)
                                                .addGap(29, 29, 29)))
                                .addGap(26, 26, 26)
                                .addComponent(chbdispo)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbaptoT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboapto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtidapartaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbclienteT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbestadoT)
                                        .addComponent(cboestadoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTsolweb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtsolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbnsolweb))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chbvsolweb)
                                        .addComponent(lbestadoW, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtestadoW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dcFeinW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbfeinW, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lbtipoAW)
                                                                .addComponent(txttipoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(dcfesaW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(lbfesaW, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtidapartaW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbidapW, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbaptoW, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAptoW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbemail)
                                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btngcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btngreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btngllam, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnenviareaserva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btncsol, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents
private Connection connection = new Conexion().conectar();
        private void chbdispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbdispoActionPerformed

		cal1 = null;
		cal1 = dcfeindesT.getCalendar();
		d = cal1.get(Calendar.DAY_OF_MONTH);
		m1 = cal1.get(Calendar.MONTH);
		a = cal1.get(Calendar.YEAR) - 1900;

		fit = new Date(a, m1, d);
		int  seleccionado = cbotipoA.getSelectedIndex();
        String  cbti=((String) cbotipoA.getItemAt(seleccionado)); 
 if (!(cbti.equals(""))) {

            Map p = new HashMap();
            p.put("tipo", cbti);
            JasperReport report;
            JasperPrint print;

           

		try {
			report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
				+ "/src/Reportes/rpttipoApartamentos.jrxml");
			print = JasperFillManager.fillReport(report, p, connection);
			JasperViewer view = new JasperViewer(print, false);
			view.setTitle("Apartamentos Reservables ");
			view.setVisible(true);

		} catch (JRException e) {
		}
chbdispo.setVisible(false);
        }//GEN-LAST:event_chbdispoActionPerformed
	}
        private void chbdispoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbdispoMouseClicked

        }//GEN-LAST:event_chbdispoMouseClicked

        private void chbdispoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chbdispoStateChanged
		// TODO add your handling code here:
        }//GEN-LAST:event_chbdispoStateChanged

        private void chbdispoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbdispoItemStateChanged
		// TODO add your handling code here:
        }//GEN-LAST:event_chbdispoItemStateChanged

        private void chbsolWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbsolWebActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_chbsolWebActionPerformed

        private void chbsolWebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbsolWebMouseClicked
		// TODO add your handling code here:
		habilitarW();
		solweb = true;
		cboestadoT.transferFocus();
		
        }//GEN-LAST:event_chbsolWebMouseClicked

        private void chbsolWebItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbsolWebItemStateChanged
		// TODO add your handling code here:
		habilitarW();
		solweb = true;
		cboestadoT.transferFocus();
                
        }//GEN-LAST:event_chbsolWebItemStateChanged

        private void chbNowebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbNowebActionPerformed
		// TODO add your handling code here:
        }//GEN-LAST:event_chbNowebActionPerformed

        private void chbNowebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbNowebMouseClicked
		// TODO add your handling code here:
		habilitarT();
		
		chbNoweb.transferFocus();
		solweb = false;
        }//GEN-LAST:event_chbNowebMouseClicked

        private void chbNowebItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chbNowebItemStateChanged
		// TODO add your handling code here:
		habilitarT();
		chbNoweb.transferFocus();
		solweb = false;
        }//GEN-LAST:event_chbNowebItemStateChanged

        private void btngclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngclienteActionPerformed
		// TODO add your handling code here:

		frmcliente form = new frmcliente();
		frmInicio.escritorio.add(form);
		form.toFront();
		form.setVisible(true);

        }//GEN-LAST:event_btngclienteActionPerformed

        private void btngreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngreservaActionPerformed
		// TODO add your handling code here:
		frmreserva form = new frmreserva();
		frmInicio.escritorio.add(form);
		form.toFront();
		form.setVisible(true);
		 frmreserva.txtidtrabajador.setText(txtidtrabajador.getText());
	    frmreserva.txttrabajador.setText(txttrabajador.getText());
        }//GEN-LAST:event_btngreservaActionPerformed

        private void btngllamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngllamMouseClicked
		// TODO add your handling code here:

        }//GEN-LAST:event_btngllamMouseClicked

        private void btngllamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngllamActionPerformed
		// TODO add your handling code here:
		accion = "guardar";

		cal = dcFechasol.getCalendar();

		d = cal.get(Calendar.DAY_OF_MONTH);
		m = cal.get(Calendar.MONTH);
		a = cal.get(Calendar.YEAR) - 1900;
		fsol = new Date(a, m, d);
		if (!solweb) {

			cal2 = dcfesadesT.getCalendar();

			d = cal2.get(Calendar.DAY_OF_MONTH);
			m2 = cal2.get(Calendar.MONTH);
			a = cal2.get(Calendar.YEAR) - 1900;
			fst = (new Date(a, m2, d));

			if (cbotipoA.equals("")) {
				JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Tipo de Apartamento");
				cbotipoA.requestFocus();
				return;
			}

			if (dcfeindesT.getDate() == null) {
				JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una fecha deseada de ingresar al Aparthotel");
				dcfeindesT.requestFocus();
				return;
			}
			if (dcfesadesT.getDate() == null) {
				JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una fecha deseada de  Salida ");
				dcfesadesT.requestFocus();
				return;
			}

			if (cboapto.equals("")) {
				JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Apartamento a Reservar");
				cboapto.requestFocus();
				return;
			}
		} else {
			cal3 = dcFeinW.getCalendar();

			d = cal3.get(Calendar.DAY_OF_MONTH);
			m3 = cal3.get(Calendar.MONTH);
			a = cal3.get(Calendar.YEAR) - 1900;
			finw = new Date(a, m3, d);

			cal4 = dcfesaW.getCalendar();

			d = cal4.get(Calendar.DAY_OF_MONTH);
			m4 = cal4.get(Calendar.MONTH);
			a = cal4.get(Calendar.YEAR) - 1900;
			fsaw = (new Date(a, m4, d));

		}
		if (txtcliente.getText().length() == 0) {
			JOptionPane.showConfirmDialog(rootPane, "Debes gestionar un cliente para la reserva");
			txtcliente.requestFocus();
			return;
		}
		if (txtidreserva.getText().length() == 0) {
			JOptionPane.showConfirmDialog(rootPane, "Debes gestionar la reserva y exportarla ,el id de reserva no puede ser blanco ");
			txtidreserva.requestFocus();
			return;
		}
		if (cboestadoT.equals("")) {
			JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Estado en la gestión de la llamada");
			cboestadoT.requestFocus();
			return;
		}

		vsolicitudescalls dts = new vsolicitudescalls();
		fsolicitudesCalls func3 = new fsolicitudesCalls();
		dts.setNumllaman(txtTelfllaman.getText());
		dts.setFechaSol(fsol);

		if (!solweb) {

			int seleccionado = cbotipoA.getSelectedIndex();
			dts.setTipoA((String) cbotipoA.getItemAt(seleccionado));
			dts.setFechaIngresoDeseada(fit);
			dts.setFechaSalidaDeseada(fst);
			int seleccionado3 = cboapto.getSelectedIndex();

			dts.setIdsolicitudWeb(0);
			dts.setNumero(Integer.parseInt(cboapto.getItemAt(seleccionado3)));
			dts.setIdapartamento(Integer.parseInt(txtidapartaT.getText()));
		} else {
			dts.setTipoA(txttipoA.getText());

			dts.setFechaIngresoDeseada(finw);

			dts.setFechaSalidaDeseada(fsaw);

			dts.setNumero(Integer.parseInt(txtAptoW.getText()));
			dts.setIdsolicitudWeb(Integer.parseInt(txtsolicitud.getText()));
			dts.setIdapartamento(Integer.parseInt(txtidapartaW.getText()));
		}

		dts.setIdcliente(Integer.parseInt(txtcliente.getText()));
		dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));
		dts.setIdtrabajador(Integer.parseInt(txtidtrabajador.getText()));

		int seleccionado2 = cboestadoT.getSelectedIndex();
		dts.setEstado((String) cboestadoT.getItemAt(seleccionado2));

		if (accion.equals("guardar")) {
			if (func3.insertar(dts)) {
				JOptionPane.showConfirmDialog(rootPane, "La Reserva de la llamada fue registrada satisfactoriamente");

				
			} else {
				JOptionPane.showConfirmDialog(rootPane, "La Reserva de la llamada NO fue registrada satisfactoriamente");
			}

        }//GEN-LAST:event_btngllamActionPerformed
	}

        private void chbvsolwebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbvsolwebActionPerformed
		// TODO add your handling code here:
		if (!(txtsolicitud.getText().equals(""))) {
			vsolicitudesweb dts = new vsolicitudesweb();
			fsolicitudesCalls func4 = new fsolicitudesCalls();

			String est = func4.buscestado(txtsolicitud.getText());
			txtestadoW.setText(est);
			Date feid = func4.buscfein(txtsolicitud.getText());
			dcFeinW.setDate(feid);
			Date fesd = func4.buscfesa(txtsolicitud.getText());
			dcfesaW.setDate(fesd);
			String ti = func4.busctipo(txtsolicitud.getText());
			txttipoA.setText(ti);
			Integer ida = func4.buscidA(txtsolicitud.getText());
			txtidapartaW.setText(String.valueOf(ida));
			Integer apt = func4.buscapt(txtsolicitud.getText());
			txtAptoW.setText(String.valueOf(apt));
			String em = func4.buscema(txtsolicitud.getText());
			txtemail.setText(em);

			
		}
		


        }//GEN-LAST:event_chbvsolwebActionPerformed

        private void chbvsolwebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbvsolwebMouseClicked
		// TODO add your handling code here:

        }//GEN-LAST:event_chbvsolwebMouseClicked

        private void btncsolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncsolActionPerformed
		// TODO add your handling code here:
		this.dispose();
        }//GEN-LAST:event_btncsolActionPerformed

        private void btnidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnidActionPerformed
		// TODO add your handling code here:
		int seleccionado = cboapto.getSelectedIndex();
		String cbe = (cboapto.getItemAt(seleccionado));
		int e = (Integer.parseInt(cbe));
		if (!(cbe.equals(""))) {

			fsolicitudesCalls func2 = new fsolicitudesCalls();
			int d = func2.buscid2(e);

			txtidapartaT.setText(String.valueOf(d));

        }//GEN-LAST:event_btnidActionPerformed
	}
        private void btnenviareaservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenviareaservaMouseClicked
                // TODO add your handling code here:
		
	
        }//GEN-LAST:event_btnenviareaservaMouseClicked

        private void btnenviareaservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviareaservaActionPerformed
                // TODO add your handling code here:
			frmEnviarCompReserva form = new frmEnviarCompReserva();
        frmInicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);
	frmEnviarCompReserva.txtidreserva.setText(txtidreserva.getText());
        frmEnviarCompReserva.txtemail.setText(txtemail.getText());
	if (solweb){
	frmEnviarCompReserva.txtnum.setText(txtidapartaW.getText());
	}else{
		int seleccionado = cboapto.getSelectedIndex();
		String cbe = (cboapto.getItemAt(seleccionado));
		frmEnviarCompReserva.txtnum.setText(cbe);
	}
        }//GEN-LAST:event_btnenviareaservaActionPerformed

        private void txtidapartaWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidapartaWActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtidapartaWActionPerformed

	

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(frmGestionCalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frmGestionCalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frmGestionCalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frmGestionCalls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmGestionCalls().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btncsol;
        private javax.swing.JButton btnenviareaserva;
        private javax.swing.JButton btngcliente;
        private javax.swing.JButton btngllam;
        private javax.swing.JButton btngreserva;
        private javax.swing.JButton btnid;
        private javax.swing.JComboBox<String> cboapto;
        private javax.swing.JComboBox<String> cboestadoT;
        private javax.swing.JComboBox<String> cbotipoA;
        private javax.swing.JCheckBox chbNoweb;
        private javax.swing.JCheckBox chbdispo;
        private javax.swing.JCheckBox chbsolWeb;
        private javax.swing.JCheckBox chbvsolweb;
        public static com.toedter.calendar.JDateChooser dcFechasol;
        private com.toedter.calendar.JDateChooser dcFeinW;
        private com.toedter.calendar.JDateChooser dcfeindesT;
        private com.toedter.calendar.JDateChooser dcfesaW;
        private com.toedter.calendar.JDateChooser dcfesadesT;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JSeparator jSeparator2;
        private javax.swing.JLabel lbaptoT;
        private javax.swing.JLabel lbaptoW;
        private javax.swing.JLabel lbclienteT;
        public static javax.swing.JLabel lbemail;
        private javax.swing.JLabel lbestadoT;
        private javax.swing.JLabel lbestadoW;
        private javax.swing.JLabel lbfeinT;
        private javax.swing.JLabel lbfeinW;
        private javax.swing.JLabel lbfesaT;
        private javax.swing.JLabel lbfesaW;
        private javax.swing.JLabel lbidapW;
        private javax.swing.JLabel lblTsolweb;
        private javax.swing.JLabel lbllamada;
        private javax.swing.JLabel lblnombre;
        private javax.swing.JLabel lbnsolweb;
        private javax.swing.JLabel lbreserva;
        private javax.swing.JLabel lbtipoAT;
        private javax.swing.JLabel lbtipoAW;
        private javax.swing.JLabel nombre;
        private javax.swing.JTextField txtAptoW;
        public static javax.swing.JTextField txtTelfllaman;
        public static javax.swing.JTextField txtcliente;
        public static javax.swing.JTextField txtemail;
        private javax.swing.JTextField txtestadoW;
        public static javax.swing.JTextField txtidapartaT;
        private javax.swing.JTextField txtidapartaW;
        public static javax.swing.JTextField txtidllamada;
        public static javax.swing.JTextField txtidreserva;
        public static javax.swing.JTextField txtidtrabajador;
        public static javax.swing.JTextField txtsolicitud;
        public static javax.swing.JTextField txttipoA;
        public static javax.swing.JTextField txttrabajador;
        // End of variables declaration//GEN-END:variables
}
