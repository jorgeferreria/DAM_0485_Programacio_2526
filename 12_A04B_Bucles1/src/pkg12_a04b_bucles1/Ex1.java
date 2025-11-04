package pkg12_a04b_bucles1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        double pes = 0, pesTotal = 0;
        boolean numeroValid = false;

        do {
            System.out.println("Dis-me el número: ");

            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    numeroValid = true;
                } else {
                    System.out.println("Ha de ser un número enter i positiu!");
                }
            } else {
                System.out.println("Ha de ser un número!");
            }
            sc.nextLine();
        } while (!numeroValid);
        // numero vàlid!!!
        for (int i = 0; i < numero; i++) {
            numeroValid = false;
            do {
                System.out.println("Dis-me el pes de la carbassa: ");

                if (sc.hasNextDouble()) {
                    pes = sc.nextDouble();
                    if (pes > 0) {
                        numeroValid = true;
                        //suma += pes; // BÉ
                    } else {
                        System.out.println("Ha de ser un número enter i positiu!");
                    }
                } else {
                    System.out.println("Ha de ser un número!");
                }
                sc.nextLine();
            } while (!numeroValid);
            pesTotal += pes;
        }
        
        System.out.println("El pes total de les carbasse és: " + pesTotal);
        System.out.printf("La mitaja de pes és: %.1f\n", pesTotal / numero);
    }

}
