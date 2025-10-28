package pkg12_a03b_seleccio3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;
        
        System.out.print("Dis-me l'hora: ");
        hora = sc.nextInt();
        
        if (hora >= 6 && hora <= 12){
            System.out.println("bon dia");
        } else if(hora >= 13 && hora <= 20) {
            System.out.println("bon tarda");
        } else if (hora >= 21 && hora <= 23  ||  hora >= 0 && hora <= 5){
            System.out.println("bon nit");
        } else {
            System.out.println("No és una hora vàlida!");
        }
        
        
    }
    
}
