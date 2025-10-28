package pkg11_a04_formatsortida1;

public class Ex2 {

    public static void main(String[] args) {
        // VARIABLES
        double preuOrdinandor = 1234.45, preuTotal;
        int quantitatOrdinadors = 23;
        
        //CODI
        preuTotal = quantitatOrdinadors * preuOrdinandor;
        
        System.out.printf("Hi ha %d ordinadors, el seu preu és %.2f€ "
                + "i en total costen %.2f€\n", 
                quantitatOrdinadors, preuOrdinandor, preuTotal);
    }
    
}
