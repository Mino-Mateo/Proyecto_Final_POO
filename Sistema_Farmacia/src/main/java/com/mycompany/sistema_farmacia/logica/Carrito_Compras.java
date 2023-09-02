/* Paquete clase */
package main.java.com.mycompany.sistema_farmacia.logica;

/* Clase Carrito*/
public class Carrito_Compras {

    // Variables
    private int idProducto;
    private String nombre;
    private int cantidad;

    // Metodos
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Inicializar
    public Carrito_Compras(int idProducto, String nombre, int cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}
