package pkg_utilitats;

import java.util.ArrayList;
import java.util.Scanner;

public class LlistaCantantsFamosos {

    static ArrayList<String> cantantFamos = new ArrayList();
    static ArrayList<String> discoMasVentas = new ArrayList();
    static Scanner sc = new Scanner(System.in);

    public static void gestionarDiscografica() {
        boolean continuar = true;
        int opcio;

        do {

            mostrarMenu();
            opcio = demanarOpcio();
            continuar = gestionarOpcio(opcio);

        } while (continuar);

    }

    public static void mostrarMenu() {
        System.out.println(
                "OPCIONS DISCOGRÀFICA:\n"
                + "\t1. Alta\n"
                + "\t2. Llista cantants\n"
                + "\t3. Eliminar\n"
                + "\t4. Modificar Disc\n"
                + "\t5. Sortir");
    }

    public static int demanarOpcio() {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        boolean continuar = true;

        do {
            System.out.print("Tria una opció: ");
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                continuar = false;
            } else {
                sc.nextLine();
                System.out.println("Valor no vàlid!");
            }
        } while (continuar);

        return valor;
    }

    public static boolean gestionarOpcio(int opcio) {
        switch (opcio) {
            case 1:
                System.out.println("1. Alta:");
                afegirCantantDisc();
                break;
            case 2:
                System.out.println("2. Llista cantants.");
                mostarCantantsDisc();
                break;
            case 3:
                System.out.println("3. Eliminar.");
                elimiarCantantDisc();
                break;
            case 4:
                System.out.println("4. Modificar Disc.");
                modificarDisc();
                break;
            case 5:
                System.out.println("5. Sortir.");

                return false;
            default:
                System.out.println("Opció Incorrecta!");
        }
        return true;
    }

    public static void afegirCantantDisc() {
        String cantant, disc;

        System.out.print("Introdueix el nom del cantant: ");
        cantant = sc.nextLine();

        System.out.print("Introdueix el disc més venut: ");
        disc = sc.nextLine();

        if (cantant.length() >= 3 && cantant.length() <= 50
                && disc.length() >= 3 && disc.length() <= 150
                && !cantantFamos.contains(cantant)) {

            cantantFamos.add(cantant);
            discoMasVentas.add(disc);

        } else {
            System.out.println("Dades no vàlides!");
        }

    }

    public static void mostarCantantsDisc() {

        if (cantantFamos.isEmpty()) {
            System.out.println("No hi ha cap cantant a la llista!");
        } else {
            for (int i = 0; i < cantantFamos.size(); i++) {

                System.out.println("Cantant: " + cantantFamos.get(i) + "\t"
                        + "Disc més venut: " + discoMasVentas.get(i));
            }
        }

    }

    private static void elimiarCantantDisc() {
        String cantant;
        int index;

        System.out.print("Introdueix el nom del cantant a eliminar: ");
        cantant = sc.nextLine();

        index = cantantFamos.indexOf(cantant);

        if (index >= 0) {
            cantantFamos.remove(cantant);
            discoMasVentas.remove(index);
        } else {
            System.out.println("El cantant NO està a la llista!");
        }
        
        System.out.println("Resultat: ");
        mostarCantantsDisc();

    }

    private static void modificarDisc() {
        String cantant, nouDisc;
        int index;

        System.out.print("Introdueix el nom del cantant a eliminar: ");
        cantant = sc.nextLine();
        
        index = cantantFamos.indexOf(cantant);
        
        if(index >= 0){
            System.out.print("Introdueix el nou nom del disc: ");
            nouDisc = sc.nextLine();
            
            discoMasVentas.set(index, nouDisc);            
        } else {
            System.out.println("El cantant NO està a la llista!");
        }
    
    }

}
