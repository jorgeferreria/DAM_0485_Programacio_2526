package pkg51_a05_botiga;

public class Main {

    public static void main(String[] args) {
        
        Botiga b = new Botiga();
        
        b.afegir(new Joc("joc1","dev1","cat1"));
        b.afegir(new Joc("joc2","dev2","cat2"));
        b.afegir(new Joc("joc3","dev4","cat3"));
        b.afegir(new Joc("joc4","dev3","cat3"));
        b.afegir(new Joc("joc1","dev2","cat2"));
        b.afegir(new Joc("joc1","dev1","cat2"));
        b.afegir(new Joc("joc3","dev4","cat1"));
        
        b.mostrarJocs();
        
        b.mostrarJocs(b.filtrar("cat1"));
        
        b.eliminar(new Joc("joc1","dev1","cat1"));
        
        b.mostrarJocs();
        
        
        b.mostrarJocs(b.eliminarJocsPerCategoria("cat3"));
        
        b.mostrarJocs();
        
    }
    
}
