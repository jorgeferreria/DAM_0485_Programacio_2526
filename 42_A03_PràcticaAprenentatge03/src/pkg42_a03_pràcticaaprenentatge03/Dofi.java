package pkg42_a03_pràcticaaprenentatge03;

public class Dofi extends AnimalBase implements AnimalAquatic {

    public Dofi(String nom) {
        super(nom, 20);
        afegirAliments();
    }

    public Dofi(String nom, int energia) {
        super(nom, energia, 15);
        afegirAliments();
    }

    @Override
    public void emetreSo() {
        System.out.println(teEnergia(10)
                ? getNom() + " diu: Clic Clic!"
                : getNom() + " està massa cansat per clicar.");
    }

    @Override
    public void nedar(int profunditat) {
        if (profunditat > 50) {
            System.out.println(getNom() + " no pot nadar a tanta profunditat.");
        } else if (profunditat <= 0) {
            System.out.println("Valor incorrecte");
        } else if (teEnergia(profunditat / 3)) {
            System.out.println("Sóc " + getNom() + " i estic nadant.");
            setEnergia(getEnergia() - profunditat / 3);
        } else {
            System.out.println(getNom() + " està massa cansat per nadar.");
        }
    }

    private void afegirAliments() {
        getAlimentsAceptats().add("peix");
        getAlimentsAceptats().add("calamar");
    }

}
