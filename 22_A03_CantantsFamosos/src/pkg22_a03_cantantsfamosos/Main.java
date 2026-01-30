package pkg22_a03_cantantsfamosos;

import java.util.ArrayList;
import static pkg_utilitats.LlistaCantantsFamosos.gestionarDiscografica;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> cantantFamos = new ArrayList();
        ArrayList<String> discoMasVentas = new ArrayList();
        
        gestionarDiscografica(cantantFamos, discoMasVentas);
        
    }
    
}
