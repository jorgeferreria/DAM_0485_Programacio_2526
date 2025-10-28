package pkg11_a07_dadesentrada2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final int RELACION_HOMBRE_PERRO = 7;
        String nom;
        int edat;
        double edatGos;
        
        System.out.print("Escriu el teu nom: ");
        nom = lector.nextLine();
        
        System.out.print("Escriu la teva edat: ");
        edat = lector.nextInt();
        
        edatGos = edat / (double)RELACION_HOMBRE_PERRO;
        
        System.out.printf("*** Edat gos ***\n Si fossis un gos, el teu nom seria "
                + "%s i tindries %.1f anys.\n", nom, edatGos);
        
        /*
        

        */
        
    }
    
}
