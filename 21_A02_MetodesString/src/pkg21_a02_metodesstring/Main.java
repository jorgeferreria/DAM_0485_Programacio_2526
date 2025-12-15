package pkg21_a02_metodesstring;

import java.util.ArrayList;
import static pkg21_a02_metodesstring.UtilitatsString.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> doctores;
        String[] parelles;
        String csv
                = "Sr. Jimenez,Dra. Garcia,Dr. Ruiz,Sra. Gonzalez,Dra. Hernandez,"
                + "Sr. Rodriguez,Sr. Diaz,Dr. Fernandez,Dra. Moreno,Sr. Lopez,"
                + "Sra. Muñoz,Dra. Martinez,Dr. Alvarez,Sr. Sanchez,Dra. Romero,"
                + "Sra. Perez,Sr. Alonso,Dr. Gomez,Sra. Gutierrez,Dr. Martin,"
                + "Dra. Navarro,Sr. Torres";

        parelles = ordenarParelles(csv);

        imprimirParelles(parelles);

        doctores = obtenirDoctores(parelles);

        eliminarDoctora(doctores);

        imprimirArrayList(doctores);

    }

}
