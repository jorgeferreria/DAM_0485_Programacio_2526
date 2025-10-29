package pkg12_a04_bucles1;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean acabar = false;

        while (!acabar) {
            System.out.println("Dis-me el número: ");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    if (numero % 3 == 0) {
                        System.out.println("Si és divisible");
                    } else {
                        System.out.println("No és divisible");
                    }
                } else if (numero == 0) {
                    acabar = true;
                } else {
                    System.out.println("Ha de ser un número enter i positiu!");
                }
            } else {
                System.out.println("Ha de ser un número!");
            }
            sc.nextLine();
        }

    }

}
