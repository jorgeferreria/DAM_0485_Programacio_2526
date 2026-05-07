package pkg014bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        crearTaula();
        insertarRegistre(demanarDadesPersona());

    }

    public static Connection getConnection() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/prova";
        String usuario = "root";
        String contrasena = "1234";

        // Class.forName(driver); // Obsoleto, solo para versiones antiguas
        return DriverManager.getConnection(url, usuario, contrasena);
    }

    public static void crearTaula() {
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

    public static void insertarRegistre(Persona p) {
        // try-with-resources
        try (Connection conexion = getConnection(); 
                Statement statement = conexion.createStatement()) {

            String sql = "INSERT INTO ejemplo_tabla (nombre, edad) VALUES ('"
                    + p.getNombre() + "', " + p.getEdad() + ")";
            int filasInsertadas = statement.executeUpdate(sql);
            System.out.println("Filas insertadas: " + filasInsertadas);

        } catch (SQLException e) {
            System.out.println("Error al insertar el registro: " + e.getMessage());

        }

    }

    public static void modificarRegiste() {
        try (Connection conexion = getConnection(); 
                Statement statement = conexion.createStatement()) {

            String sql = "UPDATE ejemplo_tabla SET edad = 35 WHERE nombre = 'Juan'";
            int filasActualizadas = statement.executeUpdate(sql);
            System.out.println("Filas actualizadas: " + filasActualizadas);

        } catch (SQLException e) {
            System.out.println("Error al actualizar el registro: " + e.getMessage());
        }
    }

    public static void elimiarRegistre() {
        try (Connection conexion = getConnection(); 
                Statement statement = conexion.createStatement()) {

            String sql = "DELETE FROM ejemplo_tabla WHERE nombre = 'Juan'";
            int filasEliminadas = statement.executeUpdate(sql);
            System.out.println("Filas eliminadas: " + filasEliminadas);

        } catch (SQLException e) {
            System.out.println("Error al eliminar el registro: " + e.getMessage());

        }
    }

    public static Persona demanarDadesPersona() {
        Persona p = new Persona();

        Scanner sc = new Scanner(System.in);

        System.out.print("Dis-me el nom: ");
        p.setNombre(sc.nextLine());

        System.out.print("Dis-me l'edat: ");
        p.setEdad(sc.nextInt());

        return p;
    }

    public static void mostrarPersones() {
        try (Connection conexion = getConnection(); 
                Statement statement = conexion.createStatement()) {

            String sql = "SELECT * FROM ejemplo_tabla";
            ResultSet resultado = statement.executeQuery(sql);

            // Iterar sobre el resultado y mostrar cada registro
            while (resultado.next()) {
                int id = resultado.getInt("id"); // 1
                String nombre = resultado.getString("nombre"); // 2
                int edad = resultado.getInt("edad"); // 3
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
            }

            resultado.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar los registros: " + e.getMessage());

        }
    }
}
