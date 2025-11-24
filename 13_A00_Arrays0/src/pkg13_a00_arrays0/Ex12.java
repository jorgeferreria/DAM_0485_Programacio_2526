package pkg13_a00_arrays0;

import java.util.Random;

public class Ex12 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int valors[] = new int[10];
        int valor, index = 0;
        boolean continuar = true, repetit = false;

        for (int i = 0; i < valors.length; i++) {
            do {
                valor = rnd.nextInt(10);
                System.out.println("Generat " + valor + " per a la posició " + (i + 1));
                while (!repetit && index < i) {
                    if (valor == valors[index]) {
                        System.out.println(valor + " ja és a la posició " + (index + 1));
                        repetit = true;
                    }
                    index++;
                }
                if (!repetit) {
                    valors[i] = valor;
                    continuar = false;
                }
                repetit = false;
                index = 0;
            } while (continuar);
            continuar = true;
        }
        System.out.println("Els valors resultants són: ");
        for (int i = 0; i < valors.length; i++) {
            System.out.println(valors[i]);
        }

    }

}
