package pkg61_a04_gestiobibliotecamvc_1n.view;

import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Llibre;
import java.util.List;
import java.util.Scanner;
import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Editorial;

public class LlibreView {

    private Scanner sc = new Scanner(System.in);

    public Llibre demanarDadesLlibre() {
        String ISBN, titol, autor;
        int pagines, idEditorial;
        
        System.out.print("ISBN: ");
        ISBN = sc.nextLine();

        System.out.print("Títol: ");
        titol = sc.nextLine();

        System.out.print("Autor: ");
        autor = sc.nextLine();

        System.out.print("Pàgines: ");
        pagines = sc.nextInt();

        System.out.print("Id Editorial: ");
        idEditorial = sc.nextInt();
        sc.nextLine();

        return new Llibre(ISBN, titol, autor, pagines, new Editorial(idEditorial));
    }

    public int demanarIdEditorial() {
        int idEditorial;
        System.out.print("\nIntrodueix l'ID de l'editorial a cercar: ");
        idEditorial = sc.nextInt();
        sc.nextLine();
        return idEditorial;
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
        int idLlibre;
        System.out.print("Introdueix l'ID del llibre: ");
        idLlibre = sc.nextInt();
        sc.nextLine();
        return idLlibre;
    }

    public int demanarNovesPagines() {
        int pagines;
        System.out.print("Introdueix el nou nombre de pàgines: ");
        pagines = sc.nextInt();
        sc.nextLine();
        return pagines;
    }
}
