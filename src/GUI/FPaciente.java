package GUI;

import Clases.Archivo;
import Clases.Conexion;
import Clases.Paciente;
import javax.swing.JOptionPane;
import static GUI.LogIn.*;
import Mensajes.ErrorAlert;
import Mensajes.ErrorAlertarea;
import Mensajes.ErrorAlertdoctor;
import Mensajes.SuccessAlert;
import Mensajes.WarningAlertCerrar;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FPaciente extends javax.swing.JFrame {

    public FPaciente() {

        initComponents();
        this.setLocationRelativeTo(null);

        Paciente p1 = new Paciente(1092388501, "Aracanjel", "Sebastian1", "gdjfhdsjfh", 34, 123432);
        Paciente p2 = new Paciente(1092388502, "Miguel", "Llorez", "dfhgdfghfd", 32, 12454353);
        Paciente p3 = new Paciente(1092388503, "Sepulverda", "Daniel", "5436473", 13, 53453466);

        listapacientes.add(p1);
        listapacientes.add(p2);
        listapacientes.add(p3);
        modificar.setEnabled(false);

    }

    public static Paciente buscarPaciente(long ced) {

        for (int i = 0; i < LogIn.listapacientes.size(); i++) {
            pac = (Paciente) LogIn.listapacientes.get(i);
            if (pac.getCedula() == ced) {
                return pac;
            }
        }

        pac = null;
        return pac;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        primernombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        buscar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        primerapellido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(226, 156, 69));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancelar2.png"))); // NOI18N
        jLabel16.setToolTipText("Cerrar");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/botón minimizar.png"))); // NOI18N
        jLabel8.setToolTipText("Minimizar");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(418, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 40));

        jPanel2.setBackground(new java.awt.Color(202, 105, 36));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cédula: ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 38, 69, -1));

        cedula.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cedula.setForeground(new java.awt.Color(102, 102, 102));
        cedula.setToolTipText("Cédula");
        cedula.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cedulaMouseMoved(evt);
            }
        });
        cedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cedulaMouseExited(evt);
            }
        });
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        jPanel2.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 38, 247, -1));

        primernombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        primernombre.setForeground(new java.awt.Color(102, 102, 102));
        primernombre.setToolTipText("Nombre");
        primernombre.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                primernombreMouseMoved(evt);
            }
        });
        primernombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                primernombreMouseExited(evt);
            }
        });
        primernombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                primernombreKeyTyped(evt);
            }
        });
        jPanel2.add(primernombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 76, 247, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Primer nombre:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 76, 130, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edad:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        edad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        edad.setForeground(new java.awt.Color(102, 102, 102));
        edad.setToolTipText("Edad");
        edad.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                edadMouseMoved(evt);
            }
        });
        edad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edadMouseExited(evt);
            }
        });
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });
        jPanel2.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 190, 247, -1));

        telefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        telefono.setForeground(new java.awt.Color(102, 102, 102));
        telefono.setToolTipText("Teléfono");
        telefono.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                telefonoMouseMoved(evt);
            }
        });
        telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                telefonoMouseExited(evt);
            }
        });
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 228, 247, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Teléfono:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 228, -1, -1));

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        limpiar.setForeground(new java.awt.Color(202, 105, 36));
        limpiar.setText("Limpiar");
        limpiar.setToolTipText("Buscar");
        limpiar.setBorder(null);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 100, -1));

        listar.setBackground(new java.awt.Color(255, 255, 255));
        listar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        listar.setForeground(new java.awt.Color(202, 105, 36));
        listar.setText("Listar");
        listar.setToolTipText("Listar");
        listar.setBorder(null);
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        jPanel2.add(listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 90, -1));

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(202, 105, 36));
        agregar.setText("Registrar");
        agregar.setToolTipText("Agregar");
        agregar.setBorder(null);
        agregar.setBorderPainted(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel2.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 100, -1));

        modificar.setBackground(new java.awt.Color(255, 255, 255));
        modificar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        modificar.setForeground(new java.awt.Color(202, 105, 36));
        modificar.setText("Modificar");
        modificar.setToolTipText("Modificar");
        modificar.setBorder(null);
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel2.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 110, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 33, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 10));

        buscar1.setBackground(new java.awt.Color(255, 255, 255));
        buscar1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buscar1.setForeground(new java.awt.Color(202, 105, 36));
        buscar1.setText("Buscar");
        buscar1.setToolTipText("Buscar");
        buscar1.setBorder(null);
        buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar1ActionPerformed(evt);
            }
        });
        jPanel2.add(buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 100, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Primer apellido:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 114, 130, -1));

        primerapellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        primerapellido.setForeground(new java.awt.Color(102, 102, 102));
        primerapellido.setToolTipText("Nombre");
        primerapellido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                primerapellidoMouseMoved(evt);
            }
        });
        primerapellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                primerapellidoMouseExited(evt);
            }
        });
        primerapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                primerapellidoKeyTyped(evt);
            }
        });
        jPanel2.add(primerapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 114, 247, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Correo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 152, 80, -1));

        correo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        correo.setForeground(new java.awt.Color(102, 102, 102));
        correo.setToolTipText("Nombre");
        correo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                correoMouseMoved(evt);
            }
        });
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                correoMouseExited(evt);
            }
        });
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 152, 247, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed

        cedula.setText("");
        primernombre.setText("");
        primerapellido.setText("");
        edad.setText("");
        telefono.setText("");
        correo.setText("");

        modificar.setEnabled(false);
        cedula.setEnabled(true);
        primernombre.setEnabled(true);
        agregar.setEnabled(true);

    }//GEN-LAST:event_limpiarActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        try {
            Conexion con = new Conexion();
            con.ConexionPostgres();
            ResultSet rs = con.consultar("select * from paciente");
            String cad = "Cedula \tPrimer Nombre \tSegundo Nombre \tedad \ttelefono \n";
            while (rs.next()) {                
                if (rootPaneCheckingEnabled) {
                    
                } else {
                }
            }
            
            
            Archivo.grabar("Pacientes.xls", cad);
            JOptionPane.showMessageDialog(null, "Archivo Generado");
            
            cedula.setText("");
            primernombre.setText("");
            edad.setText("");
            telefono.setText("");
            
            cedula.setEnabled(true);
            primernombre.setEnabled(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_listarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (cedula.getText().trim().equals("") || primernombre.getText().trim().equals("") || primerapellido.getText().trim().equals("")
                || correo.getText().trim().equals("") || edad.getText().trim().equals("") || telefono.getText().trim().equals("")) {
//            JOptionPane.showMessageDialog(null, "Por favor, llene el formulario");
            WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
            wa.titulo.setText("COMPLETE EL ESPACIO VACIO!");
            wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
            wa.setVisible(true);
        } else {

            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();
                ResultSet rs = con.consultar("Select * from paciente where cedula_paciente= '" + cedula.getText() + "'");
                if (rs.next()) {
//                    JOptionPane.showMessageDialog(null, "El paciente está repetido");
                    ErrorAlert ea = new ErrorAlert(this, true);
                    ea.titulo1.setText("¡¡PACIENTE YA REGISTRADO!!");
                    ea.titulo1.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    ea.titulo1.setForeground(new java.awt.Color(153, 153, 153));
                    ea.setVisible(true);
                } else {
                    con.actualizar("insert into paciente values('" + cedula.getText() + "','" + primernombre.getText() + "','" + primerapellido.getText()
                            + "','" + correo.getText() + "','" + edad.getText() + "','"
                            + telefono.getText() + "')");
                    
                    SuccessAlert sa = new SuccessAlert(this, true);
                    sa.titulo.setText("PACIENTE REGISTRADO!");
                    sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                    sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                    sa.setVisible(true);
                    cedula.setText("");
                    primernombre.setText("");
                    primerapellido.setText("");
                    edad.setText("");
                    telefono.setText("");
                    correo.setText("");
                }
                con.cerrar();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_agregarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        if (cedula.getText().trim().equals("") || primernombre.getText().trim().equals("") || primerapellido.getText().trim().equals("")
                || correo.getText().trim().equals("") || edad.getText().trim().equals("") || telefono.getText().trim().equals("")) {
//            JOptionPane.showMessageDialog(null, "Por favor, llene el formulario");
            WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
            wa.titulo.setText("COMPLETE EL ESPACIO VACIO!");
            wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
            wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
            wa.setVisible(true);
        } else {

            try {
                Conexion con = new Conexion();
                con.ConexionPostgres();
                String sql = ("Update paciente set primer_nombre_paciente = '" + primernombre.getText()
                        + "', apellido_nombre_paciente = '"
                        + primerapellido.getText() + "', correo_paciente = '"
                        + correo.getText() + "',edad_paciente = '" + edad.getText()
                        + "',telefono_paciente = '" + telefono.getText()
                        + "' where cedula_paciente = '" + Long.parseLong(cedula.getText()) + "'");
                con.actualizar(sql);
//                JOptionPane.showMessageDialog(null, "INFORMACION MODIFICADA!");
                SuccessAlert sa = new SuccessAlert(this, true);
                sa.titulo.setText("INFORMACIÓN MODIFICADA!");
                sa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
                sa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                sa.setVisible(true);

                cedula.setText("");
                primernombre.setText("");
                primerapellido.setText("");
                edad.setText("");
                telefono.setText("");
                correo.setText("");

                modificar.setEnabled(false);
                agregar.setEnabled(true);

                con.cerrar();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//cedula.setText("");
//                primernombre.setText("");
//                edad.setText("");
//                telefono.setText("");
//                
//                modificar.setEnabled(false);
//                cedula.setEnabled(true);
//                primernombre.setEnabled(true);
//                agregar.setEnabled(true);

    }//GEN-LAST:event_modificarActionPerformed

    private void cedulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseExited
        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cedula.setBackground(new java.awt.Color(255, 255, 255));
        cedula.setForeground(new java.awt.Color(102, 102, 102));

    }//GEN-LAST:event_cedulaMouseExited

    private void cedulaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaMouseMoved

        cedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cedula.setBackground(new java.awt.Color(245, 215, 110));
        cedula.setForeground(new java.awt.Color(159, 29, 0));
    }//GEN-LAST:event_cedulaMouseMoved

    private void primernombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primernombreMouseExited

        primernombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        primernombre.setBackground(new java.awt.Color(255, 255, 255));
        primernombre.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_primernombreMouseExited

    private void primernombreMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primernombreMouseMoved

        primernombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        primernombre.setBackground(new java.awt.Color(245, 215, 110));
        primernombre.setForeground(new java.awt.Color(159, 29, 0));
    }//GEN-LAST:event_primernombreMouseMoved

    private void edadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edadMouseExited

        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.setForeground(new java.awt.Color(102, 102, 102));
    }//GEN-LAST:event_edadMouseExited

    private void edadMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edadMouseMoved

        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        edad.setBackground(new java.awt.Color(245, 215, 110));
        edad.setForeground(new java.awt.Color(159, 29, 0));
    }//GEN-LAST:event_edadMouseMoved

    private void telefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseExited

        telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        telefono.setBackground(new java.awt.Color(255, 255, 255));
        telefono.setForeground(new java.awt.Color(102, 102, 102));

    }//GEN-LAST:event_telefonoMouseExited

    private void telefonoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefonoMouseMoved

        telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        telefono.setBackground(new java.awt.Color(245, 215, 110));
        telefono.setForeground(new java.awt.Color(159, 29, 0));
    }//GEN-LAST:event_telefonoMouseMoved

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.setState(LogIn.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        if (Character.isDigit(evt.getKeyChar()) && Character.isSpace(evt.getKeyChar()) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyTyped
        if (Character.isDigit(evt.getKeyChar()) && Character.isSpace(evt.getKeyChar()) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_edadKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        if (Character.isDigit(evt.getKeyChar()) && Character.isSpace(evt.getKeyChar()) == false) {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void primernombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primernombreKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || Character.isSpace(evt.getKeyChar())) {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_primernombreKeyTyped

    private void buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar1ActionPerformed
//        long ced = Long.parseLong(JOptionPane.showInputDialog("Digite la cédula del paciente: "));
        ErrorAlertdoctor obj = new ErrorAlertdoctor(this, true);
        obj.titulo.setText("Digite el id del area: ");
        obj.titulo.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        obj.titulo.setForeground(new java.awt.Color(153, 153, 153));
        obj.setVisible(true);

        try {

            Conexion con = new Conexion();
            con.ConexionPostgres();
            ResultSet rs = con.consultar("Select * from paciente where cedula_paciente = '" + obj.idd.getText() + "' ");
            if (rs.next()) {

                cedula.setText(rs.getString("cedula_paciente"));
                primernombre.setText(rs.getString("primer_nombre_paciente"));
                primerapellido.setText(rs.getString("apellido_nombre_paciente"));
                correo.setText(rs.getString("correo_paciente"));
                edad.setText(rs.getString("edad_paciente"));
                telefono.setText(rs.getString("telefono_paciente"));

                modificar.setEnabled(true);
                agregar.setEnabled(false);
                cedula.setEnabled(false);
            } else {
                WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
                wa.titulo.setText("¡¡PACIENTE NO ESTA REGISTRADO!!");
                wa.titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
                wa.titulo.setForeground(new java.awt.Color(153, 153, 153));
                wa.setVisible(true);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buscar1ActionPerformed

    private void primerapellidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerapellidoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_primerapellidoMouseMoved

    private void primerapellidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerapellidoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_primerapellidoMouseExited

    private void primerapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerapellidoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_primerapellidoKeyTyped

    private void correoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_correoMouseMoved

    private void correoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_correoMouseExited

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_correoKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar1;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton listar;
    private javax.swing.JButton modificar;
    private javax.swing.JTextField primerapellido;
    private javax.swing.JTextField primernombre;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
