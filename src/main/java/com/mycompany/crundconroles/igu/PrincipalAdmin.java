package com.mycompany.crundconroles.igu;

import com.mycompany.crundconroles.logica.Controladora;
import com.mycompany.crundconroles.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalAdmin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PrincipalAdmin.class.getName());

    Usuario usr;
   Controladora control;
    public PrincipalAdmin(Controladora control, Usuario usr) {
        initComponents();
         this.control = control;
        this.usr=usr;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAdmin = new javax.swing.JTable();
        txtNombreUser = new javax.swing.JTextField();
        btnCraerNuevoUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnBorrarUsuario = new javax.swing.JButton();
        btnRecargarTabla = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Perfil Administrador");

        TablaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaAdmin);

        txtNombreUser.setEditable(false);
        txtNombreUser.setText("jTextField1");
        txtNombreUser.setBorder(null);

        btnCraerNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCraerNuevoUsuario.setText("Crear Nuevo Usuario");
        btnCraerNuevoUsuario.addActionListener(this::btnCraerNuevoUsuarioActionPerformed);

        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.addActionListener(this::btnEditarUsuarioActionPerformed);

        btnBorrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBorrarUsuario.setText("Borrar Usuario");
        btnBorrarUsuario.addActionListener(this::btnBorrarUsuarioActionPerformed);

        btnRecargarTabla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRecargarTabla.setText("Recargar  Tabla");
        btnRecargarTabla.addActionListener(this::btnRecargarTablaActionPerformed);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCraerNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(btnBorrarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRecargarTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(txtNombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnCraerNuevoUsuario)
                        .addGap(35, 35, 35)
                        .addComponent(btnEditarUsuario)
                        .addGap(28, 28, 28)
                        .addComponent(btnBorrarUsuario)
                        .addGap(33, 33, 33)
                        .addComponent(btnRecargarTabla)
                        .addGap(47, 47, 47)
                        .addComponent(btnSalir)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCraerNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCraerNuevoUsuarioActionPerformed
        AltaUsuario altaUsu = new AltaUsuario(control);
        altaUsu.setVisible(true);
        altaUsu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCraerNuevoUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        // Validar que la tabla tenga elementos
        if (TablaAdmin.getRowCount() > 0) {
            //Controlar que se haya seleccioando un elemento
            if (TablaAdmin.getSelectedRow() != -1) {

                // Obteniendo la ID del elemento a eliminar
                int id_usuario = Integer.parseInt(
                    String.valueOf(
                        TablaAdmin.getValueAt(TablaAdmin.getSelectedRow(), 0)
                    )
                );
                //llama ala ventana de edicion
                Edicion pantallaEdic = new Edicion(control,id_usuario);
                pantallaEdic.setVisible(true);
                pantallaEdic.setLocationRelativeTo(null);

            } else {
                mostrarMensajes("No selecciono ningun usuario", "Error", "error al borrar");

            }
        } else {
            mostrarMensajes("La tabla esta vacia", "Error", "Error al borrar");

        }

    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarUsuarioActionPerformed

        // Validar que la tabla tenga elementos
        if (TablaAdmin.getRowCount() > 0){
            //Controlar que se haya seleccioando un elemento
            if(TablaAdmin.getSelectedRow()!=-1){

                // Obteniendo la ID del elemento a eliminar
                int id_usuario = Integer.parseInt(
                    String.valueOf(
                        TablaAdmin.getValueAt(TablaAdmin.getSelectedRow(), 0)
                    )
                );
                //llama al metodo borrar
                control.borrarUsuario(id_usuario);
                //avisar al usuario que se borro el usuario
                mostrarMensajes("se borro el usuario correctamente", "Info", "Eliminacion correcta");
                cargarTabla();
            }
            else{
                mostrarMensajes("No selecciono ningun usuario", "Error", "error al borrar");

            }
        }
        else{
            mostrarMensajes("La tabla esta vacia", "Error", "Error al borrar");

        }
    }//GEN-LAST:event_btnBorrarUsuarioActionPerformed
 public void mostrarMensajes(String mensaje, String tipo, String titulo){
         
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);

        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    private void btnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarTablaActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnRecargarTablaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
this.txtNombreUser.setText(usr.getNombreUsuario());
cargarTabla();
    }                                 
    private void cargarTabla() {
        //definir el modelo de tabla que nosotros queramos
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //que fila y columna bo sena editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //establecer los nombres de las columnas
        String titulos[] = {"Id", "Usuario", "Rol"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //traer de la BD la lista de usuarios
        List<Usuario> listaUsuarios = control.traerUsuarios();

        if (listaUsuarios != null) {
            for (Usuario usu : listaUsuarios) {
                Object[] objeto = {usu.getId(), usu.getNombreUsuario(), usu.getUnRol().getNombreRol()};
                modeloTabla.addRow(objeto);
            }
        }

        TablaAdmin.setModel(modeloTabla);

    }//GEN-LAST:event_formWindowOpened

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAdmin;
    private javax.swing.JButton btnBorrarUsuario;
    private javax.swing.JButton btnCraerNuevoUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnRecargarTabla;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNombreUser;
    // End of variables declaration//GEN-END:variables
}
