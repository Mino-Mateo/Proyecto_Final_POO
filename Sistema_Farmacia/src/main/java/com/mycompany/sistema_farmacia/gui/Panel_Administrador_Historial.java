/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Clase Publica */
public class Panel_Administrador_Historial extends javax.swing.JFrame {

    /* Inicializador */
    public Panel_Administrador_Historial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jPanel_CajaTitulo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_SubTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_CajaBusqueda = new javax.swing.JPanel();
        jPanel_CajaBoton = new javax.swing.JPanel();
        jButton_BotonBuscar = new javax.swing.JButton();
        jTextField_TextoBuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Facturas = new javax.swing.JTable();
        jPanel_Volver = new javax.swing.JPanel();
        jButton_Volver = new javax.swing.JButton();
        jPanel_Imprimir = new javax.swing.JPanel();
        jButton_Imprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Titulo.setText("Historial de Transacciones");

        javax.swing.GroupLayout jPanel_CajaTituloLayout = new javax.swing.GroupLayout(jPanel_CajaTitulo);
        jPanel_CajaTitulo.setLayout(jPanel_CajaTituloLayout);
        jPanel_CajaTituloLayout.setHorizontalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaTituloLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo)
                .addGap(40, 40, 40))
        );
        jPanel_CajaTituloLayout.setVerticalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Buscar por codigo");

        javax.swing.GroupLayout jPanel_SubTituloLayout = new javax.swing.GroupLayout(jPanel_SubTitulo);
        jPanel_SubTitulo.setLayout(jPanel_SubTituloLayout);
        jPanel_SubTituloLayout.setHorizontalGroup(
            jPanel_SubTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_SubTituloLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );
        jPanel_SubTituloLayout.setVerticalGroup(
            jPanel_SubTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SubTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_BotonBuscar.setText("Buscar");
        jButton_BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BotonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CajaBotonLayout = new javax.swing.GroupLayout(jPanel_CajaBoton);
        jPanel_CajaBoton.setLayout(jPanel_CajaBotonLayout);
        jPanel_CajaBotonLayout.setHorizontalGroup(
            jPanel_CajaBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaBotonLayout.createSequentialGroup()
                .addComponent(jButton_BotonBuscar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_CajaBotonLayout.setVerticalGroup(
            jPanel_CajaBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_BotonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jTextField_TextoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TextoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CajaBusquedaLayout = new javax.swing.GroupLayout(jPanel_CajaBusqueda);
        jPanel_CajaBusqueda.setLayout(jPanel_CajaBusquedaLayout);
        jPanel_CajaBusquedaLayout.setHorizontalGroup(
            jPanel_CajaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaBusquedaLayout.createSequentialGroup()
                .addComponent(jTextField_TextoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel_CajaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_CajaBusquedaLayout.setVerticalGroup(
            jPanel_CajaBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_CajaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField_TextoBuscar)
        );

        jTable_Facturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Transaccion", "Cajero", "Producto", "Cantidad Producto", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable_Facturas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jButton_Volver.setText("Volver");

        javax.swing.GroupLayout jPanel_VolverLayout = new javax.swing.GroupLayout(jPanel_Volver);
        jPanel_Volver.setLayout(jPanel_VolverLayout);
        jPanel_VolverLayout.setHorizontalGroup(
            jPanel_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_VolverLayout.setVerticalGroup(
            jPanel_VolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_VolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_Imprimir.setText("Imprimir");

        javax.swing.GroupLayout jPanel_ImprimirLayout = new javax.swing.GroupLayout(jPanel_Imprimir);
        jPanel_Imprimir.setLayout(jPanel_ImprimirLayout);
        jPanel_ImprimirLayout.setHorizontalGroup(
            jPanel_ImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ImprimirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_ImprimirLayout.setVerticalGroup(
            jPanel_ImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ImprimirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(jPanel_SubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jPanel_CajaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_Volver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel_Imprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addComponent(jPanel_SubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_CajaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jTextField_TextoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TextoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TextoBuscarActionPerformed

    private void jButton_BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BotonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_BotonBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BotonBuscar;
    private javax.swing.JButton jButton_Imprimir;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_CajaBoton;
    private javax.swing.JPanel jPanel_CajaBusqueda;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaTitulo;
    private javax.swing.JPanel jPanel_Imprimir;
    private javax.swing.JPanel jPanel_SubTitulo;
    private javax.swing.JPanel jPanel_Volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Facturas;
    private javax.swing.JTextField jTextField_TextoBuscar;
    // End of variables declaration//GEN-END:variables
}
