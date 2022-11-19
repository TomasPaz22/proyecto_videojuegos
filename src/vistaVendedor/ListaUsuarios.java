
package vistaVendedor;

import Conexion.Conexion;
import java.sql.*;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaUsuarios extends javax.swing.JFrame {
    Conexion enlace = new Conexion();
    Connection conect = enlace.getConexion();
   
    public ListaUsuarios() {
        initComponents();
        mostarUsuarios();
    }
    
    public void ActualizarDatos(){//NO FUNCIONA, ARREGLAR
    
        int fila = TB_usuarios.getSelectedRow();
        
        int id = Integer.parseInt(this.TB_usuarios.getValueAt(fila, 0).toString());
        String corr= TB_usuarios.getValueAt(fila, 1).toString();
        String nom= TB_usuarios.getValueAt(fila, 2).toString();
        String pass= TB_usuarios.getValueAt(fila, 3).toString();
        
        try {
            PreparedStatement actu = conect.prepareStatement("UPDATE usuario SET correo='"+corr+"',nombre='"+nom+"',contrasena='"+pass+"' WHERE id = '"+id+"'");
            actu.executeUpdate();   
            mostarUsuarios();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e+"No se logro actualizar datos");
                    
                    
        }
        
        
    
    }
    public void EliminarUsuario(){
        
        int fila = TB_usuarios.getSelectedRow();
        String valor = TB_usuarios.getValueAt(fila, 0).toString();
        
        try {
            PreparedStatement elimi = conect.prepareStatement("DELETE FROM USUARIO WHERE id='"+valor+"'");
            elimi.executeUpdate();
            mostarUsuarios();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "No se logro actualizar los datos");
        }
    
    
    }
    public void actualizarDatos(){
        
        
    }
    public void mostarUsuarios(){
        DefaultTableModel tusuario = new DefaultTableModel();
        tusuario.addColumn("ID");
        tusuario.addColumn("CORREO");
        tusuario.addColumn("NOMBRE");
        tusuario.addColumn("CONTRASEÑA");
        TB_usuarios.setModel(tusuario);
       
                
        String []datos = new String [4];
        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM USUARIO");
            
            while(resultado.next()){
                datos[0]=resultado.getString(1);
                datos[1]=resultado.getString(2);
                datos[2]=resultado.getString(3);
                datos[3]=resultado.getString(4);
                tusuario.addRow(datos);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }
    // </editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_lista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_usuarios = new javax.swing.JTable();
        JB_volverLista = new javax.swing.JButton();
        JB_EliminarUsuario = new javax.swing.JButton();
        JB_Actializar_datos_listas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TB_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TB_usuarios.setToolTipText("ss");
        jScrollPane1.setViewportView(TB_usuarios);

        JB_volverLista.setBackground(new java.awt.Color(255, 153, 255));
        JB_volverLista.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        JB_volverLista.setText("Volver");
        JB_volverLista.setActionCommand("");
        JB_volverLista.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_volverLista.setContentAreaFilled(false);
        JB_volverLista.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_volverLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_volverListaActionPerformed(evt);
            }
        });

        JB_EliminarUsuario.setBackground(new java.awt.Color(255, 153, 255));
        JB_EliminarUsuario.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        JB_EliminarUsuario.setText("Eliminar Usuario");
        JB_EliminarUsuario.setActionCommand("");
        JB_EliminarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_EliminarUsuario.setContentAreaFilled(false);
        JB_EliminarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EliminarUsuarioActionPerformed(evt);
            }
        });

        JB_Actializar_datos_listas.setBackground(new java.awt.Color(255, 153, 255));
        JB_Actializar_datos_listas.setFont(new java.awt.Font("Calisto MT", 0, 24)); // NOI18N
        JB_Actializar_datos_listas.setText("Actualizar Datos");
        JB_Actializar_datos_listas.setActionCommand("");
        JB_Actializar_datos_listas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_Actializar_datos_listas.setContentAreaFilled(false);
        JB_Actializar_datos_listas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_Actializar_datos_listas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_Actializar_datos_listasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_listaLayout = new javax.swing.GroupLayout(JP_lista);
        JP_lista.setLayout(JP_listaLayout);
        JP_listaLayout.setHorizontalGroup(
            JP_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_listaLayout.createSequentialGroup()
                        .addGroup(JP_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_EliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_Actializar_datos_listas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                    .addGroup(JP_listaLayout.createSequentialGroup()
                        .addComponent(JB_volverLista, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JP_listaLayout.setVerticalGroup(
            JP_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_listaLayout.createSequentialGroup()
                        .addComponent(JB_EliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(JB_Actializar_datos_listas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_volverLista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_lista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JP_lista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_volverListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_volverListaActionPerformed
        ActualizarDatos newframe=new ActualizarDatos();
        newframe.setVisible(true);
        this.dispose();
        newframe.setLocationRelativeTo(null);

    }//GEN-LAST:event_JB_volverListaActionPerformed

    private void JB_EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EliminarUsuarioActionPerformed
        EliminarUsuario();
    }//GEN-LAST:event_JB_EliminarUsuarioActionPerformed

    private void JB_Actializar_datos_listasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_Actializar_datos_listasActionPerformed
        //mostarUsuarios();
        ActualizarDatos();
    }//GEN-LAST:event_JB_Actializar_datos_listasActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_Actializar_datos_listas;
    private javax.swing.JButton JB_EliminarUsuario;
    private javax.swing.JButton JB_volverLista;
    private javax.swing.JPanel JP_lista;
    private javax.swing.JTable TB_usuarios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
