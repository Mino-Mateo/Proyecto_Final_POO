/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Importaciones */
import main.java.com.mycompany.sistema_farmacia.gui.Panel_Administrador_Opciones;
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;
import java.sql.*;
import javax.swing.JOptionPane;

/* Clase Publica */
public class Panel_Administrador_Cajeros extends javax.swing.JFrame {

    /* Inicializador */
    public Panel_Administrador_Cajeros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jPanel_Titulo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Usuario = new javax.swing.JLabel();
        jLabel_Contraseña = new javax.swing.JLabel();
        jLabel_Tipo = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jTextField_Usuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel_Volver = new javax.swing.JPanel();
        jButton_Volver = new javax.swing.JButton();
        jPanel_CajaBotones = new javax.swing.JPanel();
        jButton_Limpiar = new javax.swing.JButton();
        jButton_Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_Titulo.setText("Creacion de Cajeros");

        javax.swing.GroupLayout jPanel_TituloLayout = new javax.swing.GroupLayout(jPanel_Titulo);
        jPanel_Titulo.setLayout(jPanel_TituloLayout);
        jPanel_TituloLayout.setHorizontalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TituloLayout.createSequentialGroup()
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_TituloLayout.setVerticalGroup(
            jPanel_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Nombre.setText("Nombre:");

        jLabel_Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Usuario.setText("Usuario:");

        jLabel_Contraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Contraseña.setText("Contraseña:");

        jLabel_Tipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Tipo.setText("Tipo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Cajero" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jLabel_Usuario)
                    .addComponent(jLabel_Tipo)
                    .addComponent(jLabel_Contraseña))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Nombre)
                    .addComponent(jTextField_Usuario)
                    .addComponent(jPasswordField)
                    .addComponent(jComboBox1, 0, 111, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Usuario)
                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Contraseña)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Tipo)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

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
                .addComponent(jButton_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_VolverLayout.setVerticalGroup(
            jPanel_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_Limpiar.setText("Limpiar Pantalla");
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });

        jButton_Agregar.setText("Agregar Cajero");
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CajaBotonesLayout = new javax.swing.GroupLayout(jPanel_CajaBotones);
        jPanel_CajaBotones.setLayout(jPanel_CajaBotonesLayout);
        jPanel_CajaBotonesLayout.setHorizontalGroup(
            jPanel_CajaBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_CajaBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(jButton_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_CajaBotonesLayout.setVerticalGroup(
            jPanel_CajaBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaBotonesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_CajaBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addComponent(jPanel_CajaBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Boton Regresar */
    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        // Cerrar Pantalla
        dispose();

        // Abrir Opciones
        Panel_Administrador_Opciones Opciones = new Panel_Administrador_Opciones();
        Opciones.setVisible(true);
    }//GEN-LAST:event_jButton_VolverActionPerformed

    /* Boton Limpiar Pantalla */
    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed

        jTextField_Nombre.setText("");
        jTextField_Usuario.setText("");
        jPasswordField.setText("");
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    // Funcion Mensaje Insertar
    private void Texto_Insertar() {
        JOptionPane.showMessageDialog(null, "Elemento Insertado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    /* Boton Agregar */
    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed
        String nombre = jTextField_Nombre.getText();
        String usuario = jTextField_Usuario.getText();
        String contraseña = new String(jPasswordField.getPassword()); // Obtener la contraseña como String
        String tipo = (String) jComboBox1.getSelectedItem();

        String QUERY_INSERT_CAJERO = "INSERT INTO Usuarios (nombre, usuario, contraseña, tipo) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement pstmt = conn.prepareStatement(QUERY_INSERT_CAJERO);)
        {
            pstmt.setString(1, nombre);
            pstmt.setString(2, usuario);
            pstmt.setString(3, contraseña);
            pstmt.setString(4, tipo);

            int rowsAffected = pstmt.executeUpdate();
            Texto_Insertar(); // Asegúrate de tener esta función definida

            // Limpiar los campos después de agregar
            jTextField_Nombre.setText("");
            jTextField_Usuario.setText("");
            jPasswordField.setText("");
            jComboBox1.setSelectedIndex(0);
        } catch (SQLException x)
        {
            throw new RuntimeException(x);
        }
    }//GEN-LAST:event_jButton_AgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel_Contraseña;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_Usuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_CajaBotones;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_Titulo;
    private javax.swing.JPanel jPanel_Volver;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JTextField jTextField_Usuario;
    // End of variables declaration//GEN-END:variables
}
