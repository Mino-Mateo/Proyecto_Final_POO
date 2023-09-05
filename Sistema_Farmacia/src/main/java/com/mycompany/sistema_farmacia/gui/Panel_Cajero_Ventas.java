/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Clase Publica */
// Clases o Paquetes
import main.java.com.mycompany.sistema_farmacia.logica.Conexion_MySQL;
import main.java.com.mycompany.sistema_farmacia.logica.Carrito_Compras;

// Librerias
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/* Clase Panel_Cajero_Ventas*/
public class Panel_Cajero_Ventas extends javax.swing.JFrame {

    // Variable carrito
    private final ArrayList<Carrito_Compras> carrito = new ArrayList<>();

    // Panel Lateral
    private String usuario;
    private int idUsuario;
    private final DefaultTableModel productTableModel;
    private final String nombreUsuario;

    // Inicializador
    public Panel_Cajero_Ventas(String nombreUsuario, int idUsuario, String nombreCompletoUsuario) {
        initComponents();
        configurarVentana();

        // Inicializar componentes
        this.usuario = usuario;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;

        // Panel Lateral Vista
        productTableModel = (DefaultTableModel) jTable_Productos.getModel();
        Label_Nombre_Cajero.setText("Usuario: " + nombreUsuario);
        Label_id_Cajero.setText("ID: " + idUsuario);
        Label_NombreUsuario_Cajero.setText("Nombre: " + nombreCompletoUsuario);

        // Tabla de productos
        mostrarProductos();
    }

    // Componentes Graficos
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
        jScrollPane_Productos = new javax.swing.JScrollPane();
        jPanel_CajaTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Label_NombreUsuario_Cajero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Label_id_Cajero = new javax.swing.JLabel();
        Label_Nombre_Cajero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(225, 243, 255));

        jPanel_CajaGeneral.setBackground(new java.awt.Color(225, 243, 255));

        jPanel1.setBackground(new java.awt.Color(225, 243, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Ventas-removebg-preview.png"))); // NOI18N
        jLabel1.setText("Venta de Productos");

        jButton_Volver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/salir-removebg-preview.png"))); // NOI18N
        jButton_Volver.setText("SALIR");
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
                .addGap(163, 163, 163)
                .addComponent(jButton_Volver)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_CajaTodo.setBackground(new java.awt.Color(225, 243, 255));

        jLabel_TituloBuscarBotones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_TituloBuscarBotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/lupa-removebg-preview.png"))); // NOI18N
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
        jLabel_TituloInteraccionBotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/interacciones-removebg-preview.png"))); // NOI18N
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
                        .addComponent(jButton_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaTodoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_TituloBuscarBotones)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel_CajaTodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaTodoLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel_TituloInteraccionBotones))
                    .addGroup(jPanel_CajaTodoLayout.createSequentialGroup()
                        .addComponent(jButton_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton_Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
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
                    .addComponent(jButton_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
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
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(193, 225, 255));

        jPanel3.setBackground(new java.awt.Color(193, 225, 255));

        Label_NombreUsuario_Cajero.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        Label_NombreUsuario_Cajero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_NombreUsuario_Cajero.setText("-------------");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/CajeroIcon-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel2.setText("CAJERO");

        Label_id_Cajero.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        Label_id_Cajero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_id_Cajero.setText("-------------");

        Label_Nombre_Cajero.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        Label_Nombre_Cajero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Nombre_Cajero.setText("------------");
        Label_Nombre_Cajero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Label_Nombre_Cajero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Label_id_Cajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_NombreUsuario_Cajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Label_Nombre_Cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Label_id_Cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Label_NombreUsuario_Cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_Nombre_Cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Botones */
    // Boton Salir
    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed

        // Variables
        int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas salir?", "Confirmación", JOptionPane.YES_NO_OPTION);

        // Logica
        if (opcion == JOptionPane.YES_OPTION)
        {
            volverALogin();
        }
    }//GEN-LAST:event_jButton_VolverActionPerformed

    // Boton Buscar por ID
    private void jButton_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IDActionPerformed

        // Variables
        String busqueda = jTextField_Busqueda.getText().trim();

        // Logica
        if (busqueda.isEmpty())
        {
            mostrarProductos();
        } else
        {
            mostrarProductosPorID(busqueda);
        }
    }//GEN-LAST:event_jButton_IDActionPerformed

    // Boton Buscar por Nombre
    private void jButton_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NombreActionPerformed

        // Variables
        String busqueda = jTextField_Busqueda.getText().trim();

        // Logica
        if (busqueda.isEmpty())
        {
            mostrarProductos();
        } else
        {
            mostrarProductosPorNombre(busqueda);
        }
    }//GEN-LAST:event_jButton_NombreActionPerformed

    // Boton Agregar Productos
    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed

        // Variables
        int selectedRow = jTable_Productos.getSelectedRow();

        // Logica
        if (selectedRow == -1)
        {
            mostrarMensajeError("Seleccione un producto de la tabla");
            return;
        }

        // Variables Tabla
        String nombreProducto = (String) jTable_Productos.getValueAt(selectedRow, 1);
        int idProducto = obtenerIdProducto(nombreProducto);
        int stockDisponible = obtenerStock(idProducto);
        System.out.println("Stock disponible: " + stockDisponible);

        // Logica comprobacion
        if (stockDisponible <= 0)
        {
            mostrarMensajeError("No hay stock disponible para este producto");
            return;
        }

        // Ingreso de Cantidad
        String cantidadStr = obtenerInput("Ingrese la cantidad de producto a añadir:", "Agregar a Venta");

        // Logica cantidad
        if (cantidadStr != null && !cantidadStr.isEmpty())
        {
            try
            {
                int cantidad = Integer.parseInt(cantidadStr);
                System.out.println("Cantidad ingresada: " + cantidad);

                if (cantidad > 0 && cantidad <= stockDisponible)
                {
                    agregarAlCarrito(idProducto, nombreProducto, cantidad);
                    mensajeConfirmacion(cantidad + " unidades de " + nombreProducto + " agregadas al carrito", "Producto Agregado");
                    mostrarProductosCarrito();
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

        // Variables
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea continuar con la transacción?", "Confirmar Venta", JOptionPane.YES_NO_OPTION);

        // Logica
        if (respuesta == JOptionPane.YES_OPTION)
        {

            // Mensaje
            String idCajeroStr = JOptionPane.showInputDialog(this, "Ingrese su ID de Cajero:");

            // Logica
            if (idCajeroStr != null && !idCajeroStr.isEmpty())
            {
                try
                {

                    // Variable
                    int idCajero = Integer.parseInt(idCajeroStr);
                    int idTransaccion = guardarTransaccion(idCajero);
                    System.out.println("ID de Transaccion: " + idTransaccion);

                    // Logica Guardado
                    for (Carrito_Compras producto : carrito)
                    {

                        // Varaibles
                        int idProducto = obtenerIdProducto(producto.getNombre());
                        int cantidad = producto.getCantidad();
                        System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + cantidad);

                        // Guardado
                        guardarDetalleTransaccion(idTransaccion, idProducto, cantidad);

                        // Varaibles nuevas
                        int stockActual = obtenerStock(idProducto);
                        int nuevoStock = stockActual - cantidad;

                        // Actualizar Tabla
                        actualizarStock(idProducto, nuevoStock);
                    }

                    mensajeInformacion("Venta realizada exitosamente", "Venta Realizada");

                    carrito.clear();
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

        // Variable
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro de cancelar la venta?", "Cancelar Venta", JOptionPane.YES_NO_OPTION);

        // Logica
        if (respuesta == JOptionPane.YES_OPTION)
        {
            carrito.clear();
            mensajeInformacion("Venta cancelada. El carrito ha sido vaciado.", "Venta Cancelada");
        }
    }//GEN-LAST:event_jButton_CancelarActionPerformed

    /* Funciones */
    // Obtener ID
    private int obtenerIdProducto(String nombreProducto) {

        // Variables
        Connection cone = Conexion_MySQL.getConnection();
        int idProducto = -1;

        // Logica
        if (cone != null)
        {
            try
            {
                // Query
                String query = "SELECT id FROM Productos WHERE nombre = ?";
                PreparedStatement conex = cone.prepareStatement(query);
                conex.setString(1, nombreProducto);
                ResultSet resultSet = conex.executeQuery();

                // Logica
                if (resultSet.next())
                {
                    idProducto = resultSet.getInt("id");
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(cone);
            }
        }

        return idProducto;
    }

    // Obtener Nombre
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

    // Obtener Stock
    private int obtenerStock(int idProducto) {

        // Variables
        Connection cone = Conexion_MySQL.getConnection();
        int stock = 0;

        // Logica
        if (cone != null)
        {
            try
            {
                //Query
                String query = "SELECT stock FROM Productos WHERE id = ?";
                PreparedStatement conex = cone.prepareStatement(query);
                conex.setInt(1, idProducto);
                ResultSet rs = conex.executeQuery();

                //Logica
                if (rs.next())
                {
                    stock = rs.getInt("stock");
                }
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(cone);
            }
        }
        return stock;
    }

    // Actualizar Stock
    private void actualizarStock(int idProducto, int nuevoStock) {

        // Variables
        Connection cone = Conexion_MySQL.getConnection();

        // Logica
        if (cone != null)
        {
            try
            {
                String query = "UPDATE Productos SET stock = ? WHERE id = ?";
                PreparedStatement conex = cone.prepareStatement(query);
                conex.setInt(1, nuevoStock);
                conex.setInt(2, idProducto);

                conex.executeUpdate();
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(cone);
            }
        }
    }

    // Mostrar todos los productos en la tabla
    private void mostrarProductos() {

        // Variables
        productTableModel.setRowCount(0);
        Connection cone = Conexion_MySQL.getConnection();

        // Logica
        if (cone != null)
        {
            String query = "SELECT * FROM Productos";

            try (PreparedStatement conex = cone.prepareStatement(query))
            {
                ResultSet rs = conex.executeQuery();

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
                Conexion_MySQL.cerrarConexion(cone);
            }
        }
    }

    // Mostrar por ID
    private void mostrarProductosPorID(String idBusqueda) {

        // Variables
        DefaultTableModel model = (DefaultTableModel) jTable_Productos.getModel();
        model.setRowCount(0);
        Connection cone = Conexion_MySQL.getConnection();

        // Logica
        if (cone != null)
        {
            // Query
            String query = "SELECT * FROM Productos WHERE id = ?";

            // Logica
            try (PreparedStatement conex = cone.prepareStatement(query))
            {
                conex.setInt(1, Integer.parseInt(idBusqueda));
                ResultSet rs = conex.executeQuery();

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
                Conexion_MySQL.cerrarConexion(cone);
            }
        }
    }

    // Mostrar por Nombre
    private void mostrarProductosPorNombre(String nombreBusqueda) {

        // Variables
        DefaultTableModel model = (DefaultTableModel) jTable_Productos.getModel();
        model.setRowCount(0);
        Connection cone = Conexion_MySQL.getConnection();

        // Logica
        if (cone != null)
        {
            //Query
            String query = "SELECT * FROM Productos WHERE nombre = ?";

            // Logica
            try (PreparedStatement conex = cone.prepareStatement(query))
            {
                conex.setString(1, nombreBusqueda);
                ResultSet rs = conex.executeQuery();

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
                Conexion_MySQL.cerrarConexion(cone);
            }
        }
    }

    // Agregar al Carrito
    private void agregarAlCarrito(int idProducto, String nombre, int cantidad) {

        // Varaible
        Carrito_Compras productoEnCarrito = new Carrito_Compras(idProducto, nombre, cantidad);

        // Logica
        carrito.add(productoEnCarrito);
    }

    // Mostrar Carrito
    private void mostrarProductosCarrito() {

        // Variables
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Productos en el carrito:\n");

        // Logica
        for (Carrito_Compras producto : carrito)
        {
            mensaje.append(producto.getCantidad()).append(" unidades de ").append(producto.getNombre()).append("\n");
        }

        JOptionPane.showMessageDialog(this, mensaje.toString(), "Carrito de Compras", JOptionPane.INFORMATION_MESSAGE);
    }

    // Guardar Transaccion
    private int guardarTransaccion(int idCajero) {

        // Variable
        Connection connection = Conexion_MySQL.getConnection();
        int idTransaccion = -1;

        // Logica
        if (connection != null)
        {
            try
            {
                // Query
                String query = "INSERT INTO Transacciones (id_cajero) VALUES (?)";
                PreparedStatement cone = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
                cone.setInt(1, idCajero);
                int rowsAffected = cone.executeUpdate();

                // Logica
                if (rowsAffected > 0)
                {
                    ResultSet generatedKeys = cone.getGeneratedKeys();
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

    // Guardar Detalle Transaccion
    private void guardarDetalleTransaccion(int idTransaccion, int idProducto, int cantidad) {

        // Variables
        Connection connection = Conexion_MySQL.getConnection();

        // Logica
        if (connection != null)
        {
            try
            {
                // Query
                String nombreProducto = obtenerNombreProducto(idProducto); // Obtener el nombre del producto
                String query = "INSERT INTO DetallesTransaccion (id_transaccion, id_producto, nombre_producto, cantidad) VALUES (?, ?, ?, ?)";
                PreparedStatement cone = connection.prepareStatement(query);
                cone.setInt(1, idTransaccion);
                cone.setInt(2, idProducto);
                cone.setString(3, nombreProducto); // Usar el nombre del producto obtenido
                cone.setInt(4, cantidad);

                cone.executeUpdate();
            } catch (SQLException e)
            {
                e.printStackTrace();
            } finally
            {
                Conexion_MySQL.cerrarConexion(connection);
            }
        }
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
    private void mensajeConfirmacion(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    // Mensaje Informacion
    private void mensajeInformacion(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    /* Pantallas */
    // Configurar las pantallas
    private void configurarVentana() {
        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);
    }

    // Volver al Login
    private void volverALogin() {
        dispose();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_NombreUsuario_Cajero;
    private javax.swing.JLabel Label_Nombre_Cajero;
    private javax.swing.JLabel Label_id_Cajero;
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Confirmar;
    private javax.swing.JButton jButton_ID;
    private javax.swing.JButton jButton_Nombre;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_TituloBuscarBotones;
    private javax.swing.JLabel jLabel_TituloInteraccionBotones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaTabla;
    private javax.swing.JPanel jPanel_CajaTodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane_Productos;
    private javax.swing.JTable jTable_Productos;
    private javax.swing.JTextField jTextField_Busqueda;
    // End of variables declaration//GEN-END:variables
}
