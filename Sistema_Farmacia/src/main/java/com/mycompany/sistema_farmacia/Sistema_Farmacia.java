/* Paquetes */
package com.mycompany.sistema_farmacia;

/* Importaciones */
import com.mycompany.sistema_farmacia.igu.Login;

/* Clase Principal */
public class Sistema_Farmacia {

    /* Main Ejecutable */
    public static void main(String[] args) {

        /* Mostrar Pantalla Login */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login log = new Login();
                log.setVisible(true);
            }
        });
    }
}
