package pkg12_a06_bucles3_validar;

import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SORTIDA = "surt";
        String text;
        int edat, edatMaxima = -1;
        boolean continuar = true;
        
        do {
            System.out.print("Dis-me la edad o \"surt\" per sortir: ");
            if (sc.hasNextInt()) {
                edat = sc.nextInt();
                sc.nextLine(); // BUIDAR BUFFER
                if (edat >= 0 && edat <= 150) {
                    // BUSCAR EDAD MÀXIMA
                    if(edat > edatMaxima){
                        edatMaxima = edat;
                    }
                } else {
                    System.out.println("Error. Edats permeses de 0 a 150.");
                }
            } else {
                text = sc.nextLine();
                if (text.equalsIgnoreCase(SORTIDA)){
                    if(edatMaxima != -1){
                        System.out.println("L'edat més gran és: " + edatMaxima);
                    } else {
                        System.out.println("No has introduit cap edat!");
                    }
                    continuar = false;
                } else {
                    System.out.println("Error. L'edat ha de ser un número enter.");
                }
            }
        } while (continuar);
    }
    
}
