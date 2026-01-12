package pkg21_a03_generarusuaripassw;

import java.util.Scanner;
import static pkg21_a03_generarusuaripassw.Utilities.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_USUARIS = 3, COLUMNES = 2;

        String[][] usuaris = new String[MAX_USUARIS][COLUMNES];
        int totalUsuaris = 0, opcio = 0;
        boolean continuar = true, opcioValida = false;

        do {

            System.out.println("--------- MENÚ ---------");
            System.out.println("\t1. Generar login i password");
            System.out.println("\t2. Imprimir logins i passwords");
            System.out.println("\t3. Sortir");
            System.out.print("> ");

            do {
                if (sc.hasNextInt()) {
                    opcio = sc.nextInt();
                    if (opcio >= 1 && opcio <= 3) {
                        opcioValida = true;
                    } else {
                        System.out.println("Error!!!!");
                    }
                } else {
                    sc.nextLine();
                    System.out.println("Error!!!!");
                }
            } while (!opcioValida);

            switch (opcio) {
                case 1:
                    totalUsuaris = generarUsuari(usuaris, totalUsuaris);
                    break;
                case 2:
                    mostrarUsuaris(usuaris, totalUsuaris);
                    break;
                case 3:
                    System.out.println("Fin a la propera!");
                    continuar = false;
                    break;
            }
        } while (continuar);

//        for (int i = 0; i < 4; i++) {
//            totalUsuaris = generarUsuari(usuaris, totalUsuaris);
//            mostrarUsuaris(usuaris, totalUsuaris);
//        }
    }

}
