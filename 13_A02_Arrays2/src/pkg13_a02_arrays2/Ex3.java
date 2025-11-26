package pkg13_a02_arrays2;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        double valors[] = new double[5];
        final double NUM_MIN = 10.0, NUM_MAX = 30.0;
        int contMajors = 0, contMenors = 0, contIguals = 0;
        double numeroBuscar = 0;
        boolean continuar = true;

        // EMPLENAR
        for (int i = 0; i < valors.length; i++) {
            valors[i] = rnd.nextDouble(NUM_MIN, NUM_MAX);
        }

        // MOSTRAR
        for (int i = 0; i < valors.length; i++) {
            System.out.println("numeros[" + i + "]= " + valors[i]);
        }

        do {
            System.out.print("Dis-me el número a buscar: ");
            if (sc.hasNextDouble()) {
                numeroBuscar = sc.nextDouble();
                if (numeroBuscar >= NUM_MIN && numeroBuscar < NUM_MAX) {
                    continuar = false;
                } else {
                    System.out.println("Ha de ser un enter entre " + NUM_MIN + " i " + NUM_MAX);
                }
            } else {
                System.out.println("Ha de ser un nombre enter!");
                sc.nextLine(); // BUIDAR BUFFER
            }
        } while (continuar);

        for (int i = 0; i < valors.length; i++) {
            if (valors[i] < numeroBuscar) {
                contMenors++;
            } else if (valors[i] > numeroBuscar) {
                contMajors++;
            } else {
                contIguals++;
            }
        }

        System.out.println("N'hi ha " + contMajors + " més grans, " + contMenors
                + " més petits i " + contIguals + " iguals");
    }

}
