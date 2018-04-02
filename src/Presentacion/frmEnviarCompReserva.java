/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.Conexion;
import Logica.fsolicitudesCalls;
import Logica.fsolicitudesweb;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javaemail.Correo;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;

import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author inesm
 */
public class frmEnviarCompReserva extends javax.swing.JInternalFrame {

	/**
	 * Creates new form EnviarReserva
	 */
	public frmEnviarCompReserva() {
		initComponents();
		inhabilitar();
	}
	void inhabilitar() {
		lbreserva.setEnabled(true);
		txtidreserva.setEnabled(true);
		btncomprobante.setEnabled(true);
		lblcliente.setEnabled(false);
		txtdestino.setEnabled(false);
		lblasunto.setEnabled(false);
		txtasunto.setEnabled(false);
		lblmensaje.setEnabled(false);
		txtAmensaje.setEnabled(false);
		lbadjunto.setEnabled(false);
		txtadjunto.setEnabled(false);
		btnenviar.setEnabled(false);
		btncomprobante.setEnabled(true);
		txtasunto.setVisible(false);
		lblmensaje.setVisible(false);
		txtAmensaje.setVisible(false);
		lblcliente.setVisible(false);
		lblasunto.setVisible(false);
		lbreserva.setVisible(true);
		lblmensaje.setVisible(false);
		txtidreserva.setVisible(true);
		txtdestino.setVisible(false);
		lbadjunto.setVisible(false);
		txtadjunto.setVisible(false);
		txtasunto.setVisible(false);
		jSCP1.setVisible(false);
		txtAmensaje.setVisible(false);
		txtemail.setEnabled(false);
		txtemail.setVisible(false);
		txtnum.setEnabled(false);
		txtnum.setVisible(false);
		btnenviar.setVisible(false);

	}

	void habilitar() {
		txtasunto.setEnabled(true);
		lblmensaje.setEnabled(true);
		txtAmensaje.setEnabled(true);
		lblcliente.setEnabled(true);
		lblasunto.setEnabled(true);
		txtdestino.setEnabled(true);
		lbadjunto.setEnabled(true);
		txtadjunto.setEnabled(true);
		btnenviar.setEnabled(true);
		
		txtasunto.setVisible(true);
		lblmensaje.setVisible(true);
		txtAmensaje.setVisible(true);
		lblcliente.setVisible(true);
		lblasunto.setVisible(true);
		txtdestino.setVisible(true);
		lbadjunto.setVisible(true);
		txtadjunto.setVisible(true);
		btnenviar.setVisible(true);

	}

          
             
             
	 
	
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                btncomprobante = new javax.swing.JButton();
                jSeparator1 = new javax.swing.JSeparator();
                lblcliente = new javax.swing.JLabel();
                txtdestino = new javax.swing.JTextField();
                txtasunto = new javax.swing.JTextField();
                lblasunto = new javax.swing.JLabel();
                lblmensaje = new javax.swing.JLabel();
                jSCP1 = new javax.swing.JScrollPane();
                txtAmensaje = new javax.swing.JTextArea();
                lbadjunto = new javax.swing.JLabel();
                txtadjunto = new javax.swing.JTextField();
                lbreserva = new javax.swing.JLabel();
                txtidreserva = new javax.swing.JTextField();
                btnenviar = new javax.swing.JButton();
                txtemail = new javax.swing.JTextField();
                txtnum = new javax.swing.JTextField();
                btnExportar = new javax.swing.JButton();

                setClosable(true);
                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setIconifiable(true);
                setMaximizable(true);
                setResizable(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 204));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Brasilia13.png"))); // NOI18N

                jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 153, 204));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("COMPROBANTE DE RESERVA");

                btncomprobante.setForeground(new java.awt.Color(0, 153, 204));
                btncomprobante.setText("OBTENER  COMPROBANTE");
                btncomprobante.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btncomprobanteActionPerformed(evt);
                        }
                });

                lblcliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                lblcliente.setForeground(new java.awt.Color(0, 153, 204));
                lblcliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblcliente.setText("CLIENTE:");

                lblasunto.setForeground(new java.awt.Color(0, 153, 204));
                lblasunto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblasunto.setText("ASUNTO:");

                lblmensaje.setForeground(new java.awt.Color(0, 153, 204));
                lblmensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblmensaje.setText("MENSAJE:");

                txtAmensaje.setColumns(20);
                txtAmensaje.setRows(5);
                txtAmensaje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
                txtAmensaje.setEnabled(false);
                jSCP1.setViewportView(txtAmensaje);

                lbadjunto.setForeground(new java.awt.Color(0, 153, 204));
                lbadjunto.setText("ADJUNTO:");

                lbreserva.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
                lbreserva.setForeground(new java.awt.Color(0, 153, 204));
                lbreserva.setText("Reserva:");

                btnenviar.setText("ENVIAR");
                btnenviar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnenviarActionPerformed(evt);
                        }
                });

                btnExportar.setForeground(new java.awt.Color(0, 153, 204));
                btnExportar.setText("EXPORTAR");
                btnExportar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnExportarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnenviar)
                                .addGap(121, 121, 121))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lblasunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(58, 58, 58)
                                                                .addComponent(lbadjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtdestino)
                                                        .addComponent(txtasunto)
                                                        .addComponent(jSCP1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtadjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(69, 69, 69)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(81, 81, 81)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(btncomprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(29, 29, 29)
                                                                                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(lbreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                                                .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(12, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtidreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btncomprobante)
                                                        .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnExportar))
                                                .addGap(25, 25, 25)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtasunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(lblmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(105, 105, 105))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSCP1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbadjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtadjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addComponent(btnenviar)
                                .addGap(44, 44, 44))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents
Correo c = new Correo();
        private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
                // TODO add your handling code here:

                c.setContrasenia("ebfwndfprykkhrqy");
                c.setUsuarioCorreo("aptosbrasilia@gmail.com");
                c.setAsunto(txtasunto.getText());
                c.setMensaje(txtAmensaje.getText());
                c.setDestino(txtdestino.getText().trim());
                c.setNombreArchivo("ComprobanteReserva"+ txtidreserva.getText()+".pdf");
   c.setRutaArchivo("C:\\netbeansProjects\\SistemaReservaBrasilia\\src\\Reportes\\Comprobantes\\ComprobanteReserva"+ txtidreserva.getText()+".pdf");
  
  
                fsolicitudesCalls func = new fsolicitudesCalls();
                if (func.enviarCorreo(c)) {
                        JOptionPane.showMessageDialog(null, "Envio Exitoso");

                       this.dispose();
                        
                }else{
                        JOptionPane.showMessageDialog(null, "Error al enviar");
                        this.dispose();
                }

        }//GEN-LAST:event_btnenviarActionPerformed
private Connection connection = new Conexion().conectar();
        private void btncomprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprobanteActionPerformed
                // TODO add your handling code here:
		if (!(txtidreserva.getText().equals(""))) {
		
			Map p = new HashMap();
		 p.put("idreserva", txtidreserva.getText());
		JasperReport report;
		JasperPrint print;
		try{
			report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
				+ "/src/Reportes/rptComprobanteReserva.jrxml");
			print = JasperFillManager.fillReport(report, p, connection);
			JasperViewer view = new JasperViewer(print, false);
			view.setTitle("Comprobante de Reserva");
			view.setVisible(true);
			
		}catch(JRException ex){
		ex.printStackTrace();
		}	
					
	        habilitar();
		String em= txtemail.getText();
		txtdestino.setText(em);
		
		txtasunto.setText("Comprobante de la Reserva No. " + txtidreserva.getText()+ " ,Apto. No." + txtnum.getText() + " Apartamentos Brasilia ");
		jSCP1.setVisible(true);
		
		String me= " Reserva Realizada, LLAMENOS AL 950240011 O ENVIENOS EMAIL ,SI TIENE ALGUNA DUDA CON SUS DATOS DE LA RESERVA";
		txtAmensaje.setText(me);
		txtadjunto.setText("ComprobanteReserva "+ txtidreserva.getText()+".pdf");
		}	
	
	
			
        }//GEN-LAST:event_btncomprobanteActionPerformed

        private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
                // TODO add your handling code here:
		
	if (!(txtidreserva.getText().equals(""))) {
		Map p = new HashMap();
		 p.put("idreserva", txtidreserva.getText());
		JasperReport report;
		JasperPrint print;
		
		
		try {
	report = JasperCompileManager.compileReport(new File("").getAbsolutePath()
				+ "/src/Reportes/rptComprobanteReserva.jrxml");
			print = JasperFillManager.fillReport(report, p, connection);
	
            JasperExportManager.exportReportToPdfFile(print, "C:\\netbeansProjects\\SistemaReservaBrasilia\\src\\Reportes\\Comprobantes\\ComprobanteReserva"+ txtidreserva.getText()+".pdf");   
                        
               
		}catch(JRException ex){
		ex.printStackTrace();
		JOptionPane.showMessageDialog(null,"ERROR AL EXPORTAR COMPROBANTE");
		}
	}		
        }//GEN-LAST:event_btnExportarActionPerformed

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
			java.util.logging.Logger.getLogger(frmEnviarCompReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frmEnviarCompReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frmEnviarCompReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frmEnviarCompReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmEnviarCompReserva().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnExportar;
        private javax.swing.JButton btncomprobante;
        private javax.swing.JButton btnenviar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jSCP1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JLabel lbadjunto;
        private javax.swing.JLabel lblasunto;
        private javax.swing.JLabel lblcliente;
        private javax.swing.JLabel lblmensaje;
        private javax.swing.JLabel lbreserva;
        private javax.swing.JTextArea txtAmensaje;
        private javax.swing.JTextField txtadjunto;
        private javax.swing.JTextField txtasunto;
        private javax.swing.JTextField txtdestino;
        public static javax.swing.JTextField txtemail;
        public static javax.swing.JTextField txtidreserva;
        public static javax.swing.JTextField txtnum;
        // End of variables declaration//GEN-END:variables
}
