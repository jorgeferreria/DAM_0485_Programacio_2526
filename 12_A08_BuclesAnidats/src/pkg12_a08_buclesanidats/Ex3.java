package pkg12_a08_buclesanidats;

public class Ex3 {

    public static void main(String[] args) {

        int columnaTriada = 1; // 1 -> 3
        int dimensio = 3;

        for (int i = 1; i <= dimensio; i++) {
            System.out.print("|");

            for (int j = 1; j <= dimensio; j++) {
                if (columnaTriada != j) {
                    System.out.print("X|");
                } else {
                    System.out.print(i + "|");
                }
            }

            System.out.println("");
        }

    }

}
