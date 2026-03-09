package pkg42_a04_practica4;

public abstract class Planta {
    final public int ALTURA_MAXIMA;
    protected int altura;
    private boolean esViva;

    public Planta(int alturaMaxima) {
        this.ALTURA_MAXIMA = alturaMaxima;
        this.altura = 1;
        this.esViva = true;
    }

    public boolean isEsViva() {
        return esViva;
    }
    
    public void matarPlanta(){
        if(altura > ALTURA_MAXIMA){
            this.esViva = false;
        }
    }
    
    public abstract void creixer();
    
    
}
