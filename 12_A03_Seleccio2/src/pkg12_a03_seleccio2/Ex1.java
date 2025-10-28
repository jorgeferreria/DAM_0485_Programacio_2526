package pkg12_a03_seleccio2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3, num4, major, totalNumeros = 4;
        double mitjana;
        
        System.out.print("Dis-me el primer número: ");
        num1 = lector.nextInt();        
        System.out.print("Dis-me el segon número: ");
        num2 = lector.nextInt();        
        System.out.print("Dis-me el tercer número: ");
        num3 = lector.nextInt();        
        System.out.print("Dis-me el quart número: ");
        num4 = lector.nextInt();
        
        // MITJANA ARITMÈTICA
        mitjana = (num1 + num2 + num3 + num4) / (double)totalNumeros;
        System.out.println("La mitjana és: " + mitjana);
        
        // CALCULAR MAJOR FALTA CALCULAR MENOR
        if (num1 >= num2 && num1 >= num3 && num1 >= num4){
            major = num1;
        } else if (num2 >= num3 && num2 >= num4) {
            major = num2;
        } else if (num3 >= num4){
            major = num3;
        } else {
            major = num4;
        }
        System.out.printf("El major és: %d\n", major);
        
        
        
    }
    
}
