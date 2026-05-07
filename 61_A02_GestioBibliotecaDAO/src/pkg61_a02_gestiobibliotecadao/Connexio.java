package pkg61_a02_gestiobibliotecadao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexio {
    
    public static Connection getConnection() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/biblioteca_db";
        String usuario = "root";
        String contrasena = "1234";

        // Class.forName(driver); // Obsoleto, solo para versiones antiguas
        return DriverManager.getConnection(url, usuario, contrasena);
    }
    
}
