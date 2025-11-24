package pkg13_a00_arrays0;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valors[] = new int[10];
        int valor, index = 0;
        boolean continuar = true, repetit = false;

        for (int i = 0; i < valors.length; i++) {
            do {
                System.out.print("Dis-me la edat " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    valor = sc.nextInt();
                    while (!repetit && index < i) {
                        if (valor == valors[index]) {
                            repetit = true;
                        }
                        index++;
                    }
                    if (!repetit) {
                        valors[i] = valor;
                        continuar = false;
                    }
                } else {
                    System.out.println("Error. Introdueix un enter! ");
                }
                sc.nextLine();
                repetit = false;
                index = 0;
            } while (continuar);
            continuar = true;
        }

        for (int i = 0; i < valors.length; i++) {
            System.out.println(valors[i]);
        }

    }

}
