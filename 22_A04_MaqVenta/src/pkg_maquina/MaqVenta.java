package pkg_maquina;

import java.util.ArrayList;
import java.util.Random;
import static pkg_utilitats.GestorEntrada.*;
import static pkg_utilitats.GestorSortida.*;

public class MaqVenta {

    final static int CANT_MAX = 10;
    static ArrayList<String> productesSenseEstoc = new ArrayList();
    static Random rnd = new Random();
    static double recaptacio = 0;
    static int contadorProductesVenuts = 0;

    public static void gestioMaquinaVenta(String[][] nomProducte, double[][] preu, int[][] estoc) {
        int opcio;
        boolean continuar = true;

        do {
            mostrarMenu();
            opcio = demanarEnter("Selecciona una opció: ");
            continuar = gestionarOpcio(nomProducte, preu, estoc, opcio);

        } while (continuar);

    }

    public static boolean gestionarOpcio(String[][] nomProducte, double[][] preu, int[][] estoc, int opcio) {
        switch (opcio) {
            case 1:
                System.out.println("1. Mostrar fruites:");
                mostrarFruites(nomProducte, preu);
                break;
            case 2:
                System.out.println("2. Comprar fruita.");
                comprarFruita(nomProducte, preu, estoc);
                break;
            case 3:
                System.out.println("3. Mostrar estoc.");
                mostrarEstoc(nomProducte, estoc);
                break;
            case 4:
                System.out.println("4. Recarregar fruita");
                recaregarFruita(nomProducte, estoc);
                break;
            case 5:
                System.out.println("5. Resum d'activitat.");
                System.out.printf("Import recaptat: %.2f€\n", recaptacio);
                evaluarProductesSenseEstoc();
                System.out.println("Sortint del programa...");
                return false;
            default:
                System.out.println("Opció Incorrecta!");
        }
        return true;
    }

    public static void comprarFruita(String[][] nomProducte, double[][] preu, int[][] estoc) {
        final int PROBABILITAT = 10; // 10
        int posicio, posI, posJ, aleatori;

        posicio = demanarEnter("Indica el codi de la posició (FilaColumna):");

        if (posicio >= 0) {
            posI = posicio / 10;
            posJ = posicio % 10;

            if (posI >= 0 && posI < nomProducte.length
                    && posJ >= 0 && posJ < nomProducte[0].length
                    && estoc[posI][posJ] > 0) {

                estoc[posI][posJ]--;

                if (estoc[posI][posJ] <= 0) {
                    productesSenseEstoc.add(nomProducte[posI][posJ]);
                }

                recaptacio += preu[posI][posJ];

                aleatori = rnd.nextInt(PROBABILITAT);

                // AMPLIACIÓ 1
                if (aleatori == 0) {
                    System.out.println("** Incidència: la màquina no ha lliurat la fruita **");
                } else {
                    System.out.printf("** Fruita venuda: %s %.2f€ **\n",
                            nomProducte[posI][posJ], preu[posI][posJ]);
                    // AMPLIACIÓ 2
                    contadorProductesVenuts++;

                    //if (contadorProductesVenuts == 10) {
                    if (contadorProductesVenuts % 2 == 0) {
                        regalarFruita(nomProducte, estoc, posI, posJ);
                        //contadorProductesVenuts = 0;
                    }

                }

            } else {
                System.out.println("No hi ha disponibilitat d'aquesta fruita!");
            }
        }

    }

    public static void evaluarProductesSenseEstoc() {
        if (productesSenseEstoc.isEmpty()) {
            System.out.println("No s'ha esgotat cap producte");
        } else {
            System.out.println("Els següents productes s'han esgotat: ");
            mostrarProductesSenseEstoc(productesSenseEstoc);
        }
    }

    public static void recaregarFruita(String[][] nomProducte, int[][] estoc) {
        int posicio, posI, posJ, elements;
        boolean estocCero = false;

        posicio = demanarEnter("Indica el codi de la posició (FilaColumna):");

        if (posicio >= 0) {
            posI = posicio / 10;
            posJ = posicio % 10;

            if (posI >= 0 && posI < estoc.length && posJ >= 0 && posJ < estoc[0].length) {
                elements = demanarEnter("Quants elements vas a recarregar?");

                if (estoc[posI][posJ] == 0) {
                    estocCero = true;
                }

                if (elements > 0) {
                    if (estoc[posI][posJ] + elements < CANT_MAX) {
                        estoc[posI][posJ] += elements;
                    } else {
                        estoc[posI][posJ] = CANT_MAX;
                    }

//                    if(productesSenseEstoc.contains(nomProducte[posI][posJ])){
//                        productesSenseEstoc.remove(productesSenseEstoc.indexOf(nomProducte[posI][posJ]));
//                    }
                    if (estocCero) {
                        productesSenseEstoc.remove(nomProducte[posI][posJ]);
                    }

                    System.out.println("Quantitat actual: " + estoc[posI][posJ]);
                } else {
                    System.out.println("Has de ficar un enter positiu!");
                }

            } else {
                System.out.println("Fruita incorrecta!");
            }
        }
    }

    private static void regalarFruita(String[][] nomProducte, int[][] estoc, int posI, int posJ) {
        int filaRegal = -1, colRegal = -1;
        boolean regalar = false, continuar = true;

        if (productesSenseEstoc.size() == nomProducte.length * nomProducte[0].length) {
            System.out.println("Ho sentim molt! No hi ha cap producte disponible per regalar");
        } else if (productesSenseEstoc.size() == nomProducte.length * nomProducte[0].length - 1
                && estoc[posI][posJ] != 0) {
            // SOLS ESTÀ DISPONIBLE EL PRODUCTE VENUT
            filaRegal = posI;
            colRegal = posJ;
            regalar = true;
        } else {

            do {
                
                filaRegal = rnd.nextInt(nomProducte.length);
                colRegal = rnd.nextInt(nomProducte[0].length);
                System.out.println(filaRegal + " - " + colRegal);
                if (filaRegal != posI && colRegal != posJ && estoc[filaRegal][colRegal] > 0) {
                    regalar = true;
                    continuar = false;
                }
            } while (continuar);

        }

        if (regalar) {
            estoc[filaRegal][colRegal]--;
            System.out.println("** Sorpresa! Fruita de regal per la venda número 10: "
                    + nomProducte[filaRegal][colRegal] + " **");
        }

    }

}
