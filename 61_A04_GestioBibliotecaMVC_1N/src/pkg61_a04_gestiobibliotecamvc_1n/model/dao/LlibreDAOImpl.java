package pkg61_a04_gestiobibliotecamvc_1n.model.dao;

import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Llibre;
import pkg61_a04_gestiobibliotecamvc_1n.model.db.Connexio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Editorial;

public class LlibreDAOImpl implements LlibreDAO {

    @Override
    public boolean registrar(Llibre l) {
        boolean inserit = false;
        int files = 0;
        String sql = "INSERT INTO llibres (ISBN, titol, autor, pagines, id_editorial) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Connexio.getConnection(); 
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, l.getISBN());
            pstmt.setString(2, l.getTitol());
            pstmt.setString(3, l.getAutor());
            pstmt.setInt(4, l.getPagines());
            pstmt.setInt(5, l.getEditorial().getId());
            files = pstmt.executeUpdate();

            if (files > 0) {
                inserit = true;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al registrar: " + e.getMessage());
        }

        return inserit;
    }

    @Override
    public List<Llibre> obtenirTots() {
        List<Llibre> llista = new ArrayList<>();
        String sql = "SELECT l.*, e.nom as nom_ed, e.pais as pais_ed "
                + "FROM llibres l "
                + "INNER JOIN editorials e ON l.id_editorial = e.id";

        try (Connection conn = Connexio.getConnection(); 
                Statement pstmt = conn.createStatement(); 
                ResultSet rs = pstmt.executeQuery(sql)) {

            while (rs.next()) {
                // Creem l'objecte del costat "1"
                Editorial ed = new Editorial(
                        rs.getInt("id_editorial"),
                        rs.getString("nom_ed"),
                        rs.getString("pais_ed")
                );

                // Creem l'objecte del costat "N" i li injectem l'editorial
                Llibre l = new Llibre(
                        rs.getString("ISBN"),
                        rs.getString("titol"),
                        rs.getString("autor"),
                        rs.getInt("pagines"),
                        ed
                );
                l.setId(rs.getInt("id"));

                llista.add(l);
            }
        } catch (SQLException ex) {
            System.out.println("Error al llistar tots: " + ex.getMessage());
        }
        return llista;
    }

    @Override
    public List<Llibre> obtenirLlibresEditorial(int idEditorial) {
        List<Llibre> llista = new ArrayList<>();
        String sql = "SELECT l.*, e.nom as nom_ed, e.pais as pais_ed "
                + "FROM llibres l "
                + "INNER JOIN editorials e ON l.id_editorial = e.id "
                + "WHERE l.id_editorial = ?";

        try (Connection conn = Connexio.getConnection(); 
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idEditorial);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Editorial ed = new Editorial(
                        rs.getInt("id_editorial"),
                        rs.getString("nom_ed"),
                        rs.getString("pais_ed")
                );

                Llibre l = new Llibre(
                        rs.getString("ISBN"),
                        rs.getString("titol"),
                        rs.getString("autor"),
                        rs.getInt("pagines"),
                        ed
                );
                l.setId(rs.getInt("id"));

                llista.add(l);
            }
        } catch (SQLException ex) {
            System.out.println("Error al llistar per editorial: " + ex.getMessage());
        }
        return llista;
    }

    @Override
    public boolean actualitzarPagines(int id, int pagines) {
        boolean modificat = false;
        String sql = "UPDATE llibres SET pagines = ? WHERE id = ?";
        try (Connection con = Connexio.getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, pagines);
            ps.setInt(2, id);
            int files = ps.executeUpdate();

            if (files > 0) {
                modificat = true;
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }

        return modificat;
    }

    @Override
    public Llibre obtenirMesLlarg() {
        Llibre llibre = null;
        String sql = "SELECT * FROM llibres WHERE pagines = (SELECT MAX(pagines) FROM llibres)";
        try (Connection con = Connexio.getConnection(); 
                Statement st = con.createStatement(); 
                ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                llibre = new Llibre(
                        rs.getInt("id"),
                        rs.getString("ISBN"),
                        rs.getString("titol"),
                        rs.getString("autor"),
                        rs.getInt("pagines")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error: " + e.getMessage());
        }
        return llibre;
    }

}
