package pkg12_a02_seleccio1;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int costat1, costat2, costat3;
        
        System.out.print("Dis-me el costat 1: ");
        costat1 = lector.nextInt();
        
        System.out.print("Dis-me el costat 2: ");
        costat2 = lector.nextInt();
        
        System.out.print("Dis-me el costat 3: ");
        costat3 = lector.nextInt();
        
        if(costat1 > 0 && costat2 > 0 && costat3 > 0){
            if (costat1 + costat2 > costat3 && costat1 + costat3 > costat2 
                    && costat2 + costat3 > costat1){
                System.out.println("Si formen un triangle");
            } else {
                System.out.println("No formen un triangle");
            }
        } else {
            System.out.println("Algun costat no és correcte!");
        }
        
    }
    
}
