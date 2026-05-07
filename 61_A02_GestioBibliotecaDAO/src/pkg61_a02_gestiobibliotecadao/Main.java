package pkg61_a02_gestiobibliotecadao;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LlibreDAO llibreDao = new LlibreDAOImpl();
        int opcio;

        do {
            System.out.println("\n--- BIBLIOTECA MUNICIPAL ---");
            System.out.println("1. Registrar nou llibre");
            System.out.println("2. Llistar catàleg");
            System.out.println("3. Actualitzar pàgines");
            System.out.println("4. Veure llibre més llarg");
            System.out.println("5. Sortir");
            System.out.print("Tria una opció: ");
            opcio = sc.nextInt();
            sc.nextLine(); // Netejar buffer

            switch (opcio) {
                case 1:
                    boolean registrat = llibreDao.registrar(demanarDadesLlibre());
                    if (registrat) {
                        System.out.println("Llibre registrat correctament.");
                    } else {
                        System.out.println("Llibre NO registrat.");
                    }
                    break;

                case 2:
                    List<Llibre> llibres = llibreDao.obtenirTots();
                    if (llibres.isEmpty()) {
                        System.out.println("No hi han llibres.");
                    } else {
                        System.out.println("LLIBRES:");
                        for (Llibre llibre : llibres) {
                            System.out.println(llibre);
                        }
                    }

                    break;

                case 3:
                    System.out.print("ID del llibre: ");
                    int idAct = sc.nextInt();
                    System.out.print("Noves pàgines: ");
                    int novesP = sc.nextInt();
                    boolean actualitzat = llibreDao.actualitzarPagines(idAct, novesP);
                    if (actualitzat) {
                        System.out.println("Llibre actualizat correctament.");
                    } else {
                        System.out.println("Llibre NO actualizat.");
                    }
                    break;

                case 4:
                    Llibre llibreMesLlarg = llibreDao.obtenirMesLlarg();
                    if (llibreMesLlarg != null) {
                        System.out.println("LLIBRE MÉS LLARG:");
                        System.out.println(llibreMesLlarg);
                    } else {
                        System.out.println("No hi han llibres.");
                    }
                    break;

            }
        } while (opcio != 5);
    }

    private static Llibre demanarDadesLlibre() {
        Scanner sc = new Scanner(System.in);
        String ISBN, titol, autor;
        int pagines;

        System.out.print("ISBN: ");
        ISBN = sc.nextLine();

        System.out.print("Títol: ");
        titol = sc.nextLine();

        System.out.print("Autor: ");
        autor = sc.nextLine();

        System.out.print("Pàgines: ");
        pagines = sc.nextInt();

        return new Llibre(ISBN, titol, autor, pagines);
    }
}
