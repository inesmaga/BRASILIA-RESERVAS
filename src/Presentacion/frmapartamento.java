
package Presentacion;

import Datos.vApartamento;
import Logica.Conexion;
import Logica.fApartamento;
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
public class frmapartamento extends javax.swing.JInternalFrame {

    public frmapartamento() {
        initComponents();
        mostrar("");
        inhabilitar();
    }
    private String accion = "guardar";
 public Date  fo;
 
    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void inhabilitar() {

        txtidapartamento.setVisible(false);
        cbopiso.setEnabled(false);
        txtnumero.setEnabled(false);
        txtdescripcion.setEnabled(false);
        txtcaracteristicas.setEnabled(false);
        txtpreciobaja.setEnabled(false);
        txtprecioalta.setEnabled(false);
        cboestado.setEnabled(false);
        cbotipoapartamento.setEnabled(false);
        dcfecha_ocupacion.setEnabled(false);
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        txtidapartamento.setText(" ");
        txtnumero.setText(" ");
        txtpreciobaja.setText(" ");
        txtprecioalta.setText(" ");
        txtcaracteristicas.setText(" ");
        txtdescripcion.setText(" ");

    }

    void habilitar() {

        cbopiso.setEnabled(true);
        txtnumero.setEnabled(true);
        txtdescripcion.setEnabled(true);
        txtcaracteristicas.setEnabled(true);
        txtpreciobaja.setEnabled(true);
        txtprecioalta.setEnabled(true);
        cboestado.setEnabled(true);
        cbotipoapartamento.setEnabled(true);
        dcfecha_ocupacion.setEnabled(true);
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btneliminar.setEnabled(false);

        txtnumero.setText("");
        txtpreciobaja.setText("");
        txtcaracteristicas.setText("");
        txtdescripcion.setText("");
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            fApartamento func = new fApartamento();
            modelo = func.mostrar(buscar);
            tablalistado.setModel(modelo);
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
                txtnumero = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                cbopiso = new javax.swing.JComboBox<>();
                jLabel6 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                txtdescripcion = new javax.swing.JTextArea();
                jLabel7 = new javax.swing.JLabel();
                jScrollPane3 = new javax.swing.JScrollPane();
                txtcaracteristicas = new javax.swing.JTextArea();
                jLabel8 = new javax.swing.JLabel();
                txtpreciobaja = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                cboestado = new javax.swing.JComboBox<>();
                jLabel10 = new javax.swing.JLabel();
                cbotipoapartamento = new javax.swing.JComboBox<>();
                btnnuevo = new javax.swing.JButton();
                btnguardar = new javax.swing.JButton();
                btncancelar = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                txtidapartamento = new javax.swing.JTextField();
                jLabel12 = new javax.swing.JLabel();
                txtprecioalta = new javax.swing.JTextField();
                jLabel13 = new javax.swing.JLabel();
                dcfecha_ocupacion = new com.toedter.calendar.JDateChooser();
                listadoapartamentos = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tablalistado = new javax.swing.JTable();
                jLabel2 = new javax.swing.JLabel();
                txtbuscar = new javax.swing.JTextField();
                btnbuscar = new javax.swing.JButton();
                btnreporte = new javax.swing.JButton();
                btnsalir = new javax.swing.JButton();
                lbltotalregistros = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                btneliminar = new javax.swing.JButton();

                setClosable(true);
                setIconifiable(true);
                setMaximizable(true);
                setResizable(true);

                jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 153, 204));
                jLabel1.setText("Apartamento");

                jPanel3.setBackground(new java.awt.Color(204, 204, 204));
                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registro de Apartamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N

                jLabel4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(0, 153, 204));
                jLabel4.setText("Número:");

                txtnumero.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtnumeroActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 153, 204));
                jLabel5.setText("Piso:");

                cbopiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
                cbopiso.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbopisoActionPerformed(evt);
                        }
                });

                jLabel6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(0, 153, 204));
                jLabel6.setText("Descripción:");
                jLabel6.setToolTipText("");

                txtdescripcion.setColumns(20);
                txtdescripcion.setRows(5);
                jScrollPane2.setViewportView(txtdescripcion);

                jLabel7.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(0, 153, 204));
                jLabel7.setText("Características:");
                jLabel7.setToolTipText("");

                txtcaracteristicas.setColumns(20);
                txtcaracteristicas.setRows(5);
                jScrollPane3.setViewportView(txtcaracteristicas);

                jLabel8.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(0, 153, 204));
                jLabel8.setText("Precio_DiarioTemp.Baja:");
                jLabel8.setToolTipText("");

                txtpreciobaja.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtpreciobajaActionPerformed(evt);
                        }
                });

                jLabel9.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(0, 153, 204));
                jLabel9.setText("Estado:");
                jLabel9.setToolTipText("");

                cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ofertable", "Reservado", "Ocupado", "Chequeo", "Limpieza", "Mantenimiento", " " }));
                cboestado.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cboestadoActionPerformed(evt);
                        }
                });

                jLabel10.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(0, 153, 204));
                jLabel10.setText("Tipo_Apartamento:");
                jLabel10.setToolTipText("");

                cbotipoapartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudio_  Abierto", "Habitación_Abierta", "Habitación_Cerrada" }));
                cbotipoapartamento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbotipoapartamentoActionPerformed(evt);
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

                jLabel12.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(0, 153, 204));
                jLabel12.setText("Precio_DiarioTemp.Alta:");
                jLabel12.setToolTipText("");

                txtprecioalta.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtprecioaltaActionPerformed(evt);
                        }
                });

                jLabel13.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(0, 153, 204));
                jLabel13.setText("Ultima_Ocupación:");
                jLabel13.setToolTipText("");

                dcfecha_ocupacion.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                dcfecha_ocupacionFocusLost(evt);
                        }
                });
                dcfecha_ocupacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                dcfecha_ocupacionPropertyChange(evt);
                        }
                });

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                                .addComponent(txtnumero)
                                                .addComponent(cbopiso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addComponent(txtidapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(94, 94, 94)))
                                        .addComponent(txtpreciobaja, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtprecioalta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dcfecha_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbotipoapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(btnguardar)
                                                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(103, 103, 103)
                                                .addComponent(btncancelar)))
                                .addGap(101, 101, 101))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(btnnuevo))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtidapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbopiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(95, 95, 95))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtpreciobaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtprecioalta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dcfecha_ocupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(cbotipoapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnnuevo)
                                        .addComponent(btnguardar)
                                        .addComponent(btncancelar)))
                );

                listadoapartamentos.setBackground(new java.awt.Color(204, 204, 204));
                listadoapartamentos.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Listado de Apartamentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N
                listadoapartamentos.setMaximumSize(new java.awt.Dimension(1064, 768));
                listadoapartamentos.setMinimumSize(new java.awt.Dimension(1064, 768));
                listadoapartamentos.setPreferredSize(new java.awt.Dimension(1064, 768));

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
                });
                jScrollPane1.setViewportView(tablalistado);

                jLabel2.setBackground(new java.awt.Color(204, 204, 204));
                jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 153, 204));
                jLabel2.setText("Buscar:");

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

                btnreporte.setBackground(new java.awt.Color(102, 102, 102));
                btnreporte.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
                btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/reportes.png"))); // NOI18N
                btnreporte.setText("Reporte");
                btnreporte.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnreporteActionPerformed(evt);
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

                btneliminar.setBackground(new java.awt.Color(102, 102, 102));
                btneliminar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
                btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/garbage.png"))); // NOI18N
                btneliminar.setText("Eliminar");
                btneliminar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btneliminarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout listadoapartamentosLayout = new javax.swing.GroupLayout(listadoapartamentos);
                listadoapartamentos.setLayout(listadoapartamentosLayout);
                listadoapartamentosLayout.setHorizontalGroup(
                        listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listadoapartamentosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                .addGroup(listadoapartamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(listadoapartamentosLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(btnbuscar)
                                                .addGap(28, 28, 28)
                                                .addComponent(btnreporte)
                                                .addGap(49, 49, 49)
                                                .addComponent(btneliminar)
                                                .addGap(34, 34, 34)
                                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(btnsalir)
                                        .addComponent(btneliminar)
                                        .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbltotalregistros)
                                .addContainerGap(41, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(listadoapartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(listadoapartamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:

        if (txtnumero.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Número del Apartamento");
            txtnumero.requestFocus();
            return;
        }
        if (txtdescripcion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una Descripción del Apartamento");
            txtdescripcion.requestFocus();
            return;
        }
        if (txtpreciobaja.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Precio de Temporada Baja del Apartamento");
            txtpreciobaja.requestFocus();
            return;
        }
        if (txtprecioalta.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Precio de Temporada Alta del Apartamento");
            txtprecioalta.requestFocus();
            return;
        }
        if (txtcaracteristicas.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar al menos una Caracteristica del Apartamento");
            txtcaracteristicas.requestFocus();
            return;
        }

        vApartamento dts = new vApartamento();
        fApartamento func = new fApartamento();

        dts.setNumero(txtnumero.getText());

        int seleccionado = cbopiso.getSelectedIndex();
        dts.setPiso((String) cbopiso.getItemAt(seleccionado));

        dts.setDescripcion(txtdescripcion.getText());
        dts.setCaracteristicas(txtcaracteristicas.getText());
        dts.setPreciodbaja(Double.parseDouble(txtpreciobaja.getText()));
        
        dts.setPreciodalta(Double.parseDouble(txtprecioalta.getText()));
        Calendar cal1;
        cal1 = dcfecha_ocupacion.getCalendar();
        int m,a,d ;
         d = cal1.get(Calendar.DAY_OF_MONTH);
        m = cal1.get(Calendar.MONTH);
        a = cal1.get(Calendar.YEAR) - 1900;
        fo = (new Date(a, m, d));
        dts.setUltimaOcupacion(fo);
        seleccionado = cbotipoapartamento.getSelectedIndex();
        dts.setTipo_apartamento(cbotipoapartamento.getItemAt(seleccionado));
        
        seleccionado = cboestado.getSelectedIndex();
        dts.setEstado((String) cboestado.getItemAt(seleccionado));

        
        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "El Apartamento fue registrado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            dts.setIdapartamento(Integer.parseInt(txtidapartamento.getText()));

            if (func.editar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "El Apartamento fue editado satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumeroActionPerformed
        // TODO add your handling code here:
        txtnumero.transferFocus();
    }//GEN-LAST:event_txtnumeroActionPerformed

    private void cbopisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbopisoActionPerformed
        // TODO add your handling code here:
        cbopiso.transferFocus();
    }//GEN-LAST:event_cbopisoActionPerformed

    private void txtpreciobajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreciobajaActionPerformed
        // TODO add your handling code here:
        txtpreciobaja.transferFocus();
    }//GEN-LAST:event_txtpreciobajaActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        // TODO add your handling code here:
        cboestado.transferFocus();
    }//GEN-LAST:event_cboestadoActionPerformed

    private void cbotipoapartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipoapartamentoActionPerformed
        // TODO add your handling code here:
        cbotipoapartamento.transferFocus();
    }//GEN-LAST:event_cbotipoapartamentoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
        btnguardar.setText("Editar");
        habilitar();
        btneliminar.setEnabled(true);
        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());
        txtidapartamento.setText(tablalistado.getValueAt(fila, 0).toString());
        txtnumero.setText(tablalistado.getValueAt(fila, 1).toString());
        cbopiso.setSelectedItem(tablalistado.getValueAt(fila, 2).toString());
        txtdescripcion.setText(tablalistado.getValueAt(fila, 3).toString());
        txtcaracteristicas.setText(tablalistado.getValueAt(fila, 4).toString());
        txtpreciobaja.setText(tablalistado.getValueAt(fila, 5).toString());
        txtprecioalta.setText(tablalistado.getValueAt(fila, 6).toString());
        dcfecha_ocupacion.setDate(Date.valueOf(tablalistado.getValueAt(fila,7).toString()));
        cboestado.setSelectedItem(tablalistado.getValueAt(fila, 8).toString());
        cbotipoapartamento.setSelectedItem(tablalistado.getValueAt(fila, 9).toString());

    }//GEN-LAST:event_tablalistadoMouseClicked

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed
    private Connection connection = new Conexion().conectar();
    
    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        if (!(txtidapartamento.getText().equals(""))) {
       Map p= new HashMap();
       JasperReport report;
       JasperPrint print;
          
        try {
            report =JasperCompileManager.compileReport(new File("").getAbsolutePath()+
                    "/src/Reportes/rptapartamentos.jrxml");
            print=JasperFillManager.fillReport(report,p,connection);
            JasperViewer view = new JasperViewer(print,false);
            view.setTitle("Listado de Apartamentos");
            view.setVisible(true);
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnreporteActionPerformed
    }
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:

        mostrar(txtbuscar.getText());

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void txtbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarActionPerformed
        // TODO add your handling code here:
        txtbuscar.transferFocus();
    }//GEN-LAST:event_txtbuscarActionPerformed

    private void txtprecioaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioaltaActionPerformed
        // TODO add your handling code here:
        txtprecioalta.transferFocus();
    }//GEN-LAST:event_txtprecioaltaActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
         if (!(txtidapartamento.getText().equals(""))) {
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de ELIMINAR el Apartamento?", "Confirmar", 2);

            if (confirmacion==0){
                fApartamento func= new fApartamento();
                vApartamento dts= new vApartamento();

                dts.setIdapartamento(Integer.parseInt(txtidapartamento.getText()));
                func.eliminar(dts);
                mostrar("");
                inhabilitar();
            }

        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void dcfecha_ocupacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcfecha_ocupacionFocusLost
        // TODO add your handling code here:{

            dcfecha_ocupacion.transferFocus();
    }//GEN-LAST:event_dcfecha_ocupacionFocusLost

    private void dcfecha_ocupacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dcfecha_ocupacionPropertyChange
        // TODO add your handling code here:
        dcfecha_ocupacion.transferFocus();
    }//GEN-LAST:event_dcfecha_ocupacionPropertyChange

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
            java.util.logging.Logger.getLogger(frmapartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmapartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmapartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmapartamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnbuscar;
        private javax.swing.JButton btncancelar;
        private javax.swing.JButton btneliminar;
        private javax.swing.JButton btnguardar;
        private javax.swing.JButton btnnuevo;
        private javax.swing.JButton btnreporte;
        private javax.swing.JButton btnsalir;
        private javax.swing.JComboBox<String> cboestado;
        private javax.swing.JComboBox<String> cbopiso;
        private javax.swing.JComboBox<String> cbotipoapartamento;
        public static com.toedter.calendar.JDateChooser dcfecha_ocupacion;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JLabel lbltotalregistros;
        private javax.swing.JPanel listadoapartamentos;
        private javax.swing.JTable tablalistado;
        private javax.swing.JTextField txtbuscar;
        private javax.swing.JTextArea txtcaracteristicas;
        private javax.swing.JTextArea txtdescripcion;
        private javax.swing.JTextField txtidapartamento;
        private javax.swing.JTextField txtnumero;
        public static javax.swing.JTextField txtprecioalta;
        public static javax.swing.JTextField txtpreciobaja;
        // End of variables declaration//GEN-END:variables
}
