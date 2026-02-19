package pkg43_a00_fruites_polimorfisme;

import java.util.ArrayList;
import java.util.List;

public class TestFruita {

    public static void main(String[] args) {
        
        List<Fruita> fruites = new ArrayList();
        
        fruites.add(new Fruita("Maduixa", 20, 4));
        fruites.add(new Fruita("Nabiu", 10, 2));
        fruites.add(new FruitaPelable("Platan", 70, 3));
        fruites.add(new FruitaPelable("Pressec", 120, 5));
        fruites.add(new FruitaExprimible("Mandarina", 70, 2));
        fruites.add(new FruitaExprimible("Taronja", 200, 3));
        
        for (Fruita fruite : fruites) {
            System.out.println(fruite);
        }
        
        for (Fruita fruite : fruites) {
            System.out.println(fruite.getNom() + ": " +fruite.ferSuc());
        }
        
    }
    
}
