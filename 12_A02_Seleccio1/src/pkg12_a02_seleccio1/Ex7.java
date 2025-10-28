package pkg12_a02_seleccio1;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcio;
        double num1, num2;
        
        System.out.print("Dis-me l'operació:\n1. suma\n2. resta\n3. multiplicació\n4. divisió\n> ");
        opcio = lector.nextInt();
        
        if ( opcio >= 1 && opcio <= 4){
            System.out.print("Dis-me el primer número: ");
            num1 = lector.nextInt();
            System.out.print("Dis-me el segon número: ");
            num2 = lector.nextInt();
            
            switch (opcio) {
                case 1:
                    System.out.printf("La suma és: %.2f\n", num1 + num2);
                    break;
                case 2:
                    System.out.printf("La resta és: %.2f\n", num1 - num2);
                    break;
                case 3:
                    System.out.printf("La multiplicació és: %.2f\n", num1 * num2);
                    break;
                case 4: // default
                    if(num2 != 0){
                        System.out.printf("La dicisió és: %.2f\n", num1 / num2);
                    } else {
                        System.out.println("Recorda que no pots dividir per 0!");
                    }
                    break;
            } 
        } else {
            System.out.println("Operació no vàlida!");
        }
        
        /*
es mostra un menú amb les quatre operacions aritmètiques 
(suma, resta, multiplicació i divisió), perquè l'usuari triï un número 
d'opció (verificar dada).
es demana els valors dels dos operands. No es demanen els operands si l'opció 
triada no és correcta (es mostra un missatge adient).
es mostra el nom de l'operació feta i el resultat.
en el cas de la divisió, s'haurà de comprovar que el segon operand no sigui zero.
        */
    }
    
}
