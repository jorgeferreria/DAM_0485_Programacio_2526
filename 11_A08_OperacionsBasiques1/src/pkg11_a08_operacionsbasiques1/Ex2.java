package pkg11_a08_operacionsbasiques1;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        // VARIABLES
        Scanner lector = new Scanner(System.in);
        double distancia, velocitat, tempsEmprat;
        
        // CODI
        System.out.print("Introduir la distància en Km: ");
        distancia = lector.nextDouble();
        
        System.out.print("Introduir la velocitat en Km/h: ");
        velocitat = lector.nextDouble();
        
        tempsEmprat = distancia / velocitat;
        
        System.out.printf("Temps emprat: %.2f hores\n", tempsEmprat);
        System.out.printf("Has trigat més d'un dia ( 24 h)? %b\n", 
                tempsEmprat > 24);
        
        // System.out.println(25/0); // GERERA UN ERROR / EXCEPCION
        
        
        System.out.println("Fin de programa!!!");
        
        /*
Introduir la distància en Km:
1000,25
Introduir la velocitat en Km/h:
45,75
Temps emprat: 21.86 hores
Has trigat més d'un dia ( 24 h)?  false
        */
    }
    
}
