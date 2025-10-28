package pkg11_a09_operacionsbasiques2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final String LLETRES = "TRWAGMYFPDXBNJZSQVHLCKE";
        final int DIVISOR = 23;
        int dni;
        char lletraDni;
        
        System.out.print("Dis-me el número del DNI: ");
        dni = lector.nextInt();
        
        //BUIDAR BUFFER
        lector.nextLine();

        System.out.print("Dis-me la lletra del DNI: ");
        lletraDni = lector.nextLine().charAt(0);
        
        System.out.println("El DNI és correcte: " 
                + (LLETRES.charAt(dni % DIVISOR) == lletraDni));
    }
    
}
