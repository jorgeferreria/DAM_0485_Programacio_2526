package pkg006condicionals;

import java.util.Scanner;

public class Experiencia {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int experiencia;

        System.out.print("Dis-me la teva experiencia: ");
        experiencia = lector.nextInt();

        if (experiencia < 0 || experiencia >= 50) {
            System.out.println("Valor NO vàlid!");
        } else if (experiencia < 1) {
            System.out.println("No tens prou experiència");
        } else if (experiencia < 4) {
            System.out.println("Programador junior");
        } else if (experiencia < 10) {
            System.out.println("Programador senior");
        } else if (experiencia < 20) {
            System.out.println("Arquitecte SW");
        } else  {
            System.out.println("Saps més que chatgpt!");
        }
    }

}
