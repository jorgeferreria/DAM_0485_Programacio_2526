package pkg51_a07_gestiocomptes;

public class GestioComptesTest {

    public static void main(String[] args) {
        
        GestioComptes gc = new GestioComptes();
        
        Compte c1 = new Compte("1", 100);
        Compte c2 = new Compte("2", 100);
        Compte c3 = new Compte("3", 100);
        Compte c4 = new Compte("4", -100);
        Compte c5 = new Compte("5", 150);
        Compte c6 = new Compte("6", 300);
        
        System.out.println(gc.afegir(c1));
        System.out.println(gc.afegir(c2));
        System.out.println(gc.afegir(c3));
        System.out.println(gc.afegir(c4));
        System.out.println(gc.afegir(c5));
        System.out.println(gc.afegir(c6));
        
        gc.imprimirComptes();
        
        gc.esborrarPerSaldo(100);
        
        gc.imprimirComptes();
        
        
    }
    
}
