package pkg11_a04_formatsortida1;

public class Ex1 {

    public static void main(String[] args) {
        /*
        Guarda en variables la lletra inicial (en majúscula) del teu primer cognom, 
        la teva edat, la teva alçada en metres, el nom de la teva ciutat 
        i si t'agrada o no el futbol.
        */
        // VARIABLES
        char inicialCognom = 'r';
        int edad = 123;
        double alsada = 2.5878865;
        String ciutat = "Montcada i Reixac";
        boolean futbol = false;
        
        //CODI
        System.out.println("La meva incial és: " + inicialCognom);
        System.out.println("La meva edat és: " + edad);
        System.out.println("La meva alçada és: " + alsada);
        System.out.println("La meva ciutat és: " + ciutat);
        System.out.println("M'agrada el futbol?: " + futbol);
        
        System.out.printf("La meva incial és: %C\n", inicialCognom);
        System.out.printf("La meva edat és: %d\n", edad);
        System.out.printf("La meva alçada és: %.3f\n", alsada);
        System.out.printf("La meva ciutat és: %s\n", ciutat);
        System.out.printf("M'agrada el futbol?: %B\n", futbol);
    }
    
}
