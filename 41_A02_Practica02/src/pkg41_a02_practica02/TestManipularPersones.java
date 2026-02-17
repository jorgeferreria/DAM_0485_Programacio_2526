package pkg41_a02_practica02;

public class TestManipularPersones {

    public static void main(String[] args) {
        
        ManipularPersones mp = new ManipularPersones();
        
        Persona p1 = new Persona("Jorge", "1A", 23);
        Persona p2 = new Persona("Lucia", "2B", 34);
        Persona p3 = new Persona("Alba", "3C", 23);
        Persona p4 = new Persona("Lidia", "4D", 56);
        
        mp.afegir(p1);
        mp.afegir(p2);
        mp.afegir(p3);
        
        System.out.println(mp);
        
        System.out.println(mp.existeix(p4)); // true
        
        System.out.println(mp.cercaPerNif("2B"));
        mp.cercaPerNif("2B").setEdat(100);
        
        System.out.println(mp);
        
//        System.out.println(mp.esborrar("2B"));
//        
//        System.out.println(mp);
        
        System.out.println(mp.cercaPerEdat(23));
        System.out.println(mp);
        
        
    }
    
}
