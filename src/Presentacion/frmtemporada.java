package Presentacion;

import Datos.vDP;
import Datos.vtemporada;


import Logica.ftemporada;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inesm
 */
public class frmtemporada extends javax.swing.JInternalFrame {

    public frmtemporada() {
        initComponents();
         this.setTitle("Temporada por Meses ");
        mostrar("");
        
        inhabilitar();

    }
    private String accion = "guardar";

    void ocultar_columnas() {
        tablalistado.getColumnModel().getColumn(0).setMaxWidth(0);
        tablalistado.getColumnModel().getColumn(0).setMinWidth(0);
        tablalistado.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void inhabilitar() {

        txtidtemporada.setVisible(false);
        txtidtemporada.setEnabled(false);
        txtperidtemp.setEnabled(false);
        txtperidtemp.setVisible(false);
        txttemp.setVisible(false);
        txttemp.setEnabled(false);
        lblmes.setVisible(false);
        lbltemp.setVisible(false);
        txtperidtemp.setText("");
        txttemp.setText("");

    }

    void habilitar() {

        txtidtemporada.setVisible(false);
        txtidtemporada.setEnabled(false);
        txtperidtemp.setEnabled(true);
        txtperidtemp.setVisible(true);
        txttemp.setVisible(true);
        txttemp.setEnabled(true);
        lblmes.setVisible(true);
        lbltemp.setVisible(true);
        txtperidtemp.setText("");
        txttemp.setText("");

    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            ftemporada func = new ftemporada();
            modelo = func.mostrar(buscar);
            tablalistado.setModel(modelo);
            ocultar_columnas();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tablalistado = new javax.swing.JTable();
                lblmes = new javax.swing.JLabel();
                txtperidtemp = new javax.swing.JTextField();
                lbltemp = new javax.swing.JLabel();
                txttemp = new javax.swing.JTextField();
                txtidtemporada = new javax.swing.JTextField();
                btnguardar = new javax.swing.JButton();

                setClosable(true);
                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setIconifiable(true);
                setResizable(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 204));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/Brasilia13.png"))); // NOI18N

                jLabel2.setBackground(new java.awt.Color(255, 255, 204));
                jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 153, 204));
                jLabel2.setText("TEMPORADA DE  ALQUILER  POR  MESES DEL AÑO");

                tablalistado.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null}
                        },
                        new String [] {
                                "title1", "Title 2", "Title 3"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tablalistado.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tablalistadoMouseClicked(evt);
                        }
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                tablalistadoMousePressed(evt);
                        }
                });
                jScrollPane1.setViewportView(tablalistado);
                if (tablalistado.getColumnModel().getColumnCount() > 0) {
                        tablalistado.getColumnModel().getColumn(0).setResizable(false);
                        tablalistado.getColumnModel().getColumn(1).setResizable(false);
                        tablalistado.getColumnModel().getColumn(2).setResizable(false);
                }

                lblmes.setBackground(new java.awt.Color(255, 255, 204));
                lblmes.setForeground(new java.awt.Color(0, 153, 204));
                lblmes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblmes.setText("Mes:");

                txtperidtemp.setForeground(new java.awt.Color(51, 51, 51));
                txtperidtemp.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtperidtempActionPerformed(evt);
                        }
                });

                lbltemp.setBackground(new java.awt.Color(255, 255, 204));
                lbltemp.setForeground(new java.awt.Color(0, 153, 204));
                lbltemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lbltemp.setText("Temporada:");

                txttemp.setForeground(new java.awt.Color(51, 51, 51));
                txttemp.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txttempActionPerformed(evt);
                        }
                });

                txtidtemporada.setBackground(new java.awt.Color(255, 255, 204));
                txtidtemporada.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtidtemporadaActionPerformed(evt);
                        }
                });

                btnguardar.setBackground(new java.awt.Color(255, 255, 204));
                btnguardar.setForeground(new java.awt.Color(0, 153, 204));
                btnguardar.setText("Editar");
                btnguardar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnguardarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblmes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtperidtemp, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(122, 122, 122)
                                                .addComponent(lbltemp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txttemp, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtidtemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(68, 68, 68)
                                                                .addComponent(btnguardar))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lbltemp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtperidtemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(lblmes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txttemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtidtemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(14, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void txtperidtempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperidtempActionPerformed
        // TODO add your handling code here:
        txtperidtemp.transferFocus();
    }//GEN-LAST:event_txtperidtempActionPerformed

    private void txttempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttempActionPerformed
        // TODO add your handling code here:
        btnguardar.transferFocus();


    }//GEN-LAST:event_txttempActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
        btnguardar.setText("Editar");
        habilitar();

        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());
        txtidtemporada.setText(tablalistado.getValueAt(fila, 0).toString());
        txtperidtemp.setText(tablalistado.getValueAt(fila, 1).toString());
        txttemp.setText(tablalistado.getValueAt(fila, 2).toString());
        
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoMousePressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
         if (txtperidtemp.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Mes");
            txtperidtemp.requestFocus();
            return;
        }
        if (txttemp.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una Temporada a aplicar");
            txttemp.requestFocus();
            return;
        }
        vtemporada dts = new vtemporada();
        ftemporada func = new ftemporada();

        dts.setPeriodotemp(Integer.parseInt(txtperidtemp.getText()));
        dts.setTemporada(txttemp.getText());
        
         if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "Los valores fueron registrados satisfactoriamente");
                mostrar("");
                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            dts.setIdtemporada(Integer.parseInt(txtidtemporada.getText()));

            if (func.editar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "Los valores fueron editados satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
	}
        
    }//GEN-LAST:event_btnguardarActionPerformed

        private void txtidtemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidtemporadaActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtidtemporadaActionPerformed
   
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
            java.util.logging.Logger.getLogger(frmtemporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmtemporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmtemporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmtemporada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmtemporada().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnguardar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblmes;
        private javax.swing.JLabel lbltemp;
        private javax.swing.JTable tablalistado;
        private javax.swing.JTextField txtidtemporada;
        public static javax.swing.JTextField txtperidtemp;
        public static javax.swing.JTextField txttemp;
        // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
