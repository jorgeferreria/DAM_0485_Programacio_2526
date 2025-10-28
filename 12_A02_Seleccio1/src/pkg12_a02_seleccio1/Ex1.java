package pkg12_a02_seleccio1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        int temperatura;

        // CODI
        System.out.print("Introdueix la temperatura (enter): ");
        temperatura = lector.nextInt();

        if (temperatura >= 100) {
            //System.out.println("***\nL'estat de l'aigua a " + temperatura + "ºC és gas");
            System.out.printf("***\nL'estat de l'aigua a %dºC és gas\n", temperatura);
        } else if (temperatura >= 0) {
            System.out.printf("***\nL'estat de l'aigua a %dºC és líquid\n", temperatura);
        } else {
            System.out.printf("***\nL'estat de l'aigua a %dºC és sòlid\n", temperatura);
        }

        /*
Introdueix la temperatura (enter): 150
***
L'estat de l'aigua a 150ºC és gas
         */
    }

}
