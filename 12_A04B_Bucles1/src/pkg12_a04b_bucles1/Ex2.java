package pkg12_a04b_bucles1;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        final int MAX_INTENTS = 5;
        int numeroSecret, numeroProvar, intents = 0;
        boolean numeroEncertat = false;

        numeroSecret = rnd.nextInt(5, 51);
        do {
            System.out.print("Dis-me el número a provar: ");
            intents++;
            if (sc.hasNextInt()) {
                numeroProvar = sc.nextInt();
                if(numeroProvar > numeroSecret) {
                    System.out.println("Massa alt!");
                } else if(numeroProvar < numeroSecret){
                    System.out.println("Massa baix!");
                } else { // Encertat!
                    System.out.println("Enhorabona, has encertat! i has utilitzat " 
                            + intents + " intents");
                    numeroEncertat = true;
                }
            } else {
                System.out.println("Ha de ser un número!");
            }
            
            // Buidar Buffer
            sc.nextLine();
        } while (!numeroEncertat && intents < MAX_INTENTS);        
        
        if(intents >= MAX_INTENTS){
            System.out.println("Has perdut! Massa intents!!! el número era " + numeroSecret);
        }
        
    }
    
}
