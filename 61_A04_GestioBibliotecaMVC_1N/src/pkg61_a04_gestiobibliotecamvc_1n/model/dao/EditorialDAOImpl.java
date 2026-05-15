package pkg61_a04_gestiobibliotecamvc_1n.model.dao;

import pkg61_a04_gestiobibliotecamvc_1n.model.db.Connexio;
import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Editorial;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EditorialDAOImpl implements EditorialDAO {

    @Override
    public boolean registrar(Editorial e) {
        String sql = "INSERT INTO editorials (nom, pais) VALUES (?, ?)";
        try (Connection conn = Connexio.getConnection(); 
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, e.getNom());
            pstmt.setString(2, e.getPais());
            return pstmt.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Editorial> obtenirTotes() {
        List<Editorial> llista = new ArrayList<>();
        String sql = "SELECT * FROM editorials";
        try (Connection conn = Connexio.getConnection(); 
                Statement stmt = conn.createStatement(); 
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                llista.add(new Editorial(rs.getInt("id"), rs.getString("nom"), rs.getString("pais")));
            }
        } catch (SQLException ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        return llista;
    }
}
