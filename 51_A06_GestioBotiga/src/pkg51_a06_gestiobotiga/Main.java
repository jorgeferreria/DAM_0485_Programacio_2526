package pkg51_a06_gestiobotiga;

public class Main {

    public static void main(String[] args) {
        
        GestioBotigues gb = new GestioBotigues();
        
        gb.afegirJoc(
                new Client("1", "Maria", "Martinez"), 
                new Joc("joc1", "dev1", "cat1"));
        
        
    }
    
}
