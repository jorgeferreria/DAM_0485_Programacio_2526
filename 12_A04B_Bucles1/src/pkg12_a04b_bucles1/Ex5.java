package pkg12_a04b_bucles1;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carbasses = -1, totalCarbasses = 0;
                
        do{
            System.out.print("Dis-me quantes carbasses t'han donat: ");            
            if (sc.hasNextInt()){
                carbasses = sc.nextInt();
                if(carbasses > 0){
                    totalCarbasses += carbasses;
                } else if (carbasses == 0){
                    System.out.println("Has arreplegat " + totalCarbasses + " carbasses");
                } else {
                    System.out.println("Ha de ser 0 o superior!");
                }
            } else {
                System.out.println("Ha de ser un nombre enter!");
                sc.nextLine();
            }            
        } while (carbasses != 0);
        
        System.out.println("FI");
    }
    
}
