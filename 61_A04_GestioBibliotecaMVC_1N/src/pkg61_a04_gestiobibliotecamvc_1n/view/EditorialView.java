package pkg61_a04_gestiobibliotecamvc_1n.view;

import java.util.List;
import java.util.Scanner;
import pkg61_a04_gestiobibliotecamvc_1n.model.entity.Editorial;

public class EditorialView {

    private Scanner sc = new Scanner(System.in);

    public Editorial demanarDadesEditorial() {
        System.out.println("\n-- NOVA EDITORIAL --");
        System.out.print("Nom de l'editorial: ");
        String nom = sc.nextLine();
        System.out.print("País: ");
        String pais = sc.nextLine();
        return new Editorial(nom, pais);
    }

    public void mostrarEditorials(List<Editorial> editorials) {
        System.out.println("\n--- LLISTA D'EDITORIALS ---");
        if (editorials.isEmpty()) {
            System.out.println("No hi ha editorials registrades.");
            return;
        }
        for (Editorial e : editorials) {
            System.out.println(e);
        }
    }

    public void mostrarMissatge(String msg) {
        System.out.println(">> " + msg);
    }
}
