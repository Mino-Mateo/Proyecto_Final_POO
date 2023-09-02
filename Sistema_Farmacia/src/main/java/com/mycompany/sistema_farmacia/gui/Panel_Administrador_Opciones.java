/* Paquete de Clase */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Importaciones */
// Librerias
import javax.swing.*;

/* Clase Panel Opciones Administrador */
public class Panel_Administrador_Opciones extends javax.swing.JFrame {

    // Inicializador
    public Panel_Administrador_Opciones() {
        initComponents();
        configurarVentana();
    }

    // Componentes Graficos
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CajaGeneral = new javax.swing.JPanel();
        jPanel_CajaTitulo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jPanel_CajaOpciones = new javax.swing.JPanel();
        jButton_Stock = new javax.swing.JButton();
        jButton_Historial = new javax.swing.JButton();
        jButton_AddCajero = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CajaGeneral.setBackground(new java.awt.Color(225, 243, 255));

        jPanel_CajaTitulo.setBackground(new java.awt.Color(225, 243, 255));

        jLabel_Titulo.setBackground(new java.awt.Color(225, 243, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Opciones-removebg-preview.png"))); // NOI18N
        jLabel_Titulo.setText("Menu de Opciones");

        javax.swing.GroupLayout jPanel_CajaTituloLayout = new javax.swing.GroupLayout(jPanel_CajaTitulo);
        jPanel_CajaTitulo.setLayout(jPanel_CajaTituloLayout);
        jPanel_CajaTituloLayout.setHorizontalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel_CajaTituloLayout.setVerticalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaTituloLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_CajaOpciones.setBackground(new java.awt.Color(225, 243, 255));

        jButton_Stock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Producto-removebg-preview.png"))); // NOI18N
        jButton_Stock.setText("Stock de Productos");
        jButton_Stock.setToolTipText("");
        jButton_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StockActionPerformed(evt);
            }
        });

        jButton_Historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/historial-removebg-preview.png"))); // NOI18N
        jButton_Historial.setText("Historial de Transacciones");
        jButton_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HistorialActionPerformed(evt);
            }
        });

        jButton_AddCajero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/Cliente-removebg-preview.png"))); // NOI18N
        jButton_AddCajero.setText("Manejar Usuarios");
        jButton_AddCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddCajeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CajaOpcionesLayout = new javax.swing.GroupLayout(jPanel_CajaOpciones);
        jPanel_CajaOpciones.setLayout(jPanel_CajaOpcionesLayout);
        jPanel_CajaOpcionesLayout.setHorizontalGroup(
            jPanel_CajaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaOpcionesLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel_CajaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_Stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Historial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_AddCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel_CajaOpcionesLayout.setVerticalGroup(
            jPanel_CajaOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaOpcionesLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton_Historial, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton_AddCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jButton_Salir.setBackground(new java.awt.Color(225, 243, 255));
        jButton_Salir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/java/com/mycompany/sistema_farmacia/Imagenes/salir-removebg-preview.png"))); // NOI18N
        jButton_Salir.setText("SALIR");
        jButton_Salir.setBorder(null);
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CajaGeneralLayout = new javax.swing.GroupLayout(jPanel_CajaGeneral);
        jPanel_CajaGeneral.setLayout(jPanel_CajaGeneralLayout);
        jPanel_CajaGeneralLayout.setHorizontalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_CajaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel_CajaGeneralLayout.setVerticalGroup(
            jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGroup(jPanel_CajaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel_CajaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    /* Botones */
    // Boton Stock
    private void jButton_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StockActionPerformed

        // Logica
        regresarPantalla(new Panel_Administrador_Stock());
    }//GEN-LAST:event_jButton_StockActionPerformed

    // Boton Historial
    private void jButton_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HistorialActionPerformed

        // Logica
        regresarPantalla(new Panel_Administrador_Historial());
    }//GEN-LAST:event_jButton_HistorialActionPerformed

    // Boton Cajeros
    private void jButton_AddCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddCajeroActionPerformed

        // Logica
        regresarPantalla(new Panel_Administrador_Cajeros());
    }//GEN-LAST:event_jButton_AddCajeroActionPerformed

    // Boton Salir
    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed

        // Variables
        int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas salir?", "Confirmación", JOptionPane.YES_NO_OPTION);

        // Logica
        if (opcion == JOptionPane.YES_OPTION)
        {
            volverALogin();
        }
    }//GEN-LAST:event_jButton_SalirActionPerformed

    /* Pantallas */
    // Regresar Pantalla
    private void regresarPantalla(javax.swing.JFrame nuevaPantalla) {
        dispose();
        nuevaPantalla.setVisible(true);
    }

    // Volver al Login
    private void volverALogin() {
        dispose();
        Login loginPantalla = new Login();
        loginPantalla.setVisible(true);
    }

    // Configurar las pantallas
    private void configurarVentana() {

        // Centrar la ventana en el escritorio
        setLocationRelativeTo(null);

        // Evitar que la ventana pueda ser redimensionada
        setResizable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddCajero;
    private javax.swing.JButton jButton_Historial;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JButton jButton_Stock;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JPanel jPanel_CajaGeneral;
    private javax.swing.JPanel jPanel_CajaOpciones;
    private javax.swing.JPanel jPanel_CajaTitulo;
    // End of variables declaration//GEN-END:variables
}
