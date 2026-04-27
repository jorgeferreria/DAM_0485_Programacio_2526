package pkg51_a06_gestiobotiga;

public class Main {

    public static void main(String[] args) {
        
        GestioBotigues gb = new GestioBotigues();
        Client c1 = new Client("1", "Maria", "Martinez");
        Client c2 = new Client("2", "Pepe", "Lopez");
        
        gb.afegirJoc(c1, new Joc("joc1", "dev1", "cat1"));
        gb.afegirJoc(c1, new Joc("joc2", "dev2", "cat2"));
        gb.afegirJoc(c2, new Joc("joc1", "dev1", "cat1"));
        gb.afegirJoc(c2, new Joc("joc3", "dev3", "cat3"));
        
        gb.imprimir();
        
        gb.eliminarClientsPerJoc(new Joc("joc3", "dev3", "cat3"));
        
        gb.imprimir();
        
        gb.eliminarClientsPerCategoria("cat1");
        
        gb.imprimir();
    }
    
}
