package pkg42_a03_pràcticaaprenentatge03;

public class Gos extends AnimalBase implements AnimalTerrestre {
    
    public Gos(String nom) {
        super(nom, 15);
        afegirAliments();
    }
    
    public Gos(String nom, int energia) {
        super(nom, energia, 15);
        afegirAliments();
    }
    
    @Override
    public void emetreSo() {        
        if (teEnergia(10)) {
            System.out.println(getNom() + " diu: Guau Guau!");
        } else {
            System.out.println(getNom() + " està massa cansat per bordar.");
        }
        
    }
    
    private void afegirAliments() {
        getAlimentsAceptats().add("pinso");
        getAlimentsAceptats().add("carn");
    }
    
    @Override
    public void caminar(int distancia) {        
        if (distancia > 200) {
            System.out.println(getNom() + " no pot caminar tanta distància.");
        } else if (distancia <= 0){
            System.out.println("Valor incorrecte");
        } else if (teEnergia(distancia / 2)) {
            System.out.println("Sóc " + getNom() + " i estic caminant.");
            setEnergia(getEnergia() - distancia / 2);
        } else {
            System.out.println(getNom() + " està massa cansat per caminar.");
        }
    }
    
}
