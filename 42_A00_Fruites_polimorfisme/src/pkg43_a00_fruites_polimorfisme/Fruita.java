package pkg43_a00_fruites_polimorfisme;

public class Fruita {
    
    private String nom;
    private int pes;
    private int dolsor; // 1->5

    public Fruita(String nom, int pes, int dolsor) {
        this.nom = nom;
        setPes(pes);
        setDolsor(dolsor);
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getPes() {
        return pes;
    }
    
    public void setPes(int pes) {
        if(pes >= 1 && pes <= 10000){
            this.pes = pes;
        } else {
            this.pes = 1;
        }
    }
    
    public int getDolsor() {
        return dolsor;
    }
    
    public void setDolsor(int dolsor) {
        if(dolsor >= 1 && dolsor <= 5){
            this.dolsor = dolsor;
        } else {
            this.dolsor = 1;
        }
    }
    
    public double ferSuc(){
        return pes;
    }
    
    @Override
    public String toString() {
        return "Nom=" + nom + ", Pes=" + pes + ", Dolsor=" + dolsor;
    }
    
}
