package pkg42_a02_pràcticaaprenentatge02;

public abstract class Figura {
    
    private String nom;

    public Figura(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    
    public abstract double perimetre();
    
    public abstract double area();
    
}
