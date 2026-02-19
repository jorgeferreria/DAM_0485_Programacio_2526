package pkg43_a00_fruites_polimorfisme;

public class FruitaExprimible extends Fruita{

    public FruitaExprimible(String nom, int pes, int dolsor) {
        super(nom, pes, dolsor);
    }
    
    @Override
    public double ferSuc() {
        return getPes() * 0.5;
    }
}
