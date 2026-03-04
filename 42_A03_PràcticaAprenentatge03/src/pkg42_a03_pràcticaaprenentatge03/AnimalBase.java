package pkg42_a03_pràcticaaprenentatge03;

import java.util.ArrayList;
import java.util.List;

public abstract class AnimalBase implements Animal {

    private String nom;
    private int energia;
    private int aumentEnergia;
    private List<String> alimentsAceptats;

    public AnimalBase(String nom, int aumentEnergia) {
        this.nom = nom;
        setAumentEnergia(aumentEnergia);
        this.energia = 100;
        this.alimentsAceptats = new ArrayList();
    }

    public AnimalBase(String nom, int energia, int aumentEnergia) {
        this.nom = nom;
        setEnergia(energia);
        setAumentEnergia(aumentEnergia);
        this.alimentsAceptats = new ArrayList();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia >= 0 && energia <= 100 ? energia : 100;
        
//        if (energia >= 0 && energia <= 100) {
//            this.energia = energia;
//        } else {
//            this.energia = 100;
//        }
    }

    public int getAumentEnergia() {
        return aumentEnergia;
    }

    public void setAumentEnergia(int aumentEnergia) {
        this.aumentEnergia = aumentEnergia >= 15 && aumentEnergia <= 25 ? aumentEnergia : 15 ;
        
//        if (aumentEnergia >= 15 && aumentEnergia <= 25) {
//            this.aumentEnergia = aumentEnergia;
//        } else {
//            this.aumentEnergia = 15;
//        }
    }

    public List<String> getAlimentsAceptats() {
        return alimentsAceptats;
    }

    @Override
    public abstract void emetreSo();

    @Override
    public void menjar(String aliment) {
        if (alimentsAceptats.contains(aliment)) {
            setEnergia(getEnergia() + aumentEnergia);
        }
    }

    @Override
    public void descansar() {
        setEnergia(getEnergia() + 20);
    }

    public boolean teEnergia(int quantitat) {
        return energia >= quantitat;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", energia=" + energia + ", aumentEnergia=" + aumentEnergia + ", alimentsAceptats=" + alimentsAceptats;
    }
    
    

}
