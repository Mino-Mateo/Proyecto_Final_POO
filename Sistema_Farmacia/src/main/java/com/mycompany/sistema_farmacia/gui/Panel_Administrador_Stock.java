/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Clase Publica */
public class Panel_Administrador_Stock extends javax.swing.JFrame {

    /* Inicializador */
    public Panel_Administrador_Stock() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jPanel_CajaTitulo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_SubTitulo = new javax.swing.JPanel();
        jLabel_SubTitulo = new javax.swing.JLabel();
        jPanel_CajaOpciones = new javax.swing.JPanel();
        jComboBox_Opciones = new javax.swing.JComboBox<>();
        jPanel_Caja_Boton_AgregarE = new javax.swing.JPanel();
        jButton_AgregarExistente = new javax.swing.JButton();
        jPanel_Caja_Boton_AgregarN = new javax.swing.JPanel();
        jButton_AgregarNuevo = new javax.swing.JButton();
        jPanel_CajaSalir = new javax.swing.JPanel();
        jButton_Salir = new javax.swing.JButton();
        jPanel_CajaProductos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CajaTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_Titulo.setText("Stock de Productos");

        javax.swing.GroupLayout jPanel_CajaTituloLayout = new javax.swing.GroupLayout(jPanel_CajaTitulo);
        jPanel_CajaTitulo.setLayout(jPanel_CajaTituloLayout);
        jPanel_CajaTituloLayout.setHorizontalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaTituloLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo)
                .addGap(30, 30, 30))
        );
        jPanel_CajaTituloLayout.setVerticalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo)
                .addGap(17, 17, 17))
        );

        jLabel_SubTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_SubTitulo.setText("Seleccionar Producto");

        javax.swing.GroupLayout jPanel_SubTituloLayout = new javax.swing.GroupLayout(jPanel_SubTitulo);
        jPanel_SubTitulo.setLayout(jPanel_SubTituloLayout);
        jPanel_SubTituloLayout.setHorizontalGroup(
            jPanel_SubTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SubTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_SubTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_SubTituloLayout.setVerticalGroup(
            jPanel_SubTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SubTituloLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel_SubTitulo))
        );

        jComboBox_Opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5", "Producto 6", "Producto 7", "Producto 8", "Producto 9", "Producto 10" }));

        javax.swing.GroupLayout jPanel_CajaOpcionesLayout = new javax.swing.GroupLayout(jPanel_CajaOpciones);
        jPanel_CajaOpciones.setLayout(jPanel_CajaOpcionesLayout);
        jPanel_CajaOpcionesLayout.setHorizontalGroup(
            jPanel_CajaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox_Opciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_CajaOpcionesLayout.setVerticalGroup(
            jPanel_CajaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaOpcionesLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jComboBox_Opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton_AgregarExistente.setText("Agregar Producto Existente");

        javax.swing.GroupLayout jPanel_Caja_Boton_AgregarELayout = new javax.swing.GroupLayout(jPanel_Caja_Boton_AgregarE);
        jPanel_Caja_Boton_AgregarE.setLayout(jPanel_Caja_Boton_AgregarELayout);
        jPanel_Caja_Boton_AgregarELayout.setHorizontalGroup(
            jPanel_Caja_Boton_AgregarELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Caja_Boton_AgregarELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_AgregarExistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Caja_Boton_AgregarELayout.setVerticalGroup(
            jPanel_Caja_Boton_AgregarELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Caja_Boton_AgregarELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_AgregarExistente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_AgregarNuevo.setText("Agregar Producto Nuevo");

        javax.swing.GroupLayout jPanel_Caja_Boton_AgregarNLayout = new javax.swing.GroupLayout(jPanel_Caja_Boton_AgregarN);
        jPanel_Caja_Boton_AgregarN.setLayout(jPanel_Caja_Boton_AgregarNLayout);
        jPanel_Caja_Boton_AgregarNLayout.setHorizontalGroup(
            jPanel_Caja_Boton_AgregarNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_Caja_Boton_AgregarNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_AgregarNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_Caja_Boton_AgregarNLayout.setVerticalGroup(
            jPanel_Caja_Boton_AgregarNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_Caja_Boton_AgregarNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_AgregarNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_Salir.setText("Regresar al Menu");

        javax.swing.GroupLayout jPanel_CajaSalirLayout = new javax.swing.GroupLayout(jPanel_CajaSalir);
        jPanel_CajaSalir.setLayout(jPanel_CajaSalirLayout);
        jPanel_CajaSalirLayout.setHorizontalGroup(
            jPanel_CajaSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_CajaSalirLayout.setVerticalGroup(
            jPanel_CajaSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable_Productos);

        javax.swing.GroupLayout jPanel_CajaProductosLayout = new javax.swing.GroupLayout(jPanel_CajaProductos);
        jPanel_CajaProductos.setLayout(jPanel_CajaProductosLayout);
        jPanel_CajaProductosLayout.setHorizontalGroup(
            jPanel_CajaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaProductosLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel_CajaProductosLayout.setVerticalGroup(
            jPanel_CajaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_SubTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_CajaOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel_CajaSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addComponent(jPanel_Caja_Boton_AgregarE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jPanel_Caja_Boton_AgregarN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel_CajaProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_CajaSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                            .addComponent(jPanel_SubTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel_CajaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel_Caja_Boton_AgregarE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel_Caja_Boton_AgregarN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_CajaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AgregarExistente;
    private javax.swing.JButton jButton_AgregarNuevo;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JComboBox<String> jComboBox_Opciones;
    private javax.swing.JLabel jLabel_SubTitulo;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaOpciones;
    private javax.swing.JPanel jPanel_CajaProductos;
    private javax.swing.JPanel jPanel_CajaSalir;
    private javax.swing.JPanel jPanel_CajaTitulo;
    private javax.swing.JPanel jPanel_Caja_Boton_AgregarE;
    private javax.swing.JPanel jPanel_Caja_Boton_AgregarN;
    private javax.swing.JPanel jPanel_SubTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Productos;
    // End of variables declaration//GEN-END:variables
}
