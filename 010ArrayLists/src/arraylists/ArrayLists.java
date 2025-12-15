package arraylists;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
    
        // CREACIÓ D'UN ARRAYLIST DE TIPUS STRING, SOLS TIPUS COMPLEXOS (Integer, Double, Boolean, ...)
        ArrayList<String> personas = new ArrayList();
         ArrayList<String> personas2 = personas; // Copia per referència
        
        // AFEGIR UN ELEMENT
        personas.add("Pepe");
        personas.add("Maria");
        personas.add("Jose");
        
        // AFEGIR UN ELEMENT EN UNA POSICIÓ DETERMINADA
        personas.add(0,"Laura");
        
        // ELIMINAR UN ELEMENT D'UNA POSICIÓ DETERMINADA
        personas.remove(2);
        
        // MODIFICAR UN ELEMENT D'UNA POSICIÓ DETERMINADA PER UN NOU VALOR
        personas.set(1, "Andres");
        
        // BUSCAR UN ELEMENT, RETORNA TRUE/FALSE
        System.out.println(personas.contains("Luis"));
        System.out.println(personas.contains("Laura"));
        
        // BUSCAR UN ELEMENT, RETORNA -1 SI NO EL TROVA O LA POSCICIÓ ON TROVA LA PRIMERA OCURRENCIA
        System.out.println(personas.indexOf("Luis"));
        System.out.println(personas.indexOf("Laura"));
        
        // ELIMINAR TOTS ELS ELEMENTS
//        personas.clear();
        
        System.out.println(personas);
        System.out.println(personas.size());
        
        for (int i = 0; i < personas.size(); i++) {
            // MOSTRAR UNA POSICIÓ DETERMINADA
            System.out.println((i+1) + ". " + personas.get(i));
        }
        
        // FOR-EACH PER RECORRER COLLECIONS
        for (String persona : personas) {
            System.out.println(persona);
        }
        
    }
    
}
