package pkg42_a04_practica4;

import java.util.List;

public interface IHivernacle {
    boolean afegirPlanta(Planta p);
    List<Fruit> collirFruits();
    List<SenseFruit> collirPlantes();
    List<Planta> treurePlantesNoVives();
    void temps();
    
}
