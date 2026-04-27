package pkg51_a07_gestiocomptes;

import java.util.Objects;

public class Compte {
    private String numCompte;
    private double saldo;

    public Compte(String numCompte, double saldo) {
        this.numCompte = numCompte;
        this.saldo = saldo;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.numCompte);
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
        final Compte other = (Compte) obj;
        return Objects.equals(this.numCompte, other.numCompte);
    }

    @Override
    public String toString() {
        return "Compte{" + "numCompte=" + numCompte + ", saldo=" + saldo + '}';
    }
    
    
}
