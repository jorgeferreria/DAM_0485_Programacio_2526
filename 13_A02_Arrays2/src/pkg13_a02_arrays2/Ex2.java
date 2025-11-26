package pkg13_a02_arrays2;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int valors[] = new int[10];
        int contador5 = 0, numeroBuscar = 0, index = 0;
        boolean continuar = true;

        // EMPLENAR L'ARRAY
        for (int i = 0; i < valors.length; i++) {
            valors[i] = rnd.nextInt(1, 11);
        }

        // MOSTRAR L'ARRAY
        System.out.println("Valors de l'array:");
        for (int i = 0; i < valors.length; i++) {
            System.out.println("numero[" + i + "]= " + valors[i]);
        }

        // BUSCAR 5's A L'ARRAY
        for (int i = 0; i < valors.length; i++) {
            if (valors[i] == 5) {
                contador5++;
            }
        }
        System.out.println("Quantitat de 5: " + contador5);

        do {
            System.out.print("Dis-me el número a buscar: ");
            if (sc.hasNextInt()) {
                numeroBuscar = sc.nextInt();
                if (numeroBuscar > 0 && numeroBuscar <= 10) {
                    continuar = false;
                } else {
                    System.out.println("Ha de ser un enter entre 1 i 10");
                }
            } else {
                System.out.println("Ha de ser un nombre enter!");
                sc.nextLine(); // BUIDAR BUFFER
            }
        } while (continuar);

        continuar = true;

        // CON WHILE
        while (continuar && index < valors.length) {
            if (valors[index] == numeroBuscar) {
                continuar = false;
            } else {
                index++;
            }
        }

        if (index < valors.length) {
            System.out.println("El número " + numeroBuscar + " es troba a la posició " + index);
        } else {
            System.out.println("El nombre no està a l'array");
        }
    }

}
