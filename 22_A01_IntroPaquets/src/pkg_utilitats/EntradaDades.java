package pkg_utilitats;

import java.util.ArrayList;
import java.util.Scanner;

public class EntradaDades {

    static Scanner sc = new Scanner(System.in);

    public static ArrayList<String> emplenarNoms(int USUARIS) {

        ArrayList<String> noms = new ArrayList();

        for (int i = 0; i < USUARIS; i++) {
            System.out.print("Dis-me el nom " + (i + 1) + ": ");
            noms.add(sc.nextLine());
        }

        return noms;
    }

    public static ArrayList<Integer> emplenarEdats(int USUARIS) {
        ArrayList<Integer> edats = new ArrayList();
        int edat;
        boolean continuar;

        for (int i = 0; i < USUARIS; i++) {
            continuar = true;
            do {
                System.out.print("Dis-me l'edat " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    edat = sc.nextInt();
                    if (edat >= 0 && edat <= 150) {
                        edats.add(edat);
                        continuar = false;
                    } else {
                        System.out.println("Edat no vàlida! Entre 0 i 150");
                    }
                } else {
                    System.out.println("Ha de ser un enter!");
                }
                sc.nextLine(); // BUIDAR BUFFER
            } while (continuar);
        }

        return edats;
    }

    public static ArrayList<Double> emplenarAlsades(int USUARIS) {
        ArrayList<Double> alsades = new ArrayList();
        double alsada;
        boolean continuar;

        for (int i = 0; i < USUARIS; i++) {
            continuar = true;
            do {
                System.out.print("Dis-me l'alçada " + (i + 1) + ": ");
                if (sc.hasNextDouble()) {
                    alsada = sc.nextDouble();
                    if (alsada >= 0 && alsada <= 3) {
                        alsades.add(alsada);
                        continuar = false;
                    } else {
                        System.out.println("Edat no vàlida! Entre 0 i 3");
                    }
                } else {
                    System.out.println("Ha de ser un enter!");
                }
                sc.nextLine(); // BUIDAR BUFFER
            } while (continuar);
        }

        return alsades;
    }

}
