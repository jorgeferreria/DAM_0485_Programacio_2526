package pkg12_a04_bucles1;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, index = 1;
        boolean numeroValid = false;

        while (!numeroValid) {
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
        }
        
        System.out.print("Els divisors de "+numero+" són: ");
        while (index <= numero / 2){
            if (numero % index == 0){
                System.out.print(index + ", ");
            }
            index++;
        }
        System.out.println(numero);
        
        System.out.print("Els divisors de "+numero+" són: ");
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(numero);
    }
    
}
