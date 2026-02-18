package pkg012herencia;

public class Professor extends Persona {

    private String titulacion;

    public Professor(String nom, String nif, int edat, String titulacion) {
        super(nom, nif, edat);
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void explicar() {
        System.out.println("Estoy explicando!!!!");
    }

    @Override
    public void irBanyo() {
        System.out.println("Tengo baño privado y voy!");
//        super.irBanyo(); 
    }

    
    
    @Override
    public String toString() {
        return super.toString() + ", titulacion=" + titulacion;
    }

}
