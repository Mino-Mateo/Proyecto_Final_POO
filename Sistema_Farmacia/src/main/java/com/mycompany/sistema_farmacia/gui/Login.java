/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Importaciones */
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;

/* Librerias */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* Extension JFrame */
public class Login extends javax.swing.JFrame {

    /* Inicializador de componentes */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jPanel_CajaTitulo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_CajaLogin = new javax.swing.JPanel();
        jLabel_Login = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jButton_Ingresar = new javax.swing.JButton();
        jComboBox_Usuarios = new javax.swing.JComboBox<>();
        jTextField_Usuario = new javax.swing.JTextField();
        jPasswordField_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Titulo.setText("FARMACIAS SU SALUD");

        javax.swing.GroupLayout jPanel_CajaTituloLayout = new javax.swing.GroupLayout(jPanel_CajaTitulo);
        jPanel_CajaTitulo.setLayout(jPanel_CajaTituloLayout);
        jPanel_CajaTituloLayout.setHorizontalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTituloLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel_CajaTituloLayout.setVerticalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTituloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel_Login.setText("Login");

        jLabel_Usuario.setText("Usuario");

        jLabel_Password.setText("Contraseña");

        jButton_Ingresar.setText("Ingresar");
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
            .addGroup(jPanel_CajaLoginLayout.createSequentialGroup()
                .addGroup(jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaLoginLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CajaLoginLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Password)
                            .addComponent(jLabel_Usuario))))
                .addContainerGap(38, Short.MAX_VALUE))
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
        );
        jPanel_CajaLoginLayout.setVerticalGroup(
            jPanel_CajaLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
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

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel_CajaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_CajaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Logica */
    private void jButton_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarActionPerformed
        String usuario = jTextField_Usuario.getText();
        char[] password = jPasswordField_Password.getPassword();
        String enteredPassword = new String(password);

        //Verificar el usuario y contraseña en la base de datos
        boolean usuarioValido = verificarUsuario(usuario, enteredPassword);

        if (usuarioValido)
        {
            String tipoUsuario = obtenerTipoUsuario(usuario);

            if ("cajero".equals(tipoUsuario))
            {
                // Abre la pantalla de cajero (aún por implementar)
                // Ejemplo: PantallaCajero pantallaCajero = new PantallaCajero();
                // pantallaCajero.setVisible(true);
                // Cierra la pantalla de Login
                this.dispose();
            } else if ("admin".equals(tipoUsuario))
            {
                // Abrir la pantalla Panel_Administrador_Opciones
                Panel_Administrador_Opciones panelAdminOpciones = new Panel_Administrador_Opciones();
                panelAdminOpciones.setVisible(true);
                // Cierra la pantalla de Login
                this.dispose();
            }
        } else
        {
            jTextField_Usuario.setText("Error de ingreso");
        }
    }//GEN-LAST:event_jButton_IngresarActionPerformed

    // Método para verificar el usuario en la base de datos
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
            e.printStackTrace();
            return false;
        }
    }

// Método para obtener el tipo de usuario desde la base de datos
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Ingresar;
    private javax.swing.JComboBox<String> jComboBox_Usuarios;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaLogin;
    private javax.swing.JPanel jPanel_CajaTitulo;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
