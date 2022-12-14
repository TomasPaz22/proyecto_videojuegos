package vistaVendedor;

import controlador.UsuarioController;
import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class CrearCuenta extends javax.swing.JFrame {

    int xMouse, yMouse; //variables para cada eje
    
    public CrearCuenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_UsuarioTexto = new javax.swing.JLabel();
        jL_UsuarioTexto1 = new javax.swing.JLabel();
        jL_UsuarioTexto2 = new javax.swing.JLabel();
        jL_UsuarioTexto3 = new javax.swing.JLabel();
        jL_UsuarioTexto4 = new javax.swing.JLabel();
        jP_Barra = new javax.swing.JPanel();
        jP_CerrarX = new javax.swing.JPanel();
        jL_exit = new javax.swing.JLabel();
        jB_Regresar = new javax.swing.JButton();
        jL_FondoMorado = new javax.swing.JLabel();
        jB_Crear = new javax.swing.JButton();
        jT_Correo = new javax.swing.JTextField();
        jPass_Contrasena = new javax.swing.JPasswordField();
        jPass_ConfirmarContrasena = new javax.swing.JPasswordField();
        jT_Usuario1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_UsuarioTexto.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jPanel1.add(jL_UsuarioTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jL_UsuarioTexto1.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jL_UsuarioTexto1.setText("CORREO");
        jPanel1.add(jL_UsuarioTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jL_UsuarioTexto2.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jL_UsuarioTexto2.setText("CONFIRMAR CONTRASE??A");
        jPanel1.add(jL_UsuarioTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jL_UsuarioTexto3.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jL_UsuarioTexto3.setText("USUARIO");
        jPanel1.add(jL_UsuarioTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jL_UsuarioTexto4.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        jL_UsuarioTexto4.setText("CONTRASE??A");
        jPanel1.add(jL_UsuarioTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jP_Barra.setBackground(new java.awt.Color(204, 204, 204));
        jP_Barra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jP_Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jP_BarraMouseDragged(evt);
            }
        });
        jP_Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jP_BarraMousePressed(evt);
            }
        });

        jP_CerrarX.setBackground(new java.awt.Color(255, 0, 153));
        jP_CerrarX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jP_CerrarXMouseEntered(evt);
            }
        });

        jL_exit.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jL_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_exit.setText("X");
        jL_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jL_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jL_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jL_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jL_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jL_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jP_CerrarXLayout = new javax.swing.GroupLayout(jP_CerrarX);
        jP_CerrarX.setLayout(jP_CerrarXLayout);
        jP_CerrarXLayout.setHorizontalGroup(
            jP_CerrarXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );
        jP_CerrarXLayout.setVerticalGroup(
            jP_CerrarXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jB_Regresar.setBackground(new java.awt.Color(255, 153, 255));
        jB_Regresar.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jB_Regresar.setText("Volver");
        jB_Regresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jB_Regresar.setContentAreaFilled(false);
        jB_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_BarraLayout = new javax.swing.GroupLayout(jP_Barra);
        jP_Barra.setLayout(jP_BarraLayout);
        jP_BarraLayout.setHorizontalGroup(
            jP_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BarraLayout.createSequentialGroup()
                .addComponent(jP_CerrarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 706, Short.MAX_VALUE)
                .addComponent(jB_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jP_BarraLayout.setVerticalGroup(
            jP_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_CerrarX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jB_Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jP_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        jL_FondoMorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inci.jpg"))); // NOI18N
        jL_FondoMorado.setText("jLabel1");
        jL_FondoMorado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jL_FondoMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 70, 510));

        jB_Crear.setBackground(new java.awt.Color(255, 153, 255));
        jB_Crear.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jB_Crear.setText("Crear");
        jB_Crear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jB_Crear.setContentAreaFilled(false);
        jB_Crear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_CrearMouseClicked(evt);
            }
        });
        jB_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_CrearActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, 40));

        jT_Correo.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jT_Correo.setForeground(new java.awt.Color(204, 204, 204));
        jT_Correo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_Correo.setText("Ingrese su correo");
        jT_Correo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jT_Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jT_CorreoMousePressed(evt);
            }
        });
        jT_Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_CorreoActionPerformed(evt);
            }
        });
        jPanel1.add(jT_Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 250, 50));

        jPass_Contrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPass_Contrasena.setForeground(new java.awt.Color(204, 204, 204));
        jPass_Contrasena.setText("********");
        jPass_Contrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPass_Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPass_ContrasenaMousePressed(evt);
            }
        });
        jPass_Contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPass_ContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(jPass_Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 250, 50));

        jPass_ConfirmarContrasena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPass_ConfirmarContrasena.setForeground(new java.awt.Color(204, 204, 204));
        jPass_ConfirmarContrasena.setText("********");
        jPass_ConfirmarContrasena.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPass_ConfirmarContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPass_ConfirmarContrasenaMousePressed(evt);
            }
        });
        jPass_ConfirmarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPass_ConfirmarContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(jPass_ConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 250, 50));

        jT_Usuario1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jT_Usuario1.setForeground(new java.awt.Color(204, 204, 204));
        jT_Usuario1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jT_Usuario1.setText("Ingrese su usuario");
        jT_Usuario1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jT_Usuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jT_Usuario1MousePressed(evt);
            }
        });
        jT_Usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Usuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(jT_Usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jL_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jL_exitMouseClicked

    private void jL_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseEntered
        jP_CerrarX.setBackground(Color.red);
    }//GEN-LAST:event_jL_exitMouseEntered

    private void jL_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jL_exitMouseExited
        jP_CerrarX.setBackground(new Color(255,0,153));
    }//GEN-LAST:event_jL_exitMouseExited

    private void jP_CerrarXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_CerrarXMouseEntered
        //ME EQUIVOQU??
    }//GEN-LAST:event_jP_CerrarXMouseEntered

    private void jB_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_RegresarActionPerformed
        Inicio newframe = new Inicio();
        newframe.setVisible(true);
        this.dispose();
        newframe.setLocationRelativeTo(null);
    }//GEN-LAST:event_jB_RegresarActionPerformed

    private void jP_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y- yMouse);
    }//GEN-LAST:event_jP_BarraMouseDragged

    private void jP_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jP_BarraMousePressed

    private void jB_CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_CrearMouseClicked

    }//GEN-LAST:event_jB_CrearMouseClicked

    private void jB_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_CrearActionPerformed
        
        String correo, nombre, contrasena, confirmarContrasena;
        correo = jT_Correo.getText();
        nombre = jT_Usuario1.getText();
        contrasena = jPass_Contrasena.getText();
        confirmarContrasena = jPass_ConfirmarContrasena.getText();
        if(confirmarContrasena.equals(contrasena)){

            
            Usuario u = new Usuario(0,correo,nombre,confirmarContrasena);
            UsuarioController Uc = new UsuarioController();
            
             try {
            if(Uc.create(u)){
                JOptionPane.showMessageDialog(this, "Usuario creado correctamente",
                "Mensajes", JOptionPane.INFORMATION_MESSAGE);
                javax.swing.JOptionPane.showMessageDialog(this,"Usuario creado como...\n Usuario: "+ jT_Usuario1.getText()+ "\n Correo: "  + jT_Correo.getText() + "\n Contrase??a: "+ String.valueOf(jPass_Contrasena.getPassword()),"Login", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Usuario no creado",
                        "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        }
        else{
            JOptionPane.showMessageDialog(this, "Contrasena no coinciden");
        }

        
    }//GEN-LAST:event_jB_CrearActionPerformed

    private void jT_CorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_CorreoMousePressed
        if (jT_Correo.getText().equals("Ingrese su correo")){
            jT_Correo.setText("");
            jT_Correo.setForeground(Color.black);
        }
        if(String.valueOf(jPass_Contrasena.getPassword()).isEmpty()){
            jPass_Contrasena.setText("********");
            jPass_Contrasena.setForeground(new Color(204,204,204));
        }
        if(jT_Usuario1.getText().isEmpty()){
            jT_Usuario1.setText("Ingrese su usuario");
            jT_Usuario1.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(jPass_ConfirmarContrasena.getPassword()).isEmpty()){
            jPass_ConfirmarContrasena.setText("********");
            jPass_ConfirmarContrasena.setForeground(new Color(204,204,204));
        }

    }//GEN-LAST:event_jT_CorreoMousePressed

    private void jT_CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_CorreoActionPerformed

    private void jPass_ContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPass_ContrasenaMousePressed
        if(String.valueOf(jPass_Contrasena.getPassword()).equals("********")){
            jPass_Contrasena.setText("");
            jPass_Contrasena.setForeground(Color.black);
        }
        if(jT_Correo.getText().isEmpty()){
            jT_Correo.setText("Ingrese su correo");
            jT_Correo.setForeground(new Color(204,204,204));
        }
        if(jT_Usuario1.getText().isEmpty()){
            jT_Usuario1.setText("Ingrese su usuario");
            jT_Usuario1.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(jPass_ConfirmarContrasena.getPassword()).isEmpty()){
            jPass_ConfirmarContrasena.setText("********");
            jPass_ConfirmarContrasena.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_jPass_ContrasenaMousePressed

    private void jPass_ConfirmarContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPass_ConfirmarContrasenaMousePressed
        if(String.valueOf(jPass_ConfirmarContrasena.getPassword()).equals("********")){
            jPass_ConfirmarContrasena.setText("");
            jPass_ConfirmarContrasena.setForeground(Color.black);
        }
        if(jT_Usuario1.getText().isEmpty()){
            jT_Usuario1.setText("Ingrese su usuario");
            jT_Usuario1.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(jPass_Contrasena.getPassword()).isEmpty()){
            jPass_Contrasena.setText("********");
            jPass_Contrasena.setForeground(new Color(204,204,204));
        }
        if(jT_Correo.getText().isEmpty()){
            jT_Correo.setText("Ingrese su correo");
            jT_Correo.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_jPass_ConfirmarContrasenaMousePressed

    private void jT_Usuario1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jT_Usuario1MousePressed
        if (jT_Usuario1.getText().equals("Ingrese su usuario")){
            jT_Usuario1.setText("");
            jT_Usuario1.setForeground(Color.black);
        }
        if(String.valueOf(jPass_ConfirmarContrasena.getPassword()).isEmpty()){
            jPass_ConfirmarContrasena.setText("********");
            jPass_ConfirmarContrasena.setForeground(new Color(204,204,204));
        }
        if(jT_Correo.getText().isEmpty()){
            jT_Correo.setText("Ingrese su correo");
            jT_Correo.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(jPass_Contrasena.getPassword()).isEmpty()){
            jPass_Contrasena.setText("********");
            jPass_Contrasena.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_jT_Usuario1MousePressed

    private void jT_Usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Usuario1ActionPerformed

    private void jPass_ContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPass_ContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPass_ContrasenaActionPerformed

    private void jPass_ConfirmarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPass_ConfirmarContrasenaActionPerformed
        
            
        
    }//GEN-LAST:event_jPass_ConfirmarContrasenaActionPerformed

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
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Crear;
    private javax.swing.JButton jB_Regresar;
    private javax.swing.JLabel jL_FondoMorado;
    private javax.swing.JLabel jL_UsuarioTexto;
    private javax.swing.JLabel jL_UsuarioTexto1;
    private javax.swing.JLabel jL_UsuarioTexto2;
    private javax.swing.JLabel jL_UsuarioTexto3;
    private javax.swing.JLabel jL_UsuarioTexto4;
    private javax.swing.JLabel jL_exit;
    private javax.swing.JPanel jP_Barra;
    private javax.swing.JPanel jP_CerrarX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass_ConfirmarContrasena;
    private javax.swing.JPasswordField jPass_Contrasena;
    private javax.swing.JTextField jT_Correo;
    private javax.swing.JTextField jT_Usuario1;
    // End of variables declaration//GEN-END:variables
}
