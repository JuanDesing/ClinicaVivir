/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Archivo;
import javax.swing.JOptionPane;
import Clases.Area;
import Clases.Conexion;
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
import java.util.Date;
import java.util.Properties;
import static GUI.LogIn.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Control_Sallida extends javax.swing.JFrame {

    public Control_Sallida() {
        try {
            initComponents();

            this.setLocationRelativeTo(null);

            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("select * from doctor");

            doctorasignado.removeAllItems();
            while (rs.next()) {
                doctorasignado.addItem(rs.getString(1) + " - " + rs.getString(2));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Control_Sallida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Control_Sallida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Control_Sallida.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Control_Sallida.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fechadesalida = new org.freixas.jcalendar.JCalendarCombo();
        Fechaingreso = new org.freixas.jcalendar.JCalendarCombo();
        imprimir = new org.edisoncor.gui.button.ButtonAeroLeft();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        valor = new javax.swing.JTextField();
        ced2 = new javax.swing.JTextField();
        doctorasignado = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        registrarsalida = new org.edisoncor.gui.button.ButtonAeroLeft();
        jLabel10 = new javax.swing.JLabel();
        estpaciente = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(202, 105, 36));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cédula del paciente:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 180, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha de Salida:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 150, -1));

        fechadesalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechadesalidaActionPerformed(evt);
            }
        });
        jPanel2.add(fechadesalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 240, -1));
        jPanel2.add(Fechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 240, -1));

        imprimir.setBackground(new java.awt.Color(226, 156, 69));
        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        jPanel2.add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 90, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Ingreso:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Doctor:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 80, 20));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Valor a pagar:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Paciente:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 33, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 10));

        nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setToolTipText("Id Area");
        nombre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nombreMouseMoved(evt);
            }
        });
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nombreMouseExited(evt);
            }
        });
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 240, 23));

        valor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        valor.setForeground(new java.awt.Color(102, 102, 102));
        valor.setToolTipText("Id Area");
        valor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                valorMouseMoved(evt);
            }
        });
        valor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                valorMouseExited(evt);
            }
        });
        valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorActionPerformed(evt);
            }
        });
        jPanel2.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 240, 23));

        ced2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ced2.setForeground(new java.awt.Color(102, 102, 102));
        ced2.setToolTipText("Id Area");
        ced2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ced2MouseMoved(evt);
            }
        });
        ced2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ced2MouseExited(evt);
            }
        });
        ced2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ced2ActionPerformed(evt);
            }
        });
        jPanel2.add(ced2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 240, 23));

        doctorasignado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        doctorasignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorasignadoActionPerformed(evt);
            }
        });
        jPanel2.add(doctorasignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 240, -1));

        textarea.setColumns(20);
        textarea.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textarea.setForeground(new java.awt.Color(102, 102, 102));
        textarea.setRows(5);
        textarea.setToolTipText("Descripción");
        textarea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                textareaMouseMoved(evt);
            }
        });
        textarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textareaMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(textarea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 440, 220));

        registrarsalida.setBackground(new java.awt.Color(226, 156, 69));
        registrarsalida.setText("Registrar salida / Facturar");
        registrarsalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarsalidaActionPerformed(evt);
            }
        });
        jPanel2.add(registrarsalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 190, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado del paciente:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 170, 20));

        estpaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Observación", "En tratamiento", "Cuidados intensivos" }));
        estpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estpacienteActionPerformed(evt);
            }
        });
        jPanel2.add(estpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 240, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Control salida");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 20));

        jSeparator1.setBackground(new java.awt.Color(226, 156, 69));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 270, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 620));

        jPanel3.setBackground(new java.awt.Color(226, 156, 69));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancelar2.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 40, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Date factual = new Date();
        //Date fsactual = new Date();

        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Fechaingreso.setDate(factual);
        fechadesalida.setDate(factual);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed

        int state;
        String msg;
        FileDialog file = new FileDialog(Control_Sallida.this, "Load File", FileDialog.LOAD);
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
            JOptionPane.showMessageDialog(null, new String(data));
            textarea.setText(new String(data));
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
            textarea.printAll(g);
        }
        g.dispose();
        print.end();

        JOptionPane.showMessageDialog(null, "La factura se encuentra en el directorio seleccionado"
                + "\nlista para ser impresa!");

        imprimir.setEnabled(false);
        //JOptionPane.showMessageDialog(null, "La fecha actual es: " + factual);

    }//GEN-LAST:event_imprimirActionPerformed

    private void nombreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMouseMoved

    private void nombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMouseExited

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void valorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_valorMouseMoved

    private void valorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_valorMouseExited

    private void valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorActionPerformed

    private void ced2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ced2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ced2MouseMoved

    private void ced2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ced2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ced2MouseExited

    private void ced2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ced2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ced2ActionPerformed

    private void textareaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textareaMouseMoved
        textarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textarea.setBackground(new java.awt.Color(245, 215, 110));
        textarea.setForeground(new java.awt.Color(159, 29, 0));
    }//GEN-LAST:event_textareaMouseMoved

    private void textareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textareaMouseExited
        textarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textarea.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_textareaMouseExited

    private void registrarsalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarsalidaActionPerformed

        if (Fechaingreso.getDate().getTime() <= fechadesalida.getDate().getTime()) {
            Date fechsal = fechadesalida.getDate();
            float valorapagar = 0;

            int diasaliquidar = (int) (fechadesalida.getDate().getTime() - Fechaingreso.getDate().getTime()) / 86400000;

            switch (estpaciente.getSelectedItem().toString()) {
                case "Observación":
                    valorapagar = 50000 * diasaliquidar;
                    break;
                case "En tratamiento":
                    valorapagar = 100000 * diasaliquidar;
                    break;
                case "Cuidados intensivos":
                    valorapagar = 200000 * diasaliquidar;
                    break;
                default:
                    break;
            }

//            String factura = "";
//
//            factura = "\n\n\tFACTURA"
//                    + "\n\n\tNombre: " + entsal.getNombre()
//                    + "\n\tCédula: " + entsal.getCedula()
//                    + "\n\tFecha en que ingresó: " + entsal.getFecha_ingreso()
//                    + "\n\tFecha en que salió: " + entsal.getFecha_salida()
//                    + "\n\tEstado en que ingreso: " + entsal.getEstado_paciente()
//                    + "\n\tDoctor asignado: " + entsal.getDoctasig()
//                    + "\n\n\tDias que duró en la clínica: " + diasaliquidar
//                    + "\n\n\tVALOR A CANCELAR: " + valorapagar;
//
//            //textarea.setText(factura);
//            Archivo.grabar("Factura.txt", factura);
            try {
//                areadelprof.removeAllItems();
                Conexion con = new Conexion();
                con.ConexionPostgres();
                
                ResultSet rs = con.consultar("select numero_factura from control_entrada_salida where paciente_cedula_paciente = "+ced2.getText()+" and fecha_salida is null ");

                String numerofact = "";
                if (rs.next()) {
                    numerofact = rs.getString(1);
                }
                
                con.actualizar("update control_entrada_salida set fecha_salida = '" + fechadesalida.getDate() + "', valor_a_pagar_entrada_y_salida = " + valorapagar + " where numero_factura = "+numerofact+" ");
                
                JOptionPane.showMessageDialog(null, "Se le ha registrado la salida a este paciente y "
                        + "\nse le ha generado la factura!");

                fechadesalida.setEnabled(false);
                valor.setText(valorapagar + "");
                imprimir.setEnabled(true);
                registrarsalida.setEnabled(false);
                imprimir.setEnabled(true);

                con.cerrar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FDoctor.class.getName()).log(Level.SEVERE, null, ex);
            }
            //---------------------------------------------------------
            //JOptionPane.showMessageDialog(null, "La fecha de ingreso: " + Fechaingreso.getDate()
            //     + "\nFecha de salida: " + fechsal);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, verifique la fecha de salida"
                    + "\nLa fecha de salida no puede ser inferior a la fecha de entrada!");
        }
    }//GEN-LAST:event_registrarsalidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date fi = Fechaingreso.getDate();
        System.out.println("Dia: " + fi.getDate());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(fi));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void estpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estpacienteActionPerformed

    private void fechadesalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechadesalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechadesalidaActionPerformed

    private void doctorasignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorasignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorasignadoActionPerformed

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
                if ("nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control_Sallida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public org.freixas.jcalendar.JCalendarCombo Fechaingreso;
    public javax.swing.JTextField ced2;
    public javax.swing.JComboBox<String> doctorasignado;
    public javax.swing.JComboBox<String> estpaciente;
    public org.freixas.jcalendar.JCalendarCombo fechadesalida;
    public org.edisoncor.gui.button.ButtonAeroLeft imprimir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField nombre;
    public org.edisoncor.gui.button.ButtonAeroLeft registrarsalida;
    public javax.swing.JTextArea textarea;
    public javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
