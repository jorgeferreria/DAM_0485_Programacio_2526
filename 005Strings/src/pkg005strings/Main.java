package pkg005strings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "Hola a tot l'alumnat!";
        String cadena1, cadena2;
        int num =5;
        
        
        cadena1 = sc.nextLine();
        cadena2 = sc.nextLine();
        
        System.out.println(cadena.charAt(6));
        System.out.println(cadena.charAt(7));
        
        System.out.println(cadena.length());
        System.out.println(cadena.charAt( cadena.length() - 1));
        
        System.out.println(cadena.substring(7));
        System.out.println(cadena.substring(7, 9));
        
        System.out.println(cadena.indexOf("P"));
        
        System.out.println("Hola" == "Hola");
        System.out.println(cadena1 == cadena2);
        System.out.println(cadena1.equals(cadena2));
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
        
    }
    
}
