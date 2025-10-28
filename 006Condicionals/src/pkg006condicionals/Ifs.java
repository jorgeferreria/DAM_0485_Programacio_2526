package pkg006condicionals;

public class Ifs {

    public static void main(String[] args) {

        int edad = 20;

        System.out.println("Abans de l'IF");
        if (edad >= 65) {
            System.out.println("Major d'edat, Jubilat.");
        } else if( edad >= 18){
            System.out.println("Major d'edat, No jubilat.");
        } else {
            System.out.println("Menor d'edat.");
        }
        System.out.println("Després de l'IF");

    }

}
