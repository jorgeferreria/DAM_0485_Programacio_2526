package pkg12_a03_seleccio2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Dis-me el primer número: ");
        num1 = lector.nextInt();        
        System.out.print("Dis-me el segon número: ");
        num2 = lector.nextInt();        
        System.out.print("Dis-me el tercer número: ");
        num3 = lector.nextInt();
        
        if (num1 < num2 && num1 < num3){            
            System.out.print(num1 + " < ");
            if (num2 < num3){
                System.out.print(num2 + " < " + num3);
            } else {
                System.out.print(num3 + " < " + num2);
            }            
        } else {
            if (num2 < num3){
                System.out.print(num2 + " < ");
                if (num1 < num3){
                    System.out.print(num1 + " < " + num3);
                } else {
                    System.out.print(num3 + " < " + num1);
                }
            } else {
                System.out.print(num3 + " < ");
                if (num1 < num2){
                    System.out.print(num1 + " < " + num2);
                } else {
                    System.out.print(num2 + " < " + num1);
                }
            }
        }
        System.out.println("");
        
    }
    
}
