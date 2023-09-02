/* Paquete de Clase */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Importaciones */
// Clases o Paquetes
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;

// Librerias
import java.sql.*;
import javax.swing.*;

/* Clase Panel Usuarios Administrador */
public class Panel_Administrador_Cajeros extends javax.swing.JFrame {

    // Inicializador
    public Panel_Administrador_Cajeros() {
        initComponents();
        configurarVentana();
    }

    // Componentes Graficos
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jLabel_Tipo = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Usuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel_NuevaPassword = new javax.swing.JLabel();
        jPasswordField_Nueva = new javax.swing.JPasswordField();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_Volver = new javax.swing.JPanel();
        jButton_Volver = new javax.swing.JButton();
        jPanel_CajaBotones = new javax.swing.JPanel();
        jButton_Limpiar = new javax.swing.JButton();
        jButton_Agregar = new javax.swing.JButton();
        jButton_Borrar = new javax.swing.JButton();
        jButton_ActualizarPassword = new javax.swing.JButton();
        jButton_ActualizarTipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CajaGeneral.setBackground(new java.awt.Color(222, 242, 243));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/fondo.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(225, 243, 255));

        jLabel_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Nombre.setText("Nombre:");

        jLabel_Usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Usuario.setText("Usuario:");

        jLabel_Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Password.setText("Contraseña:");

        jLabel_Tipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Tipo.setText("Tipo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));

        jLabel_NuevaPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_NuevaPassword.setText("Nueva Contraseña:");

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Cliente-removebg-preview.png"))); // NOI18N
        jLabel_Titulo.setText("Manejo de Usuarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_NuevaPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Nombre)
                            .addComponent(jLabel_Usuario)
                            .addComponent(jLabel_Tipo)
                            .addComponent(jLabel_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Nombre)
                            .addComponent(jTextField_Usuario)
                            .addComponent(jPasswordField)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField_Nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Usuario)
                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_NuevaPassword)
                    .addComponent(jPasswordField_Nueva, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Tipo))
                .addGap(59, 59, 59))
        );

        jPanel_Volver.setBackground(new java.awt.Color(222, 242, 243));

        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Regresar-removebg-preview.png"))); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_VolverLayout = new javax.swing.GroupLayout(jPanel_Volver);
        jPanel_Volver.setLayout(jPanel_VolverLayout);
        jPanel_VolverLayout.setHorizontalGroup(
            jPanel_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel_VolverLayout.setVerticalGroup(
            jPanel_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_VolverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_CajaBotones.setBackground(new java.awt.Color(222, 242, 243));

        jButton_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/limpiar-removebg-preview.png"))); // NOI18N
        jButton_Limpiar.setText("Limpiar Pantalla");
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });

        jButton_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Guardar-removebg-preview.png"))); // NOI18N
        jButton_Agregar.setText("Agregar Usuario");
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });

        jButton_Borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Eliminar-removebg-preview.png"))); // NOI18N
        jButton_Borrar.setText("Borrar Usuario");
        jButton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrarActionPerformed(evt);
            }
        });

        jButton_ActualizarPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/conf-removebg-preview.png"))); // NOI18N
        jButton_ActualizarPassword.setText("Actualizar Contraseña \nUsuario");
        jButton_ActualizarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarPasswordActionPerformed(evt);
            }
        });

        jButton_ActualizarTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Actualizar-removebg-preview.png"))); // NOI18N
        jButton_ActualizarTipo.setText("Actualizar Tipo Usuario");
        jButton_ActualizarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CajaBotonesLayout = new javax.swing.GroupLayout(jPanel_CajaBotones);
        jPanel_CajaBotones.setLayout(jPanel_CajaBotonesLayout);
        jPanel_CajaBotonesLayout.setHorizontalGroup(
            jPanel_CajaBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CajaBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ActualizarPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_ActualizarTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_CajaBotonesLayout.setVerticalGroup(
            jPanel_CajaBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaBotonesLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jButton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_ActualizarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_ActualizarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jPanel_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel_CajaBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jPanel_CajaBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Botones */
    // Boton Regresar
    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        regresarPantalla(new Panel_Administrador_Opciones());
    }//GEN-LAST:event_jButton_VolverActionPerformed

    // Boton Actualizar Tipo
    private void jButton_ActualizarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarTipoActionPerformed
        actualizarTipo();
    }//GEN-LAST:event_jButton_ActualizarTipoActionPerformed

    // Boton Actualizar Constraseña
    private void jButton_ActualizarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarPasswordActionPerformed
        actualizarPassword();
    }//GEN-LAST:event_jButton_ActualizarPasswordActionPerformed

    // Boton Borrar
    private void jButton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrarActionPerformed

        // Variables
        String usuario = jTextField_Usuario.getText();
        char[] passwordChars = jPasswordField.getPassword();

        // Logica
        if (!usuario.isEmpty() && passwordChars.length > 0)
        {
            String contraseña = new String(passwordChars);
            borrarUsuario(usuario, contraseña);
        } else
        {
            JOptionPane.showMessageDialog(this, "Ingresa el usuario y la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarPantalla();
    }//GEN-LAST:event_jButton_BorrarActionPerformed

    // Boton Agregar
    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed

        // Variables
        String nombre = jTextField_Nombre.getText();
        String usuario = jTextField_Usuario.getText();
        String contraseña = new String(jPasswordField.getPassword());
        String tipo = (String) jComboBox1.getSelectedItem();

        // Logica
        agregarUsuario(nombre, usuario, contraseña, tipo);
    }//GEN-LAST:event_jButton_AgregarActionPerformed

    // Boton Limpiar
    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        limpiarPantalla();
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    /* Funciones */
    // Actualizar Tipo
    private void actualizarTipo() {

        // Variables
        String usuario = jTextField_Usuario.getText();
        String nuevoTipo = (String) jComboBox1.getSelectedItem();

        // Query
        String QUERY_UPDATE_TIPO = "UPDATE Usuarios SET tipo = ? WHERE usuario = ?";

        // Logica
        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement pstmt = conn.prepareStatement(QUERY_UPDATE_TIPO))
        {

            pstmt.setString(1, nuevoTipo);
            pstmt.setString(2, usuario);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0)
            {
                JOptionPane.showMessageDialog(this, "Tipo de usuario actualizado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(this, "No se encontró el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
            limpiarPantalla();
        } catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }

    // Actualizar Contraseña
    private void actualizarPassword() {

        // Variables
        String usuario = jTextField_Usuario.getText();
        String nuevaContraseña = new String(jPasswordField_Nueva.getPassword());

        if (!nuevaContraseña.isEmpty())
        {
            // Query
            String QUERY_UPDATE_CONTRASEÑA = "UPDATE Usuarios SET contraseña = ? WHERE usuario = ?";

            // Logica
            try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement cone = conn.prepareStatement(QUERY_UPDATE_CONTRASEÑA))
            {
                cone.setString(1, nuevaContraseña);
                cone.setString(2, usuario);

                int rowsAffected = cone.executeUpdate();
                if (rowsAffected > 0)
                {
                    JOptionPane.showMessageDialog(this, "Contraseña actualizada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else
                {
                    JOptionPane.showMessageDialog(this, "No se encontró el usuario", "Error", JOptionPane.ERROR_MESSAGE);
                }
                limpiarPantalla();
            } catch (SQLException ex)
            {
                throw new RuntimeException(ex);
            }
        } else
        {
            JOptionPane.showMessageDialog(this, "Complete la nueva contraseña", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Verificar Contraseña
    private boolean verificarPassword(String usuario, String password) {

        // Query
        String QUERY_VERIFICAR_CONTRASEÑA = "SELECT COUNT(*) FROM Usuarios WHERE usuario = ? AND contraseña = ?";

        // Logica
        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement cone = conn.prepareStatement(QUERY_VERIFICAR_CONTRASEÑA))
        {
            cone.setString(1, usuario);
            cone.setString(2, password);

            try (ResultSet rs = cone.executeQuery())
            {
                return rs.next() && rs.getInt(1) > 0;
            }
        } catch (SQLException x)
        {
            throw new RuntimeException(x);
        }
    }

    // Ventas Asociadas
    private boolean ventasAsociadas(int idUsuario) {

        // Query
        String QUERY_VERIFICAR_VENTAS = "SELECT COUNT(*) FROM ventas WHERE id_cajero = ?";

        // Logica
        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement cone = conn.prepareStatement(QUERY_VERIFICAR_VENTAS))
        {
            cone.setInt(1, idUsuario);
            try (ResultSet rs = cone.executeQuery())
            {
                return rs.next() && rs.getInt(1) > 0;
            }
        } catch (SQLException x)
        {
            throw new RuntimeException(x);
        }
    }

    // Borrar Transacciones y Ventas Asociadas
    private void borrarAsociados(int idUsuario) {

        // Query
        String DELETE_DETALLES = "DELETE FROM detallestransaccion WHERE id_transaccion IN (SELECT id FROM Transacciones WHERE id_cajero = ?)";
        String DELETE_TRANSACCIONES = "DELETE FROM Transacciones WHERE id_cajero = ?";
        String DELETE_VENTAS = "DELETE FROM ventas WHERE id_cajero = ?";
        String DELETE_USUARIO = "DELETE FROM Usuarios WHERE id = ?";

        // Logica
        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement coneDetalles = conn.prepareStatement(DELETE_DETALLES); PreparedStatement coneTransacciones = conn.prepareStatement(DELETE_TRANSACCIONES); PreparedStatement pstmtVentas = conn.prepareStatement(DELETE_VENTAS); PreparedStatement pstmtUsuario = conn.prepareStatement(DELETE_USUARIO))
        {

            conn.setAutoCommit(false);

            coneDetalles.setInt(1, idUsuario);
            coneDetalles.executeUpdate();

            coneTransacciones.setInt(1, idUsuario);
            coneTransacciones.executeUpdate();

            pstmtVentas.setInt(1, idUsuario);
            pstmtVentas.executeUpdate();

            pstmtUsuario.setInt(1, idUsuario);
            pstmtUsuario.executeUpdate();

            conn.commit();

            JOptionPane.showMessageDialog(this, "Usuario Borrado", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException x)
        {
            throw new RuntimeException(x);
        }
    }

    // Borrar Usuario
    private void borrarUsuario(String usuario, String password) {

        // Variables
        int idUsuario = buscarUsuario(usuario);

        // Logica
        if (idUsuario != -1 && verificarPassword(usuario, password))
        {
            if (ventasAsociadas(idUsuario))
            {
                int respuesta = JOptionPane.showConfirmDialog(this,
                        "No se puede borrar el Usuario ya que tiene Ventas Asociadas. ¿Quieres borrar las Ventas Asociadas?",
                        "Ventas Asociadas",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);

                if (respuesta == JOptionPane.YES_OPTION)
                {
                    borrarAsociados(idUsuario);
                    limpiarPantalla();
                }
            } else
            {
                borrarAsociados(idUsuario);
                limpiarPantalla();
            }
        } else
        {
            JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Agregar Usuarios
    private void agregarUsuario(String nombre, String usuario, String password, String tipo) {

        // Evitar usuarios vacios
        if (nombre.isEmpty() || usuario.isEmpty() || password.isEmpty() || tipo.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Query
        String QUERY_INSERT_CAJERO = "INSERT INTO Usuarios (nombre, usuario, contraseña, tipo) VALUES (?, ?, ?, ?)";

        // Logica
        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement cone = conn.prepareStatement(QUERY_INSERT_CAJERO))
        {
            // Variables Insertadas
            cone.setString(1, nombre);
            cone.setString(2, usuario);
            cone.setString(3, password);
            cone.setString(4, tipo);

            int rowsAffected = cone.executeUpdate();

            // Logica
            if (rowsAffected > 0)
            {
                JOptionPane.showMessageDialog(this, "Usuario agregado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(this, "Error al ingresar, este usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
            }

            limpiarPantalla();

        } catch (SQLIntegrityConstraintViolationException duplicateKeyException)
        {
            JOptionPane.showMessageDialog(this, "Error al ingresar, este usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }

    // Buscar Usuario
    private int buscarUsuario(String textoUsuario) {

        // Query
        String QUERY_OBTENER_ID = "SELECT id FROM Usuarios WHERE usuario = ?";

        // Logica
        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement cone = conn.prepareStatement(QUERY_OBTENER_ID))
        {
            cone.setString(1, textoUsuario);
            try (ResultSet rs = cone.executeQuery())
            {
                if (rs.next())
                {
                    return rs.getInt("id");
                }
            }
        } catch (SQLException x)
        {
            throw new RuntimeException(x);
        }
        return -1;
    }

    /* Pantallas */
    // Configurar las pantallas
    private void configurarVentana() {

        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);

        // Evitar que la ventana pueda ser redimensionada
        setResizable(false);
    }

    // Regresar Pantalla
    private void regresarPantalla(javax.swing.JFrame nuevaPantalla) {
        dispose();
        nuevaPantalla.setVisible(true);
    }

    // Limpiar Pantalla
    private void limpiarPantalla() {
        jTextField_Nombre.setText("");
        jTextField_Usuario.setText("");
        jPasswordField.setText("");
        jPasswordField_Nueva.setText("");
        jComboBox1.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ActualizarPassword;
    private javax.swing.JButton jButton_ActualizarTipo;
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Borrar;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_NuevaPassword;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_CajaBotones;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_Volver;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField_Nueva;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
