package Presentacion;

import Datos.vDP;

import Logica.fDP;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author inesm
 */
public class frmDP extends javax.swing.JInternalFrame {

    public frmDP() {
        initComponents();
         this.setTitle("Valores a Aplicar por Daños y Perjuicios ");
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

        txtidDP.setVisible(false);
        txtidDP.setEnabled(false);
        txtperiodo.setEnabled(false);
        txtperiodo.setVisible(false);
        txtvalorA.setVisible(false);
        txtvalorA.setEnabled(false);
        lblperiodo.setVisible(false);
        lblvalorA.setVisible(false);
        txtperiodo.setText("");
        txtvalorA.setText("");

    }

    void habilitar() {

        txtidDP.setVisible(false);
        txtidDP.setEnabled(false);
        txtperiodo.setEnabled(true);
        txtperiodo.setVisible(true);
        txtvalorA.setVisible(true);
        txtvalorA.setEnabled(true);
        lblperiodo.setVisible(true);
        lblvalorA.setVisible(true);
        txtperiodo.setText("");
        txtvalorA.setText("");

    }

    void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            fDP func = new fDP();
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
                btnAñadir = new javax.swing.JButton();
                lblperiodo = new javax.swing.JLabel();
                txtperiodo = new javax.swing.JTextField();
                lblvalorA = new javax.swing.JLabel();
                txtvalorA = new javax.swing.JTextField();
                txtidDP = new javax.swing.JTextField();
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
                jLabel2.setText("INDICES PORCENTAJES POR DAÑOS Y PERJUICIOS POR  DIAS");

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

                btnAñadir.setBackground(new java.awt.Color(255, 255, 204));
                btnAñadir.setForeground(new java.awt.Color(0, 153, 204));
                btnAñadir.setText("Añadir");
                btnAñadir.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAñadirActionPerformed(evt);
                        }
                });

                lblperiodo.setBackground(new java.awt.Color(255, 255, 204));
                lblperiodo.setForeground(new java.awt.Color(0, 153, 204));
                lblperiodo.setText("Periodo:");

                txtperiodo.setForeground(new java.awt.Color(51, 51, 51));
                txtperiodo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtperiodoActionPerformed(evt);
                        }
                });

                lblvalorA.setBackground(new java.awt.Color(255, 255, 204));
                lblvalorA.setForeground(new java.awt.Color(0, 153, 204));
                lblvalorA.setText("Valor a Aplicar(%):");

                txtvalorA.setForeground(new java.awt.Color(51, 51, 51));
                txtvalorA.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtvalorAActionPerformed(evt);
                        }
                });

                txtidDP.setBackground(new java.awt.Color(255, 255, 204));

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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(txtidDP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(9, 9, 9)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(lblperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(205, 205, 205)
                                                .addComponent(lblvalorA, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtvalorA, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnAñadir)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnguardar)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblvalorA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtvalorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtidDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtperiodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperiodoActionPerformed
        // TODO add your handling code here:
        txtperiodo.transferFocus();
    }//GEN-LAST:event_txtperiodoActionPerformed

    private void txtvalorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorAActionPerformed
        // TODO add your handling code here:
        btnAñadir.transferFocus();


    }//GEN-LAST:event_txtvalorAActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnguardar.setText("Guardar");
        accion = "guardar";


    }//GEN-LAST:event_btnAñadirActionPerformed

    private void tablalistadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMouseClicked
        // TODO add your handling code here:
        btnguardar.setText("Editar");
        habilitar();

        accion = "editar";

        int fila = tablalistado.rowAtPoint(evt.getPoint());
        txtidDP.setText(tablalistado.getValueAt(fila, 0).toString());
        txtperiodo.setText(tablalistado.getValueAt(fila, 1).toString());
        txtvalorA.setText(tablalistado.getValueAt(fila, 2).toString());
        
        
    }//GEN-LAST:event_tablalistadoMouseClicked

    private void tablalistadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablalistadoMousePressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
         if (txtperiodo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una Cantidad de dias");
            txtperiodo.requestFocus();
            return;
        }
        if (txtvalorA.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Valor (%) a aplicar por Daños y Perjuicios");
            txtvalorA.requestFocus();
            return;
        }
        vDP dts = new vDP();
        fDP func = new fDP();

        dts.setPeriodo(Integer.parseInt(txtperiodo.getText()));
        dts.setValor(Double.parseDouble(txtvalorA.getText()));
        
         if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "Los valores fueron registrados satisfactoriamente");
                mostrar("");
                inhabilitar();
            }

        } else if (accion.equals("editar")) {
            dts.setIdDP(Integer.parseInt(txtidDP.getText()));

            if (func.editar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "Los valores fueron editados satisfactoriamente");
                mostrar("");
                inhabilitar();
            }
        
        
    }//GEN-LAST:event_btnguardarActionPerformed
    }
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
            java.util.logging.Logger.getLogger(frmDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDP().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAñadir;
        private javax.swing.JButton btnguardar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblperiodo;
        private javax.swing.JLabel lblvalorA;
        private javax.swing.JTable tablalistado;
        private javax.swing.JTextField txtidDP;
        public static javax.swing.JTextField txtperiodo;
        public static javax.swing.JTextField txtvalorA;
        // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
