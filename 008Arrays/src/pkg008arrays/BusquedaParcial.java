package pkg008arrays;

public class BusquedaParcial {

    public static void main(String[] args) {

        double[] arrayNotes = {2.0, 5.5, 9, 10, 4.9, 8, 8.5, 7, 6.6, 5, 9, 7};
        boolean existeixNota = false;
        int index = 0;
        //No cal recórrer tot l’array
        System.out.println("Ben fet amb While!");
        while (index < arrayNotes.length && !existeixNota) {
            if (arrayNotes[index] == 10) {
                existeixNota = true; // finalitza el bucle i la cerca
            }
            index++;
            System.out.println("Ingessar 1000000€ a cada alumne!");
        }
        existeixNota = false;
        System.out.println("Mal fet amb For Break!");
        for (int i = 0; i < arrayNotes.length; i++) {
            if (arrayNotes[i] == 10) {
                existeixNota = true; // finalitza el bucle i la cerca
                break;
            }
            System.out.println("Ingessar 1000000€ a cada alumne!");
        }
        existeixNota = false;
        System.out.println("Ben fet amb For i condició extra");
        for (int i = 0; i < arrayNotes.length && !existeixNota; i++) {
            if (arrayNotes[i] == 10) {
                existeixNota = true; // finalitza el bucle i la cerca
            }
            System.out.println("Ingessar 1000000€ a cada alumne!");
        }
    }

}
