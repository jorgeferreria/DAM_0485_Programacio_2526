package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        int num;
        
        // CODI
        System.out.print("Introduir un número: ");
        num = lector.nextInt();
        
        num *= 6;
        System.out.printf("Després de multiplicar per 6 el resultat és %d\n", num);
        
        num -= 4;
        System.out.printf("Després de restar 4 el resultat és %d\n", num);
        
        num /= 2;
        System.out.printf("Després de dividir per 2 el resultat és %d\n", num);
        
        System.out.printf("El resultat és parell? %b\n", num % 2 == 0);
        
        /*
Introduir un número:
4
Després de multiplicar per 6 el resultat és 24
Després de restar 4 el resultat és 20
Després de dividir per 2 el resultat és 10
El resultat és parell? true

        */
    }
    
}
