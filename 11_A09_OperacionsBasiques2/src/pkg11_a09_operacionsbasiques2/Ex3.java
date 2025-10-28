package pkg11_a09_operacionsbasiques2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        int any;
        boolean resultat1, resultat2;
        
        // CODI
        System.out.print("Dis-me l'any a comprobar: ");
        any = lector.nextInt();
        
        resultat1 = any % 4 == 0 && (any % 100 != 0 ||  any % 400 == 0);
        resultat2 = any % 4 == 0 && any % 100 != 0 ||  any % 400 == 0;
        
        System.out.println(resultat1);
        System.out.println(resultat2);
    }
    
}
