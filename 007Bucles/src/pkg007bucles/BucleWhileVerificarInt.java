package pkg007bucles;

import java.util.Scanner;

public class BucleWhileVerificarInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alsada = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Dis-me l'alçada: ");

            if (sc.hasNextInt()) {
                alsada = sc.nextInt();
                continuar = false;
            } else {
                System.out.println("No és un valor enter!!!!");
            }
            sc.nextLine(); // BUIDAR BUFFER
        }

        System.out.println(alsada);

    }

}
