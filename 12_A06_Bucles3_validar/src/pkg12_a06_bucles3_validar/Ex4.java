package pkg12_a06_bucles3_validar;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SORTIDA = "fi", 
                BASE1 = "Error. La nota ha de ser ", 
                BASE2 = "entre 0 i 10",
                BASE3 = "un número",
                BASE4 = ".\nTorna-ho a provar: ",
                ERROR1 = BASE1 + BASE2 + BASE4,
                ERROR2 = BASE1 + BASE3 + BASE4;
        String text;
        double nota;
        int aprovats = 0, suspesos = 0;
        boolean continuar = true;

        System.out.println("Introdueix notes, entre 0 i 10 o fi per acabar.");
        do {
            if (sc.hasNextDouble()) {
                nota = sc.nextDouble();
                sc.nextLine(); // BUIDAR BUFFER
                if (nota >= 0 && nota < 5) {
                    suspesos++;
                } else if (nota >= 5 && nota <= 10) {
                    aprovats++;
                } else {
                    System.out.println(ERROR1);
                }
            } else {
                text = sc.nextLine();
                if (text.equalsIgnoreCase(SORTIDA)) {
                    continuar = false;
                    System.out.println("·············\n"
                            + "Hi ha " + aprovats + " aprovats i " + suspesos + " suspesos.");
                } else {
                    System.out.println(ERROR2);
                }
            }
        } while (continuar);
    }

}
