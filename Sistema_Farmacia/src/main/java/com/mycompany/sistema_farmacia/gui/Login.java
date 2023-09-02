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

    // Inicializador
    public Login() {
        initComponents();
        configurarVentana();
    }

    // Componentes Graficos
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

        jLabel_Titulo.setBackground(new java.awt.Color(204, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/8220922-removebg-preview.png"))); // NOI18N
        jLabel_Titulo.setText("FARMACIAS SU SALUD");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel_CajaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel_Titulo)
                .addGap(0, 0, 0)
                .addComponent(jPanel_CajaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Botones */
    // Boton Ingresar
    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed

        // Variables
        String usuario = jTextField_Usuario.getText();
        String password = new String(jPasswordField_Password.getPassword());
        String tipo = jComboBox_Usuarios.getSelectedItem().toString();

        // Logica
        if (comprobarUsuario(usuario, password, tipo))
        {
            // Dar formato al usuario
            tipo = tipo.substring(0, 1).toUpperCase() + tipo.substring(1);

            // Verificar el Jcombo seleccionado
            if ("Cajero".equals(tipo))
            {
                abrirPantallaCajero();
            } else if ("Administrador".equals(tipo))
            {
                abrirPantallaAdministrador();
            }
        } else
        {
            MensajeError();
        }
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    /* Funciones */
    // Obtener ID
    private int obtenerId(String usuario) {
        try (Connection connection = Conexion_MySQL.getConnection())
        {
            // Query
            String querySeleccionarId = "SELECT id FROM Usuarios WHERE usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(querySeleccionarId);
            preparedStatement.setString(1, usuario);

            // Logica
            try (ResultSet resultSet = preparedStatement.executeQuery())
            {
                if (resultSet.next())
                {
                    return resultSet.getInt("id");
                } else
                {
                    return -1;
                }
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            return -1;
        }
    }

    // Obtener Nombre
    private String obtenerNombre(String usuario) {
        try (Connection connection = Conexion_MySQL.getConnection())
        {
            // Query
            String querySeleccionarNombre = "SELECT nombre FROM Usuarios WHERE usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(querySeleccionarNombre);
            preparedStatement.setString(1, usuario);

            // Logica
            try (ResultSet resultSet = preparedStatement.executeQuery())
            {
                if (resultSet.next())
                {
                    return resultSet.getString("nombre");
                } else
                {
                    return "Nombre no encontrado";
                }
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
            return "Error al obtener el nombre";
        }
    }

    // Obtener Tipo
    private String obtenerTipo(String usuario) {
        try (Connection connection = Conexion_MySQL.getConnection())
        {
            // Query
            String querySeleccionar = "SELECT tipo FROM Usuarios WHERE usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(querySeleccionar);
            preparedStatement.setString(1, usuario);

            // Logica
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

    // Comprobacion de Usuario
    private boolean comprobarUsuario(String usuario, String password, String tipoUsuarioSeleccionado) {

        // Variables
        String tipoUsuario = obtenerTipo(usuario);

        // Logica
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

    // Verificar Usuario
    private boolean verificarUsuario(String usuario, String password) {
        try (Connection connection = Conexion_MySQL.getConnection())
        {
            // Query
            String querySeleccionar = "SELECT * FROM Usuarios WHERE usuario = ? AND contraseña = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(querySeleccionar);
            preparedStatement.setString(1, usuario);
            preparedStatement.setString(2, password);

            // Logica
            try (ResultSet resultSet = preparedStatement.executeQuery())
            {
                return resultSet.next();
            }
        } catch (SQLException e)
        {
            return false;
        }
    }

    /* Mensajes */
    // Mensaje de error
    private void MensajeError() {
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de ingreso", JOptionPane.ERROR_MESSAGE);
    }

    /* Pantallas */
    // Configurar las pantallas
    private void configurarVentana() {
        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);

        // Evitar que la ventana pueda ser redimensionada
        setResizable(false);
    }

    // Abrir Pantalla del Cajero
    private void abrirPantallaCajero() {

        // Variables
        String nombreUsuarioActual = jTextField_Usuario.getText();
        int idActual = obtenerId(nombreUsuarioActual);
        String nombreUsuario = obtenerNombre(nombreUsuarioActual);

        // Panel lateral de usuario
        Panel_Cajero_Ventas panelCajeroVentas = new Panel_Cajero_Ventas(nombreUsuarioActual, idActual, nombreUsuario);
        panelCajeroVentas.setVisible(true);

        // Cerrar Ventana
        this.dispose();
    }

    // Abrir Pantalla del Aministrador
    private void abrirPantallaAdministrador() {

        // Variables
        Panel_Administrador_Opciones panelAdminOpciones = new Panel_Administrador_Opciones();
        panelAdminOpciones.setVisible(true);

        // Cerrar Ventana
        this.dispose();
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
