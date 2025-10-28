package pkg12_a03b_seleccio3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HORA_NORMAL = 12, HORA_EXTRA = 16, HORES_SETMANA = 40, HORES_MAXIMES = 127;
        int hores;
        
        System.out.print("Dis-me les hores treballades de la setmana: ");
        hores = sc.nextInt();
        
        if (hores < 0 || hores > HORES_MAXIMES) {
            System.out.println("Hores no vàlides!");
        } else if ( hores <= HORES_SETMANA){
            System.out.println("Salari: " + hores * HORA_NORMAL);
        } else {
            System.out.println("Salari: " + (HORES_SETMANA * HORA_NORMAL 
                    + (hores - HORES_SETMANA) * HORA_EXTRA));
        }
        
        
    }
    
}
