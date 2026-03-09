package pkg42_a04_practica4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hivernacle implements IHivernacle {

    final public int MAXIM_PLANTES;
    private List<Planta> plantes;

    public Hivernacle(int maximPlantes) {
        this.MAXIM_PLANTES = maximPlantes;
        this.plantes = new ArrayList();
    }

    @Override
    public boolean afegirPlanta(Planta p) {
        boolean afegit = false;

        if (p != null && plantes.size() < MAXIM_PLANTES) {
            afegit = plantes.add(p);
        }

        return afegit;
    }

    @Override
    public List<Fruit> collirFruits() {
        List<Fruit> fruitsRecolectatsTotal = new ArrayList();
//        List<Fruit> fruitsRecolectatsPlanta = new ArrayList();

        for (Planta planta : plantes) {
            if (planta instanceof AmbFruits && planta.isEsViva()) {
                fruitsRecolectatsTotal.addAll(((AmbFruits) planta).treureFruits());

//                fruitsRecolectatsPlanta = ((AmbFruits) planta).treureFruits();
//                for (Fruit fruit : fruitsRecolectatsPlanta) {
//                    fruitsRecolectatsTotal.add(fruit);
//                }
            }
        }
        return fruitsRecolectatsTotal;

    }

    @Override
    public List<SenseFruit> collirPlantes() {
        List<SenseFruit> plantesSenseFruitRecolectades = new ArrayList();
        
        for (Planta planta : plantes) {
            if (planta instanceof SenseFruit && planta.isEsViva()
                    && ((SenseFruit) planta).isEsPotCollir()) {
                plantesSenseFruitRecolectades.add((SenseFruit) planta);
            }

        }
        plantes.removeAll(plantesSenseFruitRecolectades);

//        for (int i = plantes.size() - 1; i >= 0; i--) {
//            Planta planta = plantes.get(i);
//            if (planta instanceof SenseFruit && planta.isEsViva() 
//                    && ((SenseFruit) planta).isEsPotCollir()){
//                plantesSenseFruitRecolectades.add((SenseFruit) planta);
//                plantes.remove(i);
//            }
//        }
        
        return plantesSenseFruitRecolectades;
    }

    @Override
    public List<Planta> treurePlantesNoVives() {
        List<Planta> plantesMortes = new ArrayList();
        Planta planta;

        for (int i = plantes.size() - 1; i >= 0; i--) {
            planta = plantes.get(i);
            if(!planta.isEsViva()){
                plantes.remove(planta);
                plantesMortes.add(planta);
            }
        }
        return plantesMortes;
    }

    @Override
    public void temps() {
        for (Planta planta : plantes) {
            planta.creixer();
        }
    }

    @Override
    public String toString() {
        return "Hivernacle{" + "MAXIM_PLANTES=" + MAXIM_PLANTES + ", plantes=" + plantes + '}';
    }

}
