package pkg12_a04b_bucles1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char opcio = 0;
        int totalIngredients = 0;
        String ingredient, llista = "";
        
        do {
            System.out.print("Quin ingredient vols afegir a la poció? ");
            ingredient = sc.nextLine();
            llista += ++totalIngredients + ". "+ ingredient + "\n";
            
            System.out.println("Vols afegir un altre ingredient? (S/N)");
            opcio = sc.nextLine().toLowerCase().charAt(0);
            
        } while (opcio == 's');
        
        System.out.println("\nIngredients: \n"+ llista + "Total d'ingredients: " 
                + totalIngredients);
    }
    
}
