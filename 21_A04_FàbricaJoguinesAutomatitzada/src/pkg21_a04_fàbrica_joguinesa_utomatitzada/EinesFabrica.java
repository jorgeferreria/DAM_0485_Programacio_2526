package pkg21_a04_fàbrica_joguinesa_utomatitzada;

import java.util.Random;

public class EinesFabrica {

    public static char[][] inicialitzarFabrica(int dim) {
        Random rnd = new Random();
        char[][] tauler = new char[dim][dim];
        int valor;

        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                valor = rnd.nextInt(10);

                if (valor == 0) { // ELFO
                    tauler[i][j] = 'E';
                } else if (valor >= 1 && valor <= 3) { // MATERIAL
                    tauler[i][j] = 'M';
                } else {
                    tauler[i][j] = '.';
                }
            }
        }

        return tauler;
    }

    public static void executarTorn(char[][] tauler) {

        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {

                if (tauler[i][j] == 'E') {
                    // NORTE
                    if (i > 0 && tauler[i - 1][j] == 'M') {
                        tauler[i - 1][j] = 'J';
                    }

                    // SUR
                    if (i < tauler.length - 1 && tauler[i + 1][j] == 'M') {
                        tauler[i + 1][j] = 'J';
                    }
                    
                    // ESTE
                    if (j > 0 && tauler[i][j - 1] == 'M') {
                        tauler[i][j - 1] = 'J';
                    }

                    // OESTE
                    if (j < tauler[i].length - 1 && tauler[i][j + 1] == 'M') {
                        tauler[i][j + 1] = 'J';
                    }
                }

            }
        }

    }
    
    public static int comptarJoguines(char[][] tauler){
        int contador = 0;
        
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if(tauler[i][j] == 'J'){
                    contador++;
                }
            }
        }
        
        return contador;
    }

    public static void mostrarFabrica(char[][] tauler) {
        System.out.println("---- TAULER ----");
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                if (j < tauler.length - 1) {
                    System.out.print(tauler[i][j] + " ");
                } else {
                    System.out.println(tauler[i][j]);
                }
            }
        }
        System.out.println("----------------");
    }

}
