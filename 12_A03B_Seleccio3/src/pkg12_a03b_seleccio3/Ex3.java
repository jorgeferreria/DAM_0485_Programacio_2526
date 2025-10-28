package pkg12_a03b_seleccio3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean parell, multiple5;
        
        System.out.print("Dis-me el número: ");
        numero = sc.nextInt();
        
        parell = numero % 2 == 0;
        multiple5 = numero % 5 == 0;
        
        if (parell && multiple5){
            System.out.println("És parell i divisible per 5");
        } else if (parell) {
            System.out.println("És parell però no divisible per 5");
        } else if (multiple5) {
            System.out.println("NO és parell però si divisible per 5");
        } else {
            System.out.println("Na de na!");
        }

        if (numero % 2 == 0){
            if (numero % 5 == 0){
                System.out.println("És parell i divisible per 5");
            } else {
                System.out.println("És parell però no divisible per 5");
            }
        } else if (numero % 5 == 0){
            System.out.println("NO és parell però si divisible per 5");
        } else {
            System.out.println("Na de na!");
        }
        
    }
    
}
