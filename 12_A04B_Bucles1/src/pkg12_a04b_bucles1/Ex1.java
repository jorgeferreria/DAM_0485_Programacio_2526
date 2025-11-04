package pkg12_a04b_bucles1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCarbasses = 0;
        double pes = 0, pesTotal = 0;
        boolean numeroValid = false;

        do {
            System.out.print("Dis-me el total de carbasses trobades: ");

            if (sc.hasNextInt()) {
                totalCarbasses = sc.nextInt();
                if (totalCarbasses >= 0) {
                    numeroValid = true;
                } else {
                    System.out.println("Ha de ser un número enter i positiu!");
                }
            } else {
                System.out.println("Ha de ser un número!");
            }
            // Buidar Buffer
            sc.nextLine();
        } while (!numeroValid);
        
        // totalCarbasses vàlid!!!
        if (totalCarbasses > 0) {

            for (int i = 0; i < totalCarbasses; i++) {
                numeroValid = false;
                
                do {
                    System.out.print("Dis-me el pes de la carbassa "+ (i+1) +": " );

                    if (sc.hasNextDouble()) {
                        pes = sc.nextDouble();
                        if (pes > 0) {
                            numeroValid = true;
                            //suma += pes; // BÉ
                        } else {
                            System.out.println("Ha de ser un número positiu!");
                        }
                    } else {
                        System.out.println("Ha de ser un número!");
                    }
                    sc.nextLine();
                } while (!numeroValid);
                
                pesTotal += pes;
            }

            System.out.println("El pes total de les carbasse és: " + pesTotal);
            System.out.printf("El pes mitjà és: %.1f\n", pesTotal / totalCarbasses);
        } else {
            System.out.println("No has trobat cap carbassa");
        }
    }

}
