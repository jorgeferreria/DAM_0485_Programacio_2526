package pkg42_a01_pràctica01;

public class Empleat {
    
    private String nom;

    public Empleat(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Empleat{" + "nom=" + nom + '}';
    }
    
    
    
}
