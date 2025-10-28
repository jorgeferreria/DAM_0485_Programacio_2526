package pkg11_a06_dadesentrada1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        //VARIABLES
        Scanner lector = new Scanner(System.in);
        String xarxaSocialPreferida, frequenciaPublicacio;
        char inicialNomUsuari;
        int numeroUsuarisSeguits;
        double horesUltimaConsulta;
        boolean faServirMassaLesXarxesSocials;
        
        //CODI
        System.out.print("Quina és la seva xarxa social preferida? ");
        xarxaSocialPreferida = lector.nextLine();
        
        System.out.print("Quina és la inicial del seu usuari? ");
        inicialNomUsuari = lector.nextLine().toUpperCase().charAt(0);
        
        System.out.print("A quants usuaris segueixes? ");
        numeroUsuarisSeguits = lector.nextInt();
        
        System.out.print("Quantes hores fa des de l'última vegada que l'has consultat? ");
        horesUltimaConsulta = lector.nextDouble();
        
        //BUIDAR BUFFER
        lector.nextLine();
        
        System.out.print("Quina és la seva freqüència de publicació? ");
        frequenciaPublicacio = lector.nextLine();
        
        System.out.print("Creus que fas servir massa les xarxes social? (true / false)");
        faServirMassaLesXarxesSocials = lector.nextBoolean();
        
        //PRINTLN
        System.out.println("La xarxa social preferida és " + xarxaSocialPreferida 
                + " i l'inicial del seu usuari és: " + inicialNomUsuari);
        
        System.out.println("Segueix a " + numeroUsuarisSeguits 
                + " usuaris i de l'última consulta fa: " + horesUltimaConsulta + " hores");
        
        System.out.println("La teva freqüencia de publicació és " + frequenciaPublicacio 
                + " i, fas servir massa les xarxes socials? " + faServirMassaLesXarxesSocials);
        
        //PRINTF
        System.out.printf("La xarxa social preferida és %s i l'inicial del seu usuari és: %c\n",
                xarxaSocialPreferida, inicialNomUsuari);
        
        System.out.printf("Segueix a %d usuaris i de l'última consulta fa: %.2f hores\n", 
                numeroUsuarisSeguits, horesUltimaConsulta);
        
        System.out.printf("La teva freqüencia de publicació és %s i, "
                + "fas servir massa les xarxes socials? %b\n", 
                frequenciaPublicacio, faServirMassaLesXarxesSocials);
        
/*
1. Quina és la seva xarxa social preferida
2. Quina és la inicial del seu usuari
3. A quants usuaris segueix
4. Quantes hores fa des de l'última vegada que l'ha consultat 
    (introduir només 1 valor amb decimals: per exemple 1,75 vol dir 1h 45min)
5. Quina és la seva freqüència de publicació 
    (L'usuari introduirà una frase com: una publicació cada 2h)
6. Si creu que fa servir massa les xarxes socials (ha d'escriure true / false)
*/
    }
    
}
