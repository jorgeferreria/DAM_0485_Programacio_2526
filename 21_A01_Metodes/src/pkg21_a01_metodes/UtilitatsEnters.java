package pkg21_a01_metodes;

import java.util.Scanner;

public class UtilitatsEnters {

    public static int entrarEnterPositiu(int opcio) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean continuar = true;

        // DEMANAR I VALIDAR NÚMERO
        do {
            if (opcio != 0) {
                System.out.print("Dis-me el número: ");
            } else {
                System.out.print("---- MENÚ ----\n"
                        + "Tria una opció: \n"
                        + "\t1. Factorial\n"
                        + "\t2. Capicua\n"
                        + "\t3. Es Primer\n"
                        + "\t4. Comparar dos nombres\n"
                        + "\t5. Salir\n"
                        + "> ");
            }
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (num > 0) {
                    continuar = false;
                } else {
                    System.out.println("Ha de ser un enter major que 0");
                }
            } else {
                System.out.println("Ha de ser un nombre enter!");
                sc.nextLine(); // BUIDAR BUFFER
            }
        } while (continuar);

        return num;
    }

    public static long calcularFactorial(int num) {
        long factorial = 1L;

        // CALCULAR FACTORIAL
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static boolean esPrimer(int num) {
        boolean esPrimo = true;
        int index = 2;

        while (index < Math.sqrt(num) && esPrimo) {
            if (num % index == 0) {
                esPrimo = false;
            }
            index++;
        }

        return esPrimo;
    }

    public static int comparar(int num1, int num2) {
        int valor;

        if (num1 > num2) {
            valor = 1;
        } else if (num1 < num2) {
            valor = -1;
        } else {
            valor = 0;
        }

        return valor;
    }

    public static boolean esCapicua(int num) {
        boolean capicua;
        int numTemporal = num, invers = 0;

        while (numTemporal > 0) {
            invers = invers * 10 + numTemporal % 10;
            numTemporal /= 10;
        }

        if (num == invers) {
            capicua = true;
        } else {
            capicua = false;
        }

        return capicua;
    }

    public static void menu() {
        int opcio;
        boolean continuar = true;

        do {

            opcio = entrarEnterPositiu(0);

            switch (opcio) {
                case 1:
                    System.out.println("Factorial: " + calcularFactorial(entrarEnterPositiu(1)));
                    break;
                case 2:
                    System.out.println(esCapicua(entrarEnterPositiu(1)));
                    break;
                case 3:
                    System.out.println("És Primer: " + esPrimer(entrarEnterPositiu(1)));
                    break;
                case 4:
                    System.out.println(comparar(entrarEnterPositiu(1), entrarEnterPositiu(1)));
                    break;
                case 5:
                    System.out.println("Fins a la propera!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opció NO vàlida!");
                    break;
            }

        } while (continuar);
    }
}
