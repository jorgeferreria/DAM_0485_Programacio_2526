package pkg11_a06_dadesentrada1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        final String UNITATS="UNITATS", PRODUCTE = "PRODUCTE", MARCA = "MARCA",
                PREU ="PREU €/U", IMPORT = "IMPORT €", NUM = "NÚM", 
                ARTERICS = "*********************",
                IMPORT_TOTAL = "Import total:";
        final char EURO = '€';
        String nomProducte1, nomProducte2, nomProducte3, 
                marcaProducte1, marcaProducte2, marcaProducte3;
        int unitatsProducte1, unitatsProducte2, unitatsProducte3, numeroLinia = 1;
        double preuProducte1, preuProducte2, preuProducte3, 
                importProducte1, importProducte2, importProducte3, importTotal;
        
        //CODI
        //PRODUCTE 1
        System.out.print("Número d'unitats del producte 1: ");
        unitatsProducte1 = lector.nextInt();
        
        //BUIDAR BUFFER
        lector.nextLine();
        
        System.out.print("Nom del producte 1: ");
        nomProducte1 = lector.nextLine();
        
        System.out.print("Marca del producte 1: ");
        marcaProducte1 = lector.nextLine();
        
        System.out.print("Preu del producte 1: ");
        preuProducte1 = lector.nextDouble();
        
        importProducte1 = unitatsProducte1 * preuProducte1;
        
        // PRODUCTE 2
        System.out.print("Número d'unitats del producte 2: ");
        unitatsProducte2 = lector.nextInt();
        
        //BUIDAR BUFFER
        lector.nextLine();
        
        System.out.print("Nom del producte 2: ");
        nomProducte2 = lector.nextLine();
        
        System.out.print("Marca del producte 2: ");
        marcaProducte2 = lector.nextLine();
        
        System.out.print("Preu del producte 2: ");
        preuProducte2 = lector.nextDouble();
        
        importProducte2 = unitatsProducte2 * preuProducte2;
        
        // PRODUCTE 3
        System.out.print("Número d'unitats del producte 3: ");
        unitatsProducte3 = lector.nextInt();
        
        //BUIDAR BUFFER
        lector.nextLine();
        
        System.out.print("Nom del producte 3: ");
        nomProducte3 = lector.nextLine();
        
        System.out.print("Marca del producte 3: ");
        marcaProducte3 = lector.nextLine();
        
        System.out.print("Preu del producte 3: ");
        preuProducte3 = lector.nextDouble();
        
        importProducte3 = unitatsProducte3 * preuProducte3;
        
        // IMPORT TOTAL
        importTotal = importProducte1 + importProducte2 + importProducte3;
        
        // SORTIDA PER CONSOLA
        System.out.printf("%7s %-20s %-14s %8s %10s %3s \n", 
                UNITATS, PRODUCTE, MARCA, PREU, IMPORT, NUM);
        
        System.out.printf("%7d %-20s %-14s %8.2f %10.2f %03d\n", 
                unitatsProducte1, nomProducte1, marcaProducte1, preuProducte1, 
                importProducte1, numeroLinia);
        
        numeroLinia = numeroLinia + 1; // 1 -> 2
        
        System.out.printf("%7d %-20s %-14s %8.2f %10.2f %03d\n", 
                unitatsProducte2, nomProducte2, marcaProducte2, preuProducte2, 
                importProducte2, numeroLinia);
        
        numeroLinia = numeroLinia + 1; // 2 -> 3
        
        System.out.printf("%7d %-20s %-14s %8.2f %10.2f %03d\n", 
                unitatsProducte3, nomProducte3, marcaProducte3, preuProducte3, 
                importProducte3, numeroLinia);
        
        System.out.printf("%64s\n", ARTERICS);
        System.out.printf("%56s %6.2f%c\n", IMPORT_TOTAL, importTotal, EURO);
        System.out.printf("%64s\n", ARTERICS);
/*
UNITATS PRODUCTE             MARCA          PREU €/U   IMPORT € NÚM 
      3 Sardines en llauna   Rianxeira          1,30       3,90 001 
      1 Xocolata 85%         Torras             2,10       2,10 002 
      2 Quinoa               Viva               2,75       5,50 003 
                                        *********************
                                        Import total:  11,50€
                                        *********************
*/
    }
    
}
