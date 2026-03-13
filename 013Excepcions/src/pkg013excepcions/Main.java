package pkg013excepcions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Persona p = null;
        System.out.println("INICI DE PROGRAMA");

        try {
            p = new Persona("565", "Jose");
        } catch (DniNoValidException ex) {
            System.out.println(ex.getMessage());
        }
        
        if(p != null){
            System.out.println(p);
        }

        List<String> noms = new ArrayList();

        noms.add("Pepe");

        try {
            System.out.println(3 / 0);
            System.out.println(noms.get(1));
            Scanner sc = new Scanner(new File("entrada.txt"));

        } catch (FileNotFoundException | ArithmeticException ex) {
            System.out.println(ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Error de posición!!!");
        } catch (Exception ex) {
            System.out.println("Error!!!");
        }

        System.out.println("FI DE PROGRAMA!!!");

    }

}
