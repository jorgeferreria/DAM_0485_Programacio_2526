package pkg13_a00_arrays0;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edats[] = new int[10];
        int edat = 0, index = 0;
        boolean continuar = true, trobat = false;

        for (int i = 0; i < edats.length; i++) {
            do {
                System.out.print("Dis-me la edat " + (index + 1) + ": ");
                if (sc.hasNextInt()) {
                    edat = sc.nextInt();
                    if (edat >= 0 && edat <= 150) {
                        edats[index] = edat;
                        index++;
                        continuar = false;
                    } else {
                        System.out.println("Error. Introdueix un nombre entre 0 i 150! ");
                    }
                } else {
                    System.out.println("Error. Introdueix un enter! ");
                }
                sc.nextLine();
            } while (continuar);
            continuar = true;
        }

        do {
            System.out.print("Dis-me l'edat a buscar: ");
            if (sc.hasNextInt()) {
                edat = sc.nextInt();
                if (edat >= 0 && edat <= 150) {
                    continuar = false;
                } else {
                    System.out.println("Error. Introdueix un nombre entre 0 i 150! ");
                }
            } else {
                System.out.println("Error. Introdueix un enter! ");
            }
            sc.nextLine();
        } while (continuar);

        continuar = true;
        index = 0;

        while (continuar) {
            if (edat == edats[index]) {
                trobat = true;
            }
            index++;
            if (trobat || index >= edats.length) {
                continuar = false;
            }
        }

        if (trobat) {
            System.out.println("La edat " + edat + " si estava al llistat");
        } else {
            System.out.println("La edat " + edat + " no estava al llistat");
        }

        for (int i = 0; i < edats.length; i++) {
            System.out.println("La edat " + (i + 1) + " és: " + edats[i]);
        }

    }

}
