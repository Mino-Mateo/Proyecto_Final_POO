/* Paquete de Clase */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Importaciones */
// Clases o Paquetes
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;

// Librerias
import javax.swing.*;
import java.sql.*;

/* Clase Login */
public class Login extends javax.swing.JFrame {

    /* Inicializador de componentes */
    public Login() {
        initComponents();
        configurarVentana();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jPanel_CajaLogin = new javax.swing.JPanel();
        jLabel_Login = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jButton_Ingresar = new javax.swing.JButton();
        jComboBox_Usuarios = new javax.swing.JComboBox<>();
        jTextField_Usuario = new javax.swing.JTextField();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CajaGeneral.setBackground(new java.awt.Color(225, 243, 255));
        jPanel_CajaGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_CajaLogin.setBackground(new java.awt.Color(204, 255, 255));
        jPanel_CajaLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255), 3));

        jLabel_Login.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel_Login.setText("Login");

        jLabel_Usuario.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel_Usuario.setText("Usuario:");

        jLabel_Password.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel_Password.setText("Contraseña:");

        jButton_Ingresar.setBackground(new java.awt.Color(218, 244, 246));
        jButton_Ingresar.setText("INGRESAR");
        jButton_Ingresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarActionPerformed(evt);
            }
        });

        jComboBox_Usuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));

        javax.swing.GroupLayout jPanel_CajaLoginLayout = new javax.swing.GroupLayout(jPanel_CajaLogin);
        jPanel_CajaLogin.setLayout(jPanel_CajaLoginLayout);
        jPanel_CajaLoginLayout.setHorizontalGroup(
            jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaLoginLayout.createSequentialGroup()
                        .addComponent(jComboBox_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaLoginLayout.createSequentialGroup()
                        .addGroup(jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jPasswordField_Password))
                        .addGap(16, 16, 16))))
            .addGroup(jPanel_CajaLoginLayout.createSequentialGroup()
                .addGroup(jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaLoginLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Password)
                            .addComponent(jLabel_Usuario)))
                    .addGroup(jPanel_CajaLoginLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel_Login)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel_CajaLoginLayout.setVerticalGroup(
            jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaLoginLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_Usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Usuario)
                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password)
                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel_CajaGeneral.add(jPanel_CajaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel_Titulo.setBackground(new java.awt.Color(204, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/8220922-removebg-preview.png"))); // NOI18N
        jLabel_Titulo.setText("FARMACIAS SU SALUD");
        jPanel_CajaGeneral.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 344, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/fondo.jpg"))); // NOI18N
        jPanel_CajaGeneral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 89));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Logica */
    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        // Variables
        String usuario = jTextField_Usuario.getText();
        String password = new String(jPasswordField_Password.getPassword());
        String tipoUsuarioSeleccionado = jComboBox_Usuarios.getSelectedItem().toString();

        // Verificacion para abrir la pantalla
        if (comprobacionUsuario(usuario, password, tipoUsuarioSeleccionado))
        {
            // Convertir el tipo de usuario seleccionado a mayúscula inicial
            tipoUsuarioSeleccionado = tipoUsuarioSeleccionado.substring(0, 1).toUpperCase() + tipoUsuarioSeleccionado.substring(1);

            if ("Cajero".equals(tipoUsuarioSeleccionado))
            {
                abrirPantallaCajero();
            } else if ("Administrador".equals(tipoUsuarioSeleccionado))
            {
                abrirPantallaAdministrador();
            }
        } else
        {
            mostrarMensajeError();
        }
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    /* Método para verificar el usuario en la base de datos */
    private boolean verificarUsuario(String usuario, String password) {
        try (Connection connection = Conexion_MySQL.getConnection())
        {
            String querySeleccionar = "SELECT * FROM Usuarios WHERE usuario = ? AND contraseña = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(querySeleccionar);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery())
            {
                return resultSet.next();
            }
        } catch (SQLException e)
        {
            return false;
        }
    }

    /* Método para obtener el tipo de usuario desde la base de datos */
    private String obtenerTipoUsuario(String usuario) {
        try (Connection connection = Conexion_MySQL.getConnection())
        {
            String querySeleccionar = "SELECT tipo FROM Usuarios WHERE usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(querySeleccionar);
            preparedStatement.setString(1, usuario);

            try (ResultSet resultSet = preparedStatement.executeQuery())
            {
                if (resultSet.next())
                {
                    return resultSet.getString("tipo");
                } else
                {
                    return null;
                }
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /* Funciones */
    // Abrir Pantallas del Cajero
    private void abrirPantallaCajero() {
        // Abrir la pantalla Panel_Cajero_Ventas
        Panel_Cajero_Ventas panelCajeroVentas = new Panel_Cajero_Ventas();
        panelCajeroVentas.setVisible(true);

        // Cierra la pantalla de Login
        this.dispose();
    }

    // Abrir Pantallas del Aministrador
    private void abrirPantallaAdministrador() {
        // Abrir la pantalla Panel_Administrador_Opciones
        Panel_Administrador_Opciones panelAdminOpciones = new Panel_Administrador_Opciones();
        panelAdminOpciones.setVisible(true);

        // Cierra la pantalla de Login
        this.dispose();
    }

    // Funcion Comprobacion
    private boolean comprobacionUsuario(String usuario, String password, String tipoUsuarioSeleccionado) {
        String tipoUsuario = obtenerTipoUsuario(usuario);

        if (tipoUsuario == null)
        {
            return false;
        }

        if (!tipoUsuario.equals(tipoUsuarioSeleccionado))
        {
            return false;
        }

        return verificarUsuario(usuario, password);
    }

    // Mensaje de error
    private void mostrarMensajeError() {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
    }

    // Configurar las pantallas
    private void configurarVentana() {
        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);

        // Evitar que la ventana pueda ser redimensionada
        setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JComboBox<String> jComboBox_Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaLogin;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
