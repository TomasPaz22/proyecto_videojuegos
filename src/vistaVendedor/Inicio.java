package vistaVendedor;

import java.awt.Color;


public class Inicio extends javax.swing.JFrame {

    int xMouse, yMouse; //variables para cada eje
    
    
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        JB_Ingresar = new javax.swing.JButton();
        JB_CrearCuenta = new javax.swing.JButton();
        JB_ActualizarDatos = new javax.swing.JButton();
        JB_EliminarCuenta = new javax.swing.JButton();
        jP_Barra = new javax.swing.JPanel();
        jP_CerrarX = new javax.swing.JPanel();
        jL_exit = new javax.swing.JLabel();
        jL_FondoMorado = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JB_Ingresar.setBackground(new java.awt.Color(255, 153, 255));
        JB_Ingresar.setFont(new java.awt.Font("Modern No. 20", 0, 24)); // NOI18N
        JB_Ingresar.setText("Ingresar");
        JB_Ingresar.setToolTipText("");
        JB_Ingresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_Ingresar.setContentAreaFilled(false);
        JB_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_IngresarActionPerformed(evt);
            }
        });
        jPanel1.add(JB_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 190, 50));

        JB_CrearCuenta.setBackground(new java.awt.Color(255, 153, 255));
        JB_CrearCuenta.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        JB_CrearCuenta.setText("Crear");
        JB_CrearCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_CrearCuenta.setContentAreaFilled(false);
        JB_CrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_CrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_CrearCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(JB_CrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, 50));

        JB_ActualizarDatos.setBackground(new java.awt.Color(255, 153, 255));
        JB_ActualizarDatos.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        JB_ActualizarDatos.setText("Actualizar");
        JB_ActualizarDatos.setActionCommand("");
        JB_ActualizarDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_ActualizarDatos.setContentAreaFilled(false);
        JB_ActualizarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_ActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_ActualizarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(JB_ActualizarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 190, 50));

        JB_EliminarCuenta.setBackground(new java.awt.Color(255, 153, 255));
        JB_EliminarCuenta.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        JB_EliminarCuenta.setText("Eliminar222");
        JB_EliminarCuenta.setActionCommand("");
        JB_EliminarCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_EliminarCuenta.setContentAreaFilled(false);
        JB_EliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_EliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EliminarCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(JB_EliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 190, 50));

        jP_Barra.setBackground(new java.awt.Color(204, 204, 204));
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

        javax.swing.GroupLayout jP_BarraLayout = new javax.swing.GroupLayout(jP_Barra);
        jP_Barra.setLayout(jP_BarraLayout);
        jP_BarraLayout.setHorizontalGroup(
            jP_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BarraLayout.createSequentialGroup()
                .addComponent(jP_CerrarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(776, Short.MAX_VALUE))
        );
        jP_BarraLayout.setVerticalGroup(
            jP_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_CerrarX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jP_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        jL_FondoMorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inci.jpg"))); // NOI18N
        jL_FondoMorado.setText("jLabel1");
        jPanel1.add(jL_FondoMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 70, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_IngresarActionPerformed
        Ingresar newframe = new Ingresar();
        newframe.setVisible(true);
        this.dispose();
        newframe.setLocationRelativeTo(null);
    }//GEN-LAST:event_JB_IngresarActionPerformed

    private void JB_CrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_CrearCuentaActionPerformed
        CrearCuenta newframe= new CrearCuenta();
        newframe.setVisible(true);
        this.dispose();
        newframe.setLocationRelativeTo(null);
    }//GEN-LAST:event_JB_CrearCuentaActionPerformed

    private void JB_ActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_ActualizarDatosActionPerformed
        ActualizarDatos newframe=new ActualizarDatos();
        newframe.setVisible(true);
        this.dispose();
        newframe.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_JB_ActualizarDatosActionPerformed

    private void JB_EliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EliminarCuentaActionPerformed
        Eliminar newframe = new Eliminar();
        newframe.setVisible(true);
        this.dispose();
        newframe.setLocationRelativeTo(null);
    }//GEN-LAST:event_JB_EliminarCuentaActionPerformed

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
        //ME EQUIVOQUÉ
    }//GEN-LAST:event_jP_CerrarXMouseEntered

    private void jP_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y- yMouse);
    }//GEN-LAST:event_jP_BarraMouseDragged

    private void jP_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jP_BarraMousePressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_ActualizarDatos;
    private javax.swing.JButton JB_CrearCuenta;
    private javax.swing.JButton JB_EliminarCuenta;
    private javax.swing.JButton JB_Ingresar;
    private javax.swing.JLabel jL_FondoMorado;
    private javax.swing.JLabel jL_exit;
    private javax.swing.JPanel jP_Barra;
    private javax.swing.JPanel jP_CerrarX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
