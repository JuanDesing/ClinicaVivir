/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import Clases.Area;
import Clases.Conexion;
import Clases.Entrada_Salidaa;
import java.util.Date;
import static GUI.LogIn.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Control_Entrada extends javax.swing.JFrame {

    public Control_Entrada() {
        try {
            initComponents();

            this.setLocationRelativeTo(null);
            registrarentrada.setEnabled(true);

            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("SELECT * FROM doctor");

            doctorasignado.removeAllItems();
            while (rs.next()) {
                doctorasignado.addItem(rs.getString(1) + " - " + rs.getString(2));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Control_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Control_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Control_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Control_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        Fechaingreso = new org.freixas.jcalendar.JCalendarCombo();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        ced2 = new javax.swing.JTextField();
        doctorasignado = new javax.swing.JComboBox<String>();
        registrarentrada = new org.edisoncor.gui.button.ButtonAeroLeft();
        jLabel10 = new javax.swing.JLabel();
        estpaciente = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(202, 105, 36));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(226, 156, 69));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 270, 10));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cédula del paciente:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 180, 20));
        jPanel2.add(Fechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 240, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Ingreso:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 150, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Control entrada");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 200, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Doctor:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 80, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Paciente:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 20));

        jSeparator2.setBackground(new java.awt.Color(255, 33, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 10));

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
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 240, 23));

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
        jPanel2.add(ced2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 240, 23));

        doctorasignado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        jPanel2.add(doctorasignado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 240, -1));

        registrarentrada.setBackground(new java.awt.Color(226, 156, 69));
        registrarentrada.setText("Registrar entrada");
        registrarentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarentradaActionPerformed(evt);
            }
        });
        jPanel2.add(registrarentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 140, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado del paciente:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, 20));

        estpaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Observación", "En tratamiento", "Cuidados intensivos" }));
        estpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estpacienteActionPerformed(evt);
            }
        });
        jPanel2.add(estpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 240, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 490, 390));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Date factual = new Date();
        //Date fsactual = new Date();

        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Fechaingreso.setDate(factual);
        //fechadesalida.setDate(factual);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void nombreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMouseMoved

    private void nombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMouseExited

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void ced2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ced2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ced2MouseMoved

    private void ced2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ced2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ced2MouseExited

    private void ced2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ced2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ced2ActionPerformed

    private void registrarentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarentradaActionPerformed

        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();

            ResultSet rs = con.consultar("SELECT * FROM control_entrada_salida where paciente_cedula_paciente = " + ced2.getText() + " and fecha_salida is null ");

            if (!rs.next()) {
                StringTokenizer st = new StringTokenizer(doctorasignado.getSelectedItem().toString() + "-");
                String ceddoct = st.nextToken();

                con.actualizar("insert into control_entrada_salida (paciente_cedula_paciente, doctor_cedula_doctor, estado_paciente_control_entrada, fecha_ingreso) values (" + ced2.getText() + ", '" + ceddoct + "', '" + estpaciente.getSelectedItem().toString() + "', '" + Fechaingreso.getDate() + "' )");

                JOptionPane.showMessageDialog(null, "ENTRADA REALIZADA");
            }else{
                JOptionPane.showMessageDialog(null, "Este paciente ya se encuentra en la clinica"
                        + "\nNO SE LE PUEDE REALIZAR NUEVAMENTE LA ENTRADA");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Control_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Control_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Control_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Control_Entrada.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_registrarentradaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        Date fi = Fechaingreso.getDate();
//        System.out.println("Dia: " + fi.getDate());
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        System.out.println(sdf.format(fi));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void estpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estpacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estpacienteActionPerformed

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
                new Control_Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public org.freixas.jcalendar.JCalendarCombo Fechaingreso;
    public static javax.swing.JTextField ced2;
    public javax.swing.JComboBox<String> doctorasignado;
    public javax.swing.JComboBox<String> estpaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextField nombre;
    public org.edisoncor.gui.button.ButtonAeroLeft registrarentrada;
    // End of variables declaration//GEN-END:variables
}
