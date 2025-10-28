package pkg11_a09_operacionsbasiques2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        String nom;
        int edat, hora;
        boolean matriculat, resultat;
        
        // CODI
        System.out.print("Dis-me la teva edad: ");
        edat = lector.nextInt();
        
        System.out.print("Dis-me l'hora a la que vols anar: ");
        hora = lector.nextInt();
        
        System.out.print("Has estat matriculat previament(true/false)? ");
        matriculat = lector.nextBoolean();
        
        // BUIDAR BUFFER
        lector.nextLine();
        
        System.out.print("Dis-me el teu nom? ");
        nom = lector.nextLine();
        
        resultat = edat < 25 && hora >= 9 && hora <= 12 && !matriculat /* matriculat == false */;
        
        System.out.printf("Hola %s, en el teu cas, "
                + "el descompte a la matrícula és: %B\n", nom, resultat);
    }
    
}
