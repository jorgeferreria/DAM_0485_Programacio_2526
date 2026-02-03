package pkg011poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> maquinaVenta = new ArrayList();
        
        System.out.println();

//        Producto prod1 = new Producto(); // INSTANCIACIÓN
//        Producto prod2 = new Producto();

//        prod1.nomProducte = "Poma";
//        prod1.preu = 1.1;
//        prod1.estoc = 4;
//        
//        prod2.nomProducte = "Pera";
//        prod2.preu = 1.3;
//        prod2.estoc = 6;
        
//        maquinaVenta.add(prod1);
//        maquinaVenta.add(prod2);
        
        maquinaVenta.add(new Producto("Naranja", 3.2, 50));
        maquinaVenta.add(new Producto("Limon", 1.2, 20));
        maquinaVenta.add(new Producto("Cereza", 33.2, 1000));

        maquinaVenta.get(maquinaVenta.size()-1).setPreu(111243320);
        System.out.println(maquinaVenta.get(maquinaVenta.size()-1).getPreu());
        
        //System.out.println(maquinaVenta.get(maquinaVenta.size()-1).equals(maquinaVenta.size() - 2));
        
        System.out.println(maquinaVenta);
        
//        System.out.println(prod1);
        
    }

}
