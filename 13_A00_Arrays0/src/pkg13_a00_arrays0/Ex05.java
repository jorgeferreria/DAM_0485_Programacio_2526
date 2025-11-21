package pkg13_a00_arrays0;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double temperatures[]
                = {2.5, 7.5, 9.65, 15.05, 19.25, 24.9, 29.0, 27.5, 22.0, 17, 11.2, 9.2};
        final int MES_MIN = 1, MES_MAX = 12, TEMP_MIN = -100, TEMP_MAX = 100;
        boolean continuar = true;
        int mes = 0;
        double temp = 0;
        String opcio = "";

        do {

            System.out.print("Tria una opció:"
                    + "\n- Continuar"
                    + "\n- Sortir"
                    + "\n> ");
            opcio = sc.nextLine().toLowerCase();

            switch (opcio) {
                case "continuar":
                    do {
                        System.out.print("Dis-me el més a modificar (1 -> 12): ");
                        if (sc.hasNextInt()) {
                            mes = sc.nextInt();
                            if (mes >= MES_MIN && mes <= MES_MAX) {
                                continuar = false;
                            } else {
                                System.out.println("Error. Introdueix un nombre entre 1 i 12! ");
                            }
                        } else {
                            System.out.println("Error. Introdueix un enter! ");
                        }
                        sc.nextLine();
                    } while (continuar);

                    continuar = true;

                    do {
                        System.out.print("Dis-me la nova temperatura (-100 -> 100): ");
                        if (sc.hasNextDouble()) {
                            temp = sc.nextDouble();
                            if (temp >= TEMP_MIN && temp <= TEMP_MAX) {
                                continuar = false;
                            } else {
                                System.out.println("Error. Introdueix un nombre entre -100 i 100! ");
                            }
                        } else {
                            System.out.println("Error. Introdueix un enter! ");
                        }
                        sc.nextLine();
                    } while (continuar);

                    temperatures[mes - 1] = temp;
                    System.out.println("Temperatura modificada!");
                    continuar = true;
                    break;
                case "sortir":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opció no vàlida!");
                    break;
            }

        } while (continuar);

        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("temperatures[" + (i + 1) + "] = " + temperatures[i]);
        }

    }

}
