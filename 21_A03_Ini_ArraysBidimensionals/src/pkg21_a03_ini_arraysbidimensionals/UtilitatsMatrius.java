package pkg21_a03_ini_arraysbidimensionals;

import java.util.Scanner;
import static pkg21_a03_ini_arraysbidimensionals.metodesAuxiliars.demanarValor;


public class UtilitatsMatrius {
    
    static Scanner sc = new Scanner(System.in);
    static final int DIMENSION_I = 8, DIMENSION_J = 10;

    public static int demanarDimensio() {
        int dimensio = 0;
        boolean continuar = true;

        // DEMANAR I VALIDAR NÚMERO
        do {
            System.out.print("Dis-me la dimensió: ");
            if (sc.hasNextInt()) {
                dimensio = sc.nextInt();
                if (dimensio > 1) {
                    continuar = false;
                } else {
                    System.out.println("Ha de ser un enter major que 1");
                }
            } else {
                System.out.println("Ha de ser un nombre enter!");
                sc.nextLine(); // BUIDAR BUFFER
            }
        } while (continuar);
        
        return dimensio;
    }

    public static int[][] emplenarMatriu(int dimensio, int matriuActual) {
        //int[][] matriu = new int[DIMENSION_I][DIMENSION_J];
        int[][] matriu = new int[dimensio][dimensio];

        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("Valor per a la fila " + i + " columna " + j 
                        + " de la matriu " + matriuActual + ": ");
                matriu[i][j] = demanarValor();
            }
        }

        return matriu;
    }
    
    public static int[][] sumarMatrius(int[][] matriu1, int[][] matriu2){
        sc.nextLine();
        int[][] suma = new int[matriu1.length][matriu1.length];
        
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                suma[i][j] = matriu1[i][j] + matriu2[i][j];
            }
        }
        return suma;
    }

    public static void imprimirMatriu(int[][] matriu, int matriuActual) {
        
        if(matriuActual == 0){
            System.out.println("Matriu resultant");
        } else {
            System.out.println("Matriu" + matriuActual);
        }
        
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                if(j < matriu.length - 1){
                    System.out.print(matriu[i][j] + " ");
                } else {
                    System.out.println(matriu[i][j]);
                }
            }
        }
    
    }

}
