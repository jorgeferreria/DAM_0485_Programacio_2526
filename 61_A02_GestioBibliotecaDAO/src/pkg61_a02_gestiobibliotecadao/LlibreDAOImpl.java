package pkg61_a02_gestiobibliotecadao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LlibreDAOImpl implements LlibreDAO {

    @Override
    public boolean registrar(Llibre l) {
        boolean inserit = false;
        String sql = "INSERT INTO llibres (ISBN, titol, autor, pagines) VALUES (?, ?, ?, ?)";
        try (Connection con = Connexio.getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, l.getISBN());
            ps.setString(2, l.getTitol());
            ps.setString(3, l.getAutor());
            ps.setInt(4, l.getPagines());
            ps.executeUpdate();
            inserit = true;
        } catch (SQLException e) {
            throw new RuntimeException("Error al registrar: " + e.getMessage());
        }
        
        return inserit;
    }

    @Override
    public List<Llibre> obtenirTots() {
        List<Llibre> llibres = new ArrayList();
        String sql = "SELECT * FROM llibres";
        try (Connection con = Connexio.getConnection(); 
                Statement st = con.createStatement(); 
                ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Llibre llibre = new Llibre(
                        rs.getInt("id"),
                        rs.getString("ISBN"),
                        rs.getString("titol"),
                        rs.getString("autor"),
                        rs.getInt("pagines")
                );
                llibres.add(llibre);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al registrar: " + e.getMessage());
        }
        return llibres;
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
