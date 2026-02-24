package pkg42_a02_pràcticaaprenentatge02;

public class Rectangle extends Figura {

    private double amplada;
    private double altura;

    public Rectangle(String nom, double amplada, double altura) {
        super(nom);
        this.amplada = amplada;
        this.altura = altura;
    }

    public double getAmplada() {
        return amplada;
    }

    public void setAmplada(double amplada) {
        this.amplada = amplada;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public final double perimetre() {
        return 2 * (altura + amplada);
    }

    @Override
    public final double area() {
        return amplada * altura;
    }

    @Override
    public String toString() {
        return "nom=" + getNom() + ", amplada=" + amplada + ", altura=" + altura;
    }

}
