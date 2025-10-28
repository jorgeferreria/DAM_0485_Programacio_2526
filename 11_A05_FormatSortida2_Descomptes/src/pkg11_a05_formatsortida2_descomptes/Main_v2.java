package pkg11_a05_formatsortida2_descomptes;

import java.util.Scanner;

public class Main_v2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        final double DESCOMPTE_21 = 0.21, DESCOMPTE_15 = 0.15, DESCOMPTE_5 = 0.05;
        double preuSamarreta, preuPantalo, preuSabates, 
                totalEstalviat = 0, estalviSamarreta, estalviPantalo, estalviSabates;
        
        System.out.print("Dis-me el preu de la samarreta: ");
        preuSamarreta = lector.nextDouble();
        
        System.out.print("Dis-me el preu del pantaló: ");
        preuPantalo = lector.nextDouble();
        
        System.out.print("Dis-me el preu de les sabates: ");
        preuSabates = lector.nextDouble();
        
        estalviSamarreta = preuSamarreta * DESCOMPTE_21;
        System.out.printf("El preu de la samarreta és %.2f€, "
                + "i he pagat %.2f€ i m’he estalviat %.2f€.\n", 
                preuSamarreta, preuSamarreta * (1 - DESCOMPTE_21) ,estalviSamarreta);
        totalEstalviat = totalEstalviat + estalviSamarreta;
                
        estalviPantalo = preuPantalo * DESCOMPTE_15;
        System.out.printf("El preu del pantaló és %.2f€, "
                + "i he pagat %.2f€ i m’he estalviat %.2f€.\n", 
                preuPantalo, preuPantalo * (1 - DESCOMPTE_15) ,estalviPantalo);
        totalEstalviat = totalEstalviat + estalviPantalo;
        
        estalviSabates = preuSabates * DESCOMPTE_5;
        System.out.printf("El preu de les sabates és %.2f€, "
                + "i he pagat %.2f€ i m’he estalviat %.2f€.\n", 
                preuSabates, preuSabates * (1 - DESCOMPTE_5) ,estalviSabates);
        totalEstalviat = totalEstalviat + estalviSabates;
        
        System.out.printf("Total estalviat: %.2f€\n", totalEstalviat);
        /*
El preu de la samarreta és 100,00 €, i he pagat 79,00€ i m’he estalviat 21,00€. 

També m’he comprat un pantaló de 50,00€ per 42,50€  i unes sabates de 60,00€ per 57,00€.  

En total m’he estalviat 31,50€.

        */
    }
    
}
