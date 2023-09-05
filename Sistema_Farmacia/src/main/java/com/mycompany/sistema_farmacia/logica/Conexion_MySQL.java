/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.logica;

/* Importaciones */
import java.sql.*;

/* Clase Publica */
public final class Conexion_MySQL {

    // Variables
    private static final String DB_URL = "jdbc:mysql://localhost/farmacia";
    private static final String USER = "root";
    private static final String PASS = "root_bas3";

    // Cerrar Conexion
    public static void cerrarConexion(Connection cone) {
        if (cone != null)
        {
            try
            {
                cone.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Constructor
    private Conexion_MySQL() {

    }

    // Métodos y propiedades
    public static Connection getConnection() {
        Connection cone = null;
        try
        {
            cone = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return cone;
    }
}
