package pkg13_a00_arrays0;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edats[] = new int[10];
        int edat, index = 0, totalPersones = 0;
        boolean continuar = true;

        for (int i = 0; i < edats.length; i++) {
            do {
                System.out.print("Dis-me la edat " + (index + 1) + ": ");
                if (sc.hasNextInt()) {
                    edat = sc.nextInt();
                    if (edat >= 0 && edat <= 150) {
                        edats[index] = edat;
                        index++;
                        continuar = false;
                    } else {
                        System.out.println("Error. Introdueix un nombre entre 0 i 150! ");
                    }
                } else {
                    System.out.println("Error. Introdueix un enter! ");
                }
                sc.nextLine();
            } while (continuar);
            continuar = true;
        }
        
        
        for (int i = 0; i < edats.length; i++) {
            if(edats[i] >= 18){
                totalPersones++;
            }
        }
        
        System.out.println("Total persones majors d'edat: " + totalPersones);
        

        for (int i = 0; i < edats.length; i++) {
            System.out.println("La edat " + (i + 1) + " és: " + edats[i]);
        }
        
        
    }
    
}
