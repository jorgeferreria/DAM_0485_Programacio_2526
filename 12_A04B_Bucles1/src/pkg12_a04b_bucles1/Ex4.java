package pkg12_a04b_bucles1;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRatpenats = 0, ratpenatsVolen = 0;
        boolean numeroValid = false, primo = true;

        do {
            System.out.print("Dis-me el total de rapenats: ");

            if (sc.hasNextInt()) {
                numRatpenats = sc.nextInt();
                if (numRatpenats >= 0) {
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

        for (int i = 1; i <= numRatpenats; i++) {
            for (int j = 2; j <= i / 2 && primo; j++) {
                if (i % j == 0) {
                    primo = false;
                    //break; // NO ES POT UTILITZAR
                }
                //System.out.println("-->" + j);
            }
            if (primo) {
                System.out.println("El ratpenat " + i + " aixeca el vol!");
                ratpenatsVolen++;
            } else {
                System.out.println("El ratpenat " + i + " es queda a la cova.");
            }
            primo = true;
        }
        System.out.println("Total de ratpenats que alcen el vol: " + ratpenatsVolen);

    }

}
