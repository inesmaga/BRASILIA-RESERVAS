package Presentacion;

import Datos.vApartamento;
import Datos.vcomprobantesp;
import Datos.vconsumo;
import Datos.vpagos;

import Datos.vreserva;
import Logica.Conexion;
import Logica.fApartamento;
import Logica.fpago;
import Logica.fconsumo;
import Logica.freserva;
import Logica.fcomprobantesp;

import java.io.File;
import java.sql.Connection;
import java.sql.Date;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
public class frmpago extends javax.swing.JInternalFrame {

	public frmpago() {
		initComponents();
		mostrar(idreserva);
		inhabilitar();
		txtidpago.setText(idpago);
		txtidreserva.setText(idreserva);
		txtcliente.setText(cliente);
		txtidcliente.setText(idcliente);
		txtidapartamento.setText(idapartamento);
		txtnumero.setText(apartamento);
		txttotalreserva.setText((Double.toString(totalreserva)));
		txtpagadores.setText("");

		fconsumo func = new fconsumo();
		func.mostrarpg(idreserva);

		if (!(estadores.equals("Pagada_Total"))) {

			if (estadores.equals("Pagada_Mensual")) {

				double tpp = (totalreserva - preserva);
				txtpagadores.setText((Double.toString(tpp)));
				if (!(tpp < 0)) {
					txttotalpago.setText(Double.toString((tpp + func.totaldeconsumo)));
					if (tpp == mreserva) {
						frs = true;
					}

				} else {

					if ((func.totaldeconsumo) > 0) {
						txttotalpago.setText(Double.toString((func.totaldeconsumo)));
					} else {
						txttotalpago.setText("0");

					}
				}
			} else {
				if ((estadores.equals("Pendiente"))) {
					txttotalpago.setText(Double.toString((totalreserva + func.totaldeconsumo)));
				} else {
					if ((estadores.equals("Reservada"))) {
						ocu = true;
						txttotalpago.setText(Double.toString(totalreserva));

					}
				}
			}
		} else {
			if ((func.totaldeconsumo) > 0) {
				txttotalpago.setText(Double.toString(func.totaldeconsumo));
			} else {
				txttotalpago.setText("0");
			}
		}
	}

	private String accion = "guardar";
	public static String idreserva,cbc;
	public static String idconsumo;
	public static String idcliente;
	public static String cliente;
	public static String idapartamento;
	public static String apartamento;
	public static String estadores;
	public static Double totalreserva;
	public static Double tip;
	public static Double tpp;
	public static Double ppres;
	public static Double resp;
	public static Double mreserva;
	public static Double treserva;
	public static Double preserva;
	public static int diarev,vab;
	public static Date fechasalida;
	public int prorrog;
	public int vidp, df, dd;
	public double vdp, pdr;
	public double ptemp;
	public double dpf;
	public double ca;
	public static boolean pr = false;
	public static boolean pt = false;
	public static boolean pc = false;
	public static boolean ocu = false;
	public static boolean frs = false;
	public Date din, fr;
	public Date dsal, fe, fp;
	public fpago func;
	public vpagos dts;
	public static String idpago;

	/**
	 *
	 * @author inesm
	 */
	public void ocultar_columnas() {
		tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
		tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
		tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);

		tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
		tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
		tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);

	}

	public void ocultar_columnasconsumo() {
		tablalistadoconsumo.getColumnModel().getColumn(0).setMaxWidth(0);
		tablalistadoconsumo.getColumnModel().getColumn(0).setMinWidth(0);
		tablalistadoconsumo.getColumnModel().getColumn(0).setPreferredWidth(0);

		tablalistadoconsumo.getColumnModel().getColumn(1).setMaxWidth(0);
		tablalistadoconsumo.getColumnModel().getColumn(1).setMinWidth(0);
		tablalistadoconsumo.getColumnModel().getColumn(1).setPreferredWidth(0);

		tablalistadoconsumo.getColumnModel().getColumn(3).setMaxWidth(0);
		tablalistadoconsumo.getColumnModel().getColumn(3).setMinWidth(0);
		tablalistadoconsumo.getColumnModel().getColumn(3).setPreferredWidth(0);

	}

	void inhabilitar() {

		txtidpago.setVisible(true);
		txtidpago.setEnabled(false);
		txtidapartamento.setVisible(false);
		txtidreserva.setVisible(true);
		txtidreserva.setEnabled(false);
		txtidconsumo.setVisible(false);
		txtidcliente.setVisible(false);
		txtcliente.setEnabled(false);
		txtnumcomprobante.setEnabled(false);
		txtnumero.setEnabled(false);
		cbotipocomprobante.setEnabled(false);
		txtiva.setEnabled(false);
		txtpagadores.setEnabled(false);
		txtpagadores.setVisible(false);

		txttotalpago.setEnabled(false);
		txttotalpagado.setEnabled(false);
		txttotalreserva.setEnabled(false);
		dcfecha_emision.setEnabled(false);
		dcfecha_pago.setEnabled(false);

		cboestado.setEnabled(false);

		btnguardar.setEnabled(false);
		btncancelar.setEnabled(false);
		btneliminar.setEnabled(false);
		pswnumtarjeta.setEnabled(false);
		pswnumtarjeta.setVisible(true);
		txtidpago.setText("");
		txtnumcomprobante.setText("");
		txtnumero.setText("");
		txtiva.setText("");

		txtidapartamento.setText("");

	}

	void habilitar() {

		txtidpago.setVisible(true);
		txtidapartamento.setVisible(false);
		txtidreserva.setVisible(true);
		txtidconsumo.setVisible(false);
		txtidcliente.setVisible(false);
		txtcliente.setEnabled(false);
		txtnumcomprobante.setEnabled(true);
		txtnumero.setEnabled(false);
		cbotipocomprobante.setEnabled(true);
		txtiva.setEnabled(true);
		txttotalpago.setEnabled(false);
		txttotalpagado.setEnabled(true);
		txttotalreserva.setEnabled(false);
		dcfecha_emision.setEnabled(true);
		dcfecha_pago.setEnabled(true);
		txtpagadores.setEnabled(false);
		txtpagadores.setVisible(true);

		cboestado.setEnabled(true);

		btnguardar.setEnabled(true);
		btncancelar.setEnabled(true);
		btneliminar.setEnabled(true);

		txtnumcomprobante.setText("");

		txtiva.setText("");

	}

	void mostrar(String buscar) {

		try {
			DefaultTableModel modelo;
			fpago func = new fpago();
			modelo = func.mostrar(buscar);
			tablalistado.setModel(modelo);
			ocultar_columnas();
			lbltotalregistros.setText("Total en Pagos: €." + Double.toString(func.totaldepago));

			//Mostrar los datos de los consumos
			fconsumo func2 = new fconsumo();
			modelo = func2.mostrarpg(buscar);
			tablalistadoconsumo.setModel(modelo);
			ocultar_columnasconsumo();

			lbltotalregistrosconsumos.setText("Total Consumos: " + func2.totalregistros);
			lbltotalconsumos.setText("Consumo Total: €. " + func2.totaldeconsumo);

		} catch (Exception e) {
			JOptionPane.showConfirmDialog(rootPane, e);
		}
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                txtidapartamento = new javax.swing.JTextField();
                btnnuevo = new javax.swing.JButton();
                btnguardar = new javax.swing.JButton();
                btncancelar = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                txtidpago = new javax.swing.JTextField();
                jLabel13 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                txtnumero = new javax.swing.JTextField();
                txtidreserva = new javax.swing.JTextField();
                dcfecha_emision = new com.toedter.calendar.JDateChooser();
                dcfecha_pago = new com.toedter.calendar.JDateChooser();
                jLabel23 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                cboestado = new javax.swing.JComboBox<>();
                txtnumcomprobante = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                txttotalreserva = new javax.swing.JTextField();
                txtcliente = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                cbotipocomprobante = new javax.swing.JComboBox<>();
                txtiva = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                txttotalpago = new javax.swing.JTextField();
                jLabel14 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                cbotipo_pago = new javax.swing.JComboBox<>();
                txttotalpagado = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                txtidconsumo = new javax.swing.JTextField();
                jLabel22 = new javax.swing.JLabel();
                txtidcliente = new javax.swing.JTextField();
                txtpagadores = new javax.swing.JTextField();
                lblreserva = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                cbotipo_tarj = new javax.swing.JComboBox<>();
                pswnumtarjeta = new javax.swing.JTextField();
                listadoapartamentos = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tablalistado = new javax.swing.JTable();
                btneliminar = new javax.swing.JButton();
                btnsalir = new javax.swing.JButton();
                lbltotalregistros = new javax.swing.JLabel();
                btncomprobreserva = new javax.swing.JButton();
                btncomprobantetodo = new javax.swing.JButton();
                btnComprobconsumos = new javax.swing.JButton();
                listadoapartamentos1 = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                tablalistadoconsumo = new javax.swing.JTable();
                lbltotalregistrosconsumos = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                lbltotalconsumos = new javax.swing.JLabel();

                setClosable(true);
                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setIconifiable(true);
                setMaximizable(true);
                setResizable(true);
                setAutoscrolls(true);
                setMaximumSize(new java.awt.Dimension(1064, 768));
                setPreferredSize(new java.awt.Dimension(1064, 768));
                setRequestFocusEnabled(false);

                jLabel1.setFont(new java.awt.Font("Dialog", 3, 21)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 153, 204));
                jLabel1.setText("Pagos:");
                jLabel1.setToolTipText("");

                jPanel3.setBackground(new java.awt.Color(204, 204, 204));
                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N
                jPanel3.setForeground(new java.awt.Color(204, 204, 204));
                jPanel3.setToolTipText("");
                jPanel3.setAutoscrolls(true);

                jLabel4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(0, 153, 204));
                jLabel4.setText("Apartamento:");
                jLabel4.setToolTipText("");

                txtidapartamento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtidapartamentoActionPerformed(evt);
                        }
                });

                btnnuevo.setBackground(new java.awt.Color(102, 102, 102));
                btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/app.png"))); // NOI18N
                btnnuevo.setText("Nuevo");
                btnnuevo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnnuevoActionPerformed(evt);
                        }
                });

                btnguardar.setBackground(new java.awt.Color(102, 102, 102));
                btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/folder.png"))); // NOI18N
                btnguardar.setText("Guardar");
                btnguardar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnguardarActionPerformed(evt);
                        }
                });

                btncancelar.setBackground(new java.awt.Color(102, 102, 102));
                btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/error.png"))); // NOI18N
                btncancelar.setText("Cancelar");
                btncancelar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncancelarActionPerformed(evt);
                        }
                });

                jLabel3.setBackground(new java.awt.Color(204, 204, 204));
                jLabel3.setForeground(new java.awt.Color(153, 153, 153));
                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Brasilia13.png"))); // NOI18N
                jLabel3.setMaximumSize(new java.awt.Dimension(174, 38));
                jLabel3.setMinimumSize(new java.awt.Dimension(174, 38));
                jLabel3.setPreferredSize(new java.awt.Dimension(174, 238));

                txtidpago.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtidpagoActionPerformed(evt);
                        }
                });

                jLabel13.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(0, 153, 204));
                jLabel13.setText("Reservado por:");
                jLabel13.setToolTipText("");

                jLabel15.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(0, 153, 204));
                jLabel15.setToolTipText("");

                txtnumero.setForeground(new java.awt.Color(51, 51, 51));
                txtnumero.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtnumeroActionPerformed(evt);
                        }
                });

                txtidreserva.setForeground(new java.awt.Color(51, 51, 51));
                txtidreserva.setSelectedTextColor(new java.awt.Color(51, 51, 51));
                txtidreserva.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtidreservaActionPerformed(evt);
                        }
                });

                dcfecha_emision.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                dcfecha_emisionFocusLost(evt);
                        }
                });
                dcfecha_emision.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                dcfecha_emisionPropertyChange(evt);
                        }
                });

                dcfecha_pago.addAncestorListener(new javax.swing.event.AncestorListener() {
                        public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                        }
                        public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                                dcfecha_pagoAncestorAdded(evt);
                        }
                        public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                        }
                });
                dcfecha_pago.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                dcfecha_pagoFocusLost(evt);
                        }
                });
                dcfecha_pago.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                dcfecha_pagoMouseClicked(evt);
                        }
                        public void mouseReleased(java.awt.event.MouseEvent evt) {
                                dcfecha_pagoMouseReleased(evt);
                        }
                });
                dcfecha_pago.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentShown(java.awt.event.ComponentEvent evt) {
                                dcfecha_pagoComponentShown(evt);
                        }
                });
                dcfecha_pago.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                dcfecha_pagoPropertyChange(evt);
                        }
                });

                jLabel23.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(0, 153, 204));
                jLabel23.setText("Fecha Pago:");
                jLabel23.setToolTipText("");

                jLabel6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(0, 153, 204));
                jLabel6.setText("Estado del Pago:");
                jLabel6.setToolTipText("");

                cboestado.setForeground(new java.awt.Color(51, 51, 51));
                cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Pagado", "Anulado" }));
                cboestado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cboestadoActionPerformed(evt);
                        }
                });

                txtnumcomprobante.setSelectedTextColor(new java.awt.Color(51, 51, 51));
                txtnumcomprobante.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtnumcomprobanteActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(0, 153, 204));
                jLabel7.setText("Num.Comprobante:");

                jLabel2.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 153, 204));
                jLabel2.setText("Total de Reserva:");

                jLabel5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 153, 204));
                jLabel5.setText("Tipo_Comprobante:");

                cbotipocomprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boleta", "Factura", "Ticked", " ", " " }));
                cbotipocomprobante.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                cbotipocomprobanteMouseClicked(evt);
                        }
                });
                cbotipocomprobante.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbotipocomprobanteActionPerformed(evt);
                        }
                });

                txtiva.setSelectedTextColor(new java.awt.Color(51, 51, 51));
                txtiva.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtivaActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(0, 153, 204));
                jLabel8.setText("      IVA:");

                jLabel9.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(0, 153, 204));
                jLabel9.setText("Total_Pago_Pendiente:");

                txttotalpago.setSelectedTextColor(new java.awt.Color(51, 51, 51));
                txttotalpago.addInputMethodListener(new java.awt.event.InputMethodListener() {
                        public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                        }
                        public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                                txttotalpagoInputMethodTextChanged(evt);
                        }
                });
                txttotalpago.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txttotalpagoActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(0, 153, 204));
                jLabel14.setText("Num_Tarjeta:");

                jLabel12.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(0, 153, 204));
                jLabel12.setText("Tipo-Pago:");

                cbotipo_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta" }));
                cbotipo_pago.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                cbotipo_pagoMouseClicked(evt);
                        }
                });
                cbotipo_pago.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbotipo_pagoActionPerformed(evt);
                        }
                });

                txttotalpagado.setSelectedTextColor(new java.awt.Color(51, 51, 51));
                txttotalpagado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txttotalpagadoActionPerformed(evt);
                        }
                });

                jLabel10.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(0, 153, 204));
                jLabel10.setText("Total_A_Pagar:");

                jLabel22.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(0, 153, 204));
                jLabel22.setText("Fecha Emision:");
                jLabel22.setToolTipText("");

                lblreserva.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                lblreserva.setForeground(new java.awt.Color(0, 153, 204));
                lblreserva.setText("Reserva:");

                jLabel17.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(0, 153, 204));
                jLabel17.setText("# Pago:");

                jLabel18.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(0, 153, 204));
                jLabel18.setText("Tipo-Tarjeta:");

                cbotipo_tarj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "American Express", "Visa", "MasterCard", "Discover" }));
                cbotipo_tarj.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                cbotipo_tarjMouseClicked(evt);
                        }
                });
                cbotipo_tarj.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbotipo_tarjActionPerformed(evt);
                        }
                });

                pswnumtarjeta.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                pswnumtarjetaActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtidconsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtidpago, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(lblreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(42, 42, 42)
                                                                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtnumcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                                        .addComponent(txtpagadores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(txttotalreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                                        .addComponent(txtidapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(30, 30, 30)
                                                                                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(txttotalpago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtiva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(dcfecha_emision, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(dcfecha_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(cbotipo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(cbotipo_tarj, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(pswnumtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(btnnuevo)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnguardar)
                                                                .addGap(41, 41, 41)
                                                                .addComponent(btncancelar)
                                                                .addGap(21, 21, 21))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txttotalpagado, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtidconsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtidpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel17))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblreserva)))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtidapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txttotalreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtpagadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbotipocomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtnumcomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttotalpago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(txttotalpagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(txtiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dcfecha_emision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dcfecha_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbotipo_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbotipo_tarj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pswnumtarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addContainerGap(70, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnguardar)
                                                        .addComponent(btncancelar)
                                                        .addComponent(btnnuevo))
                                                .addContainerGap())))
                );

                listadoapartamentos.setBackground(new java.awt.Color(204, 204, 204));
                listadoapartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Listado de Pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N

                jScrollPane1.setMaximumSize(new java.awt.Dimension(1064, 768));

                tablalistado.setBackground(new java.awt.Color(204, 204, 204));
                tablalistado.setForeground(new java.awt.Color(102, 102, 102));
                tablalistado.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                tablalistado.setGridColor(new java.awt.Color(102, 102, 102));
                tablalistado.setInheritsPopupMenu(true);
                tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tablalistadoMouseClicked(evt);
                        }
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                tablalistadoMousePressed(evt);
                        }
                        public void mouseReleased(java.awt.event.MouseEvent evt) {
                                tablalistadoMouseReleased(evt);
                        }
                });
                jScrollPane1.setViewportView(tablalistado);

                btneliminar.setBackground(new java.awt.Color(102, 102, 102));
                btneliminar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
                btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/garbage.png"))); // NOI18N
                btneliminar.setText("Eliminar");
                btneliminar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btneliminarActionPerformed(evt);
                        }
                });

                btnsalir.setBackground(new java.awt.Color(102, 102, 102));
                btnsalir.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
                btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/salida2.png"))); // NOI18N
                btnsalir.setText("Salir");
                btnsalir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnsalirActionPerformed(evt);
                        }
                });

                lbltotalregistros.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                lbltotalregistros.setForeground(new java.awt.Color(102, 102, 102));
                lbltotalregistros.setText("Registros");

                btncomprobreserva.setBackground(new java.awt.Color(102, 102, 102));
                btncomprobreserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/reportes.png"))); // NOI18N
                btncomprobreserva.setText("Reporte s / Reserva");
                btncomprobreserva.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncomprobreservaActionPerformed(evt);
                        }
                });

                btncomprobantetodo.setBackground(new java.awt.Color(102, 102, 102));
                btncomprobantetodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/reportes.png"))); // NOI18N
                btncomprobantetodo.setText("Reporte Total");
                btncomprobantetodo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncomprobantetodoActionPerformed(evt);
                        }
                });

                btnComprobconsumos.setBackground(new java.awt.Color(102, 102, 102));
                btnComprobconsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/reportes.png"))); // NOI18N
                btnComprobconsumos.setText("Reporte s/Consumos");
                btnComprobconsumos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnComprobconsumosActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout listadoapartamentosLayout = new javax.swing.GroupLayout(listadoapartamentos);
                listadoapartamentos.setLayout(listadoapartamentosLayout);
                listadoapartamentosLayout.setHorizontalGroup(
                        listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                .addGroup(listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                                .addComponent(btncomprobreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnComprobconsumos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btncomprobantetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btneliminar))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoapartamentosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                );
                listadoapartamentosLayout.setVerticalGroup(
                        listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                .addComponent(btnsalir)
                                .addGap(12, 12, 12)
                                .addGroup(listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btncomprobreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnComprobconsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btncomprobantetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btneliminar))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbltotalregistros)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                listadoapartamentos1.setBackground(new java.awt.Color(204, 204, 204));
                listadoapartamentos1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Listado de Consumos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N

                tablalistadoconsumo.setBackground(new java.awt.Color(204, 204, 204));
                tablalistadoconsumo.setForeground(new java.awt.Color(102, 102, 102));
                tablalistadoconsumo.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                tablalistadoconsumo.setGridColor(new java.awt.Color(102, 102, 102));
                tablalistadoconsumo.setInheritsPopupMenu(true);
                tablalistadoconsumo.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tablalistadoconsumoMouseClicked(evt);
                        }
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                tablalistadoconsumoMousePressed(evt);
                        }
                });
                jScrollPane2.setViewportView(tablalistadoconsumo);

                lbltotalregistrosconsumos.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                lbltotalregistrosconsumos.setForeground(new java.awt.Color(102, 102, 102));
                lbltotalregistrosconsumos.setText("Registros");

                jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Brasilia13.png"))); // NOI18N

                lbltotalconsumos.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                lbltotalconsumos.setForeground(new java.awt.Color(102, 102, 102));
                lbltotalconsumos.setText("Total de  Consumo:");

                javax.swing.GroupLayout listadoapartamentos1Layout = new javax.swing.GroupLayout(listadoapartamentos1);
                listadoapartamentos1.setLayout(listadoapartamentos1Layout);
                listadoapartamentos1Layout.setHorizontalGroup(
                        listadoapartamentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listadoapartamentos1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(listadoapartamentos1Layout.createSequentialGroup()
                                .addGroup(listadoapartamentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(listadoapartamentos1Layout.createSequentialGroup()
                                                .addGap(180, 180, 180)
                                                .addComponent(lbltotalconsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77)
                                                .addComponent(lbltotalregistrosconsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                listadoapartamentos1Layout.setVerticalGroup(
                        listadoapartamentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listadoapartamentos1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(listadoapartamentos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbltotalregistrosconsumos)
                                        .addComponent(lbltotalconsumos))
                                .addContainerGap())
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(listadoapartamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(listadoapartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(listadoapartamentos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(listadoapartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void txtidapartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidapartamentoActionPerformed
	    // TODO add your handling code here:
	    txtidapartamento.transferFocus();
    }//GEN-LAST:event_txtidapartamentoActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
	    // TODO add your handling code here:
	    habilitar();
	    btnguardar.setText("Guardar");
	    accion = "guardar";
	    cbotipocomprobante.transferFocus();

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
	    // TODO add your handling code here:

	    if (txtiva.getText().length() == 0) {
		    JOptionPane.showConfirmDialog(rootPane, "Debes ingresar el  IVA a aplicar en tu Pago");
		    txtidapartamento.requestFocus();
		    return;
	    }
	    if (txttotalpago.getText().length() == 0) {
		    JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Total a Pagar ");
		    txtidapartamento.requestFocus();
		    return;
	    }
	    if (txtnumcomprobante.getText().length() == 0) {
		    JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un número de comprobante");
		    txtidreserva.requestFocus();
		    return;
	    }
            vcomprobantesp dts5= new vcomprobantesp();
		fcomprobantesp func5 = new fcomprobantesp();
				dts5.setNombre(cbc);
				dts5.setValor(vab);
				func5.editar (dts5);
	    vpagos dts = new vpagos();
	    fpago func = new fpago();
	    dts.setIdpago(Integer.parseInt(txtidpago.getText()));
	    dts.setIdreserva(Integer.parseInt(txtidreserva.getText()));
	    int seleccionado = cbotipocomprobante.getSelectedIndex();
	    dts.setTipo_comprobante((String) cbotipocomprobante.getItemAt(seleccionado));
	    dts.setNum_comprobante(txtnumcomprobante.getText());
	    if (!(txtpagadores.getText().equals(""))) {
		    boolean pr = true;
		    dts.setPagoreserva(Double.valueOf(txtpagadores.getText()));
		    double tr = (Double.parseDouble(txtpagadores.getText()));
		    double tt = (Double.parseDouble(txttotalpagado.getText()));

		    double ttc = tt - tr;
		    if (!(ttc > 0)) {
			    ttc = 0.00;
		    }
		    dts.setPagoconsumo(ttc);
	    } else {
		    double tr = 0.00;
		    dts.setPagoreserva(tr);
		    dts.setPagoconsumo(Double.parseDouble(txttotalpagado.getText()));
	    }
	    dts.setTotal_pago(Double.parseDouble(txttotalpagado.getText()));

	    Calendar cal1, cal2;
	    int d, m, a;

	    cal1 = dcfecha_emision.getCalendar();
	    if (cal1 == null) {
		    JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una Fecha de Emision del Comprobante");
		    dcfecha_emision.requestFocus();
		    return;
	    }
	    d = cal1.get(Calendar.DAY_OF_MONTH);
	    m = cal1.get(Calendar.MONTH);
	    a = cal1.get(Calendar.YEAR) - 1900;
	    fe = (new Date(a, m, d));

	    cal2 = dcfecha_pago.getCalendar();
	    if (cal2 == null) {
		    JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una Fecha de Pago");
		    dcfecha_pago.requestFocus();
		    return;
	    }
	    d = cal2.get(Calendar.DAY_OF_MONTH);
	    m = cal2.get(Calendar.MONTH);
	    a = cal2.get(Calendar.YEAR) - 1900;
	    fp = (new Date(a, m, d));

	    dts.setFecha_emision(fe);
	    dts.setFecha_pago(fp);
	    dts.setIva(Integer.parseInt(txtiva.getText()));

	    seleccionado = cbotipo_pago.getSelectedIndex();
	    dts.setTipo_pago((String) cbotipo_pago.getItemAt(seleccionado));
	    seleccionado = cboestado.getSelectedIndex();
	    dts.setEstado((String) cboestado.getItemAt(seleccionado));

	    if (accion.equals("guardar")) {
		    idreserva = txtidreserva.getText();

		    if (func.insertar(dts)) {

			    JOptionPane.showConfirmDialog(rootPane, "El Pago por  €." + txttotalpagado.getText() + " de Sr. " + txtcliente.getText() + " de la Reserva  " + txtidreserva.getText() + "  fue realizado satisfactoriamente", "SISTEMA DE RESERVAS BRASILIA", JOptionPane.CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

			    if (ocu) {
				    //ocupar apartamento
				    fApartamento func4 = new fApartamento();
				    vApartamento dts4 = new vApartamento();
				    dts4.setIdapartamento(Integer.parseInt(txtidapartamento.getText()));
				    func4.ocupar(dts4);
			    }

			    String ttpp = txttotalpago.getText();
			    String ttpap = txttotalpagado.getText();
			    double ppr = Double.valueOf(ttpap);
			    if (ttpp.equals(ttpap)) {
				    pt = true;
			    }
			    if (pt) {
				    if (ocu) {
					    // pagar la reserva
					    freserva func3 = new freserva();
					    vreserva dts3 = new vreserva();

					    dts3.setIdReserva(Integer.parseInt(txtidreserva.getText()));
					    dts3.setPagadore(preserva);
					    dts3.setPagado(Double.parseDouble(txttotalpagado.getText()));
					    func3.pagart(dts3);

				    } else {

					    //actualizar consumos
					    vconsumo dts2 = new vconsumo();
					    fconsumo func2 = new fconsumo();

					    dts2.setIdreserva(Integer.parseInt(txtidreserva.getText()));
					    dts2.setIdpago(Integer.parseInt(txtidpago.getText()));
					    func2.pagar(dts2);

					    // pagar la reserva
					    freserva func3 = new freserva();
					    vreserva dts3 = new vreserva();
					    double pres = (ppr - mreserva);
					    if ((pres == 0.0)) {
						    resp = mreserva;

					    } else {
						    double ppres = (Math.rint(ppr / mreserva));
						    resp = ppres * mreserva;
					    }
					    dts3.setPagadore(resp);
					    dts3.setPagado(Double.parseDouble(txttotalpagado.getText()));
					    dts3.setIdReserva(Integer.parseInt(txtidreserva.getText()));
					    func3.pagart(dts3);

					    if ((frs) || (pt)) {

						    int Jresp = JOptionPane.showConfirmDialog(rootPane, "Deseas Prorrogar la Reserva ?", "SISTEMA DE RESERVAS BRASILIA", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

						    if (Jresp == 0) {

							    frmvistaprorroga.idreserva = (idreserva);
							    frmvistaprorroga.idapartamento = (idapartamento);
							    frmvistaprorroga.numero = (txtnumero.getText());
							    frmvistaprorroga.idcliente = (txtidcliente.getText());
							    frmvistaprorroga.cliente = (cliente);
							    frmvistaprorroga.fechasalida = (fechasalida);
							    frmvistaprorroga form = new frmvistaprorroga();
							    frmInicio.escritorio.add(form);
							    form.toFront();
							    form.setVisible(true);
						    } else {

							    int dfr = func3.diferenciaEnDias(fechasalida, dts.getFecha_pago());

							    if (dfr == 0) {

								    // desocupar apartamento  
								    fApartamento func4 = new fApartamento();
								    vApartamento dts4 = new vApartamento();

								    dts4.setIdapartamento(Integer.parseInt(txtidapartamento.getText()));
								    func4.desocupar(dts4);
							    } else {
								    func3.nopro(dts3);

								    fApartamento func4 = new fApartamento();
								    vApartamento dts4 = new vApartamento();
								    dts4.setIdapartamento(Integer.parseInt(txtidapartamento.getText()));
								    dts4.setUltimaOcupacion(fechasalida);
								    func4.ofertar(dts4);

							    }

						    }

					    }
				    }
			    } else {

				    if (pc) {
					    //actualizar consumos

					    vconsumo dts2 = new vconsumo();
					    fconsumo func2 = new fconsumo();

					    dts2.setIdreserva(Integer.parseInt(txtidreserva.getText()));
					    dts2.setIdpago(Integer.parseInt(txtidpago.getText()));
					    func2.pagar(dts2);

				    } else {
					    if (pr) {
						    double pres = (ppr - mreserva);
						    if ((pres == 0.0)) {
							    resp = mreserva;

						    } else {
							    double ppres = (Math.floor(pres / mreserva));
							    resp = ppres * mreserva;

						    }
						    freserva func3 = new freserva();
						    vreserva dts3 = new vreserva();

						    dts3.setPagadore(resp);
						    dts3.setPagado(Double.parseDouble(txttotalpagado.getText()));
						    dts3.setIdReserva(Integer.parseInt(txtidreserva.getText()));
						    func3.pagar(dts3);

					    } else {
						    //actualizar consumos
						    vconsumo dts2 = new vconsumo();
						    fconsumo func2 = new fconsumo();

						    dts2.setIdreserva(Integer.parseInt(txtidreserva.getText()));
						    dts2.setIdpago(Integer.parseInt(txtidpago.getText()));
						    func2.pagar(dts2);

						    // pagar la reserva
						    double pres = (ppr - mreserva);
						    if ((pres == 0.0)) {
							    resp = mreserva;

						    } else {
							    double ppres = (Math.floor(pres / mreserva));
							    resp = ppres * mreserva;

						    }
						    freserva func3 = new freserva();
						    vreserva dts3 = new vreserva();

						    dts3.setPagadore(resp);
						    dts3.setPagado(Double.parseDouble(txttotalpagado.getText()));
						    dts3.setIdReserva(Integer.parseInt(txtidreserva.getText()));
						    func3.pagar(dts3);

					    }
				    }

			    }

			    mostrar(idreserva);
			    inhabilitar();
		    }

	    } else if (accion.equals("editar")) {
		    dts.setIdpago(Integer.parseInt(txtidpago.getText()));

		    if (func.editar(dts)) {
			    JOptionPane.showConfirmDialog(rootPane, "El Pago del Sr." + txtcliente.getText() + " con la Reserva " + txtidreserva.getText() + "  fue modificado satisfactoriamente");
			    mostrar(idreserva);
			    inhabilitar();
		    }
	    }
    }//GEN-LAST:event_btnguardarActionPerformed


    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
	    // TODO add your handling code here:

	    inhabilitar();

    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
	    // TODO add your handling code here:
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtidreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidreservaActionPerformed
	    // TODO add your handling code here:
    }//GEN-LAST:event_txtidreservaActionPerformed

    private void dcfecha_emisionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_emisionFocusLost
	    // TODO add your handling code here:{

	    dcfecha_emision.transferFocus();
    }//GEN-LAST:event_dcfecha_emisionFocusLost

    private void dcfecha_emisionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcfecha_emisionPropertyChange
	    // TODO add your handling code here:
	    dcfecha_emision.transferFocus();
    }//GEN-LAST:event_dcfecha_emisionPropertyChange

    private void dcfecha_pagoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dcfecha_pagoAncestorAdded
	    // TODO add your handling code here:

    }//GEN-LAST:event_dcfecha_pagoAncestorAdded

    private void dcfecha_pagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_pagoFocusLost
	    // TODO add your handling code here:

	    dcfecha_pago.transferFocus();
    }//GEN-LAST:event_dcfecha_pagoFocusLost

    private void dcfecha_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcfecha_pagoMouseClicked
	    // TODO add your handling code here:
	    txtnumcomprobante.transferFocus();
    }//GEN-LAST:event_dcfecha_pagoMouseClicked

    private void dcfecha_pagoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcfecha_pagoMouseReleased
	    // TODO add your handling code here:
	    txtnumcomprobante.transferFocus();
    }//GEN-LAST:event_dcfecha_pagoMouseReleased

    private void dcfecha_pagoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dcfecha_pagoComponentShown
	    // TODO add your handling code here:

    }//GEN-LAST:event_dcfecha_pagoComponentShown

    private void dcfecha_pagoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcfecha_pagoPropertyChange
	    // TODO add your handling code here:
	    txtnumcomprobante.transferFocus();
    }//GEN-LAST:event_dcfecha_pagoPropertyChange

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
	    // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoActionPerformed

    private void txtnumcomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumcomprobanteActionPerformed
	    // TODO add your handling code here:

    }//GEN-LAST:event_txtnumcomprobanteActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
	    // TODO add your handling code here:
	    btnguardar.setText("Editar");
	    habilitar();
	    btneliminar.setEnabled(true);
	    accion = "editar";

	    int fila = tablalistado.rowAtPoint(evt.getPoint());
	    txtidpago.setText(tablalistado.getValueAt(fila, 0).toString());
	    cbotipocomprobante.setSelectedItem(tablalistado.getValueAt(fila, 2).toString());
	    txtnumcomprobante.setText(tablalistado.getValueAt(fila, 3).toString());

	    txttotalpagado.setText(tablalistado.getValueAt(fila, 4).toString());
	    dcfecha_emision.setDate(Date.valueOf(tablalistado.getValueAt(fila, 5).toString()));
	    dcfecha_pago.setDate(Date.valueOf(tablalistado.getValueAt(fila, 6).toString()));
	    txtiva.setText(tablalistado.getValueAt(fila, 7).toString());

	    cbotipo_pago.setSelectedItem(tablalistado.getValueAt(fila, 8).toString());
	    pswnumtarjeta.setText(tablalistado.getValueAt(fila, 9).toString());
	    cboestado.setSelectedItem(tablalistado.getValueAt(fila, 11).toString());

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
	    // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoMousePressed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
	    // TODO add your handling code here:
	    if (!txtidpago.getText().equals("")) {
		    int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de ELIMINAR el Pago Selecciondo de la Reserva?", "Confirmar", 2);

		    if (confirmacion == 0) {
			    fpago func = new fpago();
			    vpagos dts = new vpagos();

			    dts.setIdpago(Integer.parseInt(txtidpago.getText()));
			    func.eliminar(dts);
			    mostrar(idreserva);
			    inhabilitar();
		    }

	    }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
	    // TODO add your handling code here:
	    this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtivaActionPerformed
	    // TODO add your handling code here:
	    txttotalpago.transferFocus();
	    double tap = ((Double.parseDouble(txttotalpagado.getText()) * (Integer.parseInt(txtiva.getText()))/100));
	    double ttap = ((tap) + (Double.parseDouble(txttotalpagado.getText())));
	    txttotalpagado.setText(String.valueOf(ttap));

    }//GEN-LAST:event_txtivaActionPerformed

    private void txttotalpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalpagoActionPerformed
	    // TODO add your handling code here:
    }//GEN-LAST:event_txttotalpagoActionPerformed

    private void tablalistadoconsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoconsumoMouseClicked
	    habilitar();
	    cbotipocomprobante.transferFocus();
	    pc = true;
	    int fila = tablalistadoconsumo.rowAtPoint(evt.getPoint());
	    txtnumero.setText(tablalistadoconsumo.getValueAt(fila, 2).toString());

	    txttotalpagado.setText(tablalistadoconsumo.getValueAt(fila, 7).toString());
	    txtidconsumo.setText(tablalistadoconsumo.getValueAt(fila, 0).toString());

    }//GEN-LAST:event_tablalistadoconsumoMouseClicked

    private void tablalistadoconsumoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoconsumoMousePressed
	    // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoconsumoMousePressed

    private void cbotipo_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_pagoActionPerformed
	    // TODO add your handling code here:
	    int seleccionado = cbotipo_pago.getSelectedIndex();
	    String cbe = ((String) cbotipo_pago.getItemAt(seleccionado));
	    if (!(cbe.equals("")) && cbe.equals("Tarjeta")) {
		    cbotipo_tarj.setEnabled(true);
		    cbotipo_tarj.setVisible(true);
		    cbotipo_tarj.transferFocus();
	    }
    }//GEN-LAST:event_cbotipo_pagoActionPerformed

    private void txttotalpagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalpagadoActionPerformed
	    // TODO add your handling code here:
	    txttotalpagado.transferFocus();
    }//GEN-LAST:event_txttotalpagadoActionPerformed

    private void txttotalpagoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txttotalpagoInputMethodTextChanged
	    // TODO add your handling code here:
    }//GEN-LAST:event_txttotalpagoInputMethodTextChanged
	private Connection connection = new Conexion().conectar();

    private void btncomprobreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprobreservaActionPerformed
	    // TODO add your handling code here:
	    if (!(txtidpago.getText().equals(""))) {

		    Map p = new HashMap();
		    p.put("idpago", txtidpago.getText());
		    JasperReport report;
		    JasperPrint print;

		    try {
			    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
				    + "/src/Reportes/rptComprobanteReserva.jrxml");
			    print = JasperFillManager.fillReport(report, p, connection);
			    JasperViewer view = new JasperViewer(print, false);
			    view.setTitle("Comprobante de Pago_Reserva");
			    view.setVisible(true);

		    } catch (JRException e) {
		    }
	    }

    }//GEN-LAST:event_btncomprobreservaActionPerformed

    private void txtidpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpagoActionPerformed
	    // TODO add your handling code here:
    }//GEN-LAST:event_txtidpagoActionPerformed

    private void btncomprobantetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprobantetodoActionPerformed
	    // TODO add your handling code here:

	    if (!(txtidpago.getText().equals(""))) {
		    Map p = new HashMap();
		    p.put("idpago", txtidpago.getText());
		    JasperReport report;
		    JasperPrint print;

		    try {
			    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
				    + "/src/Reportes/rptComprobantetodo.jrxml");
			    print = JasperFillManager.fillReport(report, p, connection);
			    JasperViewer view = new JasperViewer(print, false);
			    view.setTitle("Comprobante de Pago_Total");
			    view.setVisible(true);

		    } catch (JRException e) {

			    e.printStackTrace();
		    }
	    }
    }//GEN-LAST:event_btncomprobantetodoActionPerformed

    private void btnComprobconsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobconsumosActionPerformed
	    // TODO add your handling code here:
	    if (!(txtidpago.getText().equals(""))) {
		    Map p = new HashMap();
		    p.put("idpago", txtidpago.getText());
		    JasperReport report;
		    JasperPrint print;

		    try {
			    report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
				    + "/src/Reportes/rptComprobanteConsumo.jrxml");
			    print = JasperFillManager.fillReport(report, p, connection);
			    JasperViewer view = new JasperViewer(print, false);
			    view.setTitle("Comprobante de Pago_Consumo");
			    view.setVisible(true);

		    } catch (JRException e) {

			    e.printStackTrace();
		    }

	    }
    }//GEN-LAST:event_btnComprobconsumosActionPerformed

        private void tablalistadoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseReleased
		// TODO add your handling code here:
        }//GEN-LAST:event_tablalistadoMouseReleased

        private void cbotipo_pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbotipo_pagoMouseClicked
		// TODO add your handling code here:

        }//GEN-LAST:event_cbotipo_pagoMouseClicked

        private void cbotipocomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipocomprobanteActionPerformed
		// TODO add your handling code here:
		
		int seleccionado3 = cbotipocomprobante.getSelectedIndex();
		String cbc = ((String) cbotipocomprobante.getItemAt(seleccionado3));
		if (!(cbc.equals(""))) {
			if (cbc.equals("Boleta")) {
				fpago func9 = new fpago();
				String co = String.valueOf(func9.buscavalor(cbc));
				String bol = "BBol" + co + "";
				txtnumcomprobante.setText(bol);
				int vab= (Integer.parseInt(co));
				
			} else {
				if (cbc.equals("Factura")) {
					fpago func9 = new fpago();
					String co = String.valueOf(func9.buscavalor(cbc));
					String bol = "BFact" + co + "";
					txtnumcomprobante.setText(bol);
					int vab= Integer.parseInt(co);
					
				} else {
					if (cbc.equals("Ticked")) {
						fpago func9 = new fpago();
						String co = String.valueOf(func9.buscavalor(cbc));
						String bol = "BTick" + co + "";
						txtnumcomprobante.setText(bol);
						int vab= Integer.parseInt(co);
						
					}
				}
			}
		} else {
			cbotipocomprobante.requestFocus();
		}
        }//GEN-LAST:event_cbotipocomprobanteActionPerformed

        private void cbotipocomprobanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbotipocomprobanteMouseClicked
		// TODO add your handling code here:
        }//GEN-LAST:event_cbotipocomprobanteMouseClicked

        private void cbotipo_tarjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbotipo_tarjMouseClicked
		// TODO add your handling code here:
        }//GEN-LAST:event_cbotipo_tarjMouseClicked

        private void cbotipo_tarjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_tarjActionPerformed
		// TODO add your handling code here:
		pswnumtarjeta.setEnabled(true);

		pswnumtarjeta.setVisible(true);

		pswnumtarjeta.transferFocus();
        }//GEN-LAST:event_cbotipo_tarjActionPerformed

        private void pswnumtarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswnumtarjetaActionPerformed
		// TODO add your handling code here:
		int seleccionado5 = cbotipo_tarj.getSelectedIndex();
		String cbt = ((String) cbotipo_tarj.getItemAt(seleccionado5));
		if (!(cbt.equals(""))) {
			if (!(pswnumtarjeta.getText().equals(""))) {
				fpago func9 = new fpago();
				boolean tarjvalid = func9.validatarj(cbt, pswnumtarjeta.getText());
				if (tarjvalid){
					 JOptionPane.showConfirmDialog(rootPane,"La tarjeta es válida ,espere.... procedemos al cobro");
				}else{
				JOptionPane.showConfirmDialog(rootPane,"La tarjeta NO es válida ,vuelva a escribirla");
				pswnumtarjeta.requestFocus();
				}
			}
		}else {
		cbotipo_tarj.requestFocus();
		}
        }//GEN-LAST:event_pswnumtarjetaActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {

		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmpago().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnComprobconsumos;
        private javax.swing.JButton btncancelar;
        private javax.swing.JButton btncomprobantetodo;
        private javax.swing.JButton btncomprobreserva;
        private javax.swing.JButton btneliminar;
        private javax.swing.JButton btnguardar;
        public static javax.swing.JButton btnnuevo;
        private javax.swing.JButton btnsalir;
        private javax.swing.JComboBox<String> cboestado;
        private javax.swing.JComboBox<String> cbotipo_pago;
        private javax.swing.JComboBox<String> cbotipo_tarj;
        private javax.swing.JComboBox<String> cbotipocomprobante;
        public static com.toedter.calendar.JDateChooser dcfecha_emision;
        public static com.toedter.calendar.JDateChooser dcfecha_pago;
        private javax.swing.JLabel jLabel1;
        public static javax.swing.JLabel jLabel10;
        public static javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        public static javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        public static javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        public static javax.swing.JLabel jLabel7;
        public static javax.swing.JLabel jLabel8;
        public static javax.swing.JLabel jLabel9;
        public static javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        public static javax.swing.JLabel lblreserva;
        private javax.swing.JLabel lbltotalconsumos;
        private javax.swing.JLabel lbltotalregistros;
        private javax.swing.JLabel lbltotalregistrosconsumos;
        private javax.swing.JPanel listadoapartamentos;
        private javax.swing.JPanel listadoapartamentos1;
        private javax.swing.JTextField pswnumtarjeta;
        private javax.swing.JTable tablalistado;
        private javax.swing.JTable tablalistadoconsumo;
        public static javax.swing.JTextField txtcliente;
        public static javax.swing.JTextField txtidapartamento;
        public static javax.swing.JTextField txtidcliente;
        public static javax.swing.JTextField txtidconsumo;
        public static javax.swing.JTextField txtidpago;
        public static javax.swing.JTextField txtidreserva;
        public static javax.swing.JTextField txtiva;
        public static javax.swing.JTextField txtnumcomprobante;
        public static javax.swing.JTextField txtnumero;
        public static javax.swing.JTextField txtpagadores;
        public static javax.swing.JTextField txttotalpagado;
        public static javax.swing.JTextField txttotalpago;
        public static javax.swing.JTextField txttotalreserva;
        // End of variables declaration//GEN-END:variables

}
