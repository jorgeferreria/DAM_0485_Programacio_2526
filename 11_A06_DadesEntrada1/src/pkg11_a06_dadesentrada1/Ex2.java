package pkg11_a06_dadesentrada1;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        //VARIABLES
        Scanner lector = new Scanner(System.in);
        final int CENT = 100;
        double litresX100Km, KmsXLitre, totalLitresConsumits;
        int kms;
        
        //CODI
        System.out.print("Quants litres consumeix el teu vehicle cada 100Kms?");
        litresX100Km = lector.nextDouble();
        
        System.out.print("Quants kilometres vas a recorrer?");
        kms = lector.nextInt();
        
        KmsXLitre = CENT / litresX100Km;
        
        totalLitresConsumits = litresX100Km * kms / CENT;
        
        System.out.printf("Has de recórrer %dkm i el teu motor consumeix %.1f "
                + "litres per cada %dkm (%.1f km/l):\n" 
                + "en total consumiràs %.1f litres\n", 
                kms, litresX100Km, CENT, KmsXLitre, totalLitresConsumits);
/*
Has de recórrer 25km i el teu motor consumeix 6,8 litres per cada 100km (14,7 km/l):
en total consumiràs 1,7 litres
*/
    }
    
}
