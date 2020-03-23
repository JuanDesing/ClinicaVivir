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
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static GUI.LogIn.*;
import Mensajes.ErrorAlert;
import Mensajes.ErrorAlertarea;
import Mensajes.SuccessAlert;
import Mensajes.WarningAlertCerrar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FArea extends javax.swing.JFrame {

    private JButton buscar;

    public FArea() {
        initComponents();

        this.setLocationRelativeTo(null);

        modificar.setEnabled(false);
    }

    public FArea(JButton agregar, JButton buscar, JTextArea desc, JTextField id, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JPanel jPanel1, JButton listar, JButton modificar, JTextField nombre) throws HeadlessException {
        this.agregar = agregar;
        this.buscar = buscar;
        this.desc = desc;
        this.id = id;
        //Carthis.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        //this.jPanel1 = jPanel1;
        this.listar = listar;
        this.modificar = modificar;
        this.nombre = nombre;
    }

    public Area buscararea(int id) {

        for (int i = 0; i < LogIn.areas.size(); i++) {
            area = (Area) LogIn.areas.get(i);
            if (area.getId() == id) {
                return area;
            }
        }

        area = null;
        return area;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        buscar2 = new javax.swing.JButton();
        limpiar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(202, 105, 36));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desc.setColumns(20);
        desc.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        desc.setForeground(new java.awt.Color(102, 102, 102));
        desc.setRows(5);
        desc.setToolTipText("Descripción");
        desc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                descMouseMoved(evt);
            }
        });
        desc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                descMouseExited(evt);
            }
        });
        desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(desc);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 230, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del area:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id Area:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        id.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(102, 102, 102));
        id.setToolTipText("Id Area");
        id.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                idMouseMoved(evt);
            }
        });
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                idMouseExited(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 230, -1));

        nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.setToolTipText("Nombre del area");
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
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 230, -1));

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(202, 105, 36));
        agregar.setText("Agregar");
        agregar.setToolTipText("Agregar");
        agregar.setBorder(null);
        agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                agregarMouseMoved(evt);
            }
        });
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel2.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 20));

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(202, 105, 36));
        modificar.setText("Modificar");
        modificar.setToolTipText("Modificar");
        modificar.setBorder(null);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel2.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 90, 20));

        listar.setBackground(new java.awt.Color(255, 255, 255));
        listar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        listar.setForeground(new java.awt.Color(202, 105, 36));
        listar.setText("Listar");
        listar.setToolTipText("Listar");
        listar.setBorder(null);
        listar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        jPanel2.add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 80, 20));

        jSeparator1.setBackground(new java.awt.Color(255, 33, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 10));

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -20, -1, -1));

        buscar2.setBackground(new java.awt.Color(255, 255, 255));
        buscar2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buscar2.setForeground(new java.awt.Color(202, 105, 36));
        buscar2.setText("Buscar");
        buscar2.setToolTipText("Buscar");
        buscar2.setBorder(null);
        buscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar2ActionPerformed(evt);
            }
        });
        jPanel2.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 80, 20));

        limpiar1.setBackground(new java.awt.Color(255, 255, 255));
        limpiar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        limpiar1.setForeground(new java.awt.Color(202, 105, 36));
        limpiar1.setText("limpiar");
        limpiar1.setToolTipText("Buscar");
        limpiar1.setBorder(null);
        limpiar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar1ActionPerformed(evt);
            }
        });
        jPanel2.add(limpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 80, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, 320));

        jPanel3.setBackground(new java.awt.Color(226, 156, 69));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancelar2.png"))); // NOI18N
        jLabel16.setToolTipText("Cerrar");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 40, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/botón minimizar.png"))); // NOI18N
        jLabel6.setToolTipText("Minimizar");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (id.getText().isEmpty() || nombre.getText().isEmpty() || desc.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Complete el espacio vacio!!");
            WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
            wa.titulo.setText("COMPLETE EL ESPACIO VACIO!");
            wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
            wa.setVisible(true);
//            modificar.setEnabled(false);
            id.setEnabled(true);

        } else {

            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();
                ResultSet rs = con.consultar("Select * from area where id_area= '" + id.getText() + "'  ");
                if (rs.next()) {
//                    JOptionPane.showMessageDialog(null, "El Area está repetida");
                    ErrorAlert ea = new ErrorAlert(this, true);
                    ea.titulo1.setText("EL AREA ESTÁ REPETIDA!");
                    ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                    ea.setVisible(true);
                } else {
                    con.actualizar("insert into area values('" + id.getText() + "','" + nombre.getText() + "','" + desc.getText() + "')");
//                    JOptionPane.showMessageDialog(null, "Area Registrada");
                    SuccessAlert sa = new SuccessAlert(this, true);
                    sa.titulo.setText("AREA REGISTRADA!");
                    sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                    sa.setVisible(true);

                    //jlbAsignarDoctor.setEnabled(true);
                }
                con.cerrar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        /*if (buscarpersona(id.getText().trim())) {
         JOptionPane.showMessageDialog(null, "La persona a la que usted quiere registrar, "
         + "\nya se encuentra registrada");*/

    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (id.getText().isEmpty() || nombre.getText().isEmpty() || desc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete el espacio vacio!!");
            WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
            wa.titulo.setText("COMPLETE EL ESPACIO VACIO!");
            wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
            wa.setVisible(true);
            modificar.setEnabled(false);
            id.setEnabled(true);
        } else {
            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();

                String sql = ("Update area set nombre_area = '" + nombre.getText() + "',descripcion_area = '" + desc.getText() + "' "
                        + " where id_area = '" + id.getText() + "'");

                con.actualizar(sql);
//                 JOptionPane.showMessageDialog(null, "INFORMACION MODIFICADA!");
                SuccessAlert sa = new SuccessAlert(this, true);
                sa.titulo.setText("INFORMACIÓN MODIFICADA!");
                sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                sa.setVisible(true);
                
                id.setEnabled(false);
                
                id.setText(null);
                nombre.setText(null);
                desc.setText(null);
                
                agregar.setEnabled(true);
                modificar.setEnabled(false);
                
                con.cerrar();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FArea.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_modificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FDoctor().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed

        String areaa = "id area\t Nombre del area \t Descripción \n";

        

        Archivo.grabar("Areas.txt", areaa);

//        JOptionPane.showMessageDialog(null, "Archivo Generado");
        SuccessAlert sa = new SuccessAlert(this, true);
        sa.titulo.setText("ARCHIVO GENERADO!");
        sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
        sa.setVisible(true);

        id.setText("");
        nombre.setText("");
        desc.setText("");
        id.setEnabled(true);
    }//GEN-LAST:event_listarActionPerformed

    private void idMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseMoved
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        id.setBackground(new java.awt.Color(245, 215, 110));
        id.setForeground(new java.awt.Color(159, 29, 0));

    }//GEN-LAST:event_idMouseMoved

    private void idMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseExited
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setForeground(new java.awt.Color(102, 102, 102));

    }//GEN-LAST:event_idMouseExited

    private void nombreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseMoved
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nombre.setBackground(new java.awt.Color(245, 215, 110));
        nombre.setForeground(new java.awt.Color(159, 29, 0));

    }//GEN-LAST:event_nombreMouseMoved

    private void nombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseExited
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_nombreMouseExited

    private void descMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descMouseMoved
        desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        desc.setBackground(new java.awt.Color(245, 215, 110));
        desc.setForeground(new java.awt.Color(159, 29, 0));

    }//GEN-LAST:event_descMouseMoved

    private void descMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descMouseExited
        desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        desc.setBackground(new java.awt.Color(255, 255, 255));
        desc.setForeground(new java.awt.Color(102, 102, 102));    }//GEN-LAST:event_descMouseExited

    private void agregarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMouseMoved
    }//GEN-LAST:event_agregarMouseMoved

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
    }//GEN-LAST:event_nombreActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(LogIn.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped

//        if (Character.isDigit(evt.getKeyChar())) {
//        } else {
//            evt.consume();
//        }

    }//GEN-LAST:event_idKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || Character.isSpace(evt.getKeyChar())) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void descKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || Character.isSpace(evt.getKeyChar())) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_descKeyTyped

    private void buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar2ActionPerformed

        //String idd = JOptionPane.showInputDialog("Digite el id del area: ");

         ErrorAlertarea obj = new ErrorAlertarea(this, true);
         obj.titulo.setText("Digite el id del area: ");
         obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
         obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
         obj.setVisible(true);
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            ResultSet rs = con.consultar("Select * from area where id_area = '" + obj.idd.getText() + "' ");
            if (rs.next()) {

                id.setText(rs.getString("id_area"));
                nombre.setText(rs.getString("nombre_area"));
                desc.setText(rs.getString("descripcion_area"));
                modificar.setEnabled(true);
                agregar.setEnabled(false);
                id.setEnabled(false);
            } else {
//                JOptionPane.showMessageDialog(null, "El Area no existe");
                WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
                wa.titulo.setText("¡¡AREA NO REGISTRADA!!");
                wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
                wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                wa.setVisible(true);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FArea.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FArea.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FArea.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FArea.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_buscar2ActionPerformed

    private void limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar1ActionPerformed
        id.setText("");
        nombre.setText("");
        desc.setText("");
        modificar.setEnabled(false);
        id.setEnabled(true);
        agregar.setEnabled(true);
    }//GEN-LAST:event_limpiar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Area.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Area.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Area.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Area.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar2;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiar1;
    private javax.swing.JButton listar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
