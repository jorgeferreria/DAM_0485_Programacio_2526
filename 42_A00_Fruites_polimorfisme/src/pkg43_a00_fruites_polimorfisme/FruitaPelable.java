package pkg43_a00_fruites_polimorfisme;

public class FruitaPelable extends Fruita {

    public FruitaPelable(String nom, int pes, int dolsor) {
        super(nom, pes, dolsor);
    }

    @Override
    public double ferSuc() {
        return getPes() * 0.9;
    }

}
