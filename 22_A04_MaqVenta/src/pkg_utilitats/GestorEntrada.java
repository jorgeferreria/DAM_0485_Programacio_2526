package pkg_utilitats;

import java.util.Scanner;

public class GestorEntrada {
    
    public static int demanarEnter(String text){
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        boolean continuar = true;
        
        do {
            System.out.println(text);
            if (sc.hasNextInt()){
                valor = sc.nextInt();
                continuar = false;
            } else {
                sc.nextLine();
                System.out.println("Valor no vàlid!");
            }
        } while (continuar);
        
        return valor;
    }
    
    
}
