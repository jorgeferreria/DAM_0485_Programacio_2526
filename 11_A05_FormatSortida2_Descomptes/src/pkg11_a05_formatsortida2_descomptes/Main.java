package pkg11_a05_formatsortida2_descomptes;

public class Main {

    public static void main(String[] args) {
        
        final double DESCOMPTE_21 = 0.21, DESCOMPTE_15 = 0.15, DESCOMPTE_5 = 0.05;
        double preuSamarreta = 100.0, preuPantalo = 50.0, preuSabates = 60.0, 
                totalEstalviat = 0, estalviSamarreta, estalviPantalo, estalviSabates;
        
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
