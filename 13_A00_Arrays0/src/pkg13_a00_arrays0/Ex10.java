package pkg13_a00_arrays0;

public class Ex10 {

    public static void main(String[] args) {
        int valors[] = {369, -6, 0, 15, -8965, 478, 654, 58, -25, 32, 0, 9, -8, 17, 371, 414, -930};
        int positius[] = new int[valors.length];
        int negatius[] = new int[valors.length];
        int indexPositius = 0, indexNegatius = 0;

        for (int i = 0; i < valors.length; i++) {
            if (valors[i] >= 0) {
                positius[indexPositius] = valors[i];
                indexPositius++;
            } else {
                negatius[indexNegatius] = valors[i];
                indexNegatius++;
            }
        }

        System.out.println("Llistat de nombres positius o cero:");
        for (int i = 0; i < indexPositius; i++) {
            System.out.println(positius[i]);
        }
        System.out.println("Llistat de nombres negatius:");
        for (int i = 0; i < indexNegatius; i++) {
            System.out.println(negatius[i]);
        }
    }

}
