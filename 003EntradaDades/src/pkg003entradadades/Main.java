package pkg003entradadades;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //VARIABLES
        Scanner lector = new Scanner(System.in);
        String nom = "";
        char inicial;
        int edad = 0;
        double alsada;
        boolean gustarHelado;

        //CODI
        System.out.print("Dime tu edad: ");
        edad = lector.nextInt();
        
        lector.nextLine();

        System.out.print("Dime tu nombre: ");
        nom = lector.nextLine();

        // VACIADO DE BUFFER
        //lector.nextLine();

        System.out.println("Dime tu inicial");
        inicial = lector.nextLine().charAt(0); // PRIMER CARACTER D'UN STRING

        System.out.print("Dime tu alsada: ");
        alsada = lector.nextDouble();

        System.out.println("Dime si te gusta el helado? (true/false)");
        gustarHelado = lector.nextBoolean();

        System.out.println("Inicial: " + inicial);

        System.out.println("Hola soy " + nom + ", tengo " + edad + " años y mido "
                + alsada + " metros");

        System.out.println("Te gusta el helado: " + gustarHelado);
    }

}
