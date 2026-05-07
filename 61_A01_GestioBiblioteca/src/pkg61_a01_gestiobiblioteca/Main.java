package pkg61_a01_gestiobiblioteca;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio;

        do {
            System.out.println("\n--- BIBLIOTECA MUNICIPAL ---");
            System.out.println("1. Registrar nou llibre");
            System.out.println("2. Llistar catàleg");
            System.out.println("3. Actualitzar pàgines");
            System.out.println("4. Veure llibre més llarg");
            System.out.println("5. Sortir");
            System.out.print("Tria una opció: ");
            opcio = sc.nextInt();
            sc.nextLine(); // Netejar buffer

            switch (opcio) {
                case 1:
                    insertarLlibre(demanarDadesLlibre());
                    break;
                case 2:
                    llistarLlibres();
                    break;
                case 3:
                    System.out.print("ID del llibre: ");
                    int idAct = sc.nextInt();
                    System.out.print("Noves pàgines: ");
                    int novesP = sc.nextInt();
                    actualitzarPagines(idAct, novesP);
                    break;
                case 4:
                    mostrarMesLlarg();
                    break;
            }
        } while (opcio != 5);
    }

    public static Connection getConnection() throws SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/biblioteca_db";
        String usuario = "root";
        String contrasena = "1234";

        // Class.forName(driver); // Obsoleto, solo para versiones antiguas
        return DriverManager.getConnection(url, usuario, contrasena);
    }

    public static void insertarLlibre(Llibre l) {
        String sql = "INSERT INTO llibres (ISBN, titol, autor, pagines) VALUES (?, ?, ?, ?)";
        try (Connection con = getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, l.getISBN());
            ps.setString(2, l.getTitol());
            ps.setString(3, l.getAutor());
            ps.setInt(4, l.getPagines());
            ps.executeUpdate();
            System.out.println("Llibre registrat correctament.");

        } catch (SQLException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }

    public static void llistarLlibres() {
        String sql = "SELECT * FROM llibres";
        try (Connection con = getConnection(); 
                Statement st = con.createStatement(); 
                ResultSet rs = st.executeQuery(sql)) {
            
            System.out.println("LLISTAT DE LLIBRES:");
            System.out.println("*******************************************");
            while (rs.next()) {
                
                Llibre l = new Llibre(
                        rs.getInt("id"),
                        rs.getString("ISBN"),
                        rs.getString("titol"),
                        rs.getString("autor"),
                        rs.getInt("pagines")
                );
                System.out.println(l);
            }
            System.out.println("*******************************************");
        } catch (SQLException e) {
            System.out.println("Error al llistar: " + e.getMessage());
        }
    }

    public static void actualitzarPagines(int id, int pagines) {
        String sql = "UPDATE llibres SET pagines = ? WHERE id = ?";
        try (Connection con = getConnection(); 
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, pagines);
            ps.setInt(2, id);
            int files = ps.executeUpdate();

            if (files > 0) {
                System.out.println("Actualització realitzada.");
            } else {
                System.out.println("No s'ha trobat cap llibre amb aquest ID.");
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void mostrarMesLlarg() {
        String sql = "SELECT * FROM llibres WHERE pagines = (SELECT MAX(pagines) FROM llibres)";
        try (Connection con = getConnection(); 
                Statement st = con.createStatement(); 
                ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                System.out.println("El llibre més llarg és: " + rs.getString("ISBN") + " - "
                        + rs.getString("titol") + " amb " + rs.getInt("pagines") + " pàgines.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static Llibre demanarDadesLlibre() {
        Scanner sc = new Scanner(System.in);
        String ISBN, titol, autor;
        int pagines;

        System.out.print("ISBN: ");
        ISBN = sc.nextLine();

        System.out.print("Títol: ");
        titol = sc.nextLine();

        System.out.print("Autor: ");
        autor = sc.nextLine();

        System.out.print("Pàgines: ");
        pagines = sc.nextInt();

        return new Llibre(ISBN, titol, autor, pagines);
    }
}
