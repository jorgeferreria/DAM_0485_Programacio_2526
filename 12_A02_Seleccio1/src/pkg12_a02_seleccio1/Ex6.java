package pkg12_a02_seleccio1;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double nota;
        
        System.out.print("Dis-me la nota: ");
        nota = lector.nextDouble();
        
        if (nota < 0 || nota > 10){
            System.out.println("Nota no vàlida!");            
        } else if (nota < 5){
            System.out.println("Insuficient");            
        } else if (nota < 6){
            System.out.println("Suficient");            
        } else if (nota < 7){
            System.out.println("Bé");            
        } else if (nota < 9){
            System.out.println("Notable");            
        } else {
            System.out.println("Excel·lent");
        }
        

        /*
Insuficient de 0 a 5		Suficient de 5 a 6		Bé de 6 a 7
Notable de 7 a 9		Excel·lent de 9 a 10 inclòs

         */
    }

}
