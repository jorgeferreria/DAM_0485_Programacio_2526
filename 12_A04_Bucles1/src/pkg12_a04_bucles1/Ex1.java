package pkg12_a04_bucles1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, suma = 1, contador = 1;
        boolean numeroValid = false;

        while (!numeroValid) {
            System.out.println("Dis-me el número: ");

            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                if (numero > 0) {
                    numeroValid = true;
//                    // JA TINC UN VALOR ENTER POSITIU
//                    while (contador < numero) {
//                        //contador++;
//                        //suma += contador; // suma = suma + contador;
//                        suma += ++contador;
//                    }
//                    System.out.println(suma);
                } else {
                    System.out.println("Ha de ser un número enter i positiu!");
                }
            } else {
                System.out.println("Ha de ser un número!");
            }
            sc.nextLine();
        }

        // JA TINC UN VALOR ENTER POSITIU
        while (contador < numero) {
            //contador++;
            //suma += contador; // suma = suma + contador;
            suma += ++contador;
        }
        System.out.println(suma);

    }

}
