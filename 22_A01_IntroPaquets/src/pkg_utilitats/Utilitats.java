package pkg_utilitats;

import java.util.ArrayList;
import java.util.Scanner;
import static pkg_utilitats.EntradaDades.sc;

public class Utilitats {

    public static void mostrarDades(ArrayList<String> noms, ArrayList<Integer> edats, ArrayList<Double> alsades) {
        if (!noms.isEmpty()) {
            System.out.println("   NOM\t\tALÇADA\tEDAT");
            for (int i = 0; i < noms.size(); i++) {
                System.out.println(i + 1 + ". " + noms.get(i) + "\t"
                        + alsades.get(i) + "\t" + edats.get(i));
            }
        } else {
            System.out.println("No hi han dades!");
        }
    }

    public static void compararEdat(ArrayList<Integer> edats) {
        Scanner sc = new Scanner(System.in);
        int fila = -1;
        boolean trobat = false, continuar = true;

        if (!edats.isEmpty()) {
            System.out.print("Dis-me la fila de l'edat a comparar: ");
            do {
                if (sc.hasNextInt()) {
                    fila = sc.nextInt();
                    if (fila >= 0 && fila < edats.size()) {
                        continuar = false;
                    } else {
                        System.out.println("Fila no vàlida!");
                    }
                } else {
                    System.out.println("Ha de ser un enter!");
                }
                sc.nextLine(); // BUIDAR BUFFER
            } while (continuar);

            for (int i = 0; i < edats.size(); i++) {
                if (edats.get(fila - 1).equals(edats.get(i)) && (fila - 1) != i) {
                    System.out.println("Edat repetida a la posició " + (i + 1));
                    trobat = true;
                }
            }

            if (!trobat) {
                System.out.println("No hi ha cap edat repetida!");
            }
        } else {
            System.out.println("No hi han dades!");
        }

    }

    public static void compararAlsades(ArrayList<String> noms, ArrayList<Double> alsades) {
        ArrayList<Double> alsadesUtilitzades = new ArrayList();
        boolean impres = false;

        for (int i = 0; i < noms.size() - 1; i++) {
            if (!alsadesUtilitzades.contains(alsades.get(i))) {
                for (int j = i + 1; j < noms.size(); j++) {
                    if (alsades.get(i).equals(alsades.get(j))) {
                        if (!impres) {
                            System.out.println(noms.get(i) + " medeix " + alsades.get(i));
                            alsadesUtilitzades.add(alsades.get(i));
                            impres = true;
                        }
                        System.out.println(noms.get(j) + " medeix " + alsades.get(j));
                    }
                }
                impres = false;
            }
        }
    }

}
