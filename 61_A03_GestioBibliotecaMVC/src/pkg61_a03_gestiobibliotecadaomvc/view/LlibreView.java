package pkg61_a03_gestiobibliotecadaomvc.view;

import pkg61_a03_gestiobibliotecadaomvc.model.entity.Llibre;
import java.util.List;
import java.util.Scanner;

public class LlibreView {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- GESTIÓ BIBLIOTECA (MVC) ---");
        System.out.println("1. Registrar llibre");
        System.out.println("2. Llistar tots els llibres");
        System.out.println("3. Actualitzar pàgines");
        System.out.println("4. Veure el llibre més llarg");
        System.out.println("5. Sortir");
        System.out.print("Escull una opció: ");
        return scanner.nextInt();
    }

    public Llibre demanarDadesLlibre() {
        String ISBN, titol, autor;
        int pagines;
        
        scanner.nextLine(); // Netejar buffer
        
        System.out.print("ISBN: "); 
        ISBN = scanner.nextLine();
        
        System.out.print("Títol: "); 
        titol = scanner.nextLine();
        
        System.out.print("Autor: "); 
        autor = scanner.nextLine();
        
        System.out.print("Pàgines: "); 
        pagines = scanner.nextInt();
        
        return new Llibre(ISBN, titol, autor, pagines);
    }

    public void mostrarLlibres(List<Llibre> llista) {
        System.out.println("\n--- LLISTAT DE LLIBRES ---");
        for (Llibre l : llista) {
            System.out.println(l.toString());
        }
    }

    public void mostrarMissatge(String missatge) {
        System.out.println(">> " + missatge);
    }

    public int demanarId() {
        System.out.print("Introdueix l'ID del llibre: ");
        return scanner.nextInt();
    }

    public int demanarNovesPagines() {
        System.out.print("Introdueix el nou nombre de pàgines: ");
        return scanner.nextInt();
    }
}