package Presentacion;


import Datos.vsolicitudesweb;
import Logica.Conexion;
import javaemail.Correo;
import Logica.fsolicitudesweb;
import java.io.File;
import java.sql.Connection;


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
public class frmSolicitudesWeb extends javax.swing.JInternalFrame {

   
    public frmSolicitudesWeb() {
        initComponents();
	
        mostrar("");
        
    }

    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
	
	tablalistado.getColumnModel().getColumn(1).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(1).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            fsolicitudesweb func = new fsolicitudesweb();
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

                solicitudesweb = new javax.swing.JPanel();
                jLabel11 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                txtbuscar = new javax.swing.JTextField();
                btnbuscar = new javax.swing.JButton();
                btnsalir = new javax.swing.JButton();
                btnreporte = new javax.swing.JButton();
                lbltotalregistros = new javax.swing.JLabel();
                btnrecibir = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                tablalistado = new javax.swing.JTable();
                Gestionar = new javax.swing.JButton();
                btneliminar = new javax.swing.JButton();

                setClosable(true);
                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setIconifiable(true);
                setMaximizable(true);

                solicitudesweb.setBackground(new java.awt.Color(204, 204, 204));
                solicitudesweb.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Solicitudes Web", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 16), new java.awt.Color(0, 153, 204))); // NOI18N

                jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Brasilia13.png"))); // NOI18N

                jLabel3.setBackground(new java.awt.Color(204, 204, 204));
                jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(0, 153, 204));
                jLabel3.setText("Buscar Solicitud:");
                jLabel3.setToolTipText("");

                txtbuscar.setBackground(new java.awt.Color(187, 187, 187));

                btnbuscar.setBackground(new java.awt.Color(102, 102, 102));
                btnbuscar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
                btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/search.png"))); // NOI18N
                btnbuscar.setText("Buscar");
                btnbuscar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnbuscarActionPerformed(evt);
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

                btnreporte.setBackground(new java.awt.Color(102, 102, 102));
                btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/reportes.png"))); // NOI18N
                btnreporte.setText("Reporte");
                btnreporte.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnreporteActionPerformed(evt);
                        }
                });

                lbltotalregistros.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
                lbltotalregistros.setForeground(new java.awt.Color(102, 102, 102));
                lbltotalregistros.setText("Registros");

                btnrecibir.setBackground(new java.awt.Color(102, 102, 102));
                btnrecibir.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
                btnrecibir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/id-card.png"))); // NOI18N
                btnrecibir.setText("Recibir");
                btnrecibir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnrecibirActionPerformed(evt);
                        }
                });

                tablalistado.setBackground(new java.awt.Color(153, 153, 153));
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
                tablalistado.setSelectionForeground(new java.awt.Color(204, 204, 204));
                tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tablalistadoMouseClicked(evt);
                        }
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                tablalistadoMousePressed(evt);
                        }
                });
                jScrollPane2.setViewportView(tablalistado);

                Gestionar.setBackground(new java.awt.Color(102, 102, 102));
                Gestionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/id-card(1).png"))); // NOI18N
                Gestionar.setText("Gestionar");
                Gestionar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                GestionarActionPerformed(evt);
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

                javax.swing.GroupLayout solicitudeswebLayout = new javax.swing.GroupLayout(solicitudesweb);
                solicitudesweb.setLayout(solicitudeswebLayout);
                solicitudeswebLayout.setHorizontalGroup(
                        solicitudeswebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solicitudeswebLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                        .addGroup(solicitudeswebLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(solicitudeswebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(solicitudeswebLayout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solicitudeswebLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(14, 14, 14)
                                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnrecibir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Gestionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnreporte)
                                                .addGap(18, 18, 18)
                                                .addComponent(btneliminar)))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, solicitudeswebLayout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())
                );
                solicitudeswebLayout.setVerticalGroup(
                        solicitudeswebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(solicitudeswebLayout.createSequentialGroup()
                                .addGroup(solicitudeswebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(solicitudeswebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnrecibir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(solicitudeswebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Gestionar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtbuscar)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbltotalregistros))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(solicitudesweb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(solicitudesweb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents
    
        private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
                // TODO add your handling code here:

                mostrar(txtbuscar.getText());
        }//GEN-LAST:event_btnbuscarActionPerformed
 private Connection connection = new Conexion().conectar();
        private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
                // TODO add your handling code here:

                Map p= new HashMap();
                JasperReport report;
                JasperPrint print;

                try {
                        report =JasperCompileManager.compileReport(new File("").getAbsolutePath()+
                                "/src/Reportes/rptsolicitudesweb.jrxml");
                        print=JasperFillManager.fillReport(report,p,connection);
                        JasperViewer view = new JasperViewer(print,false);
                        view.setTitle("Listado de Solicitudes-Reservas Recibidas en la Web");
                        view.setVisible(true);

                } catch (Exception e) {

                        e.printStackTrace();
                }
        }//GEN-LAST:event_btnreporteActionPerformed

        private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
                // TODO add your handling code here:
                this.dispose();
        }//GEN-LAST:event_btnsalirActionPerformed

        private void btnrecibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecibirActionPerformed
                // TODO add your handling code here:
		
		fsolicitudesweb func = new fsolicitudesweb();
		Correo c = new Correo();
		if(func.recibirCorreo(c)){
		JOptionPane.showConfirmDialog(rootPane, "Las Solicitudes fueron recibidas satisfactoriamente");
                mostrar("");
		}
        }//GEN-LAST:event_btnrecibirActionPerformed

        private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
// TODO add your handling code here:

       



        }//GEN-LAST:event_tablalistadoMouseClicked

        private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
                // TODO add your handling code here:
		
        }//GEN-LAST:event_tablalistadoMousePressed

        private void GestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarActionPerformed
                // TODO add your handling code here:
	   int fila = tablalistado.getSelectedRow();
	   frmGestionweb form = new frmGestionweb();
        frmInicio.escritorio.add(form);
        form.toFront();
        form.setVisible(true);
	frmGestionweb.txtsolicitud.setText(tablalistado.getValueAt(fila, 0).toString());
        frmGestionweb.txtidaparta.setText(tablalistado.getValueAt(fila, 1).toString());
        frmGestionweb.txtnum.setText(tablalistado.getValueAt(fila, 2).toString());
       frmGestionweb.txttipo.setText(tablalistado.getValueAt(fila, 3).toString());
       frmGestionweb.txtFein.setText(tablalistado.getValueAt(fila, 4).toString());
       frmGestionweb.txtfesa.setText(tablalistado.getValueAt(fila, 5).toString());
       frmGestionweb.txtemail.setText(tablalistado.getValueAt(fila, 7).toString());
         		
		
		
        }//GEN-LAST:event_GestionarActionPerformed

        private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
               int fila = tablalistado.getSelectedRow();
		if (!(tablalistado.getValueAt(fila, 0).equals(""))) {
                        int confirmacion = JOptionPane.showConfirmDialog(rootPane, "Estas seguro de ELIMINAR la Solicitud", "Confirmar", 2);
			
                        if (confirmacion==0){
                                fsolicitudesweb func= new fsolicitudesweb();
                                vsolicitudesweb dts= new vsolicitudesweb();

                                dts.setIdSolicitud(Integer.parseInt(tablalistado.getValueAt(fila, 0).toString()));
                                func.eliminar(dts);
                                mostrar("");
                                
                        }
		}
                
        }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(frmSolicitudesWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSolicitudesWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSolicitudesWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSolicitudesWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSolicitudesWeb().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Gestionar;
        private javax.swing.JButton btnbuscar;
        private javax.swing.JButton btneliminar;
        private javax.swing.JButton btnrecibir;
        private javax.swing.JButton btnreporte;
        private javax.swing.JButton btnsalir;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel lbltotalregistros;
        public javax.swing.JPanel solicitudesweb;
        private javax.swing.JTable tablalistado;
        private javax.swing.JTextField txtbuscar;
        // End of variables declaration//GEN-END:variables
}
