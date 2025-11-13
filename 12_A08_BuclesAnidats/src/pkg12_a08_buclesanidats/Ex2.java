package pkg12_a08_buclesanidats;

public class Ex2 {

    public static void main(String[] args) {

        int dimension = 9, multiplicacio = 0;

        System.out.print("    |");
        for (int i = 1; i <= dimension; i++) {
            if (i < 10) {
                System.out.print("   " + i);
            } else {
                System.out.print("  " + i);
            }

        }
        System.out.print("\n-----");
        for (int i = 1; i <= dimension; i++) {
            System.out.print("----");
        }

        for (int i = 1; i <= dimension; i++) {

            if (i < 10) {
                System.out.print("\n  " + i + " |");
            } else {
                System.out.print("\n " + i + " |");
            }

            for (int j = 1; j <= dimension; j++) {
                multiplicacio = i * j;
                if (multiplicacio < 10) {
                    System.out.print("   " + multiplicacio);
                } else if (multiplicacio < 100) {
                    System.out.print("  " + multiplicacio);
                } else {
                    System.out.print(" " + multiplicacio);
                }
            }
        }
        System.out.println("");
    }

}
