package pkg42_a04_practica4;

class SenseFruit extends Planta {

    public final int ALTURA_MIN;
    private boolean esPotCollir;

    public SenseFruit(int alturaMaxima, int alturaMinima) {
        super(alturaMaxima);
        this.ALTURA_MIN = alturaMinima;
        this.esPotCollir = false;
    }

    public boolean isEsPotCollir() {
        return esPotCollir;
    }

    @Override
    public void creixer() {
        if (isEsViva()) {
            altura++;

            if (altura >= ALTURA_MIN) {
                esPotCollir = true;
            }
            if (altura > ALTURA_MAXIMA) {
                System.out.println("Matar Planta");
                matarPlanta();
            }
        }

    }

    @Override
    public String toString() {
        return "SenseFruit{" + "ALTURA_MIN=" + ALTURA_MIN + ", esPotCollir=" + esPotCollir
                + ", altura=" + altura + ", esViva=" + isEsViva()+ '}';
    }

}
