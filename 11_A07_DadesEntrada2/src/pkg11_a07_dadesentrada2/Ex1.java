package pkg11_a07_dadesentrada2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        String titolCanso, titolDisc, nomInterpret;
        int durada;
        
        // CODI
        System.out.print("títol d'una cançó: ");
        titolCanso = lector.nextLine();
        
        System.out.print("nom del disc: ");
        titolDisc = lector.nextLine();
        
        System.out.print("durada del disc en minuts: ");
        durada = lector.nextInt();
        
        //BUIDAR BUFFER
        lector.nextLine();
        
        System.out.print("nom de l'intèrpret: ");
        nomInterpret = lector.nextLine();
        
        System.out.printf("Títol: %s - Nom del disc: %s - Durada: %d - Nom de l'intèrpret%s\n",
                titolCanso, titolDisc, durada, nomInterpret);
        
        /*
         el títol d'una cançó, 
        a continuació el nom del disc, 
        la durada del disc en minuts, 
        i finalment el nom de l'intèrpret.
        */
    }
    
}
