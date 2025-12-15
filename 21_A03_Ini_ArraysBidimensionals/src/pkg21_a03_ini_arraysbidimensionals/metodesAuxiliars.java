package pkg21_a03_ini_arraysbidimensionals;

import java.util.Scanner;

public class metodesAuxiliars {
    
    public static int demanarValor() {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        boolean continuar = true;

        // DEMANAR I VALIDAR NÚMERO
        do {
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                continuar = false;
            } else {
                System.out.println("Ha de ser un nombre enter!");
                sc.nextLine(); // BUIDAR BUFFER
            }
        } while (continuar);
        return valor;
    }
    
}
