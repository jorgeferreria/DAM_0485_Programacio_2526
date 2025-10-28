package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        final int DIEZ = 10, VEINTE = 20;
        int num1, num2;
        
        // CODI
        System.out.print("Introduir el primer número: ");
        num1 = lector.nextInt();
        
        System.out.print("Introduir el segon número: ");
        num2 = lector.nextInt();
        
        
        System.out.printf("La suma de %d i %d és menor o igual a %d "
                + "i a la vegada el seu producte és major o igual que %d? %b\n",
                num1, num2, DIEZ, VEINTE, 
                /*num1 != num2 &&*/ num1 + num2 <= DIEZ &&  num1 * num2 >= VEINTE);
        /*
Introduir el primer número:
4
Introduir el segon número:
3
La suma de 4 i 3 és menor o igual a 10 i a la vegada el seu producte és major o igual que 20? false
Els nombres 4 i 3 són iguals? false
        */
        
    }
    
}
