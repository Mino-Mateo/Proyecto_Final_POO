/* Paquetes */
package main.java.com.mycompany.sistema_farmacia.logica;

/* Importaciones */
import java.sql.*;

/* Clase Publica */
public final class Conexion_MySQL {

    // Variables
    private static final String DB_URL = "jdbc:mysql://localhost/farmacia";
    private static final String USER = "root";
    private static final String PASS = "admin";

    public static void cerrarConexion(Connection connection) {
        if (connection != null)
        {
            try
            {
                connection.close();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    // Constructor privado para evitar instanciación
    private Conexion_MySQL() {
        // Constructor vacío o lógica adicional si es necesario
    }

    // Métodos y propiedades estáticas de la clase
    public static Connection getConnection() {
        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
}
