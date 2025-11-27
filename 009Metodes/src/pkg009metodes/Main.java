package pkg009metodes;

import static pkg009metodes.Auxiliar.saludar;

public class Main {

    public static void main(String[] args) {
        String noms[] = {"Pepe", "Maria", "Alex"};
        String ciutats[] = {"Montcada", "Sabadell", "Barcelona"};
        int edats[] = {10, 20, 30};
        String cadena;

        for (int i = 0; i < noms.length; i++) {
            cadena = saludar(noms[i], ciutats[i], edats[i]);
            System.out.println(cadena);
            
        }

    }

}
