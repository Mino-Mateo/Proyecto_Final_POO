/* Paquetes */
package main.java.com.mycompany.sistema_farmacia;

/* Importaciones */
import main.java.com.mycompany.sistema_farmacia.gui.Login;

/* Clase Main */
public class Main_Sistema {

    /* Inicializador */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            /* Primera Pantalla Login */
            public void run() {
                Login log = new Login();
                log.setVisible(true);
            }
        });
    }
}
