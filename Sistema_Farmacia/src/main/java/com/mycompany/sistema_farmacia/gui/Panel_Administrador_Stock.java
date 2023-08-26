/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Clase Publica */
// Clases o Paquetes
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;

// Librerias
import javax.swing.JOptionPane;
import java.sql.*;

/* Clase Panel Administrador Stock */
public class Panel_Administrador_Stock extends javax.swing.JFrame {

    /* Inicializador */
    public Panel_Administrador_Stock() {
        initComponents();
        configurarVentana();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jPanel_CajaTitulo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_CajaSalir = new javax.swing.JPanel();
        jButton_Salir = new javax.swing.JButton();
        jPanel_CajaPanes = new javax.swing.JPanel();
        jTabbedPane_Productos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel_CajaAgregar = new javax.swing.JPanel();
        jPanel_TituloAgre = new javax.swing.JPanel();
        jLabel_TituloAgre = new javax.swing.JLabel();
        jPanel_CajaIngresos = new javax.swing.JPanel();
        jLabel_NombProNu = new javax.swing.JLabel();
        jLabel_PrProNu = new javax.swing.JLabel();
        jLabel_StockProNu = new javax.swing.JLabel();
        jTextField_NomProNu = new javax.swing.JTextField();
        jTextField_PrProNu = new javax.swing.JTextField();
        jTextField_StockProNu = new javax.swing.JTextField();
        jPanel_BtnIngresos = new javax.swing.JPanel();
        jButton_BtnAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CajaTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_Titulo.setText("Stock de Productos");

        javax.swing.GroupLayout jPanel_CajaTituloLayout = new javax.swing.GroupLayout(jPanel_CajaTitulo);
        jPanel_CajaTitulo.setLayout(jPanel_CajaTituloLayout);
        jPanel_CajaTituloLayout.setHorizontalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTituloLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel_Titulo)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel_CajaTituloLayout.setVerticalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTituloLayout.createSequentialGroup()
                .addComponent(jLabel_Titulo)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jButton_Salir.setText("Volver");
        jButton_Salir.setActionCommand("Volver");
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CajaSalirLayout = new javax.swing.GroupLayout(jPanel_CajaSalir);
        jPanel_CajaSalir.setLayout(jPanel_CajaSalirLayout);
        jPanel_CajaSalirLayout.setHorizontalGroup(
            jPanel_CajaSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaSalirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_CajaSalirLayout.setVerticalGroup(
            jPanel_CajaSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_TituloAgre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TituloAgre.setText("Agregar Productos");

        javax.swing.GroupLayout jPanel_TituloAgreLayout = new javax.swing.GroupLayout(jPanel_TituloAgre);
        jPanel_TituloAgre.setLayout(jPanel_TituloAgreLayout);
        jPanel_TituloAgreLayout.setHorizontalGroup(
            jPanel_TituloAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TituloAgreLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_TituloAgre)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel_TituloAgreLayout.setVerticalGroup(
            jPanel_TituloAgreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TituloAgreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TituloAgre, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel_NombProNu.setText("Nombre Producto:");

        jLabel_PrProNu.setText("Precio:");

        jLabel_StockProNu.setText("Stock:");

        javax.swing.GroupLayout jPanel_CajaIngresosLayout = new javax.swing.GroupLayout(jPanel_CajaIngresos);
        jPanel_CajaIngresos.setLayout(jPanel_CajaIngresosLayout);
        jPanel_CajaIngresosLayout.setHorizontalGroup(
            jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaIngresosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_NombProNu)
                    .addComponent(jLabel_PrProNu)
                    .addComponent(jLabel_StockProNu))
                .addGap(30, 30, 30)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_StockProNu, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_PrProNu, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextField_NomProNu)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel_CajaIngresosLayout.setVerticalGroup(
            jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaIngresosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_NombProNu)
                    .addComponent(jTextField_NomProNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_PrProNu)
                    .addComponent(jTextField_PrProNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel_CajaIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_StockProNu)
                    .addComponent(jTextField_StockProNu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton_BtnAgregar.setText("Agregar Producto");
        jButton_BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BtnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_BtnIngresosLayout = new javax.swing.GroupLayout(jPanel_BtnIngresos);
        jPanel_BtnIngresos.setLayout(jPanel_BtnIngresosLayout);
        jPanel_BtnIngresosLayout.setHorizontalGroup(
            jPanel_BtnIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BtnIngresosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton_BtnAgregar)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_BtnIngresosLayout.setVerticalGroup(
            jPanel_BtnIngresosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_BtnIngresosLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jButton_BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel_CajaAgregarLayout = new javax.swing.GroupLayout(jPanel_CajaAgregar);
        jPanel_CajaAgregar.setLayout(jPanel_CajaAgregarLayout);
        jPanel_CajaAgregarLayout.setHorizontalGroup(
            jPanel_CajaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CajaIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_BtnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaAgregarLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jPanel_TituloAgre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel_CajaAgregarLayout.setVerticalGroup(
            jPanel_CajaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaAgregarLayout.createSequentialGroup()
                .addComponent(jPanel_TituloAgre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CajaAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_CajaIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_BtnIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane_Productos.addTab("Agregar Productos", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jTabbedPane_Productos.addTab("Stock de Productos", jPanel3);

        javax.swing.GroupLayout jPanel_CajaPanesLayout = new javax.swing.GroupLayout(jPanel_CajaPanes);
        jPanel_CajaPanes.setLayout(jPanel_CajaPanesLayout);
        jPanel_CajaPanesLayout.setHorizontalGroup(
            jPanel_CajaPanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaPanesLayout.createSequentialGroup()
                .addComponent(jTabbedPane_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_CajaPanesLayout.setVerticalGroup(
            jPanel_CajaPanesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_Productos)
        );

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_CajaSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addComponent(jPanel_CajaPanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_CajaSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_CajaPanes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton Agregar
    private void jButton_BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BtnAgregarActionPerformed
        String nombreProducto = jTextField_NomProNu.getText();
        String precioProducto = jTextField_PrProNu.getText();
        String stockProducto = jTextField_StockProNu.getText();

        if (nombreProducto.isEmpty() || precioProducto.isEmpty() || stockProducto.isEmpty())
        {
            mostrarMensajeError("Complete todos los campos");
            return;
        }

        int confirmacion = mostrarConfirmacion("¿Está seguro que quiere ingresar este producto?");

        if (confirmacion == JOptionPane.YES_OPTION)
        {
            if (productoExiste(nombreProducto))
            {
                mostrarMensajeError("Error al Ingresar, este producto ya existe");
                return;
            }

            if (insertarProducto(nombreProducto, precioProducto, stockProducto))
            {
                mostrarMensajeExito("Producto Agregado");

                limpiarPantalla();
            } else
            {
                mostrarMensajeError("Error al agregar el producto");
            }
        }
    }//GEN-LAST:event_jButton_BtnAgregarActionPerformed

    // Boton Volver
    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        manejoPantalla(new Panel_Administrador_Opciones());
    }//GEN-LAST:event_jButton_SalirActionPerformed

    /* Logica */
    // Verificar si el Producto esta en la base de datos
    private boolean productoExiste(String nombreProducto) {
        String QUERY_VERIFICAR_PRODUCTO = "SELECT COUNT(*) FROM Productos WHERE nombre = ?";

        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement stmt = conn.prepareStatement(QUERY_VERIFICAR_PRODUCTO))
        {
            stmt.setString(1, nombreProducto);

            try (ResultSet rs = stmt.executeQuery())
            {
                if (rs.next())
                {
                    int count = rs.getInt(1);
                    return count > 0; // Si count es mayor que cero, el producto existe
                }
            }
        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }

        return false; // En caso de error o si no se encuentra el producto, devuelve false
    }

    // Insertar Producto
    private boolean insertarProducto(String nombreProducto, String precioProducto, String stockProducto) {
        String QUERY_INSERT_PRODUCTO = "INSERT INTO Productos (nombre, precio, stock) VALUES (?, ?, ?)";

        try (Connection conn = Conexion_MySQL.getConnection(); PreparedStatement cone = conn.prepareStatement(QUERY_INSERT_PRODUCTO))
        {
            cone.setString(1, nombreProducto);
            cone.setString(2, precioProducto);
            cone.setString(3, stockProducto);

            int rowsAffected = cone.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex)
        {
            ex.printStackTrace();
            return false;
        }
    }

    /* Mensajes en Pantalla */
    // Error
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Exito
    private void mostrarMensajeExito(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }

    // Confimar si quieres
    private int mostrarConfirmacion(String mensaje) {
        return JOptionPane.showConfirmDialog(this, mensaje, "Confirmar", JOptionPane.YES_NO_OPTION);
    }

    // Limpiar Pantalla
    private void limpiarPantalla() {
        jTextField_NomProNu.setText("");
        jTextField_PrProNu.setText("");
        jTextField_StockProNu.setText("");
    }

    // Manejo de Pantalla
    private void manejoPantalla(javax.swing.JFrame nuevaPantalla) {
        dispose();
        nuevaPantalla.setVisible(true);
    }

    // Configurar las pantallas
    private void configurarVentana() {
        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);

        // Evitar que la ventana pueda ser redimensionada
        setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BtnAgregar;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel_NombProNu;
    private javax.swing.JLabel jLabel_PrProNu;
    private javax.swing.JLabel jLabel_StockProNu;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_TituloAgre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_BtnIngresos;
    private javax.swing.JPanel jPanel_CajaAgregar;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaIngresos;
    private javax.swing.JPanel jPanel_CajaPanes;
    private javax.swing.JPanel jPanel_CajaSalir;
    private javax.swing.JPanel jPanel_CajaTitulo;
    private javax.swing.JPanel jPanel_TituloAgre;
    private javax.swing.JTabbedPane jTabbedPane_Productos;
    private javax.swing.JTextField jTextField_NomProNu;
    private javax.swing.JTextField jTextField_PrProNu;
    private javax.swing.JTextField jTextField_StockProNu;
    // End of variables declaration//GEN-END:variables
}
