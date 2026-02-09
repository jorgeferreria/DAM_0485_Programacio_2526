package classes;

public class Cafetera {

    // ATRIBUTOS
    private int capacitatMaxima;
    private int quantitatActual;

    // CONTRUCTORES
    public Cafetera() {
        capacitatMaxima = 1000;
        quantitatActual = 0;
    }

    public Cafetera(int capacitatMaxima) {
        setCapacitatMaxima(capacitatMaxima);
        setQuantitatActual(capacitatMaxima);
    }

    public Cafetera(int capacitatMaxima, int quantitatActual) {
        setCapacitatMaxima(capacitatMaxima);
        setQuantitatActual(quantitatActual);
    }

    // GETTERS Y SETTERS
    public int getCapacitatMaxima() {
        return capacitatMaxima;
    }

    public void setCapacitatMaxima(int capacitatMaxima) {
        if (capacitatMaxima > 0) {
            this.capacitatMaxima = capacitatMaxima;
        } else {
            this.capacitatMaxima = 1000;
        }
    }

    public int getQuantitatActual() {
        return quantitatActual;
    }

    public void setQuantitatActual(int quantitatActual) {
        if (quantitatActual >= 0 && quantitatActual <= capacitatMaxima) {
            this.quantitatActual = quantitatActual;
        } else {
            this.quantitatActual = capacitatMaxima;
        }
    }

    // MÉTODOS PROPIOS
    public void omplir() {
        setQuantitatActual(capacitatMaxima);
    }

    public void sevirTassa(int quantitat) {
        if (quantitat > 0) {
            if (quantitat <= quantitatActual) {
                setQuantitatActual(quantitatActual - quantitat);
            } else {
                buidar();
            }
        }
    }

    public void buidar() {
        setQuantitatActual(0);
    }

    public void afegirCafe(int quantitat) {
        if (quantitat > 0) {
            if (quantitatActual + quantitat <= capacitatMaxima) {
                setQuantitatActual(quantitatActual + quantitat);
            } else {
                omplir();
            }
        }
    }
    
    // TO_STRING
    @Override
    public String toString() {
        return "Cafetera{" + "capacitatMaxima=" + capacitatMaxima + ", quantitatActual=" + quantitatActual + "}";
    }

}
