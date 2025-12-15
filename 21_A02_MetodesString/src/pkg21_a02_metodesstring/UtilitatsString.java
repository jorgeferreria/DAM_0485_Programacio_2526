package pkg21_a02_metodesstring;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilitatsString {

    public static String[] ordenarParelles(String csv) {
        String[] parelles; // LOCAL
        String temporal;

        parelles = csv.split(",");

        for (int i = 0; i < parelles.length; i += 2) {
            if (parelles[i].compareTo(parelles[i + 1]) > 0) {
                temporal = parelles[i + 1];
                parelles[i + 1] = parelles[i];
                parelles[i] = temporal;
            }
        }

        return parelles;
    }

    public static void imprimirParelles(String[] parelles) {
        for (int i = 0; i < parelles.length; i += 2) {
            System.out.println(parelles[i] + "\t\t" + parelles[i + 1]);
        }
    }

    public static ArrayList<String> obtenirDoctores(String[] parelles) {
        ArrayList<String> doctores = new ArrayList(); // LOCAL

        for (int i = 0; i < parelles.length; i += 2) {
            if (parelles[i].startsWith("Dra")) {
                doctores.add(parelles[i]);
            }
        }

        return doctores;

    }

    public static void eliminarDoctora(ArrayList<String> doctores) {
        Scanner sc = new Scanner(System.in);
        String nomDoctora;
        int index = 0;
        boolean continuar = true;

        System.out.println("Dis-me el nom de la doctora a eliminar?");
        nomDoctora = sc.nextLine();

        while (continuar) {
            if (doctores.get(index).equalsIgnoreCase(nomDoctora)) {
                doctores.remove(index);
                continuar = false;
            }
            index++;
        }
        
        imprimirArrayList(doctores);

    }
    
    public static void imprimirArrayList(ArrayList<String> doctores) {
        for (String doctora : doctores) {
            System.out.println(doctora);
        }
    }

}
