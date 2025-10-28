package pkg12_a03_seleccio2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia, mes;
        
        System.out.println("Dis-me el dia de naixement:");
        dia = lector.nextInt();
        System.out.println("Dis-me el mes de naixement:");
        mes = lector.nextInt();
        
        if (dia >= 22 && dia <= 31 && mes == 12 || dia >= 1 && dia <= 20 && mes == 1){
            System.out.println("Eres Capricorn ♑");
        } else if (dia >= 21 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 19 && mes == 2){
            System.out.println("Eres Aquari ♒");
        } else if(dia >= 20 && dia <= 29 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3){
            System.out.println("Eres Pisces ♓");
        // .... resta de horoscops    
        } else {
            System.out.println("Data no vàlida!");
        }
        
    }
    
}
