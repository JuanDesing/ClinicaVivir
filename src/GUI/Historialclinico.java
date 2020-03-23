/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Conexion;
import componentes.org1.bolivia.combo.AWTUtilities;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ListSelectionModel;
import tabla.EstiloTablaHeader;
import tabla.EstiloTablaRenderer;
import tabla.MyScrollbarUI;
import javax.swing.table.DefaultTableModel;
import static GUI.LogIn.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import Clases.Entrada_Salidaa;
import static GUI.Lista_Areas.tablee;
import static GUI.Lista_Doctores.ma;
import Mensajes.ErrorAlert;
import Mensajes.ErrorAlert1;
import java.awt.Cursor;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Historialclinico extends javax.swing.JFrame {

    Timer timer = null;
    TimerTask task;
    int i = 32;

    DefaultTableModel ma;
    Control_Sallida es = new Control_Sallida();

    public Historialclinico() {
        initComponents();

        //this.setLocationRelativeTo(null);
        this.tabla.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        this.tabla.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        this.tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        Ubicar(0);

        String data[][] = {};
        String header[] = {"N-Factura", "Cédula", "Doctor asignado", "Estado del paciente",
            "Fecha-ingreso", "Fecha-salida", "Valor a pagar"};

        ma = new DefaultTableModel(data, header);
        tabla.setModel(ma);

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

            ResultSet rs = con.consultar("select * from control_entrada_salida");
            
            for (int j = tabla.getRowCount() - 1; j >= 0; j--) {
                ma.removeRow(j);
            }
            
            while (rs.next()) {
                ma.insertRow(nuevafila, new Object[]{}); //INSERTA FILA EN TIEMPO DE EJECUCION 
                ma.setValueAt(rs.getString("numero_factura"), nuevafila, 0);
                ma.setValueAt(rs.getString("paciente_cedula_paciente"), nuevafila, 1);
                ma.setValueAt(rs.getString("doctor_cedula_doctor"), nuevafila, 2);
                ma.setValueAt(rs.getString("estado_paciente_control_entrada"), nuevafila, 3);
                ma.setValueAt(rs.getString("fecha_ingreso"), nuevafila, 4);
                ma.setValueAt(rs.getString("fecha_salida"), nuevafila, 5);
                ma.setValueAt(rs.getString("valor_a_pagar_entrada_y_salida"), nuevafila, 6);

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
        this.setLocation(100, y - 250);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Facturar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        buuscarxnombre = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buuscarxtipmedico = new app.bolivia.swing.JCTextField();
        jLabel8 = new javax.swing.JLabel();
        btnVentas = new principal.MaterialButtomRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        Facturar.setText("Imprimir factura");
        Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Facturar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 60));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1213, 570));

        jPanel2.setBackground(new java.awt.Color(255, 123, 36));
        jPanel2.setPreferredSize(new java.awt.Dimension(1175, 64));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/icono-usuario.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HISTORIAL CLÍNICO");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel16.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 151, 89));
        jPanel7.setPreferredSize(new java.awt.Dimension(282, 476));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("Buscar por el nombre del doctor:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 30, -1, 40));

        buuscarxnombre.setBorder(null);
        buuscarxnombre.setForeground(new java.awt.Color(214, 100, 65));
        buuscarxnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buuscarxnombre.setPlaceholder("BUSCAR");
        buuscarxnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buuscarxnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buuscarxnombreKeyTyped(evt);
            }
        });
        jPanel7.add(buuscarxnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 82, 190, 27));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/campo-buscar.png"))); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 0));
        jLabel7.setText("Buscar por el tipo de doctor:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 230, 40));

        buuscarxtipmedico.setBorder(null);
        buuscarxtipmedico.setForeground(new java.awt.Color(214, 100, 65));
        buuscarxtipmedico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buuscarxtipmedico.setPlaceholder("BUSCAR");
        buuscarxtipmedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buuscarxtipmedicoActionPerformed(evt);
            }
        });
        buuscarxtipmedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buuscarxtipmedicoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buuscarxtipmedicoKeyTyped(evt);
            }
        });
        jPanel7.add(buuscarxtipmedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 192, 190, 27));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/campo-buscar.png"))); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 50));

        btnVentas.setBackground(new java.awt.Color(255, 123, 36));
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("ACTUALIZAR HISTORIAL");
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel7.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 250, 50));

        tabla.setBackground(new java.awt.Color(0, 51, 51));
        tabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(0, 51, 51));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "USUARIO", "CONTRASEÑA", "TIPO USUARIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setComponentPopupMenu(jPopupMenu1);
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabla.setDoubleBuffered(true);
        tabla.setRowHeight(20);
        tabla.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 570));

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

//        Entrada_Salida obj = new Entrada_Salida();
//        obj.registrarentrada.setEnabled(true);

    }//GEN-LAST:event_jLabel16MouseClicked

    private void buuscarxnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buuscarxnombreKeyTyped

        buuscarxnombre.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                tpac.setRowFilter(RowFilter.regexFilter("(?i)" + buuscarxnombre.getText(), 5));
                //tdoc.setRowFilter(RowFilter.regexFilter("(?i)" + buuscarxtipmed.getText(), 3));

            }

        });

        tpac = new TableRowSorter(ma);
        tabla.setRowSorter(tpac);

    }//GEN-LAST:event_buuscarxnombreKeyTyped

    private void buuscarxnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buuscarxnombreKeyReleased

    }//GEN-LAST:event_buuscarxnombreKeyReleased

    private void buuscarxtipmedicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buuscarxtipmedicoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_buuscarxtipmedicoKeyReleased

    private void buuscarxtipmedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buuscarxtipmedicoKeyTyped
        buuscarxtipmedico.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {

                tpac.setRowFilter(RowFilter.regexFilter("(?i)" + buuscarxtipmedico.getText(), 6));
                //tdoc.setRowFilter(RowFilter.regexFilter("(?i)" + buuscarxtipmed.getText(), 3));

            }

        });

        tpac = new TableRowSorter(ma);
        tabla.setRowSorter(tpac);
    }//GEN-LAST:event_buuscarxtipmedicoKeyTyped

    private void FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturarActionPerformed

        if (tabla.getValueAt(tabla.getSelectedRow(), 5) == null) {

            ErrorAlert1 ea = new ErrorAlert1(this, true);
            ea.t1.setText("NO PUEDES FACTURAR ESTE PACIENTE");
            ea.t1.setFont(new java.awt.Font("Century Gothic", 1, 19)); // NOI18N
            ea.t1.setForeground(new java.awt.Color(153, 153, 153));
            ea.t2.setText("ESTE PACIENTE AÚN NO HA SALIDO DE LA CLÍNICA");
            ea.t2.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
            ea.t2.setForeground(new java.awt.Color(153, 153, 153));
            ea.setVisible(true);

        } else {

            int state;
            String msg;
            FileDialog file = new FileDialog(new Control_Sallida(), "Load File", FileDialog.LOAD);
            file.setFile("*.txt");
            file.show();
            String curFile;
            if ((curFile = file.getFile()) != null) {
                String filename = file.getDirectory() + curFile;
                char[] data;
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                File f = new File(filename);

                try {
                    FileReader fin = new FileReader(f);
                    int filesize = (int) f.length();
                    data = new char[filesize];
                    fin.read(data, 0, filesize);
                } catch (FileNotFoundException exc) {
                    String errorString = "No se Encontro Archivo: " + filename;
                    data = errorString.toCharArray();
                } catch (IOException exc) {
                    String errorString = "Tipo de Error: " + filename;
                    data = errorString.toCharArray();
                }
                //jLabel1.setText("Archivo: " + filename);
                //JOptionPane.showMessageDialog(null, new String(data));
                es.textarea.setText(new String(data));
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }

            //--------------------------------------------------------------
            String family = "Serif";
            int style = Font.PLAIN;
            int size = 20;
            Font fuente = new Font(family, style, size);
            //Terminacion de fuente
            Properties defaultProps = new Properties();
            PrintJob print = Toolkit.getDefaultToolkit().getPrintJob(this, "Imprimir", defaultProps);
            Graphics g = print.getGraphics();

            if (g != null) {
                es.textarea.printAll(g);
            }
            g.dispose();
            print.end();

            JOptionPane.showMessageDialog(null, "La factura se encuentra en el directorio seleccionado"
                    + "\nlista para ser impresa!");
        }
    }//GEN-LAST:event_FacturarActionPerformed

    private void buuscarxtipmedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buuscarxtipmedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buuscarxtipmedicoActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed

        cargartabladesdelaBD();

    }//GEN-LAST:event_btnVentasActionPerformed

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
            java.util.logging.Logger.getLogger(Historialclinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historialclinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historialclinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historialclinico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historialclinico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Facturar;
    private principal.MaterialButtomRectangle btnVentas;
    public static app.bolivia.swing.JCTextField buuscarxnombre;
    public static app.bolivia.swing.JCTextField buuscarxtipmedico;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
