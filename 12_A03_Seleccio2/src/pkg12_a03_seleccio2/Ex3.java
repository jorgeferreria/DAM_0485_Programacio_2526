package pkg12_a03_seleccio2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String mesText = "";
        int mes, any, dies = 0;

        System.out.print("Dis-me el mes: ");
        mes = lector.nextInt();
        System.out.print("Dis-me el any: ");
        any = lector.nextInt();

        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 1:
                    mesText = "gener";
                    dies = 31;
                    break;
                case 2:
                    if (any % 4 == 0 && (any % 100 != 0 || any % 400 == 0)) {
                        dies = 29;
                    } else {
                        dies = 28;
                    }
                    mesText = "febrer";
                    break;
                case 3:
                    mesText = "març";
                    dies = 31;
                    break;
                case 4:
                    mesText = "abril";
                    dies = 30;
                    break;
                case 5:
                    mesText = "maig";
                    dies = 31;
                    break;
                case 6:
                    mesText = "juny";
                    dies = 30;
                    break;
                case 7:
                    mesText = "juliol";
                    dies = 31;
                    break;
                case 8:
                    mesText = "agost";
                    dies = 31;
                    break;
                case 9:
                    mesText = "setembre";
                    dies = 30;
                    break;
                case 10:
                    mesText = "octubre";
                    dies = 31;
                    break;
                case 11:
                    mesText = "novembre";
                    dies = 30;
                    break;
                case 12:
                    mesText = "desembre";
                    dies = 31;
                    break;
            }
            System.out.println("El mes triat és " + mesText + " i té " + dies + " dies");
        } else {
            System.out.println("Mes incorrecte!");
        }

        /*
        El mes triat és febrer i té 29 dies
         */
    }

}
