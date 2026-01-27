package pkg22_a04_maqventa;

import static pkg_maquina.MaqVenta.gestioMaquinaVenta;

public class Main {

    public static void main(String[] args) {
        String[][] nomProducte = {
            {"poma", "pera", "plàtan",},
            {"pruna", "taronja", "cirera"},
            {"mora", "mandarina", "maduixa"}
        };

        double[][] preu = {
            {1.1, 0.8, 1.5},
            {1.8, 1, 1.2},
            {1.8, 1.3, 1.2}};

        int[][] estoc = {
            {2, 2, 2},
            {2, 2, 2},
            {2, 2, 2}};
        
        System.out.println();
        
        gestioMaquinaVenta(nomProducte, preu, estoc);
    }

}
