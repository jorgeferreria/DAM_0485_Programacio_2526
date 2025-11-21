package pkg13_a00_arrays0;

import java.util.Random;

public class Ex09 {

    public static void main(String[] args) {
        // VARIABLES
        Random rnd = new Random();
        final int MAX_VALORS = 50, MIN_VALUE = 1, MAX_VALUE = 6;
        int edats[] = new int[MAX_VALORS];
        int contadors[] = new int[MAX_VALUE - MIN_VALUE + 1];
        int edat, maxRepetit, numMaxRepetit;

        // CODI
        for (int i = 0; i < edats.length; i++) {
            edats[i] = rnd.nextInt(MIN_VALUE, MAX_VALUE + 1);
        }

        for (int i = 0; i < edats.length; i++) {
//            edat = edats[i];
//            contadors[ edat - MIN_VALUE]++;
            contadors[edats[i] - MIN_VALUE]++;
        }

        for (int i = 0; i < contadors.length; i++) {
            System.out.println((i + MIN_VALUE) + " - " + contadors[i]);
        }
        
        maxRepetit = contadors[0];
        numMaxRepetit = MIN_VALUE;
        for (int i = 1; i < contadors.length; i++) {
            if(maxRepetit < contadors[i]){
                maxRepetit = contadors[i];
                numMaxRepetit = i + MIN_VALUE;
            }
        }
        System.out.println(numMaxRepetit + " - " + maxRepetit);
    }

}
