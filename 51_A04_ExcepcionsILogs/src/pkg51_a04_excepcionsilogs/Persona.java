package pkg51_a04_excepcionsilogs;

import java.time.LocalDate;
import java.util.Objects;

class Persona {
    private String nif;
    private String nom;
    private LocalDate dataNaixement;

    public Persona(String nif, String nom, LocalDate dataNaixement) {
        this.nif = nif;
        this.nom = nom;
        this.dataNaixement = dataNaixement;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDataNaixement() {
        return dataNaixement;
    }

    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return "Persona{" + "nif=" + nif + ", nom=" + nom + ", dataNaixement=" + dataNaixement + '}';
    }
    
}
