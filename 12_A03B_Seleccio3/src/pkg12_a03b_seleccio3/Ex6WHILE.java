package pkg12_a03b_seleccio3;

import java.util.Scanner;

public class Ex6WHILE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, x1, x2, x3, x4, x5, x6, sum1, sum2;
        boolean demanar = true;
        
        while (demanar) {
            System.out.println("El nombre ha tenir 6 xifres!");
            System.out.print("Dis-me el número: ");
            numero = sc.nextInt();
            
            if(numero < 100000 || numero > 999999){
                System.out.println("El nombre ha tenir 6 xifres!");
            } else {
                demanar = false;
            }
        }

        x1 = numero / 100000;
        x2 = (numero / 10000) % 10;
        x3 = (numero / 1000) % 10;
        x4 = (numero / 100) % 10;
        x5 = (numero / 10) % 10;
        x6 = numero % 10;

        sum1 = x1 + x2 + x3;
        sum2 = x4 + x5 + x6;

        if (sum1 == sum2) {
            System.out.printf("El número %d és un número afortunat!\n", numero);
        } else {
            System.out.printf("El número %d NO és un número afortunat!\n", numero);
        }

    }

}
