package pkg42_a03_pràcticaaprenentatge03;

import java.util.ArrayList;
import java.util.List;

public class Zoologic {
    
    private List<AnimalBase> animals;

    public Zoologic() {
        animals = new ArrayList();
    }

    public List<AnimalBase> getAnimals() {
        return animals;
    }
    
    public void afegirAnimal(AnimalBase animal){
        if(!animals.contains(animal)){
            animals.add(animal);
        }
    }
    
    public void alimentarTotsElsAnimals(){
        
    }
    
    public void mostrarEstatAnimals(){
        
    }

    @Override
    public String toString() {
        return "Zoologic{" + "animals=" + animals + '}';
    }
    
}
