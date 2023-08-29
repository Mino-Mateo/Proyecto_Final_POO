/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Clase Publica */
// Clases o Paquetes
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;

// Librerias
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter; 
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

class ProductoCarrito {

    private int idProducto;
    private String nombre;
    private int cantidad;

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public ProductoCarrito(int idProducto, String nombre, int cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}

/* Clase Panel_Cajero_Ventas*/
public class Panel_Cajero_Ventas extends javax.swing.JFrame {

    private ArrayList<ProductoCarrito> carrito = new ArrayList<>();
    private DefaultTableModel productTableModel;

    public Panel_Cajero_Ventas() {
        initComponents();
        configurarVentana();
        productTableModel = (DefaultTableModel) jTable_Productos.getModel();
        mostrarTodosLosProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Volver = new javax.swing.JButton();
        jPanel_CajaTodo = new javax.swing.JPanel();
        jTextField_Busqueda = new javax.swing.JTextField();
        jLabel_TituloBuscarBotones = new javax.swing.JLabel();
        jButton_ID = new javax.swing.JButton();
        jButton_Nombre = new javax.swing.JButton();
        jLabel_TituloInteraccionBotones = new javax.swing.JLabel();
        jButton_Agregar = new javax.swing.JButton();
        jButton_Confirmar = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jButton_Imprimir = new javax.swing.JButton();
        jScrollPane_Productos = new javax.swing.JScrollPane();
        jPanel_CajaTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Venta de Productos");

        jButton_Volver.setText("Salir");
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
                .addGap(216, 216, 216)
                .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_TituloBuscarBotones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TituloBuscarBotones.setText("Botones Busqueda");

        jButton_ID.setText("ID");
        jButton_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IDActionPerformed(evt);
            }
        });

        jButton_Nombre.setText("Nombre");
        jButton_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NombreActionPerformed(evt);
            }
        });

        jLabel_TituloInteraccionBotones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TituloInteraccionBotones.setText("Botones Interacciones");

        jButton_Agregar.setText("Agregar");
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });

        jButton_Confirmar.setText("Confirmar");
        jButton_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfirmarActionPerformed(evt);
            }
        });

        jButton_Cancelar.setText("Cancelar");
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaTodoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTextField_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaTodoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_TituloBuscarBotones)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaTodoLayout.createSequentialGroup()
                        .addComponent(jButton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CajaTodoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel_TituloInteraccionBotones)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_CajaTodoLayout.setVerticalGroup(
            jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTodoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TituloBuscarBotones)
                    .addComponent(jLabel_TituloInteraccionBotones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID ", "Nombre", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable_Productos);

        javax.swing.GroupLayout jPanel_CajaTablaLayout = new javax.swing.GroupLayout(jPanel_CajaTabla);
        jPanel_CajaTabla.setLayout(jPanel_CajaTablaLayout);
        jPanel_CajaTablaLayout.setHorizontalGroup(
            jPanel_CajaTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_CajaTablaLayout.setVerticalGroup(
            jPanel_CajaTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane_Productos.setViewportView(jPanel_CajaTabla);

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_CajaTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane_Productos))
                .addContainerGap())
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_CajaTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane_Productos, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
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

    // Boton Salir
    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION)
        {
            volverALogin();
        }
    }//GEN-LAST:event_jButton_VolverActionPerformed

    // Boton Buscar por ID
    private void jButton_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IDActionPerformed
        String busqueda = jTextField_Busqueda.getText().trim();
        if (busqueda.isEmpty())
        {
            mostrarTodosLosProductos();
        } else
        {
            mostrarProductosPorID(busqueda);
        }
    }//GEN-LAST:event_jButton_IDActionPerformed

    // Boton Buscar por Nombre
    private void jButton_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NombreActionPerformed
        String busqueda = jTextField_Busqueda.getText().trim();
        if (busqueda.isEmpty())
        {
            mostrarTodosLosProductos();
        } else
        {
            mostrarProductosPorNombre(busqueda);
        }
    }//GEN-LAST:event_jButton_NombreActionPerformed

    // Boton Agregar Productos
    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed
        int selectedRow = jTable_Productos.getSelectedRow();

        if (selectedRow == -1)
        {
            mostrarMensajeError("Seleccione un producto de la tabla");
            return;
        }

        String nombreProducto = (String) jTable_Productos.getValueAt(selectedRow, 1);
        int idProducto = obtenerIdProductoPorNombre(nombreProducto); // Obtener el ID del producto
        int stockDisponible = obtenerStockProducto(idProducto); // Obtener el stock del producto
        System.out.println("Stock disponible: " + stockDisponible);

        if (stockDisponible <= 0)
        {
            mostrarMensajeError("No hay stock disponible para este producto");
            return;
        }

        String cantidadStr = obtenerInput("Ingrese la cantidad de producto a añadir:", "Agregar a Venta");

        if (cantidadStr != null && !cantidadStr.isEmpty())
        {
            try
            {
                int cantidad = Integer.parseInt(cantidadStr);
                System.out.println("Cantidad ingresada: " + cantidad);

                if (cantidad > 0 && cantidad <= stockDisponible)
                {
                    agregarProductoAlCarrito(idProducto, nombreProducto, cantidad);
                    mostrarMensajeConfirmacion(cantidad + " unidades de " + nombreProducto + " agregadas al carrito", "Producto Agregado");
                    mostrarElementosCarrito();
                } else
                {
                    mostrarMensajeError("La cantidad debe ser mayor que 0 y no exceder el stock disponible");
                }
            } catch (NumberFormatException e)
            {
                mostrarMensajeError("Ingrese una cantidad válida");
            }
        }
    }//GEN-LAST:event_jButton_AgregarActionPerformed

    // Boton Confirmar Venta
    private void jButton_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfirmarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea continuar con la transacción?", "Confirmar Venta", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION)
        {
            String idCajeroStr = JOptionPane.showInputDialog(this, "Ingrese su ID de Cajero:");

            if (idCajeroStr != null && !idCajeroStr.isEmpty())
            {
                try
                {
                    int idCajero = Integer.parseInt(idCajeroStr);

                    // Crear una nueva transacción en la base de datos y obtener su ID
                    int idTransaccion = guardarTransaccion(idCajero);
                    System.out.println("ID de Transaccion: " + idTransaccion);

                    // Procesar cada producto en el carrito y guardar detalles de transacción
                    for (ProductoCarrito producto : carrito)
                    {
                        int idProducto = obtenerIdProductoPorNombre(producto.getNombre());
                        int cantidad = producto.getCantidad();
                        System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + cantidad);

                        guardarDetalleTransaccion(idTransaccion, idProducto, cantidad);

                        int stockActual = obtenerStockProducto(idProducto);
                        int nuevoStock = stockActual - cantidad;
                        actualizarStockEnBaseDeDatos(idProducto, nuevoStock);
                    }

                    mostrarMensajeInformacion("Venta realizada exitosamente", "Venta Realizada");

                    carrito.clear(); // Limpiar el carrito después de la venta
                    System.out.println("Carrito limpiado");
                } catch (NumberFormatException e)
                {
                    mostrarMensajeError("Por favor, ingrese un ID de Cajero valido.");
                }
            }
        }
    }//GEN-LAST:event_jButton_ConfirmarActionPerformed

    // Boton Cancelar Venta
    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro de cancelar la venta?", "Cancelar Venta", JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION)
        {
            // Limpiar el carrito y mostrar mensaje de cancelación
            carrito.clear();
            mostrarMensajeInformacion("Venta cancelada. El carrito ha sido vaciado.", "Venta Cancelada");
        }
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    private void jButton_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ImprimirActionPerformed
        Document documento=new Document();
        
        try{
            String ruta = System.getProperty("user.home");
            String rutaCompleta = ruta + "/Desktop/mi_archivo.pdf";
            
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/mi_archivo.pdf"));
           
            documento.open();
            PdfPTable tabla=new PdfPTable(8);
            tabla.addCell("Codigo");
            tabla.addCell("ffffff");
            tabla.addCell("Codigo");
            tabla.addCell("Codigo");
            tabla.addCell("Codigo");
            tabla.addCell("Codigo");
            tabla.addCell("Codigo");
            tabla.addCell("Codigo");
            
        try{
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/farmacia","root","");
            PreparedStatement pst=cn.prepareStatement("select *from DetallesTransaccion");
            
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
            
            do{
                
               tabla.addCell(rs.getString(1));
               tabla.addCell(rs.getString(2));
               tabla.addCell(rs.getString(3));
               tabla.addCell(rs.getString(4));
               tabla.addCell(rs.getString(5));
               tabla.addCell(rs.getString(6));
               tabla.addCell(rs.getString(7));
               tabla.addCell(rs.getString(8));
               
               
            }while(rs.next());
            documento.add(tabla);
            
            
            
            }
        }catch(DocumentException | SQLException e){
        }
        documento.close();
        JOptionPane.showMessageDialog(null, "PDF Guardado");
        }catch(HeadlessException e){
        }
                                             

    }//GEN-LAST:event_jButton_ImprimirActionPerformed

    // Método para agregar un producto al carrito
    private void agregarProductoAlCarrito(int idProducto, String nombre, int cantidad) {
        ProductoCarrito productoEnCarrito = new ProductoCarrito(idProducto, nombre, cantidad);
        carrito.add(productoEnCarrito);
    }

    // Guardado de transaccion
    private int guardarTransaccion(int idCajero) {
        Connection connection = Conexion_MySQL.getConnection();
        int idTransaccion = -1;

        if (connection != null)
        {
            try
            {
                String query = "INSERT INTO Transacciones (id_cajero) VALUES (?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                preparedStatement.setInt(1, idCajero);

                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0)
                {
                    ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                    if (generatedKeys.next())
                    {
                        idTransaccion = generatedKeys.getInt(1);
                    }
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }

        return idTransaccion;
    }

    // Función para guardar el detalle de transacción en la base de datos
    private void guardarDetalleTransaccion(int idTransaccion, int idProducto, int cantidad) {
        Connection connection = Conexion_MySQL.getConnection();

        if (connection != null)
        {
            try
            {
                String nombreProducto = obtenerNombreProducto(idProducto); // Obtener el nombre del producto
                String query = "INSERT INTO DetallesTransaccion (id_transaccion, id_producto, nombre_producto, cantidad) VALUES (?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, idTransaccion);
                preparedStatement.setInt(2, idProducto);
                preparedStatement.setString(3, nombreProducto); // Usar el nombre del producto obtenido
                preparedStatement.setInt(4, cantidad);

                preparedStatement.executeUpdate();
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }
    }

    // ID Seleccionado
    private int obtenerIdProductoPorNombre(String nombreProducto) {
        Connection connection = Conexion_MySQL.getConnection();
        int idProducto = -1;

        if (connection != null)
        {
            try
            {
                String query = "SELECT id FROM Productos WHERE nombre = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, nombreProducto);

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next())
                {
                    idProducto = resultSet.getInt("id");
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }

        return idProducto;
    }

    // Obtener nombre del Producto
    private String obtenerNombreProducto(int idProducto) {
        String nombreProducto = null;

        Connection connection = Conexion_MySQL.getConnection();
        if (connection != null)
        {
            try
            {
                String query = "SELECT nombre FROM Productos WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, idProducto);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next())
                {
                    nombreProducto = resultSet.getString("nombre");
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }

        return nombreProducto;
    }

    // Función para actualizar el stock de un producto en la base de datos
    private void actualizarStockEnBaseDeDatos(int idProducto, int nuevoStock) {
        Connection connection = Conexion_MySQL.getConnection();

        if (connection != null)
        {
            try
            {
                String query = "UPDATE Productos SET stock = ? WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, nuevoStock);
                preparedStatement.setInt(2, idProducto);

                preparedStatement.executeUpdate();
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }
    }

    // Producto Seleccionado
    private int obtenerStockProducto(int idProducto) {
        Connection connection = Conexion_MySQL.getConnection();
        int stock = 0;

        if (connection != null)
        {
            try
            {
                String query = "SELECT stock FROM Productos WHERE id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, idProducto);

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next())
                {
                    stock = resultSet.getInt("stock");
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }
        return stock;
    }

    /* Mostrar productos */
    // Mostrar todos los productos en la tabla
    private void mostrarTodosLosProductos() {
        productTableModel.setRowCount(0);

        Connection connection = Conexion_MySQL.getConnection();
        if (connection != null)
        {
            String query = "SELECT * FROM Productos";

            try (PreparedStatement stmt = connection.prepareStatement(query))
            {
                ResultSet rs = stmt.executeQuery();

                while (rs.next())
                {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    int stock = rs.getInt("stock");
                    productTableModel.addRow(new Object[]
                    {
                        id, nombre, precio, stock
                    });
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }
    }

    // Mostrar productos por ID en la tabla
    private void mostrarProductosPorID(String idBusqueda) {
        DefaultTableModel model = (DefaultTableModel) jTable_Productos.getModel();
        model.setRowCount(0);

        Connection connection = Conexion_MySQL.getConnection();

        if (connection != null)
        {
            String query = "SELECT * FROM Productos WHERE id = ?";

            try (PreparedStatement cone = connection.prepareStatement(query))
            {
                cone.setInt(1, Integer.parseInt(idBusqueda));
                ResultSet rs = cone.executeQuery();

                while (rs.next())
                {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    int stock = rs.getInt("stock");
                    model.addRow(new Object[]
                    {
                        id, nombre, precio, stock
                    });
                }
            } catch (SQLException | NumberFormatException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }
    }

    // Mostrar productos por nombre en la tabla
    private void mostrarProductosPorNombre(String nombreBusqueda) {
        DefaultTableModel model = (DefaultTableModel) jTable_Productos.getModel();
        model.setRowCount(0);

        Connection connection = Conexion_MySQL.getConnection();

        if (connection != null)
        {
            String query = "SELECT * FROM Productos WHERE nombre = ?";

            try (PreparedStatement cone = connection.prepareStatement(query))
            {
                cone.setString(1, nombreBusqueda);
                ResultSet rs = cone.executeQuery();

                while (rs.next())
                {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    double precio = rs.getDouble("precio");
                    int stock = rs.getInt("stock");
                    model.addRow(new Object[]
                    {
                        id, nombre, precio, stock
                    });
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }
    }

    // Mostrar Carrito de Compras
    private void mostrarElementosCarrito() {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Productos en el carrito:\n");

        for (ProductoCarrito producto : carrito)
        {
            mensaje.append(producto.getCantidad()).append(" unidades de ").append(producto.getNombre()).append("\n");
        }

        JOptionPane.showMessageDialog(this, mensaje.toString(), "Carrito de Compras", JOptionPane.INFORMATION_MESSAGE);
    }

    /* Mensajes */
    // Mensaje Error
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Mensaje Ingreso Productos
    private String obtenerInput(String mensaje, String titulo) {
        return JOptionPane.showInputDialog(this, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
    }

    // Mensaje Confirmacion
    private void mostrarMensajeConfirmacion(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    // Mensaje Informacion
    private void mostrarMensajeInformacion(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    /* Extras */
    // Configurar las pantallas
    private void configurarVentana() {
        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);

        // Evitar que la ventana pueda ser redimensionada
        setResizable(false);
    }

    // Volver al Login
    private void volverALogin() {
        dispose();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Confirmar;
    private javax.swing.JButton jButton_ID;
    private javax.swing.JButton jButton_Imprimir;
    private javax.swing.JButton jButton_Nombre;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_TituloBuscarBotones;
    private javax.swing.JLabel jLabel_TituloInteraccionBotones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaTabla;
    private javax.swing.JPanel jPanel_CajaTodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_Productos;
    private javax.swing.JTable jTable_Productos;
    private javax.swing.JTextField jTextField_Busqueda;
    // End of variables declaration//GEN-END:variables
}
