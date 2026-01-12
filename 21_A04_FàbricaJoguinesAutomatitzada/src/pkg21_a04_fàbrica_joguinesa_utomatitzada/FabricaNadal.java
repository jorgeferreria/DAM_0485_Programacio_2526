package pkg21_a04_fàbrica_joguinesa_utomatitzada;

import static pkg21_a04_fàbrica_joguinesa_utomatitzada.EinesFabrica.*;

public class FabricaNadal {

    public static void main(String[] args) {
        final int DIM = 8;
        int totalJoguines;
        char[][] tauler;
        
        tauler = inicialitzarFabrica(DIM);
        
        mostrarFabrica(tauler);
        
        executarTorn(tauler);
        
        mostrarFabrica(tauler);
        
        totalJoguines = comptarJoguines(tauler);
        
        System.out.println("S'ha fabricat " + totalJoguines + " joguines");
        
    }
    
}
