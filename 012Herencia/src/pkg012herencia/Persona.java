package pkg012herencia;

public  abstract class Persona {
    private String nom;
    private String nif;
    private int edat;

    public Persona(String nom, String nif, int edat) {
        this.nom = nom;
        this.nif = nif;
        setEdat(edat);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNif() {
        return nif;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        if(edat >= 0 && edat <= 150){
            this.edat = edat;
        } else {
            this.edat = 0;
        }
    }

    @Override
    public String toString() {
        return "NOM:" + nom + ", NIF:" + nif + ", EDAT:" + edat;
    }
    
}
