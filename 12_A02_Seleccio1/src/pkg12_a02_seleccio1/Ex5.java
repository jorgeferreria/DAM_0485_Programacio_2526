package pkg12_a02_seleccio1;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String diaSemana;
        
        System.out.print("Dis-me el dia de la setmana en text: ");
        diaSemana = lector.nextLine().toUpperCase();
        
        if (    diaSemana.equals("DILLUNS") || 
                diaSemana.equals("DIMARTS") || 
                diaSemana.equals("DIMECRES")|| 
                diaSemana.equals("DIJOUS")  || 
                diaSemana.equals("DIVENDRES")){
            System.out.println("Dia entre setmana!");
            
        } else if (diaSemana.equals("DISSABTE") || diaSemana.equals("DIUMENTGE")) {
            System.out.println("Cap de setmana!");
            
        } else {
            System.out.println("Dia no vàlid!");
        }
        
        
        switch (diaSemana) {
            case "DILLUNS":
            case "DIMARTS":
            case "DIMECRES":
            case "DIJOUS":
            case "DIVENDRES":
                System.out.println("Dia entre setmana!");
                break;
            case "DISSABTE":
            case "DIUMENTGE":
                System.out.println("Cap de setmana!");
                break;
            default:
                System.out.println("Dia no vàlid!");
                break;
        }
        
        
        
        
    }
    
}
