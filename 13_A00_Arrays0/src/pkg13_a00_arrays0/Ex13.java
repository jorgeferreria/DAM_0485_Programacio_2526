package pkg13_a00_arrays0;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String paraules[] = new String[5];
//        String paraules[] = {"p1", "p2", "p3", "p4", "p5"};
        String paraulesAleatories[] = new String[paraules.length];
        String paraula;
        int aleatori, index = 0;
        boolean continuar = true, repetit = false;

        for (int i = 0; i < paraules.length; i++) {
            do {
                System.out.print("Dis-me la paraula " + (i + 1) + ":");
                paraula = sc.nextLine();

                while (!repetit && index < i) {
                    if (paraula.equalsIgnoreCase(paraules[index])) {
                        System.out.println(paraula + " ja és a la posició " + (index + 1));
                        repetit = true;
                    }
                    index++;
                }
                if (!repetit) {
                    paraules[i] = paraula;
                    continuar = false;
                }
                repetit = false;
                index = 0;
            } while (continuar);
            continuar = true;
        }

        for (int i = 0; i < paraules.length; i++) {
            do {
                aleatori = rnd.nextInt(paraules.length);
                System.out.println("Provant " + paraules[i]
                        + " per a la posició " + (aleatori + 1));

                if (paraulesAleatories[aleatori] == null) {
                    paraulesAleatories[aleatori] = paraules[i];
                    continuar = false;
                } else {
                    System.out.println("Ja hi ha una paraula a la posició " + (aleatori + 1));
                }
            } while (continuar);
            continuar = true;
        }
    }
}
