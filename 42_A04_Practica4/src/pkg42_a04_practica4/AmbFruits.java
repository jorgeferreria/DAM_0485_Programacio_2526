package pkg42_a04_practica4;

import java.util.ArrayList;
import java.util.List;

public class AmbFruits extends Planta {

    public int ALTURA_MIN_DONAR_FRUIT;
    public int MAXIM_FRUITS;
    private int minEsMadur;
    List<Fruit> fruits;
    private int comptFruits;

    public AmbFruits(int alturaMinDonarFruit, int maximFruits, int minEsMadur, int alturaMaxima) {
        super(alturaMaxima);
        this.ALTURA_MIN_DONAR_FRUIT = alturaMinDonarFruit;
        this.MAXIM_FRUITS = maximFruits;
        this.minEsMadur = minEsMadur;
        this.comptFruits = 0;
        this.fruits = new ArrayList();
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public List<Fruit> treureFruits() {
        List<Fruit> fruitsRecolectats = new ArrayList();

        for (Fruit fruit : fruits) {
            if (fruit.isEsMadur()) {
                fruitsRecolectats.add(fruit);
            }
        }
        fruits.removeAll(fruitsRecolectats);
        
//        for (int i = fruits.size(); i >= 0; i--) {            
//            if (fruits.get(i).isEsMadur()) {
//                fruitsRecolectats.add(fruits.get(i));
//                fruits.remove(i);
//            }
//        }

        return fruitsRecolectats;
    }

    private void creixerFruits() {
        for (Fruit fruit : fruits) {
            fruit.creix();
        }
    }

    private void crearFruit() {
        if (fruits.size() + 1 < MAXIM_FRUITS) {
            fruits.add(new Fruit(minEsMadur));
        }
    }

    @Override
    public void creixer() {
        if (isEsViva()) {
            altura++;
            if (altura >= ALTURA_MIN_DONAR_FRUIT) {
                creixerFruits();
                crearFruit();
            }

            if (altura >= ALTURA_MAXIMA) {
                matarPlanta();
            }
        }

    }

    @Override
    public String toString() {
        return "AmbFruits{" + "ALTURA_MIN_DONAR_FRUIT=" + ALTURA_MIN_DONAR_FRUIT + ", MAXIM_FRUITS="
                + MAXIM_FRUITS + ", minEsMadur=" + minEsMadur + ", fruits=" + fruits
                + ", comptFruits=" + comptFruits + ", altura=" + altura + '}';
    }

}
