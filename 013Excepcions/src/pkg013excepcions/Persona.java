package pkg013excepcions;

import java.util.Objects;

public class Persona {
    String dni;
    String nom;

    public Persona(String dni, String nom) throws DniNoValidException {
        setDni(dni);
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DniNoValidException {
        if(dni != "" && dni != null){
            this.dni = dni;
        } else {
            throw new DniNoValidException("DNI NO VÀLID!!!");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.dni);
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
        return Objects.equals(this.dni, other.dni);
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nom=" + nom + '}';
    }
    
}
