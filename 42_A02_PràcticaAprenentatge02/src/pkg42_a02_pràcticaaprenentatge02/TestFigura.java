package pkg42_a02_pràcticaaprenentatge02;

import java.util.ArrayList;
import java.util.List;

public class TestFigura {

    public static void main(String[] args) {

        List<Figura> figures = new ArrayList();
        Figura f;

        figures.add(new Cercle("cerclet", 5.6));
        figures.add(new Rectangle("rectangulet", 5.6, 7.4));

        f = new Cercle("Cerclefigura", 3.8);
//        f = new Rectangle("Cerclefigura", 3.8, 5);
        
        if( f instanceof Cercle){
            ((Cercle) f).setRadi(9);
        }
        
        figures.add(f);

        for (Figura figure : figures) {
            System.out.println(figure);
        }

        System.out.println("*****************************");
        
        for (Figura figure : figures) {
            if (figure instanceof Rectangle){
                System.out.println(figure);
            }
        }
    }

}
