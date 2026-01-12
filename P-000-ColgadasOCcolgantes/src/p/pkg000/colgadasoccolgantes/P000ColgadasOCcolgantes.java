package p.pkg000.colgadasoccolgantes;

import java.util.Scanner;

public class P000ColgadasOCcolgantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos;
        String nom;
        
        intentos = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < intentos; i++) {
            nom = sc.nextLine();
            if (nom.equalsIgnoreCase("colgadas")){
                System.out.println("Bien");
            } else {
                System.out.println("Mal");
            }
        }
        sc.close();
    }

}
