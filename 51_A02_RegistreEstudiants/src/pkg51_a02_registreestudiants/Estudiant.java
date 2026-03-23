package pkg51_a02_registreestudiants;

import java.util.Objects;

public class Estudiant {
    
    private String nom;
    private int edat;

    public Estudiant(String nom, int edat) throws EstudianteInvalidoException {
        setNom(nom);
        setEdat(edat);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws EstudianteInvalidoException {
        if (nom == null || nom.equals("")){
            throw new EstudianteInvalidoException("Dades del nom no vàlides!");
        }
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) throws EstudianteInvalidoException {
        if(edat < 0){
            throw new EstudianteInvalidoException("Dades de la edat no vàlides!");
        }
        this.edat = edat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nom);
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
        final Estudiant other = (Estudiant) obj;
        return Objects.equals(this.nom, other.nom);
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nom=" + nom + ", edat=" + edat + '}';
    }
    
}
