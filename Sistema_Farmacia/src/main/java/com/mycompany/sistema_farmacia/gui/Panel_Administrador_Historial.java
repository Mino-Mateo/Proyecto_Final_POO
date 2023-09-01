/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Clase Publica */
// Clases o Paquetes
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;

// Librerias
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter; 
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.jvm.hotspot.debugger.Page;

/* Clase Publica */
public class Panel_Administrador_Historial extends javax.swing.JFrame {

    /* Inicializador */
    public Panel_Administrador_Historial() {
        initComponents();
        configurarVentana();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Volver = new javax.swing.JButton();
        jScrollPane_Tabla = new javax.swing.JScrollPane();
        jPanel_CajaTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Historial = new javax.swing.JTable();
        jPanel_CajaTodo = new javax.swing.JPanel();
        jTextField_Busqueda = new javax.swing.JTextField();
        jButton_BuscarIDTran = new javax.swing.JButton();
        jButton_BuscarIDCajero = new javax.swing.JButton();
        jButton_BuscarNomCajero = new javax.swing.JButton();
        jButton_BuscarFecha = new javax.swing.JButton();
        jButton_BuscarProducto = new javax.swing.JButton();
        jButton_Imprimir = new javax.swing.JButton();
        jLabel_TitulBusqueda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Fondo.setBackground(new java.awt.Color(225, 243, 255));

        jPanel1.setBackground(new java.awt.Color(225, 243, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/historial-removebg-preview.png"))); // NOI18N
        jLabel1.setText("Historial de Transacciones");

        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Regresar-removebg-preview.png"))); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(310, 310, 310)
                .addComponent(jButton_Volver))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTable_Historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Transacción", "ID Cajero", "Nombre Cajero", "Fecha Y Hora", "Producto", "Cantidad Producto", "Precio ", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable_Historial);

        javax.swing.GroupLayout jPanel_CajaTablaLayout = new javax.swing.GroupLayout(jPanel_CajaTabla);
        jPanel_CajaTabla.setLayout(jPanel_CajaTablaLayout);
        jPanel_CajaTablaLayout.setHorizontalGroup(
            jPanel_CajaTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        jPanel_CajaTablaLayout.setVerticalGroup(
            jPanel_CajaTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTablaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 175, Short.MAX_VALUE))
        );

        jScrollPane_Tabla.setViewportView(jPanel_CajaTabla);

        jPanel_CajaTodo.setBackground(new java.awt.Color(225, 243, 255));

        jButton_BuscarIDTran.setText("ID Transacción");
        jButton_BuscarIDTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarIDTranActionPerformed(evt);
            }
        });

        jButton_BuscarIDCajero.setText("ID Cajero");
        jButton_BuscarIDCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarIDCajeroActionPerformed(evt);
            }
        });

        jButton_BuscarNomCajero.setText("Nombre Cajero");
        jButton_BuscarNomCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarNomCajeroActionPerformed(evt);
            }
        });

        jButton_BuscarFecha.setText("Fecha Transacción");
        jButton_BuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarFechaActionPerformed(evt);
            }
        });

        jButton_BuscarProducto.setText("Producto");
        jButton_BuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarProductoActionPerformed(evt);
            }
        });

        jButton_Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Imprimir-removebg-preview.png"))); // NOI18N
        jButton_Imprimir.setText("Imprimir");
        jButton_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CajaTodoLayout = new javax.swing.GroupLayout(jPanel_CajaTodo);
        jPanel_CajaTodo.setLayout(jPanel_CajaTodoLayout);
        jPanel_CajaTodoLayout.setHorizontalGroup(
            jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTodoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_BuscarIDTran, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_BuscarIDCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_BuscarNomCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_BuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton_BuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_CajaTodoLayout.setVerticalGroup(
            jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTodoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_BuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_BuscarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_BuscarIDCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_BuscarNomCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_BuscarIDTran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Busqueda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_TitulBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_TitulBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/lupa-removebg-preview.png"))); // NOI18N
        jLabel_TitulBusqueda.setText("Busqueda");

        javax.swing.GroupLayout jPanel_FondoLayout = new javax.swing.GroupLayout(jPanel_Fondo);
        jPanel_Fondo.setLayout(jPanel_FondoLayout);
        jPanel_FondoLayout.setHorizontalGroup(
            jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
                    .addGroup(jPanel_FondoLayout.createSequentialGroup()
                        .addComponent(jPanel_CajaTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_FondoLayout.createSequentialGroup()
                                .addComponent(jLabel_TitulBusqueda)
                                .addGap(533, 533, 533))))))
        );
        jPanel_FondoLayout.setVerticalGroup(
            jPanel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TitulBusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_CajaTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Boton Buscar por ID de Transaccion
    private void jButton_BuscarIDTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarIDTranActionPerformed
        String busqueda = jTextField_Busqueda.getText().trim();
        actualizarTabla(busqueda, "t.id");
    }//GEN-LAST:event_jButton_BuscarIDTranActionPerformed

    // Boton Buscar por ID de Cajero
    private void jButton_BuscarIDCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarIDCajeroActionPerformed
        String busqueda = jTextField_Busqueda.getText().trim();
        actualizarTabla(busqueda, "t.id_cajero");
    }//GEN-LAST:event_jButton_BuscarIDCajeroActionPerformed

    // Boton Buscar por Nombre de Cajero
    private void jButton_BuscarNomCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarNomCajeroActionPerformed
        String busqueda = jTextField_Busqueda.getText().trim();
        actualizarTabla(busqueda, "u.nombre");
    }//GEN-LAST:event_jButton_BuscarNomCajeroActionPerformed

    // Boton Buscar por Fecha
    private void jButton_BuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarFechaActionPerformed
        String busqueda = jTextField_Busqueda.getText().trim();
        actualizarTabla(busqueda, "t.fecha");
    }//GEN-LAST:event_jButton_BuscarFechaActionPerformed

    // Boton Buscar por Producto
    private void jButton_BuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarProductoActionPerformed
        String busqueda = jTextField_Busqueda.getText().trim();
        actualizarTabla(busqueda, "dt.nombre_producto");
    }//GEN-LAST:event_jButton_BuscarProductoActionPerformed

    // Boton Imprimir
    private void jButton_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImprimirActionPerformed
        String ruta = System.getProperty("user.home");
        String rutaCompleta = ruta + "/Desktop/mi_archivo.pdf"; 
        Document documento=new Document();
        
        
        try{
         PdfWriter.getInstance(documento, new FileOutputStream(rutaCompleta));

              documento.open();
                PdfPTable tabla=new PdfPTable(8);
                tabla.addCell("Hola soy judio");

        }catch(DocumentException ev){
             JOptionPane.showMessageDialog(null, "No se pudo crear PDF");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Panel_Administrador_Historial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_ImprimirActionPerformed

    // Boton Regresar
    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        manejoPantalla(new Panel_Administrador_Opciones());
    }//GEN-LAST:event_jButton_VolverActionPerformed

    /* Busqueda Global */
    // Mostrar en Tabla
    private void actualizarTabla(String busqueda, String columnaBusqueda) {
        DefaultTableModel model = (DefaultTableModel) jTable_Historial.getModel();
        model.setRowCount(0);

        Connection connection = Conexion_MySQL.getConnection();

        if (connection != null)
        {
            String query = generarQuery(columnaBusqueda, busqueda);

            try (PreparedStatement stmt = connection.prepareStatement(query))
            {
                asignarParametros(stmt, columnaBusqueda, busqueda);
                ResultSet rs = stmt.executeQuery();

                while (rs.next())
                {
                    int idTransaccion = rs.getInt("id");
                    int idCajero = rs.getInt("id_cajero");
                    String nombreCajero = rs.getString("nombre");
                    Timestamp fecha = rs.getTimestamp("fecha");
                    String producto = rs.getString("nombre_producto");
                    int cantidad = rs.getInt("cantidad");
                    double precio = rs.getDouble("precio");
                    double total = cantidad * precio;

                    model.addRow(new Object[]
                    {
                        idTransaccion, idCajero, nombreCajero, fecha, producto, cantidad, precio, total
                    });
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                cerrarConexion(connection);
            }
        }
    }

    // Query Busqueda Global
    private String generarQuery(String columnaBusqueda, String busqueda) {
        if (!busqueda.isEmpty())
        {
            return "SELECT t.id, t.id_cajero, u.nombre, t.fecha, dt.nombre_producto, dt.cantidad, p.precio "
                    + "FROM Transacciones t "
                    + "JOIN Usuarios u ON t.id_cajero = u.id "
                    + "JOIN DetallesTransaccion dt ON t.id = dt.id_transaccion "
                    + "JOIN Productos p ON dt.id_producto = p.id "
                    + "WHERE " + columnaBusqueda + " = ?";
        } else
        {
            return "SELECT t.id, t.id_cajero, u.nombre, t.fecha, dt.nombre_producto, dt.cantidad, p.precio "
                    + "FROM Transacciones t "
                    + "JOIN Usuarios u ON t.id_cajero = u.id "
                    + "JOIN DetallesTransaccion dt ON t.id = dt.id_transaccion "
                    + "JOIN Productos p ON dt.id_producto = p.id";
        }
    }

    // Parametros
    private void asignarParametros(PreparedStatement stmt, String columnaBusqueda, String busqueda) throws SQLException {
        if (!busqueda.isEmpty())
        {
            stmt.setString(1, busqueda);
        }
    }

    // Cerrar Conexion
    private void cerrarConexion(Connection connection) {
        try
        {
            connection.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    // Configurar las pantallas
    private void configurarVentana() {
        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);

        // Evitar que la ventana pueda ser redimensionada
        setResizable(false);
    }

    // Manejo de Pantalla
    private void manejoPantalla(javax.swing.JFrame nuevaPantalla) {
        dispose();
        nuevaPantalla.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BuscarFecha;
    private javax.swing.JButton jButton_BuscarIDCajero;
    private javax.swing.JButton jButton_BuscarIDTran;
    private javax.swing.JButton jButton_BuscarNomCajero;
    private javax.swing.JButton jButton_BuscarProducto;
    private javax.swing.JButton jButton_Imprimir;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_TitulBusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_CajaTabla;
    private javax.swing.JPanel jPanel_CajaTodo;
    private javax.swing.JPanel jPanel_Fondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_Tabla;
    private javax.swing.JTable jTable_Historial;
    private javax.swing.JTextField jTextField_Busqueda;
    // End of variables declaration//GEN-END:variables
}
