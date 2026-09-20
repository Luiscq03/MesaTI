/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/MesaTi";
    
     private static Connection conn = null;

    private ConexionBD() {
        
    }

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // Carga el controlador de MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Crea la conexión a la base de datos
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                // Manejo de errores
                e.printStackTrace();
            }
        }
        return conn;
    }
}
