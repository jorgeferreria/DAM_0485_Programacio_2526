package pkg61_a04_gestiobibliotecamvc_1n.model.entity;

public class Editorial {

    private int id;
    private String nom;
    private String pais;

    public Editorial(int id, String nom, String pais) {
        this.id = id;
        this.nom = nom;
        this.pais = pais;
    }

    public Editorial(String nom, String pais) {
        this.nom = nom;
        this.pais = pais;
    }

    public Editorial(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.id;
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
        final Editorial other = (Editorial) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nom: " + nom + " | País: " + pais;
    }
}
