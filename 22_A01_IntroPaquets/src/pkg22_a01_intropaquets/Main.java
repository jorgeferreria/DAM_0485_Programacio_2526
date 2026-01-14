package pkg22_a01_intropaquets;

import java.util.ArrayList;
import static pkg_utilitats.EntradaDades.*; //IMPORT DELS MÉTODES
import pkg_utilitats.Utilitats; // IMPORTS DE LA CLASSE


public class Main {

    public static void main(String[] args) {
        final int USUARIS = 5;
        
        ArrayList<String> noms;
        ArrayList<Integer> edats;
        ArrayList<Double> alsades;
        
        noms = emplenarNoms(USUARIS);
        edats = emplenarEdats(USUARIS);
        alsades = emplenarAlsades(USUARIS);
        
        Utilitats.mostrarDades(noms, edats, alsades);
        
        Utilitats.compararEdat(edats);
        
        
    }
    
}
