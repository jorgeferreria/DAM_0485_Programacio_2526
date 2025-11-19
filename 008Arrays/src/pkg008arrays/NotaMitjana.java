package pkg008arrays;

import java.util.Scanner;

public class NotaMitjana {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notes[] = new double[50];
        int alunmes = 0;
        double notaMitjana = 0, nota;
        boolean continuar = true;

        // LLENADO PARCIAL DE UN ARRAY
        do {
            System.out.println("Dis-me la nota: ");
            nota = sc.nextDouble();
            if (nota != -1) {
                notes[alunmes] = nota;
                alunmes++;
            } else {
                continuar = false;
            }
        } while (continuar);

        for (int i = 0; i < alunmes; i++) {
            notaMitjana += notes[i];
        }

        System.out.println("Nota Mitjana: " + (notaMitjana /= alunmes));

    }

}
