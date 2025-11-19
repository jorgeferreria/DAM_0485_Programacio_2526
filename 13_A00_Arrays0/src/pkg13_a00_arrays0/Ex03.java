package pkg13_a00_arrays0;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nombres = new double[100];
        boolean continuar = true;
        int posicio = 0; // LENGTH PARCIAL DEL ARRAY
        String text;
        
        System.out.println("Introdueix nombres reals o \"fi\" per acabar:");
        do {
            if(sc.hasNextDouble()){
                nombres[posicio] = sc.nextDouble();
                sc.nextLine();
                posicio++;
                if(posicio >= nombres.length){
                    continuar = false;
                }
            } else {
                text = sc.nextLine();
                if(text.equalsIgnoreCase("fi")){
                    continuar = false;
                }
            }
        } while (continuar);
        
        System.out.println("*****************");
        for (int i = 0; i < posicio; i++) {
            System.out.println(nombres[i]);
        }
        
        
    }
    
}
