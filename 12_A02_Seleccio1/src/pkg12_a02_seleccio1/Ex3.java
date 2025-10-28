package pkg12_a02_seleccio1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        char opcio;

        System.out.print("** Programa de caixer automàtic **\n"
                + "  A. Extreure\n"
                + "  B. Ingressar \n"
                + "  C. Últims moviments\n"
                + "  D. Sortir del menú\n"
                + "\n"
                + "Introdueixi l'opció desitjada (a-d): ");
        
        opcio = lector.nextLine().toUpperCase().charAt(0);
        
        switch (opcio) {
            case 'A':
                System.out.println("Opció triada extreure");
                break;
            case 'B':
                System.out.println("Opció triada ingressar");
                break;
            case 'C':
                System.out.println("Opció triada últims moviments");
                break;
            case 'D':
                System.out.println("Opció triada sortir");
                break;
            default:
                System.out.println("Opció triada incorrecta");
                break;
        }
        
        
        /*
        ** Programa de caixer automàtic **
  A. Extreure
  B. Ingressar 
  C. Últims moviments
  D. Sortir del menú

Introdueixi l'opció desitjada (a-d):
        
F
Opció triada incorrecta

B
Opció triada ingressar

        
        
         */
    }

}
