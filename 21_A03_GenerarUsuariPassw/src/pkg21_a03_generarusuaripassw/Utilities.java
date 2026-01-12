package pkg21_a03_generarusuaripassw;

import java.util.Random;
import java.util.Scanner;

public class Utilities {
    
    static final int USUARI = 0, PASS = 1;

    public static int generarUsuari(String[][] usuaris, int totalUsuaris) {
        String usuari, pass;

        if (totalUsuaris < usuaris.length) {
            usuari = demanarDades();
            pass = generarPass();

            usuari = obtenirNomUsuari(usuaris, totalUsuaris, usuari);

            usuaris[totalUsuaris][USUARI] = usuari;
            usuaris[totalUsuaris][PASS] = pass;

            totalUsuaris++;
        } else {
            System.out.println("BBDD llena!");
        }

        return totalUsuaris;

    }

    public static String demanarDades() {
        Scanner sc = new Scanner(System.in);
        String cognom1, cognom2;
        char inicial;

        System.out.print("Dis-me el nom: ");
        inicial = sc.nextLine().toLowerCase().charAt(0);

        System.out.print("Dis-me el primer cognom: ");
        cognom1 = sc.nextLine().toLowerCase();

        System.out.print("Dis-me el segon cognom: ");
        cognom2 = sc.nextLine().toLowerCase();

        return inicial + cognom1;

    }

    public static String obtenirNomUsuari(String[][] usuaris, int totalUsuaris, String usuari) {
        int contador = 0;

        for (int i = 0; i < totalUsuaris; i++) {
            if (usuaris[i][USUARI].startsWith(usuari)) {
                contador++;
            }
        }

        if (contador > 0) {
            usuari += contador + 1;
        }

        return usuari;
    }

    public static String generarPass() {
        Random rnd = new Random();
        final String CADENA_CARACTERS = "1234567890qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCVBNM";
        final int MIDA_PASS = 8;
        String pass = "";
        String pass2 = "";

        for (int i = 0; i < MIDA_PASS; i++) {
            pass += CADENA_CARACTERS.charAt(rnd.nextInt(CADENA_CARACTERS.length()));
            // Math.random()*(MAX-MIN+1)+MIN
            pass2 += CADENA_CARACTERS.charAt((int) (Math.random() * CADENA_CARACTERS.length()));
        }

//        System.out.println(pass);
//        System.out.println(pass2);

        return pass;

    }

    public static void mostrarUsuaris(String[][] usuaris, int totalUsuaris) {
        System.out.println("------------- USUARIS -------------");
        for (int i = 0; i < totalUsuaris; i++) {
            System.out.println(usuaris[i][USUARI] + " - " + usuaris[i][PASS]);
        }
    }

}
