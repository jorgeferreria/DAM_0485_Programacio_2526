package pkg42_a02_pràcticaaprenentatge02;

public final class Cercle extends Figura {

    private double radi;

    public Cercle(String nom, double radi) {
        super(nom);
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }
    
    @Override
    public double perimetre() {
        return 2 * Math.PI * radi;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radi, 2);
    }

    @Override
    public String toString() {
        return "nom=" + getNom() + ", radi=" + radi;
    }
    
}
