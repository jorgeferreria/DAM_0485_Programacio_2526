package pkg_utilitats;

import java.util.ArrayList;

public class GestorSortida {

    public static void mostrarMenu() {
        System.out.println("MÀQUINA VENTA:\n"
                + "1. Mostrar fruites\n"
                + "2. Comprar fruita\n"
                + "3. Mostrar estoc\n"
                + "4. Recarregar fruita\n"
                + "5. Sortir");
    }

    public static void mostrarFruites(String[][] nomProducte, double[][] preu) {

        for (int i = 0; i < nomProducte.length; i++) {
            for (int j = 0; j < nomProducte[i].length; j++) {
                if (j < nomProducte[i].length - 1) {
                    System.out.print(nomProducte[i][j] + "-" + preu[i][j] + "€\t");
                } else {
                    System.out.print(nomProducte[i][j] + "-" + preu[i][j] + "€\n");
                }
            }
        }

    }
    
    public static void mostrarEstoc(String[][] nomProducte, int[][] estoc) {

        for (int i = 0; i < nomProducte.length; i++) {
            for (int j = 0; j < nomProducte[i].length; j++) {
                if (j < nomProducte[i].length - 1) {
                    System.out.print(nomProducte[i][j] + "-" + estoc[i][j] + "U.\t");
                } else {
                    System.out.print(nomProducte[i][j] + "-" + estoc[i][j] + "U.\n");
                }
            }
        }

    }
    
    public static void mostrarProductesSenseEstoc(ArrayList<String> productesSenseEstoc){
        
        for (int i = 0; i < productesSenseEstoc.size(); i++) {
            System.out.println(productesSenseEstoc.get(i));
        }
        
    }

}
