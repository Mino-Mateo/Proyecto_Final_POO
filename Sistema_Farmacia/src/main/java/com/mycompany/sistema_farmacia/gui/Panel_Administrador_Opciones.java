/* Paquete de Clase */
package main.java.com.mycompany.sistema_farmacia.gui;

/* Importaciones */
// Clases o Paquetes
// Librerias
import javax.swing.JOptionPane;

/* Clase Panel Opciones Administrador */
public class Panel_Administrador_Opciones extends javax.swing.JFrame {

    /* Inicializador */
    public Panel_Administrador_Opciones() {
        initComponents();
        configurarVentana();
    }

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

        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel_Titulo.setText("Menu de Opciones");

        javax.swing.GroupLayout jPanel_CajaTituloLayout = new javax.swing.GroupLayout(jPanel_CajaTitulo);
        jPanel_CajaTitulo.setLayout(jPanel_CajaTituloLayout);
        jPanel_CajaTituloLayout.setHorizontalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo)
                .addContainerGap())
        );
        jPanel_CajaTituloLayout.setVerticalGroup(
            jPanel_CajaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CajaTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton_Stock.setText("Agregar prodcutos al Stock");
        jButton_Stock.setToolTipText("");
        jButton_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StockActionPerformed(evt);
            }
        });

        jButton_Historial.setText("Historial de Transacciones");
        jButton_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HistorialActionPerformed(evt);
            }
        });

        jButton_AddCajero.setText("Añadir Cajeros");
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

        jButton_Salir.setText("Salir");
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
                .addComponent(jPanel_CajaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_CajaGeneralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel_CajaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
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

    /* Logica */
    // Boton Stock
    private void jButton_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StockActionPerformed
        manejarPantalla(new Panel_Administrador_Stock());
    }//GEN-LAST:event_jButton_StockActionPerformed

    // Boton Historial
    private void jButton_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HistorialActionPerformed
        manejarPantalla(new Panel_Administrador_Historial());
    }//GEN-LAST:event_jButton_HistorialActionPerformed

    // Boton Cajeros
    private void jButton_AddCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddCajeroActionPerformed
        manejarPantalla(new Panel_Administrador_Cajeros());

    }//GEN-LAST:event_jButton_AddCajeroActionPerformed

    // Boton Salir 
    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Deseas salir?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION)
        {
            volverALogin();
        }
    }//GEN-LAST:event_jButton_SalirActionPerformed

    /* Funciones */
    // Manejo de Pantalla
    private void manejarPantalla(javax.swing.JFrame nuevaPantalla) {
        dispose();
        nuevaPantalla.setVisible(true);
    }

    // Volver al Login
    private void volverALogin() {
        dispose();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }

    // Configuracion de Pantalla
    private void configurarVentana() {
        setLocationRelativeTo(null);
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
