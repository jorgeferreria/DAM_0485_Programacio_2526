package pkg61_a04_gestiobibliotecamvc_1n.view;

import java.util.Scanner;

public class AppView {

    private Scanner sc = new Scanner(System.in);

    public int mostrarMenuPrincipal() {
        int opcio;
        System.out.println("\n=== BIBLIOTECA MUNICIPAL ===");
        System.out.println("--- LLIBRES ---");
        System.out.println("1. Afegir nou Llibre");
        System.out.println("2. Llistar tots els Llibres");
        System.out.println("3. Llistar Llibres per Editorial");
        System.out.println("4. Actualitzar pàgines");
        System.out.println("5. Veure el llibre més llarg");
        System.out.println("--- EDITORIALS ---");
        System.out.println("6. Afegir nova Editorial");
        System.out.println("7. Llistar Editorials");
        System.out.println("0. Sortir");
        System.out.print("Tria una opció: ");
        opcio = sc.nextInt();
        sc.nextLine();
        return opcio;
        
    }

    public void mostrarMissatge(String msg) {
        System.out.println(">> " + msg);
    }

}
