package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        final int SIS = 6, DOS = 2;
        int num;
        
        // CODI
        System.out.print("Introduir un número: ");
        num = lector.nextInt();
        
        System.out.printf("Es compleix que el número %d sigui senar o "
                + "que sigui major que %d? %b\n",
                num, SIS, num % DOS != 0 || num > 6);
        /*
Introduir un número:
4
Es compleix que el número 4 sigui senar o que sigui major que 6? false
        */
    }
    
}
