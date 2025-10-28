package pkg12_a03b_seleccio3;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, mitjana;
        String recuperacio;
        boolean aprovat = false;

        System.out.println("Dis-me la primera nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Dis-me la segona nota: ");
        nota2 = sc.nextDouble();

        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
            mitjana = (nota1 + nota2) / 2;
            
            if (mitjana >= 5) {
                aprovat = true;
            } else {
                System.out.println("Recupera? (apte/no apte)");
                //BUIDAR BUFFER
                sc.nextLine();
                recuperacio = sc.nextLine().toLowerCase();
                if (recuperacio.equals("apte")) {
                    System.out.println("La teva nota de programació és: 5");
                } else {
                    aprovat = true;
                }
            }

            if (aprovat) {
                System.out.println("La teva nota de programació és: " + mitjana);
            }

        } else {
            System.out.println("Alguna de les notes no és vàlida");
        }

    }

}
