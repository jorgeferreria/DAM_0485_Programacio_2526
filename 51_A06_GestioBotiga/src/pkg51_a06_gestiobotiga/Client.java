package pkg51_a06_gestiobotiga;

import java.util.Objects;

public class Client {
    
    private String nif;
    private String nom;
    private String cognom;

    public Client(String nif, String nom, String cognom) {
        this.nif = nif;
        this.nom = nom;
        this.cognom = cognom;
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

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nif);
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
        final Client other = (Client) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return "Client{" + "nif=" + nif + ", nom=" + nom + ", cognom=" + cognom + '}';
    }
    
}
