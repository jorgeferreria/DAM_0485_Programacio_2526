package pkg11_a02b_bus1;

public class Ex2 {

    public static void main(String[] args) {
        // VARIABLES
        int pugenStop1 = 6, pugenStop2 = 8, pugenStop3 = 5, 
                parades = 3, numTrajectes = 15;
        double nombrePassatjersMitjanaRecorregut, nombrePassatjersMitjanaDia, 
                preuBillet = 1.20, recaptacio;
        
        //CODI
        nombrePassatjersMitjanaRecorregut = 
                (pugenStop1 + pugenStop2 + pugenStop3) / (double)parades;
        
        nombrePassatjersMitjanaDia = nombrePassatjersMitjanaRecorregut * numTrajectes;
        
        recaptacio = nombrePassatjersMitjanaDia * preuBillet;
        
        System.out.println(nombrePassatjersMitjanaRecorregut);
        System.out.printf("%.1f\n", nombrePassatjersMitjanaDia);
        System.out.printf("%.2f€\n", recaptacio);
    }
    
}
