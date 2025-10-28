package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        // VARIABLES        
        Scanner lector = new Scanner(System.in);
        boolean valor1, valor2;
        
        //CODI
        System.out.print("Introduir un booleà(true/false): ");
        valor1 = lector.nextBoolean();
        
        System.out.print("Introduir un altre booleà(true/false): ");
        valor2 = lector.nextBoolean();
        
        System.out.printf("El resultat de fer %b AND %b és %b\n", 
                valor1, valor2, valor1 && valor2);
        
        System.out.printf("El resultat de fer %b OR %b és %b\n", 
                valor1, valor2, valor1 || valor2);
        /*
Introduir un booleà:
true
Introduir un altre booleà:
false
El resultat de fer true AND false és false
El resultat de fer true OR false és true

        */
    }
    
}
