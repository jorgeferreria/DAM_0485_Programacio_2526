package pkg12_a06_bucles3_validar;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroArterics = 0;
        boolean continuar = true;
        char opcio;

        System.out.print("Dis-me el número d'asterics (1-50): ");
        do {
            if (sc.hasNextInt()) {
                numeroArterics = sc.nextInt();
                if (numeroArterics > 0 && numeroArterics < 50) {
                    continuar = false;
                    sc.nextLine();
                } else {
                    System.out.println("Error. Introdueix un nombre entre 1 i 50: ");
                }
            } else {
                System.out.println("Error. Introdueix un enter: ");
                sc.nextLine();
            }
        } while (continuar);

        continuar = true;

        do {
            for (int i = 1; i <= numeroArterics; i++) {
                if (i == numeroArterics) {
                    System.out.println("*");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println("Escriu s/S per sortir, o un altre caràcter per repetir la línia:");
            opcio = sc.nextLine().toLowerCase().charAt(0);
            if (opcio == 's') {
                continuar = false;
            }
        } while (continuar);
    }

}
