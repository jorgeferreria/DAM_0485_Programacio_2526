package arraylists;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
    
        ArrayList<String> personas = new ArrayList();
        
        personas.add("Pepe");
        personas.add("Maria");
        personas.add("Jose");
        personas.add(0,"Laura");
        
        personas.remove(2);
        
        personas.set(1, "Andres");
        
        System.out.println(personas.contains("Luis"));
        System.out.println(personas.contains("Laura"));
        System.out.println(personas.indexOf("Luis"));
        System.out.println(personas.indexOf("Laura"));
        
//        personas.clear();
        
        System.out.println(personas);
        System.out.println(personas.size());
        
        for (int i = 0; i < personas.size(); i++) {
            System.out.println((i+1) + ". " + personas.get(i));
        }
        
        for (String persona : personas) {
            System.out.println(persona);
        }
        
    }
    
}
