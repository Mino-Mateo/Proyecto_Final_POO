package main.java.com.mycompany.sistema_farmacia.logica;

import java.sql.*;

public final class Conexion_MySQL {

    // Variables
    private static final String DB_URL = "jdbc:mysql://localhost/registro";
    private static final String USER = "root";
    private static final String PASS = "root_bas3";

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
