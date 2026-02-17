package pkg012herencia;

public class Alumno extends Persona{
    private int ralc;

    public Alumno(String nom, String nif, int edat, int ralc) {
        super(nom, nif, edat);
        this.ralc = ralc;
    }

    public int getRalc() {
        return ralc;
    }

    public void setRalc(int ralc) {
        this.ralc = ralc;
    }
    
    public void estudiar(){
        System.out.println("Estoy estudiando!!!!");
    }

    @Override
    public String toString() {
        return  super.toString() + ", ralc=" + ralc;
    }

    
    
    
}
