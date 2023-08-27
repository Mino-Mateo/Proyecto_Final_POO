package main.java.com.mycompany.sistema_farmacia.gui;

public class Panel_Cajero_Opciones extends javax.swing.JFrame {

    public Panel_Cajero_Opciones() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Movimiento_Fondo = new javax.swing.JPanel();
        Texto_Tipo_Movimiento = new javax.swing.JLabel();
        Boton_Salir_Movimiento = new javax.swing.JButton();
        Boton_Venta = new javax.swing.JButton();
        Boton_Detalle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Movimiento_Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Movimiento_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto_Tipo_Movimiento.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        Texto_Tipo_Movimiento.setText("Elegir Tipo de Movimiento");
        Movimiento_Fondo.add(Texto_Tipo_Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Boton_Salir_Movimiento.setBackground(new java.awt.Color(255, 51, 51));
        Boton_Salir_Movimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Boton_Salir_Movimiento.setText("Salir");
        Movimiento_Fondo.add(Boton_Salir_Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 110, 40));

        Boton_Venta.setBackground(new java.awt.Color(204, 204, 204));
        Boton_Venta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_Venta.setText("Venta");
        Boton_Venta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Movimiento_Fondo.add(Boton_Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 170, 60));

        Boton_Detalle.setBackground(new java.awt.Color(204, 204, 204));
        Boton_Detalle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Boton_Detalle.setText("Detalle de Compra");
        Boton_Detalle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Boton_Detalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_DetalleActionPerformed(evt);
            }
        });
        Movimiento_Fondo.add(Boton_Detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Movimiento_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Movimiento_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_DetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_DetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_DetalleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Detalle;
    private javax.swing.JButton Boton_Salir_Movimiento;
    private javax.swing.JButton Boton_Venta;
    private javax.swing.JPanel Movimiento_Fondo;
    private javax.swing.JLabel Texto_Tipo_Movimiento;
    // End of variables declaration//GEN-END:variables
}
