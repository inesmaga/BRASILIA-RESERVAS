package Presentacion;

import Datos.vApartamento;
import Datos.vpagos;
import Datos.vreserva;
import Logica.Conexion;
import Logica.fApartamento;
import Logica.fpago;
import Logica.freserva;
import static Presentacion.frmInicio.lbltemporada;
import java.io.File;
import java.sql.Connection;

import java.sql.Date;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author inesm
 */
public class frmreserva extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmreserva
     */
    public frmreserva() {
        initComponents();
        mostrar("");
        inhabilitar();

    }
    private String accion = "guardar";
    public static int idusuario;
    public static int diarev;

    public int vidp, df, dd;
    public double vdp, pdr;
    public double ptemp;
    public double dpf;
    public double ca;
    public boolean os = false;
    public Date din, fr;
    public Date dsal, fi, fs;
    public freserva func;
    public vreserva dts;

    public void ocultar_columnas() {
        tablalistador.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistador.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistador.getColumnModel().getColumn(0).setPreferredWidth(0);
        tablalistador.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistador.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistador.getColumnModel().getColumn(1).setPreferredWidth(0);
        tablalistador.getColumnModel().getColumn(3).setMaxWidth(0);
        tablalistador.getColumnModel().getColumn(3).setMinWidth(0);
        tablalistador.getColumnModel().getColumn(3).setPreferredWidth(0);
        tablalistador.getColumnModel().getColumn(5).setMaxWidth(0);
        tablalistador.getColumnModel().getColumn(5).setMinWidth(0);
        tablalistador.getColumnModel().getColumn(5).setPreferredWidth(0);
        tablalistador.getColumnModel().getColumn(7).setMaxWidth(0);
        tablalistador.getColumnModel().getColumn(7).setMinWidth(0);
        tablalistador.getColumnModel().getColumn(7).setPreferredWidth(0);

    }

    void inhabilitar() {

        txtidreserva.setVisible(false);
        txtidapartamento.setVisible(false);
        txtidcliente.setVisible(false);
        txtidtrabajador.setVisible(false);
        txtprecb.setVisible(false);
        txtpreca.setVisible(false);
        txtestadap.setVisible(false);
        txttemporada.setEnabled(false);
        txtprecb.setEnabled(false);
        txtpreca.setEnabled(false);
        dcfech_iniPro.setVisible(false);
        dcfech_iniPro.setEnabled(false);
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txttrabajador.setEnabled(false);
        cbotipo_reserva.setEnabled(false);
        txtprecb.setEnabled(false);
        txtpreca.setEnabled(false);
        dcfecha_reserva.setEnabled(false);
        dcfecha_ingreso.setEnabled(false);
        dcfecha_salida.setEnabled(false);
        btncalculocost.setEnabled(false);
        txtcosttot.setEnabled(false);
        txtcostmen.setEnabled(false);
        dcultiocup.setVisible(false);
        dcultiocup.setEnabled(false);
        cboestado.setEnabled(false);

        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        btnbuscaapartamento.setEnabled(false);
        btnbuscacliente.setEnabled(false);

        txtidreserva.setText("");
        txtidcliente.setText("");

        txtnumero.setText("");
        txtcliente.setText("");
        txtcostmen.setText("");
        txtcosttot.setText("");
        txtidapartamento.setText("");

    }

    void habilitar() {

        txtidreserva.setVisible(false);
        txtidapartamento.setVisible(false);
        txtidcliente.setVisible(false);
        txtidtrabajador.setVisible(false);
        txttemporada.setVisible(true);
        txttemporada.setEnabled(true);
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txttrabajador.setEnabled(false);
        dcfech_iniPro.setVisible(false);
        dcfech_iniPro.setEnabled(false);
        txtprecb.setVisible(false);
        txtpreca.setVisible(false);
        txtprecb.setEnabled(false);
        txtpreca.setEnabled(false);
        cbotipo_reserva.setEnabled(true);
        txtestadap.setVisible(false);
        dcfecha_reserva.setEnabled(true);
        dcfecha_ingreso.setEnabled(true);
        dcfecha_salida.setEnabled(true);
        btncalculocost.setEnabled(true);
        txtcostmen.setVisible(true);
        txtcosttot.setVisible(true);
        cboestado.setEnabled(true);
        dcultiocup.setEnabled(false);
        dcultiocup.setVisible(false);
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btneliminar.setEnabled(true);
        btnbuscaapartamento.setEnabled(true);
        btnbuscacliente.setEnabled(true);

        txtidreserva.setText("");
        txtidcliente.setText("");
        txtcostmen.setText("");
        txtcosttot.setText("");
        txtnumero.setText("");
        txtcliente.setText("");

        txtidapartamento.setText("");

    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            freserva func = new freserva();
            modelo = func.mostrar(buscar);
            tablalistador.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                txtidapartamento = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                cbotipo_reserva = new javax.swing.JComboBox<>();
                btnnuevo = new javax.swing.JButton();
                btnguardar = new javax.swing.JButton();
                btncancelar = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                txtidreserva = new javax.swing.JTextField();
                jLabel13 = new javax.swing.JLabel();
                txtidcliente = new javax.swing.JTextField();
                txtcostmen = new javax.swing.JTextField();
                jLabel14 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                txtnumero = new javax.swing.JTextField();
                txtcliente = new javax.swing.JTextField();
                jLabel21 = new javax.swing.JLabel();
                txttrabajador = new javax.swing.JTextField();
                txtidtrabajador = new javax.swing.JTextField();
                dcfecha_reserva = new com.toedter.calendar.JDateChooser();
                jLabel22 = new javax.swing.JLabel();
                dcfecha_ingreso = new com.toedter.calendar.JDateChooser();
                dcfecha_salida = new com.toedter.calendar.JDateChooser();
                jLabel23 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                cboestado = new javax.swing.JComboBox<>();
                btnbuscaapartamento = new javax.swing.JButton();
                btnbuscacliente = new javax.swing.JButton();
                txttemporada = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                btncalculocost = new javax.swing.JButton();
                txtprecb = new javax.swing.JTextField();
                txtpreca = new javax.swing.JTextField();
                jLabel19 = new javax.swing.JLabel();
                txtcosttot = new javax.swing.JTextField();
                dcfech_iniPro = new com.toedter.calendar.JDateChooser();
                txtestadap = new javax.swing.JTextField();
                dcultiocup = new com.toedter.calendar.JDateChooser();
                listadoapartamentos = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tablalistador = new javax.swing.JTable();
                jLabel2 = new javax.swing.JLabel();
                txtbuscar = new javax.swing.JTextField();
                btnbuscar = new javax.swing.JButton();
                btneliminar = new javax.swing.JButton();
                btnsalir = new javax.swing.JButton();
                lbltotalregistros = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                btnVconsumo = new javax.swing.JButton();
                btnrealizarpagos = new javax.swing.JButton();
                btnreporte = new javax.swing.JButton();
                btnexreser = new javax.swing.JButton();

                setClosable(true);
                setIconifiable(true);
                setMaximizable(true);
                setResizable(true);
                setAutoscrolls(true);
                setMaximumSize(new java.awt.Dimension(1064, 768));
                setPreferredSize(new java.awt.Dimension(1064, 768));

                jLabel1.setFont(new java.awt.Font("Dialog", 3, 21)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 153, 204));
                jLabel1.setText("Reservas:");
                jLabel1.setToolTipText("");

                jPanel3.setBackground(new java.awt.Color(204, 204, 204));
                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N
                jPanel3.setForeground(new java.awt.Color(204, 204, 204));
                jPanel3.setToolTipText("");

                jLabel4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(0, 153, 204));
                jLabel4.setText("Apartamento:");
                jLabel4.setToolTipText("");

                txtidapartamento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtidapartamentoActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 153, 204));
                jLabel5.setText("Tipo Reserva:");
                jLabel5.setToolTipText("");

                cbotipo_reserva.setForeground(new java.awt.Color(51, 51, 51));
                cbotipo_reserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservada", "EnAlquiler", "Prorrogada" }));
                cbotipo_reserva.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbotipo_reservaActionPerformed(evt);
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

                jLabel13.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(0, 153, 204));
                jLabel13.setText("Cliente:");
                jLabel13.setToolTipText("");

                txtidcliente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtidclienteActionPerformed(evt);
                        }
                });

                txtcostmen.setForeground(new java.awt.Color(153, 0, 51));
                txtcostmen.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                txtcostmenFocusGained(evt);
                        }
                });
                txtcostmen.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtcostmenActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(0, 153, 204));
                jLabel14.setText("Fecha Reserva:");
                jLabel14.setToolTipText("");

                jLabel15.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(0, 153, 204));
                jLabel15.setToolTipText("");

                jLabel18.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(0, 153, 204));
                jLabel18.setText("Costo_Mens.Aloj:");
                jLabel18.setToolTipText("");

                txtnumero.setForeground(new java.awt.Color(51, 51, 51));
                txtnumero.addContainerListener(new java.awt.event.ContainerAdapter() {
                        public void componentAdded(java.awt.event.ContainerEvent evt) {
                                txtnumeroComponentAdded(evt);
                        }
                });
                txtnumero.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtnumeroActionPerformed(evt);
                        }
                });
                txtnumero.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                txtnumeroPropertyChange(evt);
                        }
                });

                txtcliente.setForeground(new java.awt.Color(51, 51, 51));
                txtcliente.setSelectedTextColor(new java.awt.Color(51, 51, 51));
                txtcliente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtclienteActionPerformed(evt);
                        }
                });

                jLabel21.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel21.setForeground(new java.awt.Color(0, 153, 204));
                jLabel21.setText("Trabajador:");
                jLabel21.setToolTipText("");

                txttrabajador.setForeground(new java.awt.Color(51, 51, 51));
                txttrabajador.setSelectedTextColor(new java.awt.Color(0, 0, 0));
                txttrabajador.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txttrabajadorActionPerformed(evt);
                        }
                });

                txtidtrabajador.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtidtrabajadorActionPerformed(evt);
                        }
                });

                dcfecha_reserva.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                dcfecha_reservaPropertyChange(evt);
                        }
                });

                jLabel22.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(0, 153, 204));
                jLabel22.setText("Fecha Ingreso:");
                jLabel22.setToolTipText("");

                dcfecha_ingreso.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                dcfecha_ingresoFocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                dcfecha_ingresoFocusLost(evt);
                        }
                });
                dcfecha_ingreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                dcfecha_ingresoPropertyChange(evt);
                        }
                });

                dcfecha_salida.addAncestorListener(new javax.swing.event.AncestorListener() {
                        public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                        }
                        public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                                dcfecha_salidaAncestorAdded(evt);
                        }
                        public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                        }
                });
                dcfecha_salida.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                dcfecha_salidaFocusLost(evt);
                        }
                });
                dcfecha_salida.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                dcfecha_salidaMouseClicked(evt);
                        }
                        public void mouseReleased(java.awt.event.MouseEvent evt) {
                                dcfecha_salidaMouseReleased(evt);
                        }
                });
                dcfecha_salida.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentShown(java.awt.event.ComponentEvent evt) {
                                dcfecha_salidaComponentShown(evt);
                        }
                });
                dcfecha_salida.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                dcfecha_salidaPropertyChange(evt);
                        }
                });

                jLabel23.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(0, 153, 204));
                jLabel23.setText("Fecha Salida:");
                jLabel23.setToolTipText("");

                jLabel6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(0, 153, 204));
                jLabel6.setText("Estado de Reserva:");
                jLabel6.setToolTipText("");

                cboestado.setForeground(new java.awt.Color(51, 51, 51));
                cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservada", "Pagada-Total", "Pagada_Mensual", "Pendiente_Pago", "Anulada" }));
                cboestado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cboestadoActionPerformed(evt);
                        }
                });

                btnbuscaapartamento.setText("...");
                btnbuscaapartamento.setToolTipText("");
                btnbuscaapartamento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnbuscaapartamentoActionPerformed(evt);
                        }
                });

                btnbuscacliente.setText("...");
                btnbuscacliente.setToolTipText("");
                btnbuscacliente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnbuscaclienteActionPerformed(evt);
                        }
                });

                txttemporada.setSelectedTextColor(new java.awt.Color(51, 51, 51));
                txttemporada.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txttemporadaActionPerformed(evt);
                        }
                });

                jLabel7.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(0, 153, 204));
                jLabel7.setText("Temporada:");

                btncalculocost.setForeground(new java.awt.Color(0, 153, 204));
                btncalculocost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/calculator.png"))); // NOI18N
                btncalculocost.setText("Calc. Costo Alojamiento");
                btncalculocost.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncalculocostActionPerformed(evt);
                        }
                });

                jLabel19.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel19.setForeground(new java.awt.Color(0, 153, 204));
                jLabel19.setText("Costo_Tot. Aloj:");
                jLabel19.setToolTipText("");

                txtcosttot.setForeground(new java.awt.Color(153, 0, 51));
                txtcosttot.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                txtcosttotFocusGained(evt);
                        }
                });
                txtcosttot.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtcosttotActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtcosttot, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtcostmen, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txttemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(149, 149, 149))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGap(137, 137, 137)
                                                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                .addComponent(txtidapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(btnbuscaapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                        .addGap(96, 96, 96)
                                                                                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                        .addGap(18, 18, 18)
                                                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                        .addComponent(dcultiocup, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(dcfech_iniPro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                        .addComponent(txtprecb, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                        .addComponent(txtpreca, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addComponent(btnnuevo)
                                                                        .addGap(29, 29, 29)
                                                                        .addComponent(btnguardar)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(btncancelar))
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(dcfecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(dcfecha_reserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(btnbuscacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                .addComponent(txtestadap, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                                .addGap(6, 6, 6)
                                                                                                                .addComponent(cbotipo_reserva, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                                        .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addComponent(dcfecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btncalculocost)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtprecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtpreca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(dcultiocup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dcfech_iniPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtidapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnbuscaapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnbuscacliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbotipo_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtestadap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dcfecha_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dcfecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dcfecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txttemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(btncalculocost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtcostmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtcosttot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btncancelar)
                                        .addComponent(btnnuevo)
                                        .addComponent(btnguardar))
                                .addGap(23, 23, 23))
                );

                listadoapartamentos.setBackground(new java.awt.Color(204, 204, 204));
                listadoapartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Listado de Reservas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N
                listadoapartamentos.setMaximumSize(new java.awt.Dimension(1064, 768));
                listadoapartamentos.setPreferredSize(new java.awt.Dimension(1064, 768));

                tablalistador.setBackground(new java.awt.Color(204, 204, 204));
                tablalistador.setForeground(new java.awt.Color(102, 102, 102));
                tablalistador.setModel(new javax.swing.table.DefaultTableModel(
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
                tablalistador.setGridColor(new java.awt.Color(102, 102, 102));
                tablalistador.setInheritsPopupMenu(true);
                tablalistador.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tablalistadorMouseClicked(evt);
                        }
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                tablalistadorMousePressed(evt);
                        }
                });
                jScrollPane1.setViewportView(tablalistador);

                jLabel2.setBackground(new java.awt.Color(204, 204, 204));
                jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 153, 204));
                jLabel2.setText("Buscar Reserva:");
                jLabel2.setToolTipText("");

                txtbuscar.setBackground(new java.awt.Color(187, 187, 187));
                txtbuscar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtbuscarActionPerformed(evt);
                        }
                });

                btnbuscar.setBackground(new java.awt.Color(102, 102, 102));
                btnbuscar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
                btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/search.png"))); // NOI18N
                btnbuscar.setText("Buscar");
                btnbuscar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnbuscarActionPerformed(evt);
                        }
                });

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

                jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Brasilia13.png"))); // NOI18N

                btnVconsumo.setText("Ver Consumos");
                btnVconsumo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnVconsumoActionPerformed(evt);
                        }
                });

                btnrealizarpagos.setText("Realizar Pagos");
                btnrealizarpagos.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnrealizarpagosActionPerformed(evt);
                        }
                });

                btnreporte.setBackground(new java.awt.Color(102, 102, 102));
                btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/reportes.png"))); // NOI18N
                btnreporte.setText("Reporte");
                btnreporte.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnreporteActionPerformed(evt);
                        }
                });

                btnexreser.setText("Exportar Reserva");
                btnexreser.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnexreserActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout listadoapartamentosLayout = new javax.swing.GroupLayout(listadoapartamentos);
                listadoapartamentos.setLayout(listadoapartamentosLayout);
                listadoapartamentosLayout.setHorizontalGroup(
                        listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                .addGroup(listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(btnVconsumo)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnrealizarpagos)
                                                .addGap(27, 27, 27)
                                                .addComponent(btnexreser)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane1)
                                                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnbuscar)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnreporte)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btneliminar)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                listadoapartamentosLayout.setVerticalGroup(
                        listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(btnbuscar)
                                        .addComponent(btneliminar)
                                        .addComponent(btnsalir)
                                        .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnVconsumo)
                                        .addComponent(btnrealizarpagos)
                                        .addComponent(btnexreser)
                                        .addComponent(lbltotalregistros))
                                .addGap(25, 25, 25))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(listadoapartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(listadoapartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void txtidapartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidapartamentoActionPerformed
        // TODO add your handling code here:
        txtidapartamento.transferFocus();
    }//GEN-LAST:event_txtidapartamentoActionPerformed

    private void cbotipo_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipo_reservaActionPerformed
        // TODO add your handling code here:
        cbotipo_reserva.transferFocus();
    }//GEN-LAST:event_cbotipo_reservaActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
        txttemporada.setText(lbltemporada.getText());

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:

        if (txtidapartamento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un Apartamento");
            txtidapartamento.requestFocus();
            return;
        }
        if (txtidcliente.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un  Cliente");
            txtidcliente.requestFocus();
            return;
        }
        vreserva dts = new vreserva();
        freserva func = new freserva();
        dts.setIdapartamento(Integer.parseInt(txtidapartamento.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdtrabajador(idusuario);
        dts.setIdDP(vidp);
        int seleccionado = cbotipo_reserva.getSelectedIndex();
        dts.setTipo_reserva((String) cbotipo_reserva.getItemAt(seleccionado));
        dts.setFecha_reserva(fr);
        dts.setFecha_ingreso(fi);
        dts.setFecha_salida(fs);
        dts.setFecha_InicPro(fs);
        dts.setTemporada(txttemporada.getText());

        dts.setCosto_mensual(Double.parseDouble(txtcostmen.getText()));
        dts.setCosto_total(Double.parseDouble(txtcosttot.getText()));
        double pdr=0.00;
         double pdt=0.00;
        dts.setPagadore(pdr);
        dts.setPagado(pdt);
        seleccionado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(seleccionado));
        String es = (String.valueOf(cboestado.getItemAt(seleccionado)));
        if ((!("Anulada".equals(es))) && (!("Reservada".equals(es)))) {
            boolean os = true;
        }
        if (accion.equals("guardar")) {
		
            if (func.insertar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "La Reserva fue registrada satisfactoriamente");
                mostrar("");
                inhabilitar();
                if (os) {
                    //ocupar apartamento

                    fApartamento func3 = new fApartamento();
                    vApartamento dts3 = new vApartamento();
                    dts3.setIdapartamento(Integer.parseInt(txtidapartamento.getText()));
                    func3.ocupar(dts3);
                }

            }
	

        } else if (accion.equals("editar")) {
            dts.setIdReserva(Integer.parseInt(txtidreserva.getText()));
            dts.setIdtrabajador(Integer.parseInt(txtidtrabajador.getText()));

            if (func.editar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "La Reserva fue editada satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }
	
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        inhabilitar();
        jLabel2.transferFocus();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
        txtidcliente.transferFocus();
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtcostmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostmenActionPerformed
        // TODO add your handling code here:
        txtcostmen.transferFocus();
    }//GEN-LAST:event_txtcostmenActionPerformed

    private void tablalistadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadorMouseClicked
        // TODO add your handling code here:
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistador.rowAtPoint(evt.getPoint());
        txtidreserva.setText(tablalistador.getValueAt(fila, 0).toString());
        txtidapartamento.setText(tablalistador.getValueAt(fila, 1).toString());
        txtnumero.setText(tablalistador.getValueAt(fila, 2).toString());
        txtidcliente.setText(tablalistador.getValueAt(fila, 3).toString());
        txtcliente.setText(tablalistador.getValueAt(fila, 4).toString());
        txtidtrabajador.setText(tablalistador.getValueAt(fila, 5).toString());
        txttrabajador.setText(tablalistador.getValueAt(fila, 6).toString());

        cbotipo_reserva.setSelectedItem(tablalistador.getValueAt(fila, 8).toString());
        dcfecha_reserva.setDate(Date.valueOf(tablalistador.getValueAt(fila, 9).toString()));
        dcfecha_ingreso.setDate(Date.valueOf(tablalistador.getValueAt(fila, 10).toString()));
        dcfecha_salida.setDate(Date.valueOf(tablalistador.getValueAt(fila, 11).toString()));
        dcfech_iniPro.setDate(Date.valueOf(tablalistador.getValueAt(fila, 12).toString()));
        txttemporada.setText(tablalistador.getValueAt(fila, 13).toString());
        txtcostmen.setText(tablalistador.getValueAt(fila, 14).toString());
        txtcosttot.setText(tablalistador.getValueAt(fila, 15).toString());
        cboestado.setSelectedItem(tablalistador.getValueAt(fila, 16).toString());

    }//GEN-LAST:event_tablalistadorMouseClicked

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
        txtbuscar.transferFocus();
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:

        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtidreserva.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de ELIMINAR la Reserva?", "Confirmar", 2);

            if (confirmacion == 0) {
                freserva func = new freserva();
                vreserva dts = new vreserva();

                dts.setIdReserva(Integer.parseInt(txtidreserva.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtnumeroActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void txttrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrabajadorActionPerformed

    private void txtidtrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtrabajadorActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoActionPerformed

    private void btnbuscaapartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaapartamentoActionPerformed
        // TODO add your handling code here:
        frmvistaapartamento form = new frmvistaapartamento();
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnbuscaapartamentoActionPerformed

    private void btnbuscaclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscaclienteActionPerformed
        // TODO add your handling code here:
        frmvistacliente form = new frmvistacliente();
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnbuscaclienteActionPerformed

    private void tablalistadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadorMousePressed

    private void txtcostmenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcostmenFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_txtcostmenFocusGained

    private void dcfecha_salidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_salidaFocusLost
        // TODO add your handling code here:

        dcfecha_salida.transferFocus();

    }//GEN-LAST:event_dcfecha_salidaFocusLost

    private void txttemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttemporadaActionPerformed
        // TODO add your handling code here:

        txttemporada.transferFocus();
    }//GEN-LAST:event_txttemporadaActionPerformed

    private void dcfecha_salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcfecha_salidaMouseClicked
        // TODO add your handling code here:
        txttemporada.transferFocus();
    }//GEN-LAST:event_dcfecha_salidaMouseClicked

    private void dcfecha_salidaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcfecha_salidaPropertyChange
        // TODO add your handling code here:
        txttemporada.transferFocus();
    }//GEN-LAST:event_dcfecha_salidaPropertyChange

    private void dcfecha_salidaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcfecha_salidaMouseReleased
        // TODO add your handling code here:
        txttemporada.transferFocus();
    }//GEN-LAST:event_dcfecha_salidaMouseReleased

    private void dcfecha_salidaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dcfecha_salidaAncestorAdded
        // TODO add your handling code here:


    }//GEN-LAST:event_dcfecha_salidaAncestorAdded

    private void dcfecha_salidaComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dcfecha_salidaComponentShown
        // TODO add your handling code here:


    }//GEN-LAST:event_dcfecha_salidaComponentShown

    private void dcfecha_reservaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcfecha_reservaPropertyChange
        // TODO add your handling code here:

        dcfecha_reserva.transferFocus();
    }//GEN-LAST:event_dcfecha_reservaPropertyChange

    private void dcfecha_ingresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcfecha_ingresoPropertyChange
        // TODO add your handling code here:

        dcfecha_ingreso.transferFocus();
    }//GEN-LAST:event_dcfecha_ingresoPropertyChange

    private void dcfecha_ingresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_ingresoFocusLost
        // TODO add your handling code here:{

        dcfecha_ingreso.transferFocus();
    }//GEN-LAST:event_dcfecha_ingresoFocusLost

    private void btncalculocostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculocostActionPerformed
        // TODO add your handling code here:
        vreserva dts = new vreserva();
        freserva func = new freserva();
        Calendar cal, cal1, cal2;
        int d, m, m1, m2, a;
        cal = dcfecha_reserva.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        fr = new Date(a, m, d);

        cal1 = dcfecha_ingreso.getCalendar();

        if (cal1.before(cal)) {
            JOptionPane.showConfirmDialog(rootPane, "La fecha de Ingreso debe ser posterior a la de Reserva");
            dcfecha_ingreso.requestFocus();
            return;
        }
        d = cal1.get(Calendar.DAY_OF_MONTH);
        m1 = cal1.get(Calendar.MONTH);

        a = cal1.get(Calendar.YEAR) - 1900;

        fi = (new Date(a, m1, d));

        cal1 = dcfecha_ingreso.getCalendar();
        cal2 = dcfecha_salida.getCalendar();

        d = cal2.get(Calendar.DAY_OF_MONTH);
        m2 = cal2.get(Calendar.MONTH);
        a = cal2.get(Calendar.YEAR) - 1900;
        fs = new Date(a, m2, d);

        if (cal2.before(cal1)) {
            JOptionPane.showConfirmDialog(rootPane, "La fecha de Salida debe ser posterior a la de Ingreso");
            dcfecha_salida.requestFocus();
            return;
        }
        df = func.diferenciaEnDias(fs, fi);

        if (df <= 0) {
            JOptionPane.showConfirmDialog(rootPane, "La fecha de Salida y la de Ingreso no deben ser iguales");
        } else {
            vidp = func.buscaIDP(df);

            vdp = func.buscaVDP(df);

            if (txttemporada.getText().equals("Alta")) {
                ptemp = Double.parseDouble(txtpreca.getText());
            } else {
                ptemp = Double.parseDouble(txtprecb.getText());
            }

            int me = func.diferenciaEnMeses(fi, fs);

            pdr = (df * ptemp);

            dpf = ((pdr * vdp) / (100));

            ca = dpf + pdr;
            double calo;
		calo = Math.rint(ca);

            if ((me) >= 1) {
                double calom =Math.rint((calo) / (me));

                txtcostmen.setText((String.valueOf(calom)));
            } else {
                txtcostmen.setText((String.valueOf(calo)));
            }

            txtcosttot.setText((String.valueOf(calo)));

        }
        txtcosttot.transferFocus();
    }//GEN-LAST:event_btncalculocostActionPerformed

    private void txtcosttotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcosttotFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcosttotFocusGained

    private void txtcosttotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcosttotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcosttotActionPerformed

    private void btnVconsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVconsumoActionPerformed
        // TODO add your handling code here:

        int fila = tablalistador.getSelectedRow();
        frmvistaconsumo.idreserva = (tablalistador.getValueAt(fila, 0).toString());
        frmvistaconsumo.idapartamento = (tablalistador.getValueAt(fila, 1).toString());
        frmvistaconsumo.numero = (tablalistador.getValueAt(fila, 2).toString());
        frmvistaconsumo.fechaingreso = (Date.valueOf(tablalistador.getValueAt(fila, 10).toString()));
        frmvistaconsumo.fechasalida = (Date.valueOf(tablalistador.getValueAt(fila, 11).toString()));
      
        frmvistaconsumo form = new frmvistaconsumo();
        frmInicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);


    }//GEN-LAST:event_btnVconsumoActionPerformed

    private void btnrealizarpagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrealizarpagosActionPerformed
        // TODO add your handling code here:
        int fila = tablalistador.getSelectedRow();
        frmpago.idreserva = tablalistador.getValueAt(fila, 0).toString();
        frmpago.idcliente = tablalistador.getValueAt(fila, 3).toString();
        frmpago.cliente = tablalistador.getValueAt(fila, 4).toString();
        frmpago.preserva = (Double.valueOf(tablalistador.getValueAt(fila, 17).toString()));
        frmpago.treserva = (Double.valueOf(tablalistador.getValueAt(fila, 18).toString()));
        frmpago.totalreserva = Math.rint(Double.valueOf(tablalistador.getValueAt(fila, 15).toString()));
        frmpago.mreserva = Math.rint(Double.valueOf(tablalistador.getValueAt(fila, 14).toString()));
        frmpago.idapartamento = tablalistador.getValueAt(fila, 1).toString();
        frmpago.apartamento = tablalistador.getValueAt(fila, 2).toString();
        frmpago.estadores = tablalistador.getValueAt(fila, 16).toString();
        frmpago.fechasalida = (Date.valueOf(tablalistador.getValueAt(fila, 11).toString()));
         
        
        vpagos dts2 = new vpagos();
        fpago func2 = new fpago();
        int d = func2.buscid(dts2);

        frmpago.idpago = (String.valueOf(d));
        frmpago form = new frmpago();
      
        frmInicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnrealizarpagosActionPerformed

    private void txtnumeroPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtnumeroPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txtnumeroPropertyChange

    private void txtnumeroComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtnumeroComponentAdded
        // TODO add your handling code here:


    }//GEN-LAST:event_txtnumeroComponentAdded

    private void dcfecha_ingresoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_ingresoFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_dcfecha_ingresoFocusGained
    private Connection connection = new Conexion().conectar();
    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        // TODO add your handling code here:

        Map p = new HashMap();
        JasperReport report;
        JasperPrint print;

        try {
            report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
                    + "/src/Reportes/rptreservas.jrxml");
            print = JasperFillManager.fillReport(report, p, connection);
            JasperViewer view = new JasperViewer(print, false);
            view.setTitle("Listado de Reservas");
            view.setVisible(true);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnreporteActionPerformed

        private void btnexreserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexreserActionPerformed
                // TODO add your handling code here:
		int fila = tablalistador.getSelectedRow();
	frmGestionCalls.txtidreserva.setText(tablalistador.getValueAt(fila, 0).toString());
	this.dispose();
        }//GEN-LAST:event_btnexreserActionPerformed


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
            java.util.logging.Logger.getLogger(frmreserva.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmreserva.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmreserva().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnVconsumo;
        private javax.swing.JButton btnbuscaapartamento;
        private javax.swing.JButton btnbuscacliente;
        private javax.swing.JButton btnbuscar;
        public static javax.swing.JButton btncalculocost;
        private javax.swing.JButton btncancelar;
        private javax.swing.JButton btneliminar;
        private javax.swing.JButton btnexreser;
        private javax.swing.JButton btnguardar;
        private javax.swing.JButton btnnuevo;
        private javax.swing.JButton btnrealizarpagos;
        private javax.swing.JButton btnreporte;
        private javax.swing.JButton btnsalir;
        private javax.swing.JComboBox<String> cboestado;
        private javax.swing.JComboBox<String> cbotipo_reserva;
        private com.toedter.calendar.JDateChooser dcfech_iniPro;
        public static com.toedter.calendar.JDateChooser dcfecha_ingreso;
        private com.toedter.calendar.JDateChooser dcfecha_reserva;
        public static com.toedter.calendar.JDateChooser dcfecha_salida;
        public static com.toedter.calendar.JDateChooser dcultiocup;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        public static javax.swing.JLabel jLabel7;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lbltotalregistros;
        private javax.swing.JPanel listadoapartamentos;
        private javax.swing.JTable tablalistador;
        private javax.swing.JTextField txtbuscar;
        public static javax.swing.JTextField txtcliente;
        private javax.swing.JTextField txtcostmen;
        private javax.swing.JTextField txtcosttot;
        public static javax.swing.JTextField txtestadap;
        public static javax.swing.JTextField txtidapartamento;
        public static javax.swing.JTextField txtidcliente;
        private javax.swing.JTextField txtidreserva;
        public static javax.swing.JTextField txtidtrabajador;
        public static javax.swing.JTextField txtnumero;
        public static javax.swing.JTextField txtpreca;
        public static javax.swing.JTextField txtprecb;
        public static javax.swing.JTextField txttemporada;
        public static javax.swing.JTextField txttrabajador;
        // End of variables declaration//GEN-END:variables
}
