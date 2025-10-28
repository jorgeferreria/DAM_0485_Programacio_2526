package pkg11_a09_operacionsbasiques2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        double costat1, costat2, costat3;
        boolean resultat;
        
        // CODI
        System.out.print("Demanar el costat 1: ");
        costat1 = lector.nextDouble();
        
        System.out.print("Demanar el costat 2: ");
        costat2 = lector.nextDouble();
        
        System.out.print("Demanar el costat 3: ");
        costat3 = lector.nextDouble();
        
        resultat = costat1 + costat2 > costat3 && 
                costat2 + costat3 > costat1 && costat1 + costat3 > costat2;
        
        System.out.printf("Forma un trinagle? %b\n", resultat);
        
        System.out.printf("És un triangle equilàter? %b\n", 
                costat1 == costat2 && costat2 == costat3);
        
    }
    
}
