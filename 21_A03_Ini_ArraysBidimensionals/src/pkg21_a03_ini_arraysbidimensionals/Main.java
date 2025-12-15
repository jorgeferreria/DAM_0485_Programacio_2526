package pkg21_a03_ini_arraysbidimensionals;

import static pkg21_a03_ini_arraysbidimensionals.UtilitatsMatrius.*;

public class Main {

    public static void main(String[] args) {
        // VARIABLES
        int dimensio, matriuActual = 1;
        int[][] matriu1, matriu2, suma;
        
        
        //CODI
        dimensio = demanarDimensio();
        System.out.println(dimensio);
        
        matriu1 = emplenarMatriu(dimensio, matriuActual);
        matriuActual++;
        matriu2 = emplenarMatriu(dimensio, matriuActual);
        
        matriuActual = 1;
        imprimirMatriu(matriu1, matriuActual);
        matriuActual++;
        imprimirMatriu(matriu2, matriuActual);
        
        suma = sumarMatrius(matriu1, matriu2);
        
        imprimirMatriu(suma, 0);
    }
    
}
