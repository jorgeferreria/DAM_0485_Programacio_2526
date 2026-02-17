package pkg41_a02_practica02;

import java.util.Objects;

public class Persona {
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

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 83 * hash + Objects.hashCode(this.nif);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Persona other = (Persona) obj;
//        return Objects.equals(this.nif, other.nif);
//    } 

    @Override
    public String toString() {
        return "Nom:" + nom + ", Nif:" + nif + ", Edat:" + edat + "}";
    }
    
}
