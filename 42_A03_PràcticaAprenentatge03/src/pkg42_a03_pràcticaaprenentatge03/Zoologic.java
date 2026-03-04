package pkg42_a03_pràcticaaprenentatge03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zoologic {

    private List<AnimalBase> animals;

    public Zoologic() {
        animals = new ArrayList();
    }

    public List<AnimalBase> getAnimals() {
        return animals;
    }

    public void afegirAnimal(AnimalBase animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
        }
    }

    public void alimentarTotsElsAnimals() {
        Random rnd = new Random();
        List alimentsValids = List.of("pinso", "carn", "peix", "calamar", "rosegadors");

        for (AnimalBase animal : animals) {
            animal.menjar((String) alimentsValids.get(rnd.nextInt(alimentsValids.size())));
        }

    }

    public void mostrarEstatAnimals() {
        for (AnimalBase animal : animals) {
            System.out.println(animal);
        }
    }

    @Override
    public String toString() {
        return "Zoologic{" + "animals=" + animals + '}';
    }

}
