package pkg11_a07_dadesentrada2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        final int PPM = 220;
        int edat, fcm;
        
        
        System.out.print("Escriu la teva edat: ");
        edat = lector.nextInt();
        
        fcm = PPM - edat;
        
        System.out.println("La freqüència cardíaca màxima per a "+ edat +" anys és "
                + fcm +" ppm");
        
        /*
Escriu la teva edat: 20
La freqüència cardíaca màxima per a 20 anys és 200 ppm
        */
    }
    
}
