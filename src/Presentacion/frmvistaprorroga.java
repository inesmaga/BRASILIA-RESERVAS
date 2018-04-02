package Presentacion;


import Datos.vreserva;


import Logica.freserva;

import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inesm
 */
public class frmvistaprorroga extends javax.swing.JInternalFrame {
public static String idreserva;
    public  static String idapartamento;
     public static String numero;
     public static Date fechaingreso;
     public static Date fechasalida;
       public static String idcliente;
    public static String cliente;
     
    public frmvistaprorroga() {
        initComponents();
        txtidapartamento.setText(idapartamento);
   txtidapartamento.setVisible(false);
        txtidreserva.setText(idreserva);
        txtnumero.setText(numero);
        txtidcliente.setText(idcliente);
        txtcliente.setText(cliente);
        dcfecha_iniprog.setDate(fechasalida);
        
        mostrar(idreserva);
        inhabilitar();
    }
    private String accion = "editar";
    public static int idusuario;
    public static int diarev;

    public int vidp, df, dd,ida;
    public double vdp, pdr;
    public double ptemp = 0.0;
    public double dpf;
    public double ca;
    public double ptem;
    public Date din, fr;
    public Date dsal, fi, ffi, fs;
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

        txtidapartamento.setVisible(false);
        txtnumero.setEnabled(false);
        txtidreserva.setEnabled(false);
        txtidcliente.setVisible(false);
        txtcliente.setVisible(true);
        txtidtrabajador.setVisible(false);
        txttrabajador.setVisible(true);
        txtprecb.setVisible(false);
        txtpreca.setVisible(false);
        txtidp.setVisible(false);
        txtprecb.setEnabled(false);
        txtpreca.setEnabled(false);
        dcfecha_iniprog.setEnabled(false);
        dcfecha_finprog.setEnabled(false);
        txttemporada.setEnabled(false);
        txtcostmen.setEnabled(false);
        txtcosttot.setEnabled(false);
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txttrabajador.setEnabled(false);
        cboestado.setEnabled(false);
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        txttipo_reserva.setVisible(false);
        txttipo_reserva.setEnabled(false);
        
        btncalculocost.setEnabled(false);
    
    }

    void habilitar() {

        txtidapartamento.setVisible(false);
        txtidreserva.setEnabled(true);
        txtidreserva.setVisible(true);
        txtidcliente.setVisible(false);
        txtcliente.setVisible(true);
        txtidtrabajador.setVisible(false);
        txttrabajador.setVisible(true);
        txtprecb.setVisible(false);
        txtpreca.setVisible(false);
        txtprecb.setEnabled(false);
        txtpreca.setEnabled(false);
        txttipo_reserva.setVisible(false);
        txttipo_reserva.setEnabled(false);
        txttemporada.setVisible(true);
        
        dcfecha_iniprog.setVisible(true);
        dcfecha_iniprog.setEnabled(false);
        dcfecha_finprog.setEnabled(true);
        txttemporada.setEnabled(true);
        txtcostmen.setEnabled(false);
        txtcosttot.setEnabled(false);
        txtnumero.setEnabled(false);
        txtcliente.setEnabled(false);
        txttrabajador.setEnabled(false);
        txtidp.setVisible(false);
        txtcostmen.setVisible(true);
        txtcosttot.setVisible(true);
        cboestado.setEnabled(true);

        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btneliminar.setEnabled(true);
        
        
        btncalculocost.setEnabled(true);

      
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            freserva func = new freserva();
            modelo = func.mostrarvistap(buscar);
            tablalistador.setModel(modelo);
            ocultar_columnas();
            lbltotalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));

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
        jLabel13 = new javax.swing.JLabel();
        txtcostmen = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        txtidreserva = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        dcfecha_iniprog = new com.toedter.calendar.JDateChooser();
        dcfecha_finprog = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboestado = new javax.swing.JComboBox<>();
        txttemporada = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtidtrabajador = new javax.swing.JTextField();
        txttrabajador = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtidcliente = new javax.swing.JTextField();
        txtcliente = new javax.swing.JTextField();
        txtprecb = new javax.swing.JTextField();
        txtpreca = new javax.swing.JTextField();
        btncalculocost = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtcosttot = new javax.swing.JTextField();
        txtidp = new javax.swing.JTextField();
        txttipo_reserva = new javax.swing.JTextField();
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Prórrogas:");
        jLabel1.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Prórrogas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N
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
        jLabel13.setText("Numero _Reserva:");
        jLabel13.setToolTipText("");

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

        jLabel15.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setToolTipText("");

        jLabel18.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 204));
        jLabel18.setText("Costo_Mensual  Aloj:");
        jLabel18.setToolTipText("");

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

        jLabel22.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 204));
        jLabel22.setText("Fecha Inic. Prórroga:");
        jLabel22.setToolTipText("");

        dcfecha_iniprog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dcfecha_iniprogFocusLost(evt);
            }
        });
        dcfecha_iniprog.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcfecha_iniprogPropertyChange(evt);
            }
        });

        dcfecha_finprog.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dcfecha_finprogAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        dcfecha_finprog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dcfecha_finprogFocusLost(evt);
            }
        });
        dcfecha_finprog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dcfecha_finprogMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dcfecha_finprogMouseReleased(evt);
            }
        });
        dcfecha_finprog.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                dcfecha_finprogComponentShown(evt);
            }
        });
        dcfecha_finprog.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dcfecha_finprogPropertyChange(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 204));
        jLabel23.setText("Fecha Vcto Prórroga:");
        jLabel23.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Estado de la Prórroga:");
        jLabel6.setToolTipText("");

        cboestado.setForeground(new java.awt.Color(51, 51, 51));
        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Efectuada", "Anulada" }));
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
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

        jLabel21.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 204));
        jLabel21.setText("Trabajador:");
        jLabel21.setToolTipText("");

        txtidtrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidtrabajadorActionPerformed(evt);
            }
        });

        txttrabajador.setForeground(new java.awt.Color(51, 51, 51));
        txttrabajador.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txttrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrabajadorActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 204));
        jLabel14.setText("Cliente:");
        jLabel14.setToolTipText("");

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        txtcliente.setForeground(new java.awt.Color(51, 51, 51));
        txtcliente.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        txtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclienteActionPerformed(evt);
            }
        });

        btncalculocost.setForeground(new java.awt.Color(0, 153, 204));
        btncalculocost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/calculator.png"))); // NOI18N
        btncalculocost.setText("Calc.Costo Alojamiento");
        btncalculocost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculocostActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 204));
        jLabel19.setText("Costo_Total:");
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btncancelar)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcostmen, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dcfecha_iniprog, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcfecha_finprog, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(txtcosttot, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btncalculocost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txttemporada, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtprecb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpreca, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttipo_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnnuevo)
                        .addGap(87, 87, 87)
                        .addComponent(btnguardar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15)
                        .addGap(83, 83, 83)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcfecha_iniprog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcfecha_finprog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprecb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpreca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btncalculocost, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcostmen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcosttot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo)
                            .addComponent(btnguardar)
                            .addComponent(btncancelar))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txttipo_reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        listadoapartamentos.setBackground(new java.awt.Color(204, 204, 204));
        listadoapartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Listado de Prórrogas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N

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
        jLabel2.setText("Buscar Prórrogas:");
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

        javax.swing.GroupLayout listadoapartamentosLayout = new javax.swing.GroupLayout(listadoapartamentos);
        listadoapartamentos.setLayout(listadoapartamentosLayout);
        listadoapartamentosLayout.setHorizontalGroup(
            listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listadoapartamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoapartamentosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(listadoapartamentosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar)
                .addGap(72, 72, 72)
                .addComponent(btneliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(btnsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addComponent(lbltotalregistros)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listadoapartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listadoapartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        btnguardar.setText("Editar");
        accion = "editar";


    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:

        if (txtidapartamento.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar un Apartamento");
            txtidapartamento.requestFocus();
            return;
        }
        if (txtidreserva.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes seleccionar una  Reserva");
            txtidreserva.requestFocus();
            return;
        }
        vreserva dts = new vreserva();
        freserva func = new freserva();
        dts.setIdapartamento(Integer.parseInt(txtidapartamento.getText()));
        dts.setIdReserva(Integer.parseInt(txtidreserva.getText()));
        dts.setIdcliente(Integer.parseInt(txtidcliente.getText()));
        dts.setIdtrabajador(Integer.parseInt(txtidtrabajador.getText()));
        dts.setIdDP(vidp);

        dts.setFecha_salida(fs);
        dts.setFecha_InicPro(ffi);

        dts.setTemporada(txttemporada.getText());

        dts.setCosto_mensual(Double.parseDouble(txtcostmen.getText()));
        dts.setCosto_total(Double.parseDouble(txtcosttot.getText()));
        int seleccionado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(seleccionado));

         if (accion.equals("editar")) {
            dts.setIdReserva(Integer.parseInt(txtidreserva.getText()));
            dts.setIdtrabajador(Integer.parseInt(txtidtrabajador.getText()));

            if (func.editarp(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "La Prórroga fue editada satisfactoriamente");
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
        txtidreserva.setText(tablalistador.getValueAt(fila, 0).toString());
        txtidcliente.setText(tablalistador.getValueAt(fila, 3).toString());
        txtcliente.setText(tablalistador.getValueAt(fila, 4).toString());
        txtidtrabajador.setText(tablalistador.getValueAt(fila, 5).toString());
        txttrabajador.setText(tablalistador.getValueAt(fila, 6).toString());
         
        dcfecha_iniprog.setDate(Date.valueOf(tablalistador.getValueAt(fila, 11).toString()));
            
        txttemporada.setText(tablalistador.getValueAt(fila, 13).toString());
        txtcostmen.setText(tablalistador.getValueAt(fila, 14).toString());
        txtcosttot.setText(tablalistador.getValueAt(fila, 15).toString());
        cboestado.setSelectedItem(tablalistador.getValueAt(fila, 16).toString());
    }//GEN-LAST:event_tablalistadorMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (!txtidreserva.getText().equals("")) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de ELIMINAR la Reserva ?", "Confirmar", 2);

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

    private void txtidreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidreservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidreservaActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoActionPerformed

    private void tablalistadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadorMousePressed

    private void txtcostmenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcostmenFocusGained
        // TODO add your handling code here:


    }//GEN-LAST:event_txtcostmenFocusGained

    private void dcfecha_finprogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_finprogFocusLost
        // TODO add your handling code here:

        dcfecha_finprog.transferFocus();

    }//GEN-LAST:event_dcfecha_finprogFocusLost

    private void txttemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttemporadaActionPerformed
        // TODO add your handling code here:

        txttemporada.transferFocus();
    }//GEN-LAST:event_txttemporadaActionPerformed

    private void dcfecha_finprogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcfecha_finprogMouseClicked
        // TODO add your handling code here:
        txttemporada.transferFocus();
    }//GEN-LAST:event_dcfecha_finprogMouseClicked

    private void dcfecha_finprogPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcfecha_finprogPropertyChange
        // TODO add your handling code here:
        txttemporada.transferFocus();
    }//GEN-LAST:event_dcfecha_finprogPropertyChange

    private void dcfecha_finprogMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dcfecha_finprogMouseReleased
        // TODO add your handling code here:
        txttemporada.transferFocus();
    }//GEN-LAST:event_dcfecha_finprogMouseReleased

    private void dcfecha_finprogAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dcfecha_finprogAncestorAdded
        // TODO add your handling code here:


    }//GEN-LAST:event_dcfecha_finprogAncestorAdded

    private void dcfecha_finprogComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_dcfecha_finprogComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_dcfecha_finprogComponentShown

    private void dcfecha_iniprogPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcfecha_iniprogPropertyChange
        // TODO add your handling code here:
        dcfecha_iniprog.transferFocus();
    }//GEN-LAST:event_dcfecha_iniprogPropertyChange

    private void dcfecha_iniprogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_iniprogFocusLost
        // TODO add your handling code here:{

        dcfecha_iniprog.transferFocus();
    }//GEN-LAST:event_dcfecha_iniprogFocusLost

    private void txtidtrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidtrabajadorActionPerformed

    private void txttrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrabajadorActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
        txtidcliente.transferFocus();
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void txtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclienteActionPerformed

    private void btncalculocostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculocostActionPerformed
        // TODO add your handling code here:
        vreserva dts = new vreserva();
        freserva func = new freserva();
        Calendar cal1, cal2;
        int d, m, a;
        
        cal1 = dcfecha_iniprog.getCalendar();
        d = cal1.get(Calendar.DAY_OF_MONTH);
        m = cal1.get(Calendar.MONTH);
        a = cal1.get(Calendar.YEAR) - 1900;
        ffi = (new Date(a, m, d));

        cal2 = dcfecha_finprog.getCalendar();

        d = cal2.get(Calendar.DAY_OF_MONTH);
        m = cal2.get(Calendar.MONTH);
        a = cal2.get(Calendar.YEAR) - 1900;
        fs = (new Date(a, m, d));

        if (cal2.before(cal1)) {
            JOptionPane.showConfirmDialog(rootPane, "La fecha de Fin Prórroga debe ser posterior a la de Inicio");
            dcfecha_finprog.requestFocus();
            return;
        }

        df = func.diferenciaEnDias(fs, ffi);

        if (df <= 0) {
            JOptionPane.showConfirmDialog(rootPane, "La fecha de Fin y la de Inicio no deben ser iguales");
        } else {
            vidp = func.buscaIDP(df);

            vdp = func.buscaVDP(df);
           ida=(Integer.parseInt(txtidapartamento.getText()));
             
            if (txttemporada.getText().equals("Alta")) {
                
                ptemp = func.buscaprea(ida);
                txtpreca.setText((String.valueOf(ptemp)));
            } else {
                ptemp = func.buscapreb(ida);
                txtprecb.setText((String.valueOf(ptemp)));
            }
           int  me=func.diferenciaEnMeses(ffi, fs);

            pdr = (df * ptemp);

            dpf = ((pdr * vdp) / (100));
            ca = dpf + pdr;
            double calo = Math.rint(ca);
            if ((me) >= 1) {
                double clm = (calo / me);
                double calom = Math.rint(clm);
                txtcostmen.setText((String.valueOf(calom)));
            } else {
                txtcostmen.setText((String.valueOf(calo)));
            }

            txtcosttot.setText((String.valueOf(calo)));

            txtcosttot.transferFocus();
    }//GEN-LAST:event_btncalculocostActionPerformed
    }
    private void txtcosttotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcosttotFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcosttotFocusGained

    private void txtcosttotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcosttotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcosttotActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
        txtbuscar.transferFocus();
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:

        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_btnbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(frmvistaprorroga.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmvistaprorroga.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmvistaprorroga.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmvistaprorroga.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmvistaprorroga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    public static javax.swing.JButton btncalculocost;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cboestado;
    public static com.toedter.calendar.JDateChooser dcfecha_finprog;
    public static com.toedter.calendar.JDateChooser dcfecha_iniprog;
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
    public static javax.swing.JTextField txtidapartamento;
    public static javax.swing.JTextField txtidcliente;
    public static javax.swing.JTextField txtidp;
    public static javax.swing.JTextField txtidreserva;
    public static javax.swing.JTextField txtidtrabajador;
    public static javax.swing.JTextField txtnumero;
    public static javax.swing.JTextField txtpreca;
    public static javax.swing.JTextField txtprecb;
    public static javax.swing.JTextField txttemporada;
    public static javax.swing.JTextField txttipo_reserva;
    public static javax.swing.JTextField txttrabajador;
    // End of variables declaration//GEN-END:variables
}
