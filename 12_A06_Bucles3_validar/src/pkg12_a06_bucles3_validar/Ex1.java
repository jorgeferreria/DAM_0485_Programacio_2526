package pkg12_a06_bucles3_validar;

import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String PASSWORD_SECRET = "BONDIA!";
        String password = "";
        boolean continuar = true;
              
        do {
            System.out.print("Dis-me la teva contrasenya: ");
            password = sc.nextLine();
            continuar = !password.equals(PASSWORD_SECRET);
            if (continuar){
                System.out.println("Has fallat, torna a intentar-ho!");
            }
        } while (continuar);
        System.out.println("Benvingut!!!! Has encertat la contrasenya!");
    }
    
}
