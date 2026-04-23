package pkg51_a05_botiga;

import java.util.Objects;

public class Joc {
    
    private String nom; 
    private String desenvolupador;
    private String categoria;

    public Joc(String nom, String desenvolupador, String categoria) {
        this.nom = nom;
        this.desenvolupador = desenvolupador;
        this.categoria = categoria.toUpperCase();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesenvolupador() {
        return desenvolupador;
    }

    public void setDesenvolupador(String desenvolupador) {
        this.desenvolupador = desenvolupador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.desenvolupador);
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
        final Joc other = (Joc) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.desenvolupador, other.desenvolupador);
    }

    @Override
    public String toString() {
        return "Joc{" + "nom=" + nom + ", desenvolupador=" + desenvolupador + ", categoria=" + categoria + '}';
    }
    
}
