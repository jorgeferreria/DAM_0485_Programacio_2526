package pkg13_a02_arrays2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frases[];
        int lletresTotal = 0, frasesTotals = 0;
        boolean continuar = true;

        do {
            System.out.print("Dis-me el total de frases: ");
            if(sc.hasNextInt()){
                frasesTotals = sc.nextInt();
                if (frasesTotals > 0 && frasesTotals <= 100){
                    continuar = false;
                } else {
                    System.out.println("Ha de ser un enter entre 1 i 100");
                }
            } else {
                System.out.println("Ha de ser un nombre enter!");
                sc.nextLine(); // BUIDAR BUFFER
            }
        } while (continuar);

        frases = new String[frasesTotals];

        sc.nextLine(); // BUIDAR BUFFER
        // INTRODUIR LES FRASES
        for (int i = 0; i < frases.length; i++) {
            System.out.print("Dis-me la frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }

        // MOSTRAR LES FRASES
        System.out.println("Lectura de les línies:");
        for (int i = 0; i < frases.length; i++) {
            System.out.println("línia[" + i + "]= " + frases[i]);
        }

        // CONTAR LLESTRES DE LES FRASES
        for (int i = 0; i < frases.length; i++) {
            lletresTotal += frases[i].length();
        }

        System.out.println("Suma de lletres: " + lletresTotal);
    }

}
