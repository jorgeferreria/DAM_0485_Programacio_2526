package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        char lletra;
        int lletraEntera;
        
        // CODI
        System.out.print("Introduir una lletra: ");
        lletra = lector.nextLine().charAt(0);
        lletraEntera = lletra;
        
        System.out.printf("La lletra que has introduït és la %c\n", lletra);
        
        System.out.printf("La lletra que has introduït en decimal és %d\n", lletraEntera);
        System.out.printf("La lletra que has introduït en hexadecimal és %x\n", lletraEntera);
        System.out.printf("La lletra que has introduït en octal és %o\n", lletraEntera);
        
        System.out.printf("La lletra %c es troba entre la A/a i la Z/z? %b\n",
                lletra, lletra >= 'A' && lletra <='Z' || lletra >= 'a' && lletra <='z');
        /*
Introduir una lletra:
g
La lletra que has introduït és la g
La lletra que has introduït en decimal és 103
La lletra que has introduït en hexadecimal és 67

La lletra g es troba entre la A/a i la Z/z? true
        */
    }
    
}
