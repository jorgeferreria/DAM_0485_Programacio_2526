package pkg42_a01_pràctica01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleat> empleats = new ArrayList();
        List<Operari> operaris = new ArrayList();

        empleats.add(new Empleat("Pepe"));
        empleats.add(new Directiu("Maria"));
        empleats.add(new Operari("Lucia"));
        empleats.add(new Oficial("Andres"));
        empleats.add(new Tecnic("Elena"));

        for (Empleat empleat : empleats) {
            System.out.println(empleat);
            
            if (empleat instanceof Operari) {
                operaris.add((Operari) empleat);
                ((Operari) empleat).trabajar();
            }
        }

        
        for (Operari operari : operaris) {
            System.out.println(operari);
        }
    }

}
