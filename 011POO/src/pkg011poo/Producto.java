package pkg011poo;

public class Producto {

    // ATRIBUTOS
    private String nomProducte;
    private double preu;
    private int estoc;

    // CONTRUCTORES
    public Producto(String nomProducte, double preu, int estoc) {
        this.nomProducte = nomProducte;
        this.preu = preu;
        this.estoc = estoc;
    }

    // GETTERS AND SETTERS
    public String getNomProducte() {
        return nomProducte;
    }

    public void setNomProducte(String nomProducte) {
        this.nomProducte = nomProducte;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        if (preu >= 0 && preu < 100) {
            this.preu = preu;
        }
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }

    // MÉTODOS PROPIOS
    
    
    
    
    // TO STRING
    @Override
    public String toString() {
        return "nomProducte=" + nomProducte + ", preu=" + preu + ", estoc=" + estoc;
    }

}
