package pkg12_a04_bucles1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero1 = 0, numero2 = 0;
        char operacio;
        boolean sortir = false;

        while (!sortir) {
            System.out.println("Dis-me el primer número: ");
            if (sc.hasNextDouble()) {
                numero1 = sc.nextDouble();
                sortir = true;
            } else {
                System.out.println("Ha de ser un número!");
            }
            sc.nextLine();
        }

        sortir = false;

        while (!sortir) {
            System.out.println("Dis-me el segon número: ");
            if (sc.hasNextDouble()) {
                numero2 = sc.nextDouble();
                sortir = true;
            } else {
                System.out.println("Ha de ser un número!");
            }
            sc.nextLine();
        }

        sortir = false;

        while (!sortir) {
            System.out.println("Dis-me l'operació (+, -, *, /, s/S (sortir)) :");
            operacio = sc.nextLine().toLowerCase().charAt(0);

            switch (operacio) {
                case '+':
                    System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
                    break;
                case '-':
                    System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
                    break;
                case '*':
                    System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
                    break;
                case '/':
                    if(numero2 != 0){
                        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
                    } else {
                        System.out.println("El segon valor no pot ser 0");
                    }
                    break;
                case 's':
                    sortir = true;
                    System.out.println("Et trobarem a faltar!!!!!");
                    break;
                default:
                    System.out.println("Opció no vàlida!");
                    break;
            }

        }

    }

}
