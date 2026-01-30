package pkg_utilitats;

import java.util.ArrayList;

public class LlistaCantantsFamosos {
    
    public static void gestionarDiscografica(ArrayList<String> cantantFamos, ArrayList<String> discoMasVentas) {
        boolean continuar = true;
        
        do {
            
            mostrarMenu();
            
        } while (continuar);
    
    }
    
    public static void mostrarMenu() {
        System.out.println(
            "OPCIONS DISCOGRÀFICA:\n" + 
            "\t1. Alta\n" + 
            "\t2. Llista cantants\n" + 
            "\t3. Eliminar\n" + 
            "\t4. Modificar Disc\n" + 
            "\t5. Sortir");
    }
    
    
}
