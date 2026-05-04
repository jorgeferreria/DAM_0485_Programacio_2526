package pkg014bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection conexion = null;
        Statement statement = null;
        int files = 0;

        try {

            conexion = getConnection();
            statement = conexion.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS ejemplo_tabla ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nombre VARCHAR(255) NOT NULL,"
                    + "edad INT)";
            files = statement.executeUpdate(sql);
            System.out.println("Tabla creada exitosamente.");
            System.out.println("Files afectades: " + files);

        } catch (SQLException e) {
            System.out.println("Error al crear la tabla: " + e.getMessage());

        } finally {
            // Cerrar la conexión y el statement
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

    }

    public static Connection getConnection() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/prova";
        String usuario = "root";
        String contrasena = "1234";

        // Class.forName(driver); // Obsoleto, solo para versiones antiguas
        return DriverManager.getConnection(url, usuario, contrasena);
    }

}
