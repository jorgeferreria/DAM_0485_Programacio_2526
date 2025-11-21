package pkg13_a00_arrays0;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edats[] = new int[10];
        int edat, index = 0, edadMaxima;
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

        edadMaxima = edats[0]; // ASUMIMOS LA PRIMERA EDAD COMO LA EDAD MÁXIMA

        for (int i = 1; i < edats.length; i++) {
            if(edadMaxima < edats[i]){
                edadMaxima = edats[i];
            }
        }
        
        System.out.println("La edat màxima és: " + edadMaxima);
        
//        for (int i = 0; i < edats.length; i++) {
//            System.out.println("La edat " + (i + 1) + " és: " + edats[i]);
//        }
        
        
    }
    
}
