package Presentacion;

import BHelp.WBHelp;
import Datos.vpagos;
import Logica.Conexion;
import Logica.fpago;
import Logica.ftemporada;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
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
public class frmInicio extends javax.swing.JFrame {

	public frmInicio() {
		initComponents();
		this.setExtendedState(frmInicio.MAXIMIZED_BOTH);
		this.setTitle("SISTEMA DE RESERVAS DE APARTAMENTOS BRASILIA");
		lblidpersona.setVisible(false);
		lblnombre.setVisible(false);
		lblprimerApellido.setVisible(false);
		Calendar fecha = Calendar.getInstance();
		int mes = fecha.get(Calendar.MONTH) + 1;
		ftemporada func8 = new ftemporada();
		String temp=func8.busctemp(mes);
		lbltemporada.setText(temp);
		lbltemporada.setVisible(true);
		txtfechsys.setVisible(false);

	}

	@Override
	public Image getIconImage() {
		Image retValue = Toolkit.getDefaultToolkit().
			getImage(ClassLoader.getSystemResource("files/Brasiliaic.png"));
		return retValue;
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                escritorio = new javax.swing.JDesktopPane();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                lblnombre = new javax.swing.JLabel();
                lblacceso = new javax.swing.JLabel();
                lblidpersona = new javax.swing.JLabel();
                lbltemporada = new javax.swing.JLabel();
                lblprimerApellido = new javax.swing.JLabel();
                txtfechsys = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                menuBar = new javax.swing.JMenuBar();
                mnusisreserva = new javax.swing.JMenu();
                mnuarchivo = new javax.swing.JMenu();
                smnuapartament = new javax.swing.JMenuItem();
                smnuclientes = new javax.swing.JMenuItem();
                smnuconsumo = new javax.swing.JMenuItem();
                smnugastos = new javax.swing.JMenuItem();
                smnupagos = new javax.swing.JMenuItem();
                mnureservas = new javax.swing.JMenu();
                smnureservas = new javax.swing.JMenuItem();
                smnuprorroga = new javax.swing.JMenuItem();
                smnusolweb = new javax.swing.JMenuItem();
                smnusoltelf = new javax.swing.JMenuItem();
                mnuconsultas = new javax.swing.JMenu();
                smnuestado = new javax.swing.JMenuItem();
                smnuTipo_Apartamentos = new javax.swing.JMenuItem();
                smnuReservhoy = new javax.swing.JMenuItem();
                smnuproximasentradas = new javax.swing.JMenuItem();
                smnuproximassalidas = new javax.swing.JMenuItem();
                smnupagospendientes = new javax.swing.JMenuItem();
                smnuconssoliweb = new javax.swing.JMenuItem();
                smnusoltelefon = new javax.swing.JMenuItem();
                smubeneficios = new javax.swing.JMenuItem();
                mnuconfigur = new javax.swing.JMenu();
                smnuusuarios = new javax.swing.JMenuItem();
                jMenuItem1 = new javax.swing.JMenuItem();
                mnuherra = new javax.swing.JMenu();
                jSeparator1 = new javax.swing.JPopupMenu.Separator();
                smnuDP = new javax.swing.JMenuItem();
                smnutemporada = new javax.swing.JMenuItem();
                mnuayuda = new javax.swing.JMenu();
                smnuAcercade = new javax.swing.JMenuItem();
                smnuquestions = new javax.swing.JMenuItem();
                smnuguiarapid = new javax.swing.JMenuItem();
                smnumanual = new javax.swing.JMenuItem();
                mnusalir = new javax.swing.JMenu();
                jSeparator2 = new javax.swing.JPopupMenu.Separator();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setIconImage(getIconImage());

                escritorio.setBackground(new java.awt.Color(255, 255, 204));
                escritorio.setForeground(new java.awt.Color(0, 153, 204));
                escritorio.setMaximumSize(getMaximumSize());

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Brasilia1.png"))); // NOI18N
                jLabel1.setToolTipText("");
                escritorio.add(jLabel1);
                jLabel1.setBounds(20, 110, 330, 400);

                jLabel2.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 153, 204));
                jLabel2.setText("Calle Cartagena,23 .Almeria");
                escritorio.add(jLabel2);
                jLabel2.setBounds(50, 500, 220, 60);

                lblnombre.setBackground(new java.awt.Color(0, 102, 102));
                lblnombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                lblnombre.setForeground(new java.awt.Color(0, 0, 0));
                lblnombre.setText("lblnombre");
                lblnombre.setToolTipText("");
                escritorio.add(lblnombre);
                lblnombre.setBounds(30, 0, 100, 20);

                lblacceso.setBackground(new java.awt.Color(0, 102, 102));
                lblacceso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                lblacceso.setForeground(new java.awt.Color(255, 255, 255));
                lblacceso.setText("lblacceso");
                lblacceso.setToolTipText("");
                escritorio.add(lblacceso);
                lblacceso.setBounds(10, 60, 100, 20);

                lblidpersona.setForeground(new java.awt.Color(51, 51, 51));
                lblidpersona.setText("lblid");
                escritorio.add(lblidpersona);
                lblidpersona.setBounds(0, 0, 50, 20);

                lbltemporada.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                lbltemporada.setForeground(new java.awt.Color(255, 255, 255));
                lbltemporada.setText("lbltemporada");
                escritorio.add(lbltemporada);
                lbltemporada.setBounds(110, 90, 100, 20);

                lblprimerApellido.setBackground(new java.awt.Color(0, 102, 102));
                lblprimerApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                lblprimerApellido.setForeground(new java.awt.Color(0, 0, 0));
                lblprimerApellido.setText("lblprimerapellido");
                lblprimerApellido.setToolTipText("");
                escritorio.add(lblprimerApellido);
                lblprimerApellido.setBounds(0, 30, 120, 20);
                escritorio.add(txtfechsys);
                txtfechsys.setBounds(970, 20, 14, 24);

                jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("Temporada:");
                escritorio.add(jLabel3);
                jLabel3.setBounds(10, 90, 90, 20);

                menuBar.setBackground(new java.awt.Color(0, 153, 204));
                menuBar.setForeground(new java.awt.Color(0, 153, 204));
                menuBar.setToolTipText("");
                menuBar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                menuBar.setMaximumSize(new java.awt.Dimension(926, 32785));
                menuBar.setName(""); // NOI18N

                mnusisreserva.setBackground(new java.awt.Color(0, 153, 204));
                mnusisreserva.setForeground(new java.awt.Color(51, 51, 51));
                mnusisreserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/home.png"))); // NOI18N
                mnusisreserva.setMnemonic('f');
                mnusisreserva.setText("Sist.Reservas");
                mnusisreserva.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                mnusisreserva.setPreferredSize(new java.awt.Dimension(141, 40));
                mnusisreserva.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                mnusisreservaFocusGained(evt);
                        }
                });
                menuBar.add(mnusisreserva);

                mnuarchivo.setBackground(new java.awt.Color(0, 153, 204));
                mnuarchivo.setForeground(new java.awt.Color(51, 51, 51));
                mnuarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/paperclip.png"))); // NOI18N
                mnuarchivo.setMnemonic('e');
                mnuarchivo.setText("Archivo");
                mnuarchivo.setToolTipText("");
                mnuarchivo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                mnuarchivo.setPreferredSize(new java.awt.Dimension(121, 40));
                mnuarchivo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                mnuarchivoActionPerformed(evt);
                        }
                });

                smnuapartament.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
                smnuapartament.setBackground(new java.awt.Color(0, 153, 204));
                smnuapartament.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuapartament.setForeground(new java.awt.Color(51, 51, 51));
                smnuapartament.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/flats.png"))); // NOI18N
                smnuapartament.setMnemonic('t');
                smnuapartament.setText("Apartamentos");
                smnuapartament.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuapartamentActionPerformed(evt);
                        }
                });
                mnuarchivo.add(smnuapartament);

                smnuclientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
                smnuclientes.setBackground(new java.awt.Color(0, 153, 204));
                smnuclientes.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuclientes.setForeground(new java.awt.Color(51, 51, 51));
                smnuclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/collaboration.png"))); // NOI18N
                smnuclientes.setMnemonic('a');
                smnuclientes.setText("Clientes");
                smnuclientes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuclientesActionPerformed(evt);
                        }
                });
                mnuarchivo.add(smnuclientes);

                smnuconsumo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
                smnuconsumo.setBackground(new java.awt.Color(0, 153, 204));
                smnuconsumo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuconsumo.setForeground(new java.awt.Color(51, 51, 51));
                smnuconsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/invention.png"))); // NOI18N
                smnuconsumo.setMnemonic('d');
                smnuconsumo.setText("Consumos");
                smnuconsumo.setToolTipText("");
                smnuconsumo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuconsumoActionPerformed(evt);
                        }
                });
                mnuarchivo.add(smnuconsumo);

                smnugastos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK));
                smnugastos.setBackground(new java.awt.Color(0, 153, 204));
                smnugastos.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnugastos.setForeground(new java.awt.Color(0, 0, 0));
                smnugastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/dollar-symbol.png"))); // NOI18N
                smnugastos.setText("Gastos");
                smnugastos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnugastosActionPerformed(evt);
                        }
                });
                mnuarchivo.add(smnugastos);

                smnupagos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
                smnupagos.setBackground(new java.awt.Color(0, 153, 204));
                smnupagos.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnupagos.setForeground(new java.awt.Color(51, 51, 51));
                smnupagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/shopping-store.png"))); // NOI18N
                smnupagos.setText("Pagos");
                smnupagos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnupagosActionPerformed(evt);
                        }
                });
                mnuarchivo.add(smnupagos);

                menuBar.add(mnuarchivo);

                mnureservas.setBackground(new java.awt.Color(0, 153, 204));
                mnureservas.setForeground(new java.awt.Color(51, 51, 51));
                mnureservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/upload.png"))); // NOI18N
                mnureservas.setMnemonic('h');
                mnureservas.setText("Reservas");
                mnureservas.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                mnureservas.setPreferredSize(new java.awt.Dimension(121, 40));

                smnureservas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
                smnureservas.setBackground(new java.awt.Color(0, 153, 204));
                smnureservas.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnureservas.setForeground(new java.awt.Color(51, 51, 51));
                smnureservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/calendar(1).png"))); // NOI18N
                smnureservas.setMnemonic('c');
                smnureservas.setText("Reservas");
                smnureservas.setToolTipText("");
                smnureservas.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnureservasActionPerformed(evt);
                        }
                });
                mnureservas.add(smnureservas);

                smnuprorroga.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
                smnuprorroga.setBackground(new java.awt.Color(0, 153, 204));
                smnuprorroga.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuprorroga.setForeground(new java.awt.Color(51, 51, 51));
                smnuprorroga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/loop.png"))); // NOI18N
                smnuprorroga.setText("Prórrogas");
                smnuprorroga.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuprorrogaActionPerformed(evt);
                        }
                });
                mnureservas.add(smnuprorroga);

                smnusolweb.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
                smnusolweb.setBackground(new java.awt.Color(0, 153, 204));
                smnusolweb.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnusolweb.setForeground(new java.awt.Color(0, 0, 0));
                smnusolweb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/repeat(2).png"))); // NOI18N
                smnusolweb.setText("Solicitudes WEB");
                smnusolweb.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnusolwebActionPerformed(evt);
                        }
                });
                mnureservas.add(smnusolweb);

                smnusoltelf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
                smnusoltelf.setBackground(new java.awt.Color(0, 153, 204));
                smnusoltelf.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnusoltelf.setForeground(new java.awt.Color(0, 0, 0));
                smnusoltelf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/phone-call.png"))); // NOI18N
                smnusoltelf.setText("Solicitudes Telefónicas");
                smnusoltelf.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnusoltelfActionPerformed(evt);
                        }
                });
                mnureservas.add(smnusoltelf);

                menuBar.add(mnureservas);

                mnuconsultas.setBackground(new java.awt.Color(0, 153, 204));
                mnuconsultas.setForeground(new java.awt.Color(0, 0, 0));
                mnuconsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/line-graph.png"))); // NOI18N
                mnuconsultas.setText("Consultas");
                mnuconsultas.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                mnuconsultas.setPreferredSize(new java.awt.Dimension(121, 40));

                smnuestado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
                smnuestado.setBackground(new java.awt.Color(0, 153, 204));
                smnuestado.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuestado.setForeground(new java.awt.Color(0, 0, 0));
                smnuestado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smnuestado.setText("Apartamentos en Estado de...");
                smnuestado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuestadoActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smnuestado);

                smnuTipo_Apartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
                smnuTipo_Apartamentos.setBackground(new java.awt.Color(0, 153, 204));
                smnuTipo_Apartamentos.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuTipo_Apartamentos.setForeground(new java.awt.Color(51, 51, 51));
                smnuTipo_Apartamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smnuTipo_Apartamentos.setText("Apartamentos Reservables por Tipo_Apartamento:");
                smnuTipo_Apartamentos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuTipo_ApartamentosActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smnuTipo_Apartamentos);

                smnuReservhoy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
                smnuReservhoy.setBackground(new java.awt.Color(0, 153, 204));
                smnuReservhoy.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuReservhoy.setForeground(new java.awt.Color(51, 51, 51));
                smnuReservhoy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smnuReservhoy.setText("Apartamentos Reservables Hoy");
                smnuReservhoy.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuReservhoyActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smnuReservhoy);

                smnuproximasentradas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
                smnuproximasentradas.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuproximasentradas.setForeground(new java.awt.Color(51, 51, 51));
                smnuproximasentradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smnuproximasentradas.setText("Próximas Entradas");
                smnuproximasentradas.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuproximasentradasActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smnuproximasentradas);

                smnuproximassalidas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
                smnuproximassalidas.setBackground(new java.awt.Color(0, 153, 204));
                smnuproximassalidas.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuproximassalidas.setForeground(new java.awt.Color(51, 51, 51));
                smnuproximassalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smnuproximassalidas.setText("Próximas Salidas");
                smnuproximassalidas.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuproximassalidasActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smnuproximassalidas);

                smnupagospendientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
                smnupagospendientes.setBackground(new java.awt.Color(0, 153, 204));
                smnupagospendientes.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnupagospendientes.setForeground(new java.awt.Color(51, 51, 51));
                smnupagospendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smnupagospendientes.setText("Pagos Pendientes");
                smnupagospendientes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnupagospendientesActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smnupagospendientes);

                smnuconssoliweb.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.ALT_MASK));
                smnuconssoliweb.setBackground(new java.awt.Color(0, 153, 204));
                smnuconssoliweb.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnuconssoliweb.setForeground(new java.awt.Color(51, 51, 51));
                smnuconssoliweb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smnuconssoliweb.setText("Solicitudes Recibidas-WEB");
                smnuconssoliweb.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuconssoliwebActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smnuconssoliweb);

                smnusoltelefon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
                smnusoltelefon.setBackground(new java.awt.Color(0, 153, 204));
                smnusoltelefon.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smnusoltelefon.setForeground(new java.awt.Color(51, 51, 51));
                smnusoltelefon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smnusoltelefon.setText("Solicitudes-Telefónicas Recibidas");
                smnusoltelefon.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnusoltelefonActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smnusoltelefon);

                smubeneficios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
                smubeneficios.setBackground(new java.awt.Color(0, 153, 204));
                smubeneficios.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                smubeneficios.setForeground(new java.awt.Color(51, 51, 51));
                smubeneficios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/file.png"))); // NOI18N
                smubeneficios.setText("Beneficios del Mes");
                smubeneficios.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smubeneficiosActionPerformed(evt);
                        }
                });
                mnuconsultas.add(smubeneficios);

                menuBar.add(mnuconsultas);

                mnuconfigur.setBackground(new java.awt.Color(0, 153, 204));
                mnuconfigur.setForeground(new java.awt.Color(51, 51, 51));
                mnuconfigur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/cogs.png"))); // NOI18N
                mnuconfigur.setText("Configuraciones");
                mnuconfigur.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                mnuconfigur.setPreferredSize(new java.awt.Dimension(159, 40));

                smnuusuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK));
                smnuusuarios.setBackground(new java.awt.Color(0, 153, 204));
                smnuusuarios.setForeground(new java.awt.Color(51, 51, 51));
                smnuusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/worker.png"))); // NOI18N
                smnuusuarios.setText("Usuarios y Accesos");
                smnuusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                smnuusuariosMouseClicked(evt);
                        }
                });
                smnuusuarios.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuusuariosActionPerformed(evt);
                        }
                });
                mnuconfigur.add(smnuusuarios);

                jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
                jMenuItem1.setBackground(new java.awt.Color(0, 153, 204));
                jMenuItem1.setForeground(new java.awt.Color(51, 51, 51));
                jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/database.png"))); // NOI18N
                jMenuItem1.setText("Estructura de la Base de Datos");
                jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItem1ActionPerformed(evt);
                        }
                });
                mnuconfigur.add(jMenuItem1);

                menuBar.add(mnuconfigur);

                mnuherra.setBackground(new java.awt.Color(0, 153, 204));
                mnuherra.setForeground(new java.awt.Color(51, 51, 51));
                mnuherra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/wrench-and-cogwheel.png"))); // NOI18N
                mnuherra.setText("Herramientas");
                mnuherra.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                mnuherra.setPreferredSize(new java.awt.Dimension(159, 40));

                jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
                mnuherra.add(jSeparator1);

                smnuDP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
                smnuDP.setBackground(new java.awt.Color(0, 153, 204));
                smnuDP.setForeground(new java.awt.Color(51, 51, 51));
                smnuDP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/bars-chart.png"))); // NOI18N
                smnuDP.setText("Actualizar Valores del IDP ");
                smnuDP.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuDPActionPerformed(evt);
                        }
                });
                mnuherra.add(smnuDP);

                smnutemporada.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.SHIFT_MASK));
                smnutemporada.setBackground(new java.awt.Color(0, 153, 204));
                smnutemporada.setForeground(new java.awt.Color(51, 51, 51));
                smnutemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/fight.png"))); // NOI18N
                smnutemporada.setText("Actualizar Temporada a Aplicar");
                smnutemporada.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnutemporadaActionPerformed(evt);
                        }
                });
                mnuherra.add(smnutemporada);

                menuBar.add(mnuherra);

                mnuayuda.setBackground(new java.awt.Color(0, 153, 204));
                mnuayuda.setForeground(new java.awt.Color(51, 51, 51));
                mnuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/sunrise.png"))); // NOI18N
                mnuayuda.setText("Ayuda");
                mnuayuda.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                mnuayuda.setPreferredSize(new java.awt.Dimension(121, 40));

                smnuAcercade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
                smnuAcercade.setBackground(new java.awt.Color(0, 153, 204));
                smnuAcercade.setForeground(new java.awt.Color(51, 51, 51));
                smnuAcercade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/men.png"))); // NOI18N
                smnuAcercade.setText("Acerca DE");
                smnuAcercade.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuAcercadeActionPerformed(evt);
                        }
                });
                mnuayuda.add(smnuAcercade);

                smnuquestions.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
                smnuquestions.setBackground(new java.awt.Color(0, 153, 204));
                smnuquestions.setForeground(new java.awt.Color(51, 51, 51));
                smnuquestions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/businessman.png"))); // NOI18N
                smnuquestions.setText("Ayuda");
                smnuquestions.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuquestionsActionPerformed(evt);
                        }
                });
                mnuayuda.add(smnuquestions);

                smnuguiarapid.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
                smnuguiarapid.setBackground(new java.awt.Color(0, 153, 204));
                smnuguiarapid.setForeground(new java.awt.Color(51, 51, 51));
                smnuguiarapid.setIcon(new javax.swing.ImageIcon("C:\\Users\\inesm\\Desktop\\proyjava\\files\\strategy.png")); // NOI18N
                smnuguiarapid.setText("Guía Rápida");
                smnuguiarapid.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnuguiarapidActionPerformed(evt);
                        }
                });
                mnuayuda.add(smnuguiarapid);

                smnumanual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
                smnumanual.setBackground(new java.awt.Color(0, 153, 204));
                smnumanual.setForeground(new java.awt.Color(51, 51, 51));
                smnumanual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/newspaper.png"))); // NOI18N
                smnumanual.setText("Manual de Usuario");
                smnumanual.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                smnumanualActionPerformed(evt);
                        }
                });
                mnuayuda.add(smnumanual);

                menuBar.add(mnuayuda);

                mnusalir.setBackground(new java.awt.Color(0, 153, 204));
                mnusalir.setForeground(new java.awt.Color(51, 51, 51));
                mnusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/add.png"))); // NOI18N
                mnusalir.setText("Salir");
                mnusalir.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                mnusalir.setPreferredSize(new java.awt.Dimension(121, 40));
                mnusalir.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                mnusalirMouseClicked(evt);
                        }
                });
                mnusalir.add(jSeparator2);

                menuBar.add(mnusalir);

                setJMenuBar(menuBar);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void smnuclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuclientesActionPerformed
	    // TODO add your handling code here:
	    frmcliente form = new frmcliente();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);

    }//GEN-LAST:event_smnuclientesActionPerformed


    private void mnusisreservaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mnusisreservaFocusGained
	    // TODO add your handling code here:
    }//GEN-LAST:event_mnusisreservaFocusGained

    private void smnuusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuusuariosActionPerformed
	    // TODO add your handling code here:
	    frmtrabajador form = new frmtrabajador();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
    }//GEN-LAST:event_smnuusuariosActionPerformed

    private void mnusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnusalirMouseClicked
	    // TODO add your handling code here:
	    this.dispose();
    }//GEN-LAST:event_mnusalirMouseClicked

    private void smnureservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnureservasActionPerformed
	    // TODO add your handling code here:
	    frmreserva form = new frmreserva();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
	    frmreserva.txtidtrabajador.setText(lblidpersona.getText());
	    frmreserva.txttrabajador.setText(lblnombre.getText() + " " + lblprimerApellido.getText());
	    frmreserva.idusuario = Integer.parseInt(lblidpersona.getText());

    }//GEN-LAST:event_smnureservasActionPerformed

    private void smnuusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smnuusuariosMouseClicked
	    // TODO add your handling code here:
    }//GEN-LAST:event_smnuusuariosMouseClicked

    private void smnuDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuDPActionPerformed
	    // TODO add your handling code here:
	    frmDP form = new frmDP();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);

    }//GEN-LAST:event_smnuDPActionPerformed

    private void smnuconsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuconsumoActionPerformed
	    // TODO add your handling code here:
	    frmconsumo form = new frmconsumo();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
    }//GEN-LAST:event_smnuconsumoActionPerformed

    private void smnuapartamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuapartamentActionPerformed
	    // TODO add your handling code here:
	    frmapartamento form = new frmapartamento();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);

    }//GEN-LAST:event_smnuapartamentActionPerformed

    private void mnuarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuarchivoActionPerformed
	    // TODO add your handling code here:
    }//GEN-LAST:event_mnuarchivoActionPerformed

    private void smnuprorrogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuprorrogaActionPerformed
	    // TODO add your handling code here:
	    frmprorroga form = new frmprorroga();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
	    frmprorroga.txtidtrabajador.setText(lblidpersona.getText());
	    frmprorroga.txttrabajador.setText(lblnombre.getText() + " " + lblprimerApellido.getText());
	    frmprorroga.idusuario = Integer.parseInt(lblidpersona.getText());
    }//GEN-LAST:event_smnuprorrogaActionPerformed

    private void smnupagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnupagosActionPerformed
	    // TODO add your handling code here:

	    frmpagoin form = new frmpagoin();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);


    }//GEN-LAST:event_smnupagosActionPerformed

    private void smnugastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnugastosActionPerformed
	    // TODO add your handling code here:

	    frmgastos form = new frmgastos();
	    frmInicio.escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
    }//GEN-LAST:event_smnugastosActionPerformed

    private void smnuestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuestadoActionPerformed
	    // TODO add your handling code here:
	    frmestado form = new frmestado();
	    frmInicio.escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
    }//GEN-LAST:event_smnuestadoActionPerformed
	private Connection connection = new Conexion().conectar();
    private void smnupagospendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnupagospendientesActionPerformed
	    // TODO add your handling code here:
	    Map p = new HashMap();
	    JasperReport report;
	    JasperPrint print;

	    try {
		    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
			    + "/src/Reportes/rptpagospendientes.jrxml");
		    print = JasperFillManager.fillReport(report, p, connection);
		    JasperViewer view = new JasperViewer(print, false);
		    view.setTitle("Pagos Pendientes");
		    view.setVisible(true);

	    } catch (JRException e) {
	    }

    }//GEN-LAST:event_smnupagospendientesActionPerformed

    private void smnuproximasentradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuproximasentradasActionPerformed
	    // TODO add your handling code here:
	    Map p = new HashMap();
	    JasperReport report;
	    JasperPrint print;

	    try {
		    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
			    + "/src/Reportes/rptProximasEntradas.jrxml");
		    print = JasperFillManager.fillReport(report, p, connection);
		    JasperViewer view = new JasperViewer(print, false);
		    view.setTitle("Próximas Entradas");
		    view.setVisible(true);

	    } catch (JRException e) {
	    }
    }//GEN-LAST:event_smnuproximasentradasActionPerformed

    private void smnuproximassalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuproximassalidasActionPerformed
	    // TODO add your handling code here:
	    Map p = new HashMap();
	    JasperReport report;
	    JasperPrint print;

	    try {
		    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
			    + "/src/Reportes/rptPróximasSalidas.jrxml");
		    print = JasperFillManager.fillReport(report, p, connection);
		    JasperViewer view = new JasperViewer(print, false);
		    view.setTitle("Próximas Salidas");
		    view.setVisible(true);

	    } catch (JRException e) {
	    }


    }//GEN-LAST:event_smnuproximassalidasActionPerformed

    private void smubeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smubeneficiosActionPerformed
	    // TODO add your handling code here:

	    frmbeneficios form = new frmbeneficios();
	    frmInicio.escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);


    }//GEN-LAST:event_smubeneficiosActionPerformed

        private void smnuAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuAcercadeActionPerformed
		// TODO add your handling code here:

		frmCopyrigh form = new frmCopyrigh();
		frmInicio.escritorio.add(form);
		form.toFront();
		form.setVisible(true);
        }//GEN-LAST:event_smnuAcercadeActionPerformed

        private void smnumanualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnumanualActionPerformed
		// TODO add your handling code here:

		try {
			File path =new File("src/Reportes/brasilia3007.pdf");
			Desktop.getDesktop().open(path);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
        }//GEN-LAST:event_smnumanualActionPerformed

        private void smnuquestionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuquestionsActionPerformed
                // TODO add your handling code here:
		WBHelp form = new WBHelp();
	         escritorio.add(form);
		form.toFront();
		form.setVisible(true);
        }//GEN-LAST:event_smnuquestionsActionPerformed

        private void smnuTipo_ApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuTipo_ApartamentosActionPerformed
               frmtipo form = new frmtipo();
	    frmInicio.escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
        }//GEN-LAST:event_smnuTipo_ApartamentosActionPerformed

        private void smnusolwebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnusolwebActionPerformed
                frmSolicitudesWeb form = new frmSolicitudesWeb();
	    frmInicio.escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
        }//GEN-LAST:event_smnusolwebActionPerformed

        private void smnuconssoliwebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuconssoliwebActionPerformed
                    Map p = new HashMap();
	    JasperReport report;
	    JasperPrint print;

	    try {
		    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
			    + "/src/Reportes/rptsolicitudesweb.jrxml");
		    print = JasperFillManager.fillReport(report, p, connection);
		    JasperViewer view = new JasperViewer(print, false);
		    view.setTitle("Solicitudes Web");
		    view.setVisible(true);

	    } catch (JRException e) {
	    }

        }//GEN-LAST:event_smnuconssoliwebActionPerformed

        private void smnusoltelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnusoltelfActionPerformed
                // TODO add your handling code here:
		    frmSolicitudesCalls form = new frmSolicitudesCalls();
	    frmInicio.escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
	frmSolicitudesCalls.idtrabajador.setText(lblidpersona.getText());
 frmSolicitudesCalls.txttrabajador.setText(lblnombre.getText() + " " + lblprimerApellido.getText());
	
        }//GEN-LAST:event_smnusoltelfActionPerformed

        private void smnutemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnutemporadaActionPerformed
                // TODO add your handling code here:
		 frmtemporada form = new frmtemporada();
	    escritorio.add(form);
	    form.toFront();
	    form.setVisible(true);
        }//GEN-LAST:event_smnutemporadaActionPerformed

        private void smnusoltelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnusoltelefonActionPerformed
                // TODO add your handling code here:
		            Map p = new HashMap();
	    JasperReport report;
	    JasperPrint print;

	    try {
		    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
			    + "/src/Reportes/rptsolicitudesCalls.jrxml");
		    print = JasperFillManager.fillReport(report, p, connection);
		    JasperViewer view = new JasperViewer(print, false);
		    view.setTitle("Solicitudes Telefónicas");
		    view.setVisible(true);

	    } catch (JRException e) {
	    }

        }//GEN-LAST:event_smnusoltelefonActionPerformed

        private void smnuReservhoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuReservhoyActionPerformed
                // TODO add your handling code here:
		      Map p = new HashMap();
	    JasperReport report;
	    JasperPrint print;

	    try {
		    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
			    + "/src/Reportes/rptreservablesfecha.jrxml");
		    print = JasperFillManager.fillReport(report, p, connection);
		    JasperViewer view = new JasperViewer(print, false);
		    view.setTitle("Reservables Hoy");
		    view.setVisible(true);

	    } catch (JRException e) {
	    }
        }//GEN-LAST:event_smnuReservhoyActionPerformed

        private void smnuguiarapidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnuguiarapidActionPerformed
                // TODO add your handling code here:
		try {
			File path =new File("src/Reportes/GUIARAPID.pdf");
			Desktop.getDesktop().open(path);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
        }//GEN-LAST:event_smnuguiarapidActionPerformed

        private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jMenuItem1ActionPerformed

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
			java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frmInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmInicio().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        public static javax.swing.JDesktopPane escritorio;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JMenuItem jMenuItem1;
        private javax.swing.JPopupMenu.Separator jSeparator1;
        private javax.swing.JPopupMenu.Separator jSeparator2;
        public static javax.swing.JLabel lblacceso;
        public static javax.swing.JLabel lblidpersona;
        public static javax.swing.JLabel lblnombre;
        public static javax.swing.JLabel lblprimerApellido;
        public static javax.swing.JLabel lbltemporada;
        private javax.swing.JMenuBar menuBar;
        public static javax.swing.JMenu mnuarchivo;
        private javax.swing.JMenu mnuayuda;
        public static javax.swing.JMenu mnuconfigur;
        public static javax.swing.JMenu mnuconsultas;
        public static javax.swing.JMenu mnuherra;
        public static javax.swing.JMenu mnureservas;
        private javax.swing.JMenu mnusalir;
        private javax.swing.JMenu mnusisreserva;
        private javax.swing.JMenuItem smnuAcercade;
        private javax.swing.JMenuItem smnuDP;
        private javax.swing.JMenuItem smnuReservhoy;
        private javax.swing.JMenuItem smnuTipo_Apartamentos;
        private javax.swing.JMenuItem smnuapartament;
        public static javax.swing.JMenuItem smnuclientes;
        private javax.swing.JMenuItem smnuconssoliweb;
        private javax.swing.JMenuItem smnuconsumo;
        public static javax.swing.JMenuItem smnuestado;
        private javax.swing.JMenuItem smnugastos;
        private javax.swing.JMenuItem smnuguiarapid;
        private javax.swing.JMenuItem smnumanual;
        public static javax.swing.JMenuItem smnupagos;
        public static javax.swing.JMenuItem smnupagospendientes;
        private javax.swing.JMenuItem smnuprorroga;
        public static javax.swing.JMenuItem smnuproximasentradas;
        public static javax.swing.JMenuItem smnuproximassalidas;
        private javax.swing.JMenuItem smnuquestions;
        private javax.swing.JMenuItem smnureservas;
        private javax.swing.JMenuItem smnusoltelefon;
        private javax.swing.JMenuItem smnusoltelf;
        private javax.swing.JMenuItem smnusolweb;
        private javax.swing.JMenuItem smnutemporada;
        private javax.swing.JMenuItem smnuusuarios;
        public static javax.swing.JMenuItem smubeneficios;
        private javax.swing.JTextField txtfechsys;
        // End of variables declaration//GEN-END:variables

}
