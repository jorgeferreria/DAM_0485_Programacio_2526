package Metodes;

import java.util.Random;
import java.util.Scanner;

public class Utilitats {

    final static int REPETICIONS = 200, POS_I0 = 0, POS_I1 = 1, POS_J0 = 0, POS_J1 = 1,
            MIDA = 2;

    public static void barrejarTauler(String[][] tauler) {
        Random rnd = new Random();
        int posI0, posI1, posJ0, posJ1;
        String temp;

        for (int i = 0; i < REPETICIONS; i++) {
            posI0 = rnd.nextInt(tauler.length);
            posJ0 = rnd.nextInt(tauler[0].length);

            posI1 = rnd.nextInt(tauler.length);
            posJ1 = rnd.nextInt(tauler[0].length);

            temp = tauler[posI0][posJ0];
            tauler[posI0][posJ0] = tauler[posI1][posJ1];
            tauler[posI1][posJ1] = temp;
        }

    }

    public static int[][] demanarJugada(int lengthI, int lengthJ) {
        Scanner sc = new Scanner(System.in);
        int[][] posicions = new int[2][2];
        String pos1, pos2;
        int pos1_num, pos2_num;

        boolean continuar = true;

        do {
            System.out.println("Escriu les 2 posicions del núm més alt:");
            pos1 = sc.nextLine();
            pos2 = sc.nextLine();

            if (pos1.length() == MIDA && pos2.length() == MIDA && !pos1.equals(pos2)) {
                pos1_num = Integer.parseInt(pos1);
                pos2_num = Integer.parseInt(pos2);
                
                posicions[POS_I0][POS_J0] = pos1_num / 10;
                posicions[POS_I0][POS_J1] = pos1_num % 10;
                posicions[POS_I1][POS_J0] = pos2_num / 10;
                posicions[POS_I1][POS_J1] = pos2_num % 10;

                if (posicions[POS_I0][POS_J0] >= 0 && posicions[POS_I0][POS_J0] < lengthI
                        && posicions[POS_I0][POS_J1] >= 0 && posicions[POS_I0][POS_J1] < lengthJ
                        && posicions[POS_I1][POS_J0] >= 0 && posicions[POS_I1][POS_J0] < lengthI
                        && posicions[POS_I1][POS_J1] >= 0 && posicions[POS_I1][POS_J1] < lengthJ) {
                    continuar = false;
                } else {
                    System.out.println("Valors NO vàlids!");
                }
            } else {
                System.out.println("Valors NO vàlids!");
            }

        } while (continuar);

        return posicions;
    }

    public static int procesarJugada(String[][] tauler, int[][] posicions, int numActual) {
        int valor1, valor2;

        valor1 = Integer.parseInt(tauler[posicions[POS_I0][POS_J0]][posicions[POS_I0][POS_J1]]);
        valor2 = Integer.parseInt(tauler[posicions[POS_I1][POS_J0]][posicions[POS_I1][POS_J1]]);

//        if (Integer.parseInt(tauler[posicions[POS_I0][POS_J0]][posicions[POS_I0][POS_J1]]) == numActual
//                && Integer.parseInt(tauler[posicions[POS_I0][POS_J0]][posicions[POS_I0][POS_J1]]) 
//                == Integer.parseInt(tauler[posicions[POS_I1][POS_J0]][posicions[POS_I1][POS_J1]])
//        ) {
//            tauler[posicions[POS_I0][POS_J0]][posicions[POS_I0][POS_J1]] = "X";
//            tauler[posicions[POS_I1][POS_J0]][posicions[POS_I1][POS_J1]] = "X";
//            numActual--;
//        } else {
//            System.out.println("T'has equivocat!");
//        }
        if (valor1 == numActual && valor1 == valor2) {
            tauler[posicions[POS_I0][POS_J0]][posicions[POS_I0][POS_J1]] = "X";
            tauler[posicions[POS_I1][POS_J0]][posicions[POS_I1][POS_J1]] = "X";
            numActual--;
        } else {
            System.out.println("T'has equivocat!");
        }

        return numActual;
    }

    public static void mostrarTauler(String[][] tauler) {
        System.out.print("    ");
        for (int col = 0; col < tauler[col].length; col++) {
            if (col < tauler[col].length - 1) {
                System.out.print(col + " ");
            } else {
                System.out.print(col + "\n");
            }
        }

        System.out.print("  --");
        for (int col = 0; col < tauler[col].length; col++) {
            if (col < tauler[col].length - 1) {
                System.out.print("--");
            } else {
                System.out.print("--\n");
            }
        }

        for (int i = 0; i < tauler.length; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < tauler[i].length; j++) {
                if (j < tauler[i].length - 1) {
                    System.out.print(tauler[i][j] + " ");
                } else {
                    System.out.print(tauler[i][j] + "\n");
                }
            }
        }
    }
}
