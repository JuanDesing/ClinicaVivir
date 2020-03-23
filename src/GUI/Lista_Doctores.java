/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Conexion;
import Clases.Doctor;
import static GUI.Lista_Areas.tablee;
import componentes.org1.bolivia.combo.AWTUtilities;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ListSelectionModel;
import tabla.EstiloTablaHeader;
import tabla.EstiloTablaRenderer;
import tabla.MyScrollbarUI;
import javax.swing.table.DefaultTableModel;
import static GUI.LogIn.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableRowSorter;

public class Lista_Doctores extends javax.swing.JFrame {

    Timer timer = null;
    TimerTask task;
    int i = 32;

    public static DefaultTableModel ma;
    Control_Entrada es = new Control_Entrada();

    public Lista_Doctores() {
        initComponents();

        //this.setLocationRelativeTo(null);
        this.tabladoctores.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.tabladoctores.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.tabladoctores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        Ubicar(0);

        String data[][] = {};
        String header[] = {"Cédula", "Nombre", "Apellido", "Teléfono",
            "Correo", "Tipo médico", "Área respectiva"};

        ma = new DefaultTableModel(data, header);
        tabladoctores.setModel(ma);

        cargartabladesdelaBD();

//        combodoctores.removeAllItems();
//        combodoctores.addItem("TIPO DE DOCTOR");
//        //JOptionPane.showMessageDialog(null, "Tamaño del contenedor de doctores: " + list_Doctor.size());
//        //JOptionPane.showMessageDialog(null, "Tamaño del contenedor de doctores: " + listadoctores.size());
//        for (int j = 0; j < listadoctores.size(); j++) {
//            d = (Doctor) listadoctores.get(j);
//            //JOptionPane.showMessageDialog(null, "Se va a agregar el doctor " + d.getPrimernombre());
//            combodoctores.addItem(d.getPrimernombre() + " " + d.getPrimerapellido());
//        }
    }

    public void cargartabladesdelaBD() {
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            int nuevafila = 0;

            ResultSet rs = con.consultar("select * from doctor");

            for (int j = tabladoctores.getRowCount() - 1; j >= 0; j--) {
                ma.removeRow(j);
            }

            while (rs.next()) {
                ma.insertRow(nuevafila, new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION 
                ma.setValueAt(rs.getString("cedula_doctor"), nuevafila, 0);
                ma.setValueAt(rs.getString("primer_nombre_doctor"), nuevafila, 1);
                ma.setValueAt(rs.getString("primer_apellido_doctor"), nuevafila, 2);
                ma.setValueAt(rs.getString("telefono_doctor"), nuevafila, 3);
                ma.setValueAt(rs.getString("correo_doctor"), nuevafila, 4);
                ma.setValueAt(rs.getString("tipomedico_doctor"), nuevafila, 5);
                ma.setValueAt(rs.getString("area_id_area"), nuevafila, 6);

                nuevafila++;// 
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lista_Areas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lista_Areas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Lista_Areas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Lista_Areas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    TableRowSorter tpac;

    private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    private void Ubicar(int y) {
        this.setLocation(242, y - 240);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Facturar = new javax.swing.JMenuItem();
        panel1 = new org.edisoncor.gui.panel.Panel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladoctores = new javax.swing.JTable();
        btnVentas = new principal.MaterialButtomRectangle();
        jLabel16 = new javax.swing.JLabel();
        btnVentas1 = new principal.MaterialButtomRectangle();

        Facturar.setText("Imprimir factura");
        Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Facturar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 153));
        setLocation(new java.awt.Point(600, 300));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 204, 153));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setForeground(new java.awt.Color(255, 204, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1213, 570));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));

        tabladoctores.setBackground(new java.awt.Color(204, 204, 204));
        tabladoctores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabladoctores.setForeground(new java.awt.Color(255, 255, 255));
        tabladoctores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "NOMBRE", "DESCRIPCIÓN", "TIPO PRODUCTO", "$PRECIO", "STOCK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabladoctores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabladoctores.setDoubleBuffered(true);
        tabladoctores.setRowHeight(20);
        tabladoctores.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tabladoctores.getTableHeader().setReorderingAllowed(false);
        tabladoctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladoctoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabladoctores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, 850, 460));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 860, 420));

        btnVentas.setBackground(new java.awt.Color(255, 123, 36));
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("IMPRIMIR");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 240, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel16.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(838, 8, 40, 30));

        btnVentas1.setBackground(new java.awt.Color(255, 123, 36));
        btnVentas1.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas1.setText("ACTUALIZAR TABLA");
        btnVentas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentas1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 240, 40));

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    Ubicar(i);
                    i += 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);

    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        //setVisible(false);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarActionPerformed

    }//GEN-LAST:event_FacturarActionPerformed

    private void tabladoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladoctoresMouseClicked

    }//GEN-LAST:event_tabladoctoresMouseClicked

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed


    }//GEN-LAST:event_btnVentasActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    Cerrar();
                } else {
                    Ubicar(i);
                    i -= 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);

        Control_Entrada obj = new Control_Entrada();
        obj.registrarentrada.setEnabled(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void btnVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentas1ActionPerformed

        cargartabladesdelaBD();
    }//GEN-LAST:event_btnVentas1ActionPerformed

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
            java.util.logging.Logger.getLogger(Lista_Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_Doctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Lista_Doctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Facturar;
    private principal.MaterialButtomRectangle btnVentas;
    private principal.MaterialButtomRectangle btnVentas1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    public static javax.swing.JTable tabladoctores;
    // End of variables declaration//GEN-END:variables
}
