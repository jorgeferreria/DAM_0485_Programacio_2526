package pkg42_a03_pràcticaaprenentatge03;

public class Aguila extends AnimalBase implements AnimalVolador {

    public Aguila(String nom) {
        super(nom, 15);
        afegirAliments();
    }

    public Aguila(String nom, int energia) {
        super(nom, energia, 15);
        afegirAliments();
    }

    @Override
    public void emetreSo() {
        System.out.println(teEnergia(10)
                ? getNom() + " diu: Pio Pio!"
                : getNom() + " està massa cansat per clicar.");
    }

    @Override
    public void volar(int altura, int distancia) {
        if (altura > 500) {
            System.out.println(getNom() + " no pot volar tan alt.");
        } else if (altura <= 0 || distancia <= 0) {
            System.out.println("Valor incorrecte");
        } else if (teEnergia((altura / 10) + (distancia / 5))) {
            System.out.println("Sóc " + getNom() + " i estic nadant.");
            setEnergia(getEnergia() - ((altura / 10) + (distancia / 5)));
        } else {
            System.out.println(getNom() + " està massa cansat per volar.");
        }
    }

    private void afegirAliments() {
        getAlimentsAceptats().add("rosegadors");
        getAlimentsAceptats().add("peix");
    }

}
