package pkg22_a02_agilitatmental;

import static Metodes.Utilitats.*;

public class Main {

    public static void main(String[] args) {
        final double MIL = 1000;
        String[][] tauler = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"1", "2", "3"},
            {"4", "5", "6"}
        };

        int[][] posicions;
        long tempsInicial, tempsFinal;
        int numActual = 6;

        // barrejar
        barrejarTauler(tauler);

        tempsInicial = System.currentTimeMillis();

        do {
            mostrarTauler(tauler);
            posicions = demanarJugada(tauler.length, tauler[0].length);
            numActual = procesarJugada(tauler, posicions, numActual);
        } while (numActual > 0);

        System.out.println("__________________________________\n"
                + "**********************************");

        System.out.println("Has guanyat!!!!!");
        tempsFinal = System.currentTimeMillis();

        //System.out.println("Has trigat " + ((tempsFinal - tempsInicial) / MIL) + " segons");
        System.out.printf("Has trigat %.2f segons\n", (tempsFinal - tempsInicial) / MIL);
    }

}
